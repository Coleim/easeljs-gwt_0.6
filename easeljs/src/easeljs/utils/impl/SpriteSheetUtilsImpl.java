package easeljs.utils.impl;

import com.google.gwt.canvas.client.Canvas;
import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.user.client.ui.Image;

public class SpriteSheetUtilsImpl extends JavaScriptObject {
	protected SpriteSheetUtilsImpl() {}

	public static native SpriteSheetUtilsImpl create() /*-{
		return new $wnd.SpriteSheetUtils();
	}-*/;

	/*******************************************************
	 * Methods
	 *******************************************************/

	/**
	 * <b>This is an experimental method, and may be buggy. Please report issues.</b><br/><br/>
Extends the existing sprite sheet by flipping the original frames horizontally, vertically, or both,
and adding appropriate animation & frame data. The flipped animations will have a suffix added to their names
(_h, _v, _hv as appropriate). Make sure the sprite sheet images are fully loaded before using this method.
<br/><br/>
For example:<br/>
SpriteSheetUtils.addFlippedFrames(mySpriteSheet, true, true);
The above would add frames that are flipped horizontally AND frames that are flipped vertically.
<br/><br/>
Note that you can also flip any display object by setting its scaleX or scaleY to a negative value. On some
browsers (especially those without hardware accelerated canvas) this can result in slightly degraded performance,
which is why addFlippedFrames is available.
	 */
	public final native void addFlippedFrames(Number spriteSheet, Number horizontal, Number vertical, Number both) /*-{
		this.addFlippedFrames(spriteSheet, horizontal, vertical, both);
	}-*/;

	/**
	 * Returns a single frame of the specified sprite sheet as a new PNG image.

<strong>WARNING:</strong> In almost all cases it is better to display a single frame using a {{#crossLink "BitmapAnimation"}}{{/crossLink}}
with a {{#crossLink "BitmapAnimation/gotoAndStop"}}{{/crossLink}} call than it is to slice out a frame using this
method and display it with a Bitmap instance. You can also crop an image using the <code>sourceRect</code>
property of {{#crossLink "Bitmap"}}{{/crossLink}}.

The extractFrame method may cause cross-domain warnings since it accesses pixels directly on the canvas.
	 */
	public final native Image extractFrame(Number spriteSheet, Number frame) /*-{
		this.extractFrame(spriteSheet, frame);
	}-*/;

	/**
	 * Merges the rgb channels of one image with the alpha channel of another. This can be used to combine a compressed
JPEG image containing color data with a PNG32 monochromatic image containing alpha data. With certain types of
images (those with detail that lend itself to JPEG compression) this can provide significant file size savings
versus a single RGBA PNG32. This method is very fast (generally on the order of 1-2 ms to run).
	 */
	public final native Canvas mergeAlpha(Number rbgImage, Number alphaImage, Number canvas) /*-{
		this.mergeAlpha(rbgImage, alphaImage, canvas);
	}-*/;

}
