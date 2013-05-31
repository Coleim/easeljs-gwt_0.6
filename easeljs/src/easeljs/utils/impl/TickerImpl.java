package easeljs.utils.impl;

import com.google.gwt.core.client.JavaScriptObject;

public class TickerImpl extends JavaScriptObject {
	protected TickerImpl() {}

	public static native TickerImpl create() /*-{
		return new $wnd.Ticker();
	}-*/;

	/*******************************************************
	 * Methods
	 *******************************************************/

	/**
	 * Adds a listener for the tick event. The listener must be either an object exposing a <code>tick</code> method,
or a function. The listener will be called once each tick / interval. The interval is specified via the 
<code>.setInterval(ms)</code> method.
The tick method or function is passed two parameters: the elapsed time between the previous tick and the current
one, and a boolean indicating whether Ticker is paused.
	 */
	public final native void addListener(Number o, Number pauseable) /*-{
		this.addListener(o, pauseable);
	}-*/;

	/**
	 * Initializes or resets the timer, clearing all associated listeners and fps measuring data, starting the tick.
This is called automatically when the first listener is added.
	 */
	public final native void init() /*-{
		this.init();
	}-*/;

	/**
	 * Removes the specified listener.
	 */
	public final native void removeListener(Number o) /*-{
		this.removeListener(o);
	}-*/;

	/**
	 * Removes all listeners.
	 */
	public final native void removeAllListeners() /*-{
		this.removeAllListeners();
	}-*/;

	/**
	 * Sets the target time (in milliseconds) between ticks. Default is 50 (20 FPS).

Note actual time between ticks may be more than requested depending on CPU load.
	 */
	public final native void setInterval(Number interval) /*-{
		this.setInterval(interval);
	}-*/;

	/**
	 * Returns the current target time between ticks, as set with {{#crossLink "Ticker/setInterval"}}{{/crossLink}}.
	 */
	public final native Number getInterval() /*-{
		this.getInterval();
	}-*/;

	/**
	 * Sets the target frame rate in frames per second (FPS). For example, with an interval of 40, <code>getFPS()</code>
will return 25 (1000ms per second divided by 40 ms per tick = 25fps).
	 */
	public final native void setFPS(Number value) /*-{
		this.setFPS(value);
	}-*/;

	/**
	 * Returns the target frame rate in frames per second (FPS). For example, with an interval of 40, <code>getFPS()</code>
will return 25 (1000ms per second divided by 40 ms per tick = 25fps).
	 */
	public final native Number getFPS() /*-{
		this.getFPS();
	}-*/;

	/**
	 * Returns the actual frames / ticks per second.
	 */
	public final native Number getMeasuredFPS(Number ticks) /*-{
		this.getMeasuredFPS(ticks);
	}-*/;

	/**
	 * Changes the "paused" state of the Ticker, which can be retrieved by the {{#crossLink "Ticker/getPaused"}}{{/crossLink}}
method, and is passed as the "paused" property of the <code>tick</code> event. When the ticker is paused, all
listeners will still receive a tick event, but the <code>paused</code> property will be false.

Note that in EaselJS v0.5.0 and earlier, "pauseable" listeners would <strong>not</strong> receive the tick
callback when Ticker was paused. This is no longer the case.

<h4>Example</h4>
     createjs.Ticker.addEventListener("tick", handleTick);
     createjs.Ticker.setPaused(true);
     function handleTick(event) {
         console.log("Paused:", event.paused, createjs.Ticker.getPaused());
     }
	 */
	public final native void setPaused(Number value) /*-{
		this.setPaused(value);
	}-*/;

	/**
	 * Returns the number of milliseconds that have elapsed since Ticker was initialized. For example, you could use
this in a time synchronized animation to determine the exact amount of time that has elapsed.
	 */
	public final native Number getTime(Number runTime) /*-{
		this.getTime(runTime);
	}-*/;

	/**
	 * Returns the number of ticks that have been broadcast by Ticker.
	 */
	public final native Number getTicks(Number pauseable) /*-{
		this.getTicks(pauseable);
	}-*/;

	/**
	 * 
	 */
	public final native void _handleAF() /*-{
		this._handleAF();
	}-*/;

	/**
	 * 
	 */
	public final native void _handleTimeout() /*-{
		this._handleTimeout();
	}-*/;

	/**
	 * 
	 */
	public final native void _setupTick() /*-{
		this._setupTick();
	}-*/;

	/**
	 * 
	 */
	public final native void _tick() /*-{
		this._tick();
	}-*/;

	/**
	 * 
	 */
	public final native void _getTime() /*-{
		this._getTime();
	}-*/;

}
