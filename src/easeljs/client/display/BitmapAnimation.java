package easeljs.client.display;

import com.google.gwt.core.client.JavaScriptObject;

import easeljs.client.display.impl.BitmapAnimationImpl;


public class BitmapAnimation extends DisplayObject  {

	protected BitmapAnimationImpl impl;
	protected SpriteSheet spriteSheet;
	
	public BitmapAnimation(SpriteSheet spriteSheet) {
		this(BitmapAnimationImpl.create(spriteSheet.getImpl()));
		this.spriteSheet = spriteSheet;
	}
	
	protected BitmapAnimation(BitmapAnimationImpl impl) {
		this.overlay = this.impl = impl;
	}
	
	@Override
	public DisplayObject clone() {
		return new BitmapAnimation((BitmapAnimationImpl)impl.clone());
	}
	
	public void gotoAndPlay(int frame) {
		impl.gotoAndPlay(frame);
	}
	
	public void gotoAndPlay(String frameOrSequence) {
		impl.gotoAndPlay(frameOrSequence);
	}
	
	public void gotoAndStop(int frame) {
		impl.gotoAndStop(frame);
	}
	
	public void gotoAndStop(String frameOrSequence) {
		impl.gotoAndStop(frameOrSequence);
	}

	public int getCurrentFrame() {
		return impl.getCurrentFrame();
	}
	
	public BitmapAnimationImpl getImpl() {
		return impl;
	}
	
	public boolean getPaused() {
		return impl.getPaused();
	}
	
	public SpriteSheet getSpriteSheet() {
		return spriteSheet;
	}
	
	public void setCurrentFrame(int frame) {
		impl.setCurrentFrame(frame);
	}
	
	public void setImpl(BitmapAnimationImpl impl) {
		this.impl = impl;
	}
	
	public void setSpriteSheet(SpriteSheet spriteSheet) {
		impl.setSpriteSheet(spriteSheet.getImpl());
		this.spriteSheet = spriteSheet;
	}
	
	public JavaScriptObject addEventListener(String type, JavaScriptObject listener) {
		return impl.addEventListener(type, listener);
	}

}





