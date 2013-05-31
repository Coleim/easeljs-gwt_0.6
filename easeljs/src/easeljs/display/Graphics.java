package easeljs.display;

import easeljs.display.impl.GraphicsImpl;

public class Graphics {
	protected GraphicsImpl impl;

	public Graphics() {
		this(GraphicsImpl.create()); 
	}

	protected Graphics(GraphicsImpl impl) {
		this.impl = impl;
	}


}
