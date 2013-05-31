import javaClasses
import os



def ensure_dir(dir):
    if not os.path.exists(dir):
		os.makedirs(dir)


def createJavaClasses(iJsonData, iOutputFolder):
	
	javaClassDict = {}
	
	extractClasses(iJsonData, javaClassDict)
	
	toFile(javaClassDict, iOutputFolder)

def toFile(javaClassDict, iOutputFolder):

	for classIdx in javaClassDict:
		#print "\n\n============================================================"
		
		aClass = javaClassDict[classIdx]
		outputDir = iOutputFolder
		packageStr = []
		for pack in aClass.packages:
			outputDir += "/" + pack;
			packageStr.append(pack);
		implOutputDir = outputDir + '/impl'
		
		ensure_dir(outputDir)
		ensure_dir(implOutputDir)
		

		implClassFile = open(implOutputDir+"/"+aClass.name+"Impl.java", 'w')
		classFile = open(outputDir+"/"+aClass.name+".java", 'w')
		
		
		implClassFile.write('package ' + '.'.join(packageStr) + '.impl;')
		classFile.write('package ' + '.'.join(packageStr) + ';')
		implClassFile.write('\n')
		classFile.write('\n')
		implClassFile.write('\n')
		classFile.write('\n')
		extend = ""
		extendImpl = aClass.extends

		if aClass.extends != "JavaScriptObject":
			extendImpl += 'Impl'
			extend = ' extends ' + aClass.extends
		else:
			implClassFile.write('import com.google.gwt.core.client.JavaScriptObject;\n\n')

		
		implClassFile.write('public class ' + aClass.name + 'Impl extends ' + extendImpl + ' {\n')
		classFile.write('public class ' + aClass.name + extend + ' {\n')
		implClassFile.write('\tprotected ' + aClass.name + 'Impl() {}\n')
		classFile.write('\tprotected ' + aClass.name + 'Impl impl;\n')	
		classFile.write('\n')
		implClassFile.write('\n')
		printConstructors(aClass.constructors, implClassFile, classFile, aClass.name)

		classFile.write('\n')
		implClassFile.write('\n')
		printMethod(aClass.methods, implClassFile, classFile, aClass.name)
		
		
		classFile.write('}')
		implClassFile.write('}')
		classFile.write('\n')
		implClassFile.write('\n')
		
		classFile.close()
		implClassFile.close()
		
def printConstructors(constructorList, implClassFile, classFile, className):

	paramStr = []

	if len(constructorList) != 0:
		for param in constructorList[0].parameters:
			paramStr.append(param.type + ' ' + param.name)
	
	classFile.write('\tpublic ' + className + '(');
	classFile.write(', '.join(paramStr)	+ ') {\n')
	
	implClassFile.write('\tpublic static native ' + className + 'Impl create(');
	implClassFile.write(', '.join(paramStr)	+ ') /*-{\n')	
	
	paramStr = []
	if len(constructorList) != 0:
		for param in constructorList[0].parameters:
			paramStr.append(param.name)
			
	classFile.write('\t\tthis(' + className + 'Impl.create(' + ', '.join(paramStr)	+ ')); \n' )
	classFile.write('\t}\n')
	classFile.write('\n')

	classFile.write('\tprotected ' + className + '('+ className + 'Impl impl) {\n');
	classFile.write('\t\tthis.impl = impl;\n')
	classFile.write('\t}\n')
	classFile.write('\n')
	

	implClassFile.write('\t\treturn new $wnd.' + className + '(' + ', '.join(paramStr) + ');\n')
	implClassFile.write('\t}-*/;\n')
		
		
	
	
	
