package easeljs.client.display.impl;

import com.google.gwt.core.client.JavaScriptObject;

public class BitmapAnimationImpl extends DisplayObjectImpl {
	protected BitmapAnimationImpl() {}
	
	public static native BitmapAnimationImpl create(SpriteSheetImpl spriteSheet) /*-{
		anim = new $wnd.createjs.BitmapAnimation(spriteSheet);
		console.log(anim);
		return anim;
	}-*/;
	
	/*******************************************************
	 * Properties
	 *******************************************************/
	
	public final native String getCurrentAnimation() /*-{
		return this.currentAnimation;
	}-*/;
	
	public final native String getCurrentAnimationFrame() /*-{
		return this.currentAnimationFrame;
	}-*/;
	
	public final native int getCurrentFrame() /*-{
		return this.currentFrame;
	}-*/;
	
	public final native void setCurrentFrame(int frame) /*-{
		this.currentFrame = frame;
	}-*/;
	
	public final native int getOffset() /*-{
		return this.offset;
	}-*/;
	
	//public final native int getOnAnimationEnd() /*-{
	//	return this.onAnimationEnd;
	//}-*/;

	public final native boolean getPaused() /*-{
		return this.paused;
	}-*/;

	public final native void setPaused(boolean paused) /*-{
		this.paused = paused;
	}-*/;

	public final native boolean getSnapToPixel() /*-{
		return this.snapToPixel;
	}-*/;

	public final native SpriteSheetImpl getSpriteSheet() /*-{
		return this.spriteSheet;
	}-*/;
		
	public final native void setSpriteSheet(SpriteSheetImpl spriteSheet) /*-{
		this.spriteSheet = spriteSheet;
	}-*/;
	

	/*******************************************************
	 * Methods
	 *******************************************************/
		
	/*
	void advance ( )
	void cache ( )
	Point clone ( )
	void draw ( ctx , ignoreCache ): 
		Parameters: ctx <CanvasRenderingContext2D> The canvas 2D context object to draw into.
					ignoreCache <Boolean> Indicates whether the draw operation should ignore any current cache. For example, used for drawing the cache (to prevent it from simply drawing an existing cache back into itself).
	Boolean isVisible ( )
	void play ( )
	void stop ( )	
	String toString ( )
	void uncache ( )
	void updateCache ( )
	*/
	
	public final native void gotoAndPlay(int frame) /*-{
		this.gotoAndPlay(frame);
	}-*/;
	
	public final native void gotoAndPlay(String frameOrAnimation) /*-{
		this.gotoAndPlay(frameOrAnimation);
	}-*/;
	
	public final native void gotoAndStop(int frame) /*-{
		this.gotoAndStop(frame);
	}-*/;
	
	public final native void gotoAndStop(String frameOrAnimation) /*-{
		this.gotoAndStop(frameOrAnimation);
	}-*/;	
	
	
	public final native JavaScriptObject addEventListener(String type, JavaScriptObject listener) /*-{
		return this.addEventListener(type, listener);
	}-*/;	
	
}
