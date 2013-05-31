package easeljs.utils;

import easeljs.utils.impl.SpriteSheetUtilsImpl;

public class SpriteSheetUtils {
	protected SpriteSheetUtilsImpl impl;

	public SpriteSheetUtils() {
		this(SpriteSheetUtilsImpl.create()); 
	}

	protected SpriteSheetUtils(SpriteSheetUtilsImpl impl) {
		this.impl = impl;
	}


}
