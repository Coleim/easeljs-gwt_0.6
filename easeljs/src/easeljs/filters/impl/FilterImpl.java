package easeljs.filters.impl;

import com.google.gwt.core.client.JavaScriptObject;

import easeljs.geom.Rectangle;

public class FilterImpl extends JavaScriptObject {
	protected FilterImpl() {}

	public static native FilterImpl create() /*-{
		return new $wnd.Filter();
	}-*/;

	/*******************************************************
	 * Methods
	 *******************************************************/

	/**
	 * Initialization method.
	 */
	public final native void initialize() /*-{
		this.initialize();
	}-*/;

	/**
	 * Returns a rectangle with values indicating the margins required to draw the filter.
For example, a filter that will extend the drawing area 4 pixels to the left, and 7 pixels to the right
(but no pixels up or down) would return a rectangle with (x=-4, y=0, width=11, height=0).
	 */
	public final native Rectangle getBounds() /*-{
		this.getBounds();
	}-*/;

	/**
	 * Applies the filter to the specified context.
	 */
	public final native Boolean applyFilter(Number ctx, Number x, Number y, Number width, Number height, Number targetCtx, Number targetX, Number targetY) /*-{
		this.applyFilter(ctx, x, y, width, height, targetCtx, targetX, targetY);
	}-*/;

	/**
	 * Returns a clone of this Filter instance.
	 */
	public final native FilterImpl clone() /*-{
		this.clone();
	}-*/;

}
