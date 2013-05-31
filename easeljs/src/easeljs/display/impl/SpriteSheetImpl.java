package easeljs.display.impl;

import java.util.ArrayList;

import com.google.gwt.core.client.JavaScriptObject;

import easeljs.geom.Rectangle;

public class SpriteSheetImpl extends JavaScriptObject {
	protected SpriteSheetImpl() {}

	public static native SpriteSheetImpl create(JavaScriptObject data) /*-{
		return new $wnd.SpriteSheet(data);
	}-*/;

	/*******************************************************
	 * Methods
	 *******************************************************/

	/**
	 * 
	 */
	public final native void initialize() /*-{
		this.initialize();
	}-*/;

	/**
	 * Returns the total number of frames in the specified animation, or in the whole sprite
sheet if the animation param is omitted.
	 */
	public final native Number getNumFrames(Number animation) /*-{
		this.getNumFrames(animation);
	}-*/;

	/**
	 * Returns an array of all available animation names as strings.
	 */
	public final native ArrayList<String> getAnimations() /*-{
		this.getAnimations();
	}-*/;

	/**
	 * Returns an object defining the specified animation. The returned object has a
frames property containing an array of the frame id's in the animation, a frequency
property indicating the advance frequency for this animation, a name property, 
and a next property, which specifies the default next animation. If the animation
loops, the name and next property will be the same.
	 */
	public final native Object getAnimation(Number name) /*-{
		this.getAnimation(name);
	}-*/;

	/**
	 * Returns an object specifying the image and source rect of the specified frame. The returned object
has an image property holding a reference to the image object in which the frame is found,
and a rect property containing a Rectangle instance which defines the boundaries for the
frame within that image.
	 */
	public final native Object getFrame(Number frameIndex) /*-{
		this.getFrame(frameIndex);
	}-*/;

	/**
	 * Returns a Rectangle instance defining the bounds of the specified frame relative to the origin. For example, a
90 x 70 frame with a regX of 50 and a regY of 40 would return a rectangle with [x=-50, y=-40, width=90, height=70].
	 */
	public final native Rectangle getFrameBounds(Number frameIndex) /*-{
		this.getFrameBounds(frameIndex);
	}-*/;

	/**
	 * Returns a clone of the SpriteSheet instance.
	 */
	public final native SpriteSheetImpl clone() /*-{
		this.clone();
	}-*/;

	/**
	 * 
	 */
	public final native void _handleImageLoad() /*-{
		this._handleImageLoad();
	}-*/;

	/**
	 * 
	 */
	public final native void _calculateFrames() /*-{
		this._calculateFrames();
	}-*/;

}
