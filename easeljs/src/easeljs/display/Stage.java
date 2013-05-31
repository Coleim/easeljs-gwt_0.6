package easeljs.display;

import com.google.gwt.core.client.JavaScriptObject;

import easeljs.display.impl.StageImpl;

public class Stage extends Container {
	protected StageImpl impl;

	public Stage(String canvas) {
		this(StageImpl.create(canvas)); 
	}
	
	public Stage(JavaScriptObject canvas) {
		this(StageImpl.create(canvas)); 
	}
	
	protected Stage(StageImpl impl) {
		this.impl = impl;
	}


}
