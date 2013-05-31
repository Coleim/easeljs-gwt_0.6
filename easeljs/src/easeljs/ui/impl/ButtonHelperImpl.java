package easeljs.ui.impl;

import com.google.gwt.core.client.JavaScriptObject;

import easeljs.display.BitmapAnimation;
import easeljs.display.MovieClip;

public class ButtonHelperImpl extends JavaScriptObject {
	protected ButtonHelperImpl() {}

	public static native ButtonHelperImpl create(BitmapAnimation target) /*-{
		return new $wnd.ButtonHelper(target);
	}-*/;
	
	public static native ButtonHelperImpl create(MovieClip target) /*-{
		return new $wnd.ButtonHelper(target);
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
	 * Enables or disables the button functionality on the target.
	 */
	public final native void setEnabled(Number value) /*-{
		this.setEnabled(value);
	}-*/;

	/**
	 * 
	 */
	public final native void handleEvent() /*-{
		this.handleEvent();
	}-*/;

}
