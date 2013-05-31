package easeljs.display;

import easeljs.display.impl.ShapeImpl;

public class Shape extends DisplayObject {
	protected ShapeImpl impl;

	public Shape(Graphics graphics) {
		this(ShapeImpl.create(graphics)); 
	}

	protected Shape(ShapeImpl impl) {
		this.impl = impl;
	}


}
