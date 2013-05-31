package easeljs.display.impl;

import com.google.gwt.core.client.JavaScriptObject;

public class ShadowImpl extends JavaScriptObject {
	protected ShadowImpl() {}

	public static native ShadowImpl create(String color) /*-{
		return new $wnd.Shadow(color);
	}-*/;

	/*******************************************************
	 * Methods
	 *******************************************************/

	/**
	 * Initialization method.
	 */
	public final native void initialize(Number color, Number offsetX, Number offsetY, Number blur) /*-{
		this.initialize(color, offsetX, offsetY, blur);
	}-*/;

	/**
	 * Returns a clone of this Shadow instance.
	 */
	public final native ShadowImpl clone() /*-{
		this.clone();
	}-*/;

}
