package easeljs.geom;

import easeljs.geom.impl.Matrix2DImpl;

public class Matrix2D {
	protected Matrix2DImpl impl;

	public Matrix2D(Number a) {
		this(Matrix2DImpl.create(a)); 
	}

	protected Matrix2D(Matrix2DImpl impl) {
		this.impl = impl;
	}


}
