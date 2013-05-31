package easeljs.filters;

import easeljs.filters.impl.BoxBlurFilterImpl;

public class BoxBlurFilter extends Filter {
	protected BoxBlurFilterImpl impl;

	public BoxBlurFilter(Number blurX) {
		this(BoxBlurFilterImpl.create(blurX)); 
	}

	protected BoxBlurFilter(BoxBlurFilterImpl impl) {
		this.impl = impl;
	}


}
