package easeljs.geom.impl;

import com.google.gwt.core.client.JavaScriptObject;

public class RectangleImpl extends JavaScriptObject {
	protected RectangleImpl() {}

	public static native RectangleImpl create(Number x) /*-{
		return new $wnd.Rectangle(x);
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
	 * Returns a clone of the Rectangle instance.
	 */
	public final native RectangleImpl clone() /*-{
		this.clone();
	}-*/;

}
