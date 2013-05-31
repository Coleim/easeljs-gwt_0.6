package easeljs.utils.impl;

import com.google.gwt.core.client.JavaScriptObject;

public class LogImpl extends JavaScriptObject {
	protected LogImpl() {}

	public static native LogImpl create() /*-{
		return new $wnd.Log();
	}-*/;

	/*******************************************************
	 * Methods
	 *******************************************************/

	/**
	 * Adds a definition object that associates one or more keys with longer messages. 
These messages can optionally include "%DETAILS%" which will be replaced by any details passed
with the error. For example:<br/>
Log.addKeys( {MY_ERROR:"This is a description of my error [%DETAILS%]"} );
Log.error( "MY_ERROR" , 5 ); // outputs "This is a description of my error [5]"
	 */
	public final native void addKeys(Number keys) /*-{
		this.addKeys(keys);
	}-*/;

	/**
	 * Outputs the specified error via the method assigned to the "out" property. If the error matches a key in any of the
loaded def objects, it will substitute that message.
	 */
	public final native void error(Number message, Number details, Number level) /*-{
		this.error(message, details, level);
	}-*/;

}
