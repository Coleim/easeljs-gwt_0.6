package easeljs.display.impl;

import com.google.gwt.core.client.JavaScriptObject;

public class StageImpl extends ContainerImpl {
	protected StageImpl() {}

	public static native StageImpl create(String canvas) /*-{
		return new $wnd.Stage(canvas);
	}-*/;
	
	public static native StageImpl create(JavaScriptObject canvas) /*-{
		return new $wnd.Stage(canvas);
	}-*/;

	/*******************************************************
	 * Methods
	 *******************************************************/

	/**
	 * Each time the update method is called, the stage will tick any descendants exposing a tick method (ex. {{#crossLink "BitmapAnimation"}}{{/crossLink}})
and render its entire display list to the canvas. Any parameters passed to update will be passed on to any
<code>tick</code> event handlers.
	 */
	public final native void update() /*-{
		this.update();
	}-*/;

	/**
	 * Clears the target canvas. Useful if <code>autoClear</code> is set to false.
	 */
	public final native void clear() /*-{
		this.clear();
	}-*/;

	/**
	 * Returns a data url that contains a Base64-encoded image of the contents of the stage. The returned data url can
be specified as the src value of an image element.
	 */
	public final native String toDataURL(Number backgroundColor, Number mimeType) /*-{
		this.toDataURL(backgroundColor, mimeType);
	}-*/;

	/**
	 * Enables or disables (by passing a frequency of 0) mouse over events (mouseover and mouseout) for this stage's
display list. These events can be expensive to generate, so they are disabled by default. The frequency of
the events can be controlled independently of mouse move events via the optional <code>frequency</code> parameter.

<h4>Example</h4>
     var stage = new createjs.Stage("canvasId");
     stage.enableMouseOver(10);
	 */
	public final native void enableMouseOver(Number frequency) /*-{
		this.enableMouseOver(frequency);
	}-*/;

	/**
	 * Enables or disables the event listeners that stage adds to DOM elements (window, document and canvas).
It is good practice to disable events when disposing of a Stage instance, otherwise the stage will
continue to receive events from the page.

When changing the canvas property you must disable the events on the old canvas, and enable events on the
new canvas or mouse events will not work as expected. For example:

     myStage.enableDOMEvents(false);
     myStage.canvas = anotherCanvas;
     myStage.enableDOMEvents(true);
	 */
	public final native void enableDOMEvents(Number enable) /*-{
		this.enableDOMEvents(enable);
	}-*/;

	/**
	 * 
	 */
	public final native void _getPointerData(Number id) /*-{
		this._getPointerData(id);
	}-*/;

	/**
	 * 
	 */
	public final native void _handleMouseMove(Number e) /*-{
		this._handleMouseMove(e);
	}-*/;

	/**
	 * 
	 */
	public final native void _handlePointerMove(Number id, Number e, Number pageX, Number pageY) /*-{
		this._handlePointerMove(id, e, pageX, pageY);
	}-*/;

	/**
	 * 
	 */
	public final native void _updatePointerPosition(Number id, Number pageX, Number pageY) /*-{
		this._updatePointerPosition(id, pageX, pageY);
	}-*/;

	/**
	 * 
	 */
	public final native void _getElementRect(Number e) /*-{
		this._getElementRect(e);
	}-*/;

	/**
	 * 
	 */
	public final native void _handleMouseUp(Number e) /*-{
		this._handleMouseUp(e);
	}-*/;

	/**
	 * 
	 */
	public final native void _handlePointerUp(Number id, Number e, Number clear) /*-{
		this._handlePointerUp(id, e, clear);
	}-*/;

	/**
	 * 
	 */
	public final native void _handleMouseDown(Number e) /*-{
		this._handleMouseDown(e);
	}-*/;

	/**
	 * 
	 */
	public final native void _handlePointerDown(Number id, Number e, Number x, Number y) /*-{
		this._handlePointerDown(id, e, x, y);
	}-*/;

	/**
	 * 
	 */
	public final native void _testMouseOver() /*-{
		this._testMouseOver();
	}-*/;

	/**
	 * 
	 */
	public final native void _handleDoubleClick(Number e) /*-{
		this._handleDoubleClick(e);
	}-*/;

}
