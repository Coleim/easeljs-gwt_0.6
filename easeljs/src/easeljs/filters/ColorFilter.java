package easeljs.filters;

import easeljs.filters.impl.ColorFilterImpl;

public class ColorFilter extends Filter {
	protected ColorFilterImpl impl;

	public ColorFilter(Number redMultiplier) {
		this(ColorFilterImpl.create(redMultiplier)); 
	}

	protected ColorFilter(ColorFilterImpl impl) {
		this.impl = impl;
	}


}
