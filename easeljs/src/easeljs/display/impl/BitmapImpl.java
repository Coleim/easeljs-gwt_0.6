package easeljs.display.impl;

import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.user.client.ui.Image;

public class BitmapImpl extends DisplayObjectImpl {
	protected BitmapImpl() {}

	public static native BitmapImpl create(Image imageOrUri) /*-{
		return new $wnd.Bitmap(imageOrUri);
	}-*/;

	public static native BitmapImpl create(JavaScriptObject imageOrUri) /*-{
		return new $wnd.Bitmap(imageOrUri);
	}-*/;

	public static native BitmapImpl create(String imageOrUri) /*-{
		return new $wnd.Bitmap(imageOrUri);
	}-*/;

	/*******************************************************
	 * Methods
	 *******************************************************/

	/**
	 * Because the content of a Bitmap is already in a simple format, cache is unnecessary for Bitmap instances.
You should <b>not</b> cache Bitmap instances as it can degrade performance.

<strong>However: If you want to use a filter on a Bitmap, you <em>MUST</em> cache it, or it will not work.</strong>
To see the API for caching, please visit the DisplayObject {{#crossLink "DisplayObject/cache"}}{{/crossLink}}
method.
	 */
	public final native void cache() /*-{
		this.cache();
	}-*/;

	/**
	 * Because the content of a Bitmap is already in a simple format, cache is unnecessary for Bitmap instances.
You should <b>not</b> cache Bitmap instances as it can degrade performance.

<strong>However: If you want to use a filter on a Bitmap, you <em>MUST</em> cache it, or it will not work.</strong>
To see the API for caching, please visit the DisplayObject {{#crossLink "DisplayObject/cache"}}{{/crossLink}}
method.
	 */
	public final native void updateCache() /*-{
		this.updateCache();
	}-*/;


}
