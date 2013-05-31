package easeljs.display.impl;

import easeljs.display.SpriteSheet;
import easeljs.geom.Rectangle;

public class BitmapAnimationImpl extends DisplayObjectImpl {
	protected BitmapAnimationImpl() {}

	public static native BitmapAnimationImpl create(SpriteSheet spriteSheet) /*-{
		return new $wnd.BitmapAnimation(spriteSheet);
	}-*/;

	/*******************************************************
	 * Methods
	 *******************************************************/

	/**
	 * Because the content of a Bitmap is already in a simple format, cache is unnecessary for Bitmap instances.
You should not cache Bitmap instances as it can degrade performance.
	 */
	public final native void cache() /*-{
		this.cache();
	}-*/;

	/**
	 * Because the content of a Bitmap is already in a simple format, cache is unnecessary for Bitmap instances.
You should not cache Bitmap instances as it can degrade performance.
	 */
	public final native void updateCache() /*-{
		this.updateCache();
	}-*/;


	/**
	 * Begin playing a paused animation. The BitmapAnimation will be paused if either {{#crossLink "BitmapAnimation/stop"}}{{/crossLink}}
or {{#crossLink "BitmapAnimation/gotoAndStop"}}{{/crossLink}} is called. Single frame animations will remain
unchanged.
	 */
	public final native void play() /*-{
		this.play();
	}-*/;

	/**
	 * Stop playing a running animation. The BitmapAnimation will be playing if {{#crossLink "BitmapAnimation/gotoAndPlay"}}{{/crossLink}}
is called. Note that calling {{#crossLink "BitmapAnimation/gotoAndPlay"}}{{/crossLink}} or {{#crossLink "BitmapAnimation/play"}}{{/crossLink}}
will resume playback.
	 */
	public final native void stop() /*-{
		this.stop();
	}-*/;

	/**
	 * Sets paused to false and plays the specified animation name, named frame, or frame number.
	 */
	public final native void gotoAndPlay(Number frameOrAnimation) /*-{
		this.gotoAndPlay(frameOrAnimation);
	}-*/;

	/**
	 * Sets paused to true and seeks to the specified animation name, named frame, or frame number.
	 */
	public final native void gotoAndStop(Number frameOrAnimation) /*-{
		this.gotoAndStop(frameOrAnimation);
	}-*/;

	/**
	 * Advances the playhead. This occurs automatically each tick by default.
	 */
	public final native void advance() /*-{
		this.advance();
	}-*/;

	/**
	 * Returns a {{#crossLink "Rectangle"}}{{/crossLink}} instance defining the bounds of the current frame relative to
the origin. For example, a 90 x 70 frame with <code>regX=50</code> and <code>regY=40</code> would return a
rectangle with [x=-50, y=-40, width=90, height=70].

Also see the SpriteSheet {{#crossLink "SpriteSheet/getFrameBounds"}}{{/crossLink}} method.
	 */
	public final native Rectangle getBounds() /*-{
		this.getBounds();
	}-*/;


}
