package easeljs.client.utils;

import com.google.gwt.core.client.JavaScriptObject;


public class Logger extends JavaScriptObject {
	protected Logger() {}
	
	public static native void log(JavaScriptObject object) /*-{
		console.log("[MDW] JavaScriptObject: " + object);
	}-*/;
	
	public static native void log(String message) /*-{
		console.log("[MDW] " + message);
	}-*/;
	
	public static native void debug(String message) /*-{
		console.debug("[MDW] " + message);
	}-*/;

	public static native void info(String message) /*-{
		console.info("[MDW] " + message);
	}-*/;
	
	public static native void warn(String message) /*-{
		console.warn("[MDW] " + message);
	}-*/;
	
	public static native void error(String message) /*-{
		console.error("[MDW] " + message);
	}-*/;
}
