package easeljs.filters.impl;

import com.google.gwt.dom.client.Element;
import com.google.gwt.user.client.ui.Image;

public class AlphaMapFilterImpl extends FilterImpl {
	protected AlphaMapFilterImpl() {}

	public static native AlphaMapFilterImpl create(Image alphaMap) /*-{
		return new $wnd.AlphaMapFilter(alphaMap);
	}-*/;
	
	public static native AlphaMapFilterImpl create(Element alphaMap) /*-{
		return new $wnd.AlphaMapFilter(alphaMap);
	}-*/;

	/*******************************************************
	 * Methods
	 *******************************************************/

}
