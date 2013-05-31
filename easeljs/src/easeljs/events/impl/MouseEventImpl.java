package easeljs.events.impl;

import com.google.gwt.core.client.JavaScriptObject;

public class MouseEventImpl extends JavaScriptObject {
	protected MouseEventImpl() {}

	public static native MouseEventImpl create(String type) /*-{
		return new $wnd.MouseEvent(type);
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
	 * Returns a clone of the MouseEvent instance.
	 */
	public final native MouseEventImpl clone() /*-{
		this.clone();
	}-*/;

}
