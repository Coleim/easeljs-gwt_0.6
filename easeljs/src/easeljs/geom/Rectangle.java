package easeljs.geom;

import easeljs.geom.impl.RectangleImpl;

public class Rectangle {
	protected RectangleImpl impl;

	public Rectangle(Number x) {
		this(RectangleImpl.create(x)); 
	}

	protected Rectangle(RectangleImpl impl) {
		this.impl = impl;
	}


}
