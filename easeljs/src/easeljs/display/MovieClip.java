package easeljs.display;

import easeljs.display.impl.MovieClipImpl;

public class MovieClip extends Container {
	protected MovieClipImpl impl;

	public MovieClip(String mode) {
		this(MovieClipImpl.create(mode)); 
	}

	protected MovieClip(MovieClipImpl impl) {
		this.impl = impl;
	}


}
