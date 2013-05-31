package easeljs.ui;

import easeljs.display.BitmapAnimation;
import easeljs.display.MovieClip;
import easeljs.ui.impl.ButtonHelperImpl;

public class ButtonHelper {
	protected ButtonHelperImpl impl;

	public ButtonHelper(BitmapAnimation target) {
		this(ButtonHelperImpl.create(target)); 
	}
	
	public ButtonHelper(MovieClip target) {
		this(ButtonHelperImpl.create(target)); 
	}

	protected ButtonHelper(ButtonHelperImpl impl) {
		this.impl = impl;
	}


}
