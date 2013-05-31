package easeljs.display.impl;

public class MovieClipImpl extends ContainerImpl {
	protected MovieClipImpl() {}

	public static native MovieClipImpl create(String mode) /*-{
		return new $wnd.MovieClip(mode);
	}-*/;

	/*******************************************************
	 * Methods
	 *******************************************************/

	/**
	 * Draws the display object into the specified context ignoring it's visible, alpha, shadow, and transform.
Returns true if the draw was handled (useful for overriding functionality).
NOTE: This method is mainly for internal use, though it may be useful for advanced uses.
	 */
	public final native void draw(Number ctx, Number ignoreCache) /*-{
		this.draw(ctx, ignoreCache);
	}-*/;

	/**
	 * Sets paused to false.
	 */
	public final native void play() /*-{
		this.play();
	}-*/;

	/**
	 * Sets paused to true.
	 */
	public final native void stop() /*-{
		this.stop();
	}-*/;

	/**
	 * Advances this movie clip to the specified position or label and sets paused to false.
	 */
	public final native void gotoAndPlay(Number positionOrLabel) /*-{
		this.gotoAndPlay(positionOrLabel);
	}-*/;

	/**
	 * Advances this movie clip to the specified position or label and sets paused to true.
	 */
	public final native void gotoAndStop(Number positionOrLabel) /*-{
		this.gotoAndStop(positionOrLabel);
	}-*/;

	/**
	 * 
	 */
	public final native void _goto() /*-{
		this._goto();
	}-*/;

	/**
	 * 
	 */
	public final native void _reset() /*-{
		this._reset();
	}-*/;

	/**
	 * 
	 */
	public final native void _updateTimeline() /*-{
		this._updateTimeline();
	}-*/;

	/**
	 * 
	 */
	public final native void _setState() /*-{
		this._setState();
	}-*/;

	/**
	 * Adds a child to the timeline, and sets it up as a managed child.
	 */
	public final native void _addManagedChild() /*-{
		this._addManagedChild();
	}-*/;

	/**
	 * 
	 */
	public final native void priority() /*-{
		this.priority();
	}-*/;

	/**
	 * 
	 */
	public final native void install() /*-{
		this.install();
	}-*/;

	/**
	 * 
	 */
	public final native void init() /*-{
		this.init();
	}-*/;

	/**
	 * 
	 */
	public final native void step() /*-{
		this.step();
	}-*/;

	/**
	 * 
	 */
	public final native void tween() /*-{
		this.tween();
	}-*/;

}
