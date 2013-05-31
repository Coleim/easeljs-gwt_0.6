package easeljs.geom.impl;

import com.google.gwt.core.client.JavaScriptObject;

public class PointImpl extends JavaScriptObject {
	protected PointImpl() {}

	public static native PointImpl create(Number x) /*-{
		return new $wnd.Point(x);
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
	 * Returns a clone of the Point instance.
	 */
	public final native PointImpl clone() /*-{
		this.clone();
	}-*/;

}
