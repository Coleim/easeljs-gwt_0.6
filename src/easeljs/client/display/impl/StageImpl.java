package easeljs.client.display.impl;

import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.user.client.Element;

public class StageImpl extends ContainerImpl {
	protected StageImpl() {}
	
	/**
	 * A canvas object that the Stage will render to, or the string id of a canvas object in the current document.
	 * @param canvas
	 * @return StageImpl
	 */
	public static native StageImpl create(Element canvas) /*-{
		return new $wnd.createjs.Stage(canvas);
	}-*/;
	
	/**
	 * A canvas object that the Stage will render to, or the string id of a canvas object in the current document.
	 * @param canvas
	 * @return StageImpl
	 */
	public static native StageImpl create(String canvas) /*-{
		return new $wnd.Stage(canvas);
	}-*/;
	
	/**********************************************************************
	 * Methods
	 **********************************************************************/
		
	/**
	 * Clears the target canvas. Useful if autoClear is set to false.
	 */
	public final native void clear() /*-{
		this.clear();
	}-*/;
	
	/**
	 * Enables or disables the event listeners that stage adds to DOM elements (window, document and canvas). 
	 * It is good practice to disable events when disposing of a Stage instance, 
	 * otherwise the stage will continue to receive events from the page.
	 * @param enable Indicates whether to enable or disable the events. Default is true.
	 */
	public final native void enableDOMEvents(Boolean enable) /*-{
		this.enableDOMEvents(enable);
	}-*/;

	/**
	 * Enables or disables (by passing a frequency of 0) mouse over events (mouseover and mouseout) for this stage's 
	 * display list. 
	 * These events can be expensive to generate, so they are disabled by default, 
	 * and the frequency of the events can be controlled independently of mouse move events via the optional frequency 
	 * parameter.
	 * @param frequency Optional param specifying the maximum number of times per second to broadcast mouse over/out events. Set to 0 to disable mouse over events completely. Maximum is 50. A lower frequency is less responsive, but uses less CPU.
	 */
	public final native void enableMouseOver(Number frequency) /*-{
		this.enableMouseOver(frequency);
	}-*/;	
	
	/**
	 * Returns a data url that contains a Base64-encoded image of the contents of the stage. The returned data url can be specified as the src value of an image element.
	 * @param backgroundColor The background color to be used for the generated image. The value can be any value HTML color value, including HEX colors, rgb and rgba. The default value is a transparent background.
	 * @param mimeType The MIME type of the image format to be create. The default is "image/png". If an unknown MIME type is passed in, or if the browser does not support the specified MIME type, the default value will be used.
	 * @return String a Base64 encoded image.
	 */
	public final native String toDataURL(String backgroundColor, String mimeType) /*-{
		return this.toDataURL(backgroundColor, mimeType);
	}-*/;
	
	
	/**
	 * Each time the update method is called, the stage will tick any descendants exposing a tick method (ex. BitmapAnimation) and render its entire display list to the canvas. 
	 * Any parameters passed to update will be passed on to any onTick handlers.
	 */
	public final native void update() /*-{
		this.update();
	}-*/;	
	
	public final native JavaScriptObject addEventListener(String type, JavaScriptObject listener) /*-{
		return this.addEventListener(type, listener);
	}-*/;
	
	
	/**********************************************************************
	 * Properties
	 **********************************************************************/
	
	/**
	 * 
	 * @return The canvas the stage will render to. 
	 */
	public final native Element getCanvas() /*-{
		return this.canvas;
	}-*/;
	
	/**
	 * 
	 * @return
	 */
	public final native JavaScriptObject getContext() /*-{
		return this.canvas.getContext("2d");
	}-*/;
	
	
	//public final native DisplayObjectImpl getObjectUnderPoint(float x, float y) /*-{
	//	return this.getObjectUnderPoint(x, y);
	//}-*/;
	
	//public final native JsArray<DisplayObjectImpl> getObjectsUnderPoint(float x, float y) /*-{
	//	return this.getObjectsUnderPoint(x, y);
	//}-*/;
	

}
