easeljs-gwt_0.6
======================================


EaselJs
======================================
Easel-GWT is a GWT port of EaselJS version 0.6 : http://easeljs.com/ <br />
I just copied my Eclipse project into easeljs folder. <br />
Please check the easeljs/src folder to view only the java sources.<br />

	
	Usage
	======================================
	1] Add the jar in the /bin directory to your classpath.
	2] In your module.gwt.xml add: <inherits name='easeljs.EaselJS'/>


Python Generator
======================================
I wrote a quick python generator to Java Classes from the json documentation of EaselJs.<br />
It is not a complete one and needs manula updates of the code afterward.<br />
(Feel free to improve it)<br />

	Usage
	======================================
	python main.py [jsonfile.json] [OutputFolder]
	example:
		python main.py data.json Classes
		
		
		
REFERENCES
======================================
https://github.com/timknip2
http://www.createjs.com/#!/EaselJS

