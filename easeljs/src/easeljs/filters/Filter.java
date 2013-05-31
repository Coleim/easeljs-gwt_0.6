package easeljs.filters;

import easeljs.filters.impl.FilterImpl;

public class Filter {
	protected FilterImpl impl;

	public Filter() {
		this(FilterImpl.create()); 
	}

	protected Filter(FilterImpl impl) {
		this.impl = impl;
	}


}
