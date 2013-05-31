package easeljs.filters;

import easeljs.filters.impl.ColorMatrixImpl;

public class ColorMatrix {
	protected ColorMatrixImpl impl;

	public ColorMatrix(Number brightness) {
		this(ColorMatrixImpl.create(brightness)); 
	}

	protected ColorMatrix(ColorMatrixImpl impl) {
		this.impl = impl;
	}


}
