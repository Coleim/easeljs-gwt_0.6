package easeljs.filters.impl;

public class ColorFilterImpl extends FilterImpl {
	protected ColorFilterImpl() {}

	public static native ColorFilterImpl create(Number redMultiplier) /*-{
		return new $wnd.ColorFilter(redMultiplier);
	}-*/;

	/*******************************************************
	 * Methods
	 *******************************************************/


}
