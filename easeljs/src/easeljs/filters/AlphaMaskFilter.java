package easeljs.filters;

import com.google.gwt.user.client.ui.Image;

import easeljs.filters.impl.AlphaMaskFilterImpl;

public class AlphaMaskFilter extends Filter {
	protected AlphaMaskFilterImpl impl;

	public AlphaMaskFilter(Image mask) {
		this(AlphaMaskFilterImpl.create(mask)); 
	}

	protected AlphaMaskFilter(AlphaMaskFilterImpl impl) {
		this.impl = impl;
	}


}
