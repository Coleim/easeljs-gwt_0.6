package easeljs.ui.impl;

import com.google.gwt.core.client.JavaScriptObject;

public class TouchImpl extends JavaScriptObject {
	protected TouchImpl() {}

	public static native TouchImpl create() /*-{
		return new $wnd.Touch();
	}-*/;

	/*******************************************************
	 * Methods
	 *******************************************************/

	/**
	 * Returns true if touch is supported in the current browser.
	 */
	public final native Boolean isSupported() /*-{
		this.isSupported();
	}-*/;

	/**
	 * Enables touch interaction for the specified EaselJS stage. Currently supports iOS (and compatible browsers, such
as modern Android browsers), and IE10. Supports both single touch and multi-touch modes. Extends the EaselJS
MouseEvent model, but without support for double click or over/out events. See <code>MouseEvent.pointerID</code>
for more information.
	 */
	public final native Boolean enable(Number stage, Number singleTouch, Number allowDefault) /*-{
		this.enable(stage, singleTouch, allowDefault);
	}-*/;

	/**
	 * Removes all listeners that were set up when calling Touch.enable on a stage.
	 */
	public final native void disable(Number stage) /*-{
		this.disable(stage);
	}-*/;

	/**
	 * 
	 */
	public final native void _IOS_enable(Number stage) /*-{
		this._IOS_enable(stage);
	}-*/;

	/**
	 * 
	 */
	public final native void _IOS_disable(Number stage) /*-{
		this._IOS_disable(stage);
	}-*/;

	/**
	 * 
	 */
	public final native void _IOS_handleEvent() /*-{
		this._IOS_handleEvent();
	}-*/;

	/**
	 * 
	 */
	public final native void _IE_handleEvent() /*-{
		this._IE_handleEvent();
	}-*/;

	/**
	 * 
	 */
	public final native void _handleStart() /*-{
		this._handleStart();
	}-*/;

	/**
	 * 
	 */
	public final native void _handleMove() /*-{
		this._handleMove();
	}-*/;

	/**
	 * 
	 */
	public final native void _handleEnd() /*-{
		this._handleEnd();
	}-*/;

}
