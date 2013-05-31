package easeljs.display.impl;

import com.google.gwt.dom.client.Element;

public class DOMElementImpl extends DisplayObjectImpl {
	protected DOMElementImpl() {}

	public static native DOMElementImpl create(Element htmlElement) /*-{
		return new $wnd.DOMElement(htmlElement);
	}-*/;

	/*******************************************************
	 * Methods
	 *******************************************************/

	/**
	 * Draws the display object into the specified context ignoring it's visible, alpha, shadow, and transform.
Returns true if the draw was handled (useful for overriding functionality).
NOTE: This method is mainly for internal use, though it may be useful for advanced uses.
	 */
	public final native void draw(Number ctx, Number ignoreCache) /*-{
		this.draw(ctx, ignoreCache);
	}-*/;

	/**
	 * Not applicable to DOMElement.
	 */
	public final native void cache() /*-{
		this.cache();
	}-*/;


	/**
	 * Not applicable to DOMElement.
	 */
	public final native void updateCache() /*-{
		this.updateCache();
	}-*/;

	/**
	 * Not applicable to DOMElement.
	 */
	public final native void hitArea() /*-{
		this.hitArea();
	}-*/;

	/**
	 * Not applicable to DOMElement.
	 */
	public final native void localToGlobal() /*-{
		this.localToGlobal();
	}-*/;

	/**
	 * Not applicable to DOMElement.
	 */
	public final native void globalToLocal() /*-{
		this.globalToLocal();
	}-*/;

	/**
	 * Not applicable to DOMElement.
	 */
	public final native void localToLocal() /*-{
		this.localToLocal();
	}-*/;

}
