package easeljs.filters;

import java.util.ArrayList;

import easeljs.filters.impl.ColorMatrixFilterImpl;

public class ColorMatrixFilter extends Filter {
	protected ColorMatrixFilterImpl impl;

	public ColorMatrixFilter(ArrayList<ColorMatrix> matrix) {
		this(ColorMatrixFilterImpl.create(matrix)); 
	}

	protected ColorMatrixFilter(ColorMatrixFilterImpl impl) {
		this.impl = impl;
	}


}
