package easeljs.ui;

import easeljs.ui.impl.TouchImpl;

public class Touch {
	protected TouchImpl impl;

	public Touch() {
		this(TouchImpl.create()); 
	}

	protected Touch(TouchImpl impl) {
		this.impl = impl;
	}


}
