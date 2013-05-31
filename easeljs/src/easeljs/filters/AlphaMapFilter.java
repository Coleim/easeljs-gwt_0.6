package easeljs.filters;

import com.google.gwt.dom.client.Element;
import com.google.gwt.user.client.ui.Image;

import easeljs.filters.impl.AlphaMapFilterImpl;

public class AlphaMapFilter extends Filter {
	protected AlphaMapFilterImpl impl;

	public AlphaMapFilter(Element alphaMap) {
		this(AlphaMapFilterImpl.create(alphaMap)); 
	}
	
	public AlphaMapFilter(Image alphaMap) {
		this(AlphaMapFilterImpl.create(alphaMap)); 
	}

	protected AlphaMapFilter(AlphaMapFilterImpl impl) {
		this.impl = impl;
	}


}
