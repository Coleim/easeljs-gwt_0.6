package easeljs.filters.impl;

import java.util.ArrayList;

import easeljs.filters.ColorMatrix;

public class ColorMatrixFilterImpl extends FilterImpl {
	protected ColorMatrixFilterImpl() {}

	public static native ColorMatrixFilterImpl create(ArrayList<ColorMatrix> matrix) /*-{
		return new $wnd.ColorMatrixFilter(matrix);
	}-*/;

	/*******************************************************
	 * Methods
	 *******************************************************/

	/**
	 * 
	 */
	public final native void initialize(Number matrix) /*-{
		this.initialize(matrix);
	}-*/;

}
