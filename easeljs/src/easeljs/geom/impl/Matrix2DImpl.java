package easeljs.geom.impl;

import com.google.gwt.core.client.JavaScriptObject;

public class Matrix2DImpl extends JavaScriptObject {
	protected Matrix2DImpl() {}

	public static native Matrix2DImpl create(Number a) /*-{
		return new $wnd.Matrix2D(a);
	}-*/;

	/*******************************************************
	 * Methods
	 *******************************************************/

	/**
	 * Initialization method.
	 */
	public final native Matrix2DImpl initialize() /*-{
		this.initialize();
	}-*/;

	/**
	 * Concatenates the specified matrix properties with this matrix. All parameters are required.
	 */
	public final native Matrix2DImpl prepend(Number a, Number b, Number c, Number d, Number tx, Number ty) /*-{
		this.prepend(a, b, c, d, tx, ty);
	}-*/;

	/**
	 * Appends the specified matrix properties with this matrix. All parameters are required.
	 */
	public final native Matrix2DImpl append(Number a, Number b, Number c, Number d, Number tx, Number ty) /*-{
		this.append(a, b, c, d, tx, ty);
	}-*/;

	/**
	 * Prepends the specified matrix with this matrix.
	 */
	public final native void prependMatrix(Number matrix) /*-{
		this.prependMatrix(matrix);
	}-*/;

	/**
	 * Appends the specified matrix with this matrix.
	 */
	public final native Matrix2DImpl appendMatrix(Number matrix) /*-{
		this.appendMatrix(matrix);
	}-*/;

	/**
	 * Generates matrix properties from the specified display object transform properties, and prepends them with this matrix.
For example, you can use this to generate a matrix from a display object: var mtx = new Matrix2D();
mtx.prependTransform(o.x, o.y, o.scaleX, o.scaleY, o.rotation);
	 */
	public final native Matrix2DImpl prependTransform(Number x, Number y, Number scaleX, Number scaleY, Number rotation, Number skewX, Number skewY, Number regX, Number regY) /*-{
		this.prependTransform(x, y, scaleX, scaleY, rotation, skewX, skewY, regX, regY);
	}-*/;

	/**
	 * Generates matrix properties from the specified display object transform properties, and appends them with this matrix.
For example, you can use this to generate a matrix from a display object: var mtx = new Matrix2D();
mtx.appendTransform(o.x, o.y, o.scaleX, o.scaleY, o.rotation);
	 */
	public final native Matrix2DImpl appendTransform(Number x, Number y, Number scaleX, Number scaleY, Number rotation, Number skewX, Number skewY, Number regX, Number regY) /*-{
		this.appendTransform(x, y, scaleX, scaleY, rotation, skewX, skewY, regX, regY);
	}-*/;

	/**
	 * Applies a rotation transformation to the matrix.
	 */
	public final native Matrix2DImpl rotate(Number angle) /*-{
		this.rotate(angle);
	}-*/;

	/**
	 * Applies a skew transformation to the matrix.
	 */
	public final native Matrix2DImpl skew(Number skewX, Number skewY) /*-{
		this.skew(skewX, skewY);
	}-*/;

	/**
	 * Applies a scale transformation to the matrix.
	 */
	public final native Matrix2DImpl scale(Number x, Number y) /*-{
		this.scale(x, y);
	}-*/;

	/**
	 * Translates the matrix on the x and y axes.
	 */
	public final native Matrix2DImpl translate(Number x, Number y) /*-{
		this.translate(x, y);
	}-*/;

	/**
	 * Sets the properties of the matrix to those of an identity matrix (one that applies a null transformation).
	 */
	public final native Matrix2DImpl identity() /*-{
		this.identity();
	}-*/;

	/**
	 * Inverts the matrix, causing it to perform the opposite transformation.
	 */
	public final native Matrix2DImpl invert() /*-{
		this.invert();
	}-*/;

	/**
	 * Returns true if the matrix is an identity matrix.
	 */
	public final native Boolean isIdentity() /*-{
		this.isIdentity();
	}-*/;

	/**
	 * Decomposes the matrix into transform properties (x, y, scaleX, scaleY, and rotation). Note that this these values
may not match the transform properties you used to generate the matrix, though they will produce the same visual
results.
	 */
	public final native Matrix2DImpl decompose(Number target) /*-{
		this.decompose(target);
	}-*/;

	/**
	 * Reinitializes all matrix properties to those specified.
	 */
	public final native Matrix2DImpl appendProperties(Number a, Number b, Number c, Number d, Number tx, Number ty, Number alpha, Number shadow, Number compositeOperation) /*-{
		this.appendProperties(a, b, c, d, tx, ty, alpha, shadow, compositeOperation);
	}-*/;

	/**
	 * Appends the specified visual properties to the current matrix.
	 */
	public final native Matrix2DImpl appendProperties(Number alpha, Number shadow, Number compositeOperation) /*-{
		this.appendProperties(alpha, shadow, compositeOperation);
	}-*/;

	/**
	 * Prepends the specified visual properties to the current matrix.
	 */
	public final native Matrix2DImpl prependProperties(Number alpha, Number shadow, Number compositeOperation) /*-{
		this.prependProperties(alpha, shadow, compositeOperation);
	}-*/;

	/**
	 * Returns a clone of the Matrix2D instance.
	 */
	public final native Matrix2DImpl clone() /*-{
		this.clone();
	}-*/;

}
