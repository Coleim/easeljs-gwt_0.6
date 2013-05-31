package easeljs.utils;

import easeljs.utils.impl.SpriteSheetBuilderImpl;

public class SpriteSheetBuilder {
	protected SpriteSheetBuilderImpl impl;

	public SpriteSheetBuilder() {
		this(SpriteSheetBuilderImpl.create()); 
	}

	protected SpriteSheetBuilder(SpriteSheetBuilderImpl impl) {
		this.impl = impl;
	}


}