def printMethod(methodList, implClassFile, classFile, className):
	implClassFile.write('\t/*******************************************************\n')
	implClassFile.write('\t * Methods\n')
	implClassFile.write('\t *******************************************************/\n')
	implClassFile.write('\n')
	for method in methodList:
		if method.name != "toString":
			implClassFile.write('\t/**\n')
			implClassFile.write('\t * ' + method.description + '\n')
			implClassFile.write('\t */\n')
			implClassFile.write('\tpublic final native ' )
			retType = method.returnType.type
			if retType == className:
				retType += 'Impl'
			implClassFile.write(retType)
			implClassFile.write(' ' + method.name + '(')
			paramsStr = []
			for param in method.parameters:
				paramsStr.append(param.type + ' ' + param.name)
			implClassFile.write(', '.join(paramsStr))
			implClassFile.write(') /*-{\n')
			implClassFile.write('\t\tthis.' + method.name + '(')
			paramsStr = []
			for param in method.parameters:
				paramsStr.append(param.name)
			implClassFile.write(', '.join(paramsStr))
			implClassFile.write(');\n');
			implClassFile.write('\t}-*/;\n')
			implClassFile.write('\n')

def extractClasses(iJsonData, javaClassDict):

	aFiles = iJsonData["files"]
	for aFile in aFiles:
		path = aFile.replace("../src/", "")
		path = path.replace(".js", "")
		path = path.replace("/", ".")
		
		# Create class
		
		aClass = javaClasses.JavaClass()
		packages = path.split('.')
		for pack in packages:
			firstLetter = pack[0]
			if firstLetter.upper() == firstLetter:
				aClass.name = pack
			else:
				aClass.packages.append(pack)

		if aClass.name != "":
			javaClassDict[aClass.name] = aClass
	
	
	
	''' Classes basics (Description, name, constructor) '''
	classes = iJsonData["classes"]	
	for classIdx in javaClassDict:
		jsonClass = classes[classIdx]
		aClass = javaClassDict[classIdx]
		''' Description '''
		aClass.description = jsonClass["description"]
		''' Extends '''
		if "extends" in jsonClass:
			aClass.extends = jsonClass["extends"]
		else:
			aClass.extends = "JavaScriptObject"
		''' Params (constructor) '''	
		if "params" in jsonClass:
			params = jsonClass["params"]
			for jsonParam in params:
				constr = javaClasses.Method()
				constr.name = "Constructor"
				parameter = javaClasses.Parameter()
				parameter.name = jsonParam["name"]
				parameter.description = jsonParam["description"]
				if "type" in jsonParam:
					parameter.type = jsonParam["type"]
				constr.parameters.append(parameter)
				aClass.constructors.append(constr)
	
	
	''' Classes items (methods/properties/...) '''
	classItems = iJsonData["classitems"]
	i=0;
	for item in classItems:
		className = item["class"]
		try:
			aClass = javaClassDict[className]
			
			# returnType = item["type"]	
			
		except:
			print "Class not found in Map: " + className

			
		if "itemtype" in item:
			itemType = item["itemtype"]
			if itemType == "method":
				''' Methods '''
				method = javaClasses.Method()
				if "name" in item:
					method.name = item["name"]
				if "description" in item:
					method.description = item["description"]
				if "params" in item:
					params = item["params"]
					for methodParam in params:
						parameter = javaClasses.Parameter()
						parameter.name = methodParam["name"]
						parameter.description = methodParam["description"]
						if "type" in methodParam:
							parameter.type = jsonParam["type"]
						method.parameters.append(parameter)			
				if "return" in item:
					ret = item["return"]
					if "type" in ret:
						method.returnType.type = ret["type"]
						method.returnType.description = ret["description"]
					else:
						desc = ret["description"]
						method.returnType.type = desc.partition(' ')[0]
						method.returnType.description = desc.partition(' ')[1]
					
				else:
					method.returnType.type = "void"
				aClass.methods.append(method)
				
			'''
			# Getters/Setters
			if itemType == "property":
				''' '''property '''''' 
				#print itemType
			elif itemType == "method":

				
				
			elif itemType == "event":
				#print itemType
			else:
				#print itemType'''
	

		else:
			print "ERROR: No type on the item: " + str(i) + " - " + className
		i += 1;

'''	
	
def printToFile(iJavaFile, iOutputFolder):
	filePath = iOutputFolder + "/client/" + iJavaFile.filePackage
	
	if not os.path.exists(filePath):
		os.makedirs(filePath)
		
	fileName = filePath + "/" + iJavaFile.fileName
	outFile = open(fileName,'w');	
	outFile.write('package easeljs.client.' + iJavaFile.filePackage + ';\n');
	outFile.write('\n');
	outFile.write('import ' + fileImports);'''
	
	
	
	