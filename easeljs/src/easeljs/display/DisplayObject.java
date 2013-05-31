package easeljs.display;

import easeljs.display.impl.DisplayObjectImpl;

public class DisplayObject {
	protected DisplayObjectImpl impl;

	public DisplayObject() {
		this(DisplayObjectImpl.create()); 
	}

	protected DisplayObject(DisplayObjectImpl impl) {
		this.impl = impl;
	}


}
