package easeljs.display;

import com.google.gwt.core.client.JavaScriptObject;

import easeljs.display.impl.SpriteSheetImpl;

public class SpriteSheet {
	protected SpriteSheetImpl impl;

	public SpriteSheet(JavaScriptObject data) {
		this(SpriteSheetImpl.create(data)); 
	}

	protected SpriteSheet(SpriteSheetImpl impl) {
		this.impl = impl;
	}


}
