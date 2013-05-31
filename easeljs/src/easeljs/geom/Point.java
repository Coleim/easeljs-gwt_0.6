package easeljs.geom;

import easeljs.geom.impl.PointImpl;

public class Point {
	protected PointImpl impl;

	public Point(Number x) {
		this(PointImpl.create(x)); 
	}

	protected Point(PointImpl impl) {
		this.impl = impl;
	}


}
