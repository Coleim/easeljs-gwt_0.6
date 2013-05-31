package easeljs.filters.impl;

import com.google.gwt.user.client.ui.Image;

public class AlphaMaskFilterImpl extends FilterImpl {
	protected AlphaMaskFilterImpl() {}

	public static native AlphaMaskFilterImpl create(Image mask) /*-{
		return new $wnd.AlphaMaskFilter(mask);
	}-*/;

}
