################################################################################
## This file convert javascript classes into Java classes using GWT.
## It uses a json file representing the classes (based on generated comments).
################################################################################


import sys
import os
import json

import jsonToJava




def ensure_dir(dir):
    if not os.path.exists(dir):
		os.makedirs(dir)

		
def main(argv):                         
	inputFile = sys.argv[1]
	outputFolder = sys.argv[2]
	ensure_dir(outputFolder)
	
	print inputFile
	print outputFolder	
	
	jsonData = json.loads(open(inputFile).read())
	
	
	jsonToJava.createJavaClasses(jsonData, outputFolder)
	

if __name__ == "__main__":
    main(sys.argv[1:])