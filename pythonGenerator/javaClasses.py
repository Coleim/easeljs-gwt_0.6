# ----------------------------------------------------------
# Return
# 	The return type of a method
# ----------------------------------------------------------
class Return:
	type = ""
	description = ""
	def toString(self):
		print "--Return--"
		print self.type
		print self.description
#
# ----------------------------------------------------------


# ----------------------------------------------------------
# Parameter
# 	Parameter of a method
# ----------------------------------------------------------
class Parameter:
	def __init__(self):
		self.type = ""
		self.name = ""
		self.description = ""
		
	def __str__(self):
		retStr = "-|- Name: "
		retStr += self.name
		retStr += "\n|--|---|- Type: "
		retStr += self.type
		retStr += "\n|--|---|- Description: "
		retStr += self.description		
		return retStr
#
# ----------------------------------------------------------

	
# ----------------------------------------------------------
# Method
# 	Describe a Method
# ----------------------------------------------------------
class Method:
	def __init__(self):
		self.name = ""
		self.description = ""
		self.parameters = []
		self.returnType = Return()
	
	def __str__(self):
		retStr = "-|- Name: "
		retStr += self.name
		retStr += "\n|--|- Description: "
		retStr += self.description
		retStr += "\n|--|- Parameters: "
		for param in self.parameters:
			retStr += "\n|--|--"
			retStr += param.__str__()
		return retStr
	
#
# ----------------------------------------------------------


# ----------------------------------------------------------
# JavaClass
# 	Describe a Java Class
# ----------------------------------------------------------
class JavaClass:
	def __init__(self):
		self.name = ""
		self.extends = ""
		self.description = ""
		self.constructors = []
		self.methods = []
		self.properties = []
		self.packages = []
		self.imports = []
	
	def __str__(self):
		retStr = "|- Class: " + self.name
		retStr = "\n|- Extends: " + self.extends
		retStr += "\n|- Packages: "
		for pack in self.packages:
			retStr += pack + "."
		retStr += "\n|- Description: "
		retStr += self.description
		retStr += "\n|- Constructeurs: "
		for constr in self.constructors:
			retStr += "\n|-"
			retStr += constr.__str__()
		retStr += "\n|- Methods: "
		for meth in self.methods:
			retStr += "\n|-"
			retStr += meth.__str__()
		return retStr
#
# ----------------------------------------------------------
