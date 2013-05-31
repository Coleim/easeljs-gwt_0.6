package easeljs.display;

import easeljs.display.impl.BitmapAnimationImpl;

public class BitmapAnimation extends DisplayObject {
	protected BitmapAnimationImpl impl;

	public BitmapAnimation(SpriteSheet spriteSheet) {
		this(BitmapAnimationImpl.create(spriteSheet)); 
	}

	protected BitmapAnimation(BitmapAnimationImpl impl) {
		this.impl = impl;
	}


}
