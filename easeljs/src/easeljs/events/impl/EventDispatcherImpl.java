package easeljs.events.impl;

import com.google.gwt.core.client.JavaScriptObject;

public class EventDispatcherImpl extends JavaScriptObject {
	protected EventDispatcherImpl() {}

	public static native EventDispatcherImpl create() /*-{
		return new $wnd.EventDispatcher();
	}-*/;

	/*******************************************************
	 * Methods
	 *******************************************************/

	/**
	 * Static initializer to mix in EventDispatcher methods.
	 */
	public final native void initialize(Number target) /*-{
		this.initialize(target);
	}-*/;

	/**
	 * Initialization method.
	 */
	public final native void initialize() /*-{
		this.initialize();
	}-*/;

	/**
	 * Adds the specified event listener. Note that adding multiple listeners to the same function will result in
multiple callbacks getting fired.

<h4>Example</h4>

     displayObject.addEventListener("click", handleClick);
     function handleClick(event) {
        // Click happened.
     }
	 */
	public final native JavaScriptObject addEventListener(String type, JavaScriptObject listener) /*-{
		this.addEventListener(type, listener);
	}-*/;
	

	/**
	 * Removes the specified event listener.

<b>Important Note:</b> that you must pass the exact function reference used when the event was added. If a proxy
function, or function closure is used as the callback, the proxy/closure reference must be used - a new proxy or
closure will not work.

<h4>Example</h4>

     displayObject.removeEventListener("click", handleClick);
	 */
	public final native void removeEventListener(Number type, Number listener) /*-{
		this.removeEventListener(type, listener);
	}-*/;

	/**
	 * Removes all listeners for the specified type, or all listeners of all types.

<h4>Example</h4>

     // Remove all listeners
     displayObject.removeAllEvenListeners();

     // Remove all click listeners
     displayObject.removeAllEventListeners("click");
	 */
	public final native void removeAllEventListeners(Number type) /*-{
		this.removeAllEventListeners(type);
	}-*/;

	/**
	 * Dispatches the specified event to all listeners.

<h4>Example</h4>

     // Use a string event
     this.dispatchEvent("complete");

     // Use an object
     var event = {
         type: "complete",
         foo: "bar"
     };
     this.dispatchEvent(event);
	 */
	public final native Boolean dispatchEvent(Number eventObj, Number target) /*-{
		this.dispatchEvent(eventObj, target);
	}-*/;

	/**
	 * Indicates whether there is at least one listener for the specified event type.
	 */
	public final native Boolean hasEventListener(Number type) /*-{
		this.hasEventListener(type);
	}-*/;

}
