package easeljs.display;

import easeljs.display.impl.TextImpl;

public class Text extends DisplayObject {
	protected TextImpl impl;

	public Text(String text) {
		this(TextImpl.create(text)); 
	}

	protected Text(TextImpl impl) {
		this.impl = impl;
	}


}
