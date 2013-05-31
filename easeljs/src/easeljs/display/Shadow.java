package easeljs.display;

import easeljs.display.impl.ShadowImpl;

public class Shadow {
	protected ShadowImpl impl;

	public Shadow(String color) {
		this(ShadowImpl.create(color)); 
	}

	protected Shadow(ShadowImpl impl) {
		this.impl = impl;
	}


}
