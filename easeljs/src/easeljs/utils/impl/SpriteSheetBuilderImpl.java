package easeljs.utils.impl;

import com.google.gwt.core.client.JavaScriptObject;

import easeljs.display.SpriteSheet;

public class SpriteSheetBuilderImpl extends JavaScriptObject {
	protected SpriteSheetBuilderImpl() {}

	public static native SpriteSheetBuilderImpl create() /*-{
		return new $wnd.SpriteSheetBuilder();
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
	 * Adds a frame to the {{#crossLink "SpriteSheet"}}{{/crossLink}}. Note that the frame will not be drawn until you
call {{#crossLink "SpriteSheetBuilder/build"}}{{/crossLink}} method. The optional setup params allow you to have
a function run immediately before the draw occurs. For example, this allows you to add a single source multiple
times, but manipulate it or it's children to change it to generate different frames.

Note that the source's transformations (x, y, scale, rotate, alpha) will be ignored, except for regX/Y. To apply
transforms to a source object and have them captured in the sprite sheet, simply place it into a {{#crossLink "Container"}}{{/crossLink}}
and pass in the Container as the source.
	 */
	public final native Number addFrame(Number source, Number sourceRect, Number scale, Number setupFunction, Number setupParams, Number setupScope) /*-{
		this.addFrame(source, sourceRect, scale, setupFunction, setupParams, setupScope);
	}-*/;

	/**
	 * Adds an animation that will be included in the created sprite sheet.
	 */
	public final native void addAnimation(Number name, Number frames, Number next, Number frequency) /*-{
		this.addAnimation(name, frames, next, frequency);
	}-*/;

	/**
	 * This will take a MovieClip, and add its frames and labels to this builder. Labels will be added as an animation
running from the label index to the next label. For example, if there is a label named "foo" at frame 0 and a label
named "bar" at frame 10, in a MovieClip with 15 frames, it will add an animation named "foo" that runs from frame
index 0 to 9, and an animation named "bar" that runs from frame index 10 to 14.

Note that this will iterate through the full MovieClip with actionsEnabled set to false, ending on the last frame.
	 */
	public final native void addMovieClip(Number source, Number sourceRect, Number scale) /*-{
		this.addMovieClip(source, sourceRect, scale);
	}-*/;

	/**
	 * Builds a SpriteSheet instance based on the current frames.
	 */
	public final native SpriteSheet build() /*-{
		this.build();
	}-*/;

	/**
	 * Asynchronously builds a {{#crossLink "SpriteSheet"}}{{/crossLink}} instance based on the current frames. It will
run 20 times per second, using an amount of time defined by <code>timeSlice</code>. When it is complete it will
call the specified callback.
	 */
	public final native void buildAsync(Number timeSlice) /*-{
		this.buildAsync(timeSlice);
	}-*/;

	/**
	 * Stops the current asynchronous build.
	 */
	public final native void stopAsync() /*-{
		this.stopAsync();
	}-*/;

	/**
	 * SpriteSheetBuilder instances cannot be cloned.
	 */
	public final native SpriteSheetBuilderImpl clone() /*-{
		this.clone();
	}-*/;

	/**
	 * 
	 */
	public final native void _startBuild() /*-{
		this._startBuild();
	}-*/;

	/**
	 * 
	 */
	public final native void _endBuild() /*-{
		this._endBuild();
	}-*/;

	/**
	 * 
	 */
	public final native void _run() /*-{
		this._run();
	}-*/;

	/**
	 * 
	 */
	public final native Boolean _drawNext() /*-{
		this._drawNext();
	}-*/;

}
