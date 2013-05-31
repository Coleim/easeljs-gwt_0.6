package easeljs.filters.impl;

import easeljs.geom.Rectangle;

public class BoxBlurFilterImpl extends FilterImpl {
	protected BoxBlurFilterImpl() {}

	public static native BoxBlurFilterImpl create(Number blurX) /*-{
		return new $wnd.BoxBlurFilter(blurX);
	}-*/;

	/*******************************************************
	 * Methods
	 *******************************************************/

}
