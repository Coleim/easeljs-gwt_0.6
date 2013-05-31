package easeljs.display.impl;

public class TextImpl extends DisplayObjectImpl {
	protected TextImpl() {}

	public static native TextImpl create(String text) /*-{
		return new $wnd.Text(text);
	}-*/;

	/*******************************************************
	 * Methods
	 *******************************************************/

	/**
	 * Draws the Text into the specified context ignoring it's visible, alpha, shadow, and transform.
Returns true if the draw was handled (useful for overriding functionality).
NOTE: This method is mainly for internal use, though it may be useful for advanced uses.
	 */
	public final native void draw(Number ctx, Number ignoreCache) /*-{
		this.draw(ctx, ignoreCache);
	}-*/;

	/**
	 * Returns the measured, untransformed width of the text without wrapping.
	 */
	public final native Number getMeasuredWidth() /*-{
		this.getMeasuredWidth();
	}-*/;

	/**
	 * Returns an approximate line height of the text, ignoring the lineHeight property. This is based on the measured
width of a "M" character multiplied by 1.2, which approximates em for most fonts.
	 */
	public final native Number getMeasuredLineHeight() /*-{
		this.getMeasuredLineHeight();
	}-*/;

	/**
	 * Returns the approximate height of multi-line text by multiplying the number of lines against either the
<code>lineHeight</code> (if specified) or {{#crossLink "Text/getMeasuredLineHeight"}}{{/crossLink}}. Note that
this operation requires the text flowing logic to run, which has an associated CPU cost.
	 */
	public final native Number getMeasuredHeight() /*-{
		this.getMeasuredHeight();
	}-*/;

	/**
	 * 
	 */
	public final native void _drawTextLine(Number ctx, Number text, Number y) /*-{
		this._drawTextLine(ctx, text, y);
	}-*/;

}
