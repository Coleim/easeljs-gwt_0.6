package easeljs.utils.impl;

import com.google.gwt.core.client.JavaScriptObject;

public class UIDImpl extends JavaScriptObject {
	protected UIDImpl() {}

	public static native UIDImpl create() /*-{
		return new $wnd.UID();
	}-*/;

	/*******************************************************
	 * Methods
	 *******************************************************/

	/**
	 * Returns the next unique id.
	 */
	public final native Number get() /*-{
		this.get();
	}-*/;

}
