package easeljs.filters.impl;

import java.util.ArrayList;

public class ColorMatrixImpl {
	protected ColorMatrixImpl() {}

	public static native ColorMatrixImpl create(Number brightness) /*-{
		return new $wnd.ColorMatrix(brightness);
	}-*/;

	/*******************************************************
	 * Methods
	 *******************************************************/

	/**
	 * Initialization method.
	 */
	public final native void initialize() /*-{
		this.initialize();
	}-*/;

	/**
	 * Resets the matrix to identity values.
	 */
	public final native ColorMatrixImpl reset() /*-{
		this.reset();
	}-*/;

	/**
	 * Shortcut method to adjust brightness, contrast, saturation and hue.
Equivalent to calling adjustHue(hue), adjustContrast(contrast),
adjustBrightness(brightness), adjustSaturation(saturation), in that order.
	 */
	public final native ColorMatrixImpl adjustColor(Number brightness, Number contrast, Number saturation, Number hue) /*-{
		this.adjustColor(brightness, contrast, saturation, hue);
	}-*/;

	/**
	 * Adjusts the brightness of pixel color by adding the specified value to the red, green and blue channels.
Positive values will make the image brighter, negative values will make it darker.
	 */
	public final native ColorMatrixImpl adjustBrightness(Number value) /*-{
		this.adjustBrightness(value);
	}-*/;

	/**
	 * Adjusts the contrast of pixel color.
Positive values will increase contrast, negative values will decrease contrast.
	 */
	public final native ColorMatrixImpl adjustContrast(Number value) /*-{
		this.adjustContrast(value);
	}-*/;

	/**
	 * Adjusts the color saturation of the pixel.
Positive values will increase saturation, negative values will decrease saturation (trend towards greyscale).
	 */
	public final native ColorMatrixImpl adjustSaturation(Number value) /*-{
		this.adjustSaturation(value);
	}-*/;

	/**
	 * Adjusts the hue of the pixel color.
	 */
	public final native ColorMatrixImpl adjustHue(Number value) /*-{
		this.adjustHue(value);
	}-*/;

	/**
	 * Concatenates (multiplies) the specified matrix with this one.
	 */
	public final native ColorMatrixImpl concat(Number matrix) /*-{
		this.concat(matrix);
	}-*/;

	/**
	 * Returns a clone of this ColorMatrix.
	 */
	public final native ColorMatrixImpl clone() /*-{
		this.clone();
	}-*/;

	/**
	 * Return a length 25 (5x5) array instance containing this matrix's values.
	 */
	public final native ArrayList<Number> toArray() /*-{
		this.toArray();
	}-*/;

	/**
	 * Copy the specified matrix's values to this matrix.
	 */
	public final native ColorMatrixImpl copyMatrix(Number matrix) /*-{
		this.copyMatrix(matrix);
	}-*/;

	/**
	 * 
	 */
	public final native void _multiplyMatrix() /*-{
		this._multiplyMatrix();
	}-*/;

	/**
	 * Make sure values are within the specified range, hue has a limit of 180, brightness is 255, others are 100.
	 */
	public final native void _cleanValue() /*-{
		this._cleanValue();
	}-*/;

	/**
	 * Makes sure matrixes are 5x5 (25 long).
	 */
	public final native void _fixMatrix() /*-{
		this._fixMatrix();
	}-*/;

}
