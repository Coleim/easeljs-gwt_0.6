package easeljs.client.display.impl;

import easeljs.client.display.Graphics;


public class ShapeImpl extends DisplayObjectImpl {
	protected ShapeImpl() {}
	
	/**
	 * 
	 * @return
	 */
	public static native ShapeImpl create() /*-{
		return new $wnd.createjs.Shape();
	}-*/;
	
	/**
	 * 
	 * @param graphics The graphics instance to display. If null, a new Graphics instance will be created.
	 * @return
	 */
	public static native ShapeImpl create(Graphics graphics) /*-{
		return new $wnd.Shape(graphics);
	}-*/;
	
	/**********************************************************************
	 * Methods
	 **********************************************************************/
	
	/**
	 * 
	 * @return The graphics instance to display.
	 */
	public final native GraphicsImpl getGraphics() /*-{
		return this.graphics;
	}-*/;
}
