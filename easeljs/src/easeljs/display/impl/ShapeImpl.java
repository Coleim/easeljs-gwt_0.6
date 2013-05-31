package easeljs.display.impl;

import easeljs.display.Graphics;

public class ShapeImpl extends DisplayObjectImpl {
	protected ShapeImpl() {}

	public static native ShapeImpl create(Graphics graphics) /*-{
		return new $wnd.Shape(graphics);
	}-*/;

	/*******************************************************
	 * Methods
	 *******************************************************/

	/**
	 * Initialization method.
	 */
	public final native void initialize(Graphics graphics) /*-{
		this.initialize(graphics);
	}-*/;

	/**
	 * Returns a clone of this Shape. Some properties that are specific to this instance's current context are reverted to 
their defaults (for example .parent).
	 */
	public final native void clone(Graphics recursive) /*-{
		this.clone(recursive);
	}-*/;

}
