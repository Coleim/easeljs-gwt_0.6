package easeljs.display;

import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.user.client.ui.Image;

import easeljs.display.impl.BitmapImpl;


public class Bitmap extends DisplayObject {
	protected BitmapImpl impl;

	public Bitmap(Image imageOrUri) {
		this(BitmapImpl.create(imageOrUri)); 
	}
		
	public Bitmap(String imageOrUri) {
		this(BitmapImpl.create(imageOrUri)); 
	}
	
	public Bitmap(JavaScriptObject imageOrUri) {
		this(BitmapImpl.create(imageOrUri)); 
	}

	protected Bitmap(BitmapImpl impl) {
		this.impl = impl;
	}


}
