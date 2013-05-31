package easeljs.display.impl;

import com.google.gwt.core.client.JavaScriptObject;

public class GraphicsImpl extends JavaScriptObject {
	protected GraphicsImpl() {}

	public static native GraphicsImpl create() /*-{
		return new $wnd.Graphics();
	}-*/;

	/*******************************************************
	 * Methods
	 *******************************************************/

	/**
	 * Returns a CSS compatible color string based on the specified RGB numeric color values in the format 
"rgba(255,255,255,1.0)", or if alpha is null then in the format "rgb(255,255,255)". For example,

     Graphics.getRGB(50, 100, 150, 0.5);
     // Returns "rgba(50,100,150,0.5)"

It also supports passing a single hex color value as the first param, and an optional alpha value as the second
param. For example,

     Graphics.getRGB(0xFF00FF, 0.2);
     // Returns "rgba(255,0,255,0.2)"
	 */
	public final native String getRGB(Number r, Number g, Number b, Number alpha) /*-{
		this.getRGB(r, g, b, alpha);
	}-*/;

	/**
	 * Returns a CSS compatible color string based on the specified HSL numeric color values in the format "hsla(360,100,100,1.0)", 
or if alpha is null then in the format "hsl(360,100,100)".

     Graphics.getHSL(150, 100, 70);
     // Returns "hsl(150,100,70)"
	 */
	public final native String getHSL(Number hue, Number saturation, Number lightness, Number alpha) /*-{
		this.getHSL(hue, saturation, lightness, alpha);
	}-*/;

	/**
	 * Initialization method.
	 */
	public final native void initialize() /*-{
		this.initialize();
	}-*/;

	/**
	 * Returns true if this Graphics instance has no drawing commands.
	 */
	public final native Boolean isEmpty() /*-{
		this.isEmpty();
	}-*/;

	/**
	 * Draws the display object into the specified context ignoring it's visible, alpha, shadow, and transform.
Returns true if the draw was handled (useful for overriding functionality).

NOTE: This method is mainly for internal use, though it may be useful for advanced uses.
	 */
	public final native void draw(Number ctx) /*-{
		this.draw(ctx);
	}-*/;

	/**
	 * Draws only the path described for this Graphics instance, skipping any non-path instructions, including fill and
stroke descriptions. Used by <code>DisplayObject.clippingPath</code> to draw the clipping path, for example.
	 */
	public final native void drawAsPath(Number ctx) /*-{
		this.drawAsPath(ctx);
	}-*/;

	/**
	 * Moves the drawing point to the specified position. A tiny API method "mt" also exists.
	 */
	public final native GraphicsImpl moveTo(Number x, Number y) /*-{
		this.moveTo(x, y);
	}-*/;

	/**
	 * Draws a line from the current drawing point to the specified position, which become the new current drawing
point. A tiny API method "lt" also exists.

For detailed information, read the 
<a href="http://www.whatwg.org/specs/web-apps/current-work/multipage/the-canvas-element.html#complex-shapes-(paths)">
whatwg spec</a>.
	 */
	public final native GraphicsImpl lineTo(Number x, Number y) /*-{
		this.lineTo(x, y);
	}-*/;

	/**
	 * Draws an arc with the specified control points and radius.  For detailed information, read the 
<a href="http://www.whatwg.org/specs/web-apps/current-work/multipage/the-canvas-element.html#dom-context-2d-arcto">
whatwg spec</a>. A tiny API method "at" also exists.
	 */
	public final native GraphicsImpl arcTo(Number x1, Number y1, Number x2, Number y2, Number radius) /*-{
		this.arcTo(x1, y1, x2, y2, radius);
	}-*/;

	/**
	 * Draws an arc defined by the radius, startAngle and endAngle arguments, centered at the position (x, y). For
example, to draw a full circle with a radius of 20 centered at (100, 100):

     arc(100, 100, 20, 0, Math.PI*2);

For detailed information, read the
<a href="http://www.whatwg.org/specs/web-apps/current-work/multipage/the-canvas-element.html#dom-context-2d-arc">whatwg spec</a>.
A tiny API method "a" also exists.
	 */
	public final native GraphicsImpl arc(Number x, Number y, Number radius, Number startAngle, Number endAngle, Number anticlockwise) /*-{
		this.arc(x, y, radius, startAngle, endAngle, anticlockwise);
	}-*/;

	/**
	 * Draws a quadratic curve from the current drawing point to (x, y) using the control point (cpx, cpy). For detailed
information, read the <a href="http://www.whatwg.org/specs/web-apps/current-work/multipage/the-canvas-element.html#dom-context-2d-quadraticcurveto">
whatwg spec</a>. A tiny API method "qt" also exists.
	 */
	public final native GraphicsImpl quadraticCurveTo(Number cpx, Number cpy, Number x, Number y) /*-{
		this.quadraticCurveTo(cpx, cpy, x, y);
	}-*/;

	/**
	 * Draws a bezier curve from the current drawing point to (x, y) using the control points (cp1x, cp1y) and (cp2x,
cp2y). For detailed information, read the
<a href="http://www.whatwg.org/specs/web-apps/current-work/multipage/the-canvas-element.html#dom-context-2d-beziercurveto">
whatwg spec</a>. A tiny API method "bt" also exists.
	 */
	public final native GraphicsImpl bezierCurveTo(Number cp1x, Number cp1y, Number cp2x, Number cp2y, Number x, Number y) /*-{
		this.bezierCurveTo(cp1x, cp1y, cp2x, cp2y, x, y);
	}-*/;

	/**
	 * Draws a rectangle at (x, y) with the specified width and height using the current fill and/or stroke.
For detailed information, read the
<a href="http://www.whatwg.org/specs/web-apps/current-work/multipage/the-canvas-element.html#dom-context-2d-rect">
whatwg spec</a>. A tiny API method "r" also exists.
	 */
	public final native GraphicsImpl rect(Number x, Number y, Number w, Number h) /*-{
		this.rect(x, y, w, h);
	}-*/;

	/**
	 * Closes the current path, effectively drawing a line from the current drawing point to the first drawing point specified
since the fill or stroke was last set. A tiny API method "cp" also exists.
	 */
	public final native GraphicsImpl closePath() /*-{
		this.closePath();
	}-*/;

	/**
	 * Clears all drawing instructions, effectively resetting this Graphics instance. Any line and fill styles will need
to be redefined to draw shapes following a clear call. A tiny API method "c" also exists.
	 */
	public final native GraphicsImpl clear() /*-{
		this.clear();
	}-*/;

	/**
	 * Begins a fill with the specified color. This ends the current sub-path. A tiny API method "f" also exists.
	 */
	public final native GraphicsImpl beginFill(Number color) /*-{
		this.beginFill(color);
	}-*/;

	/**
	 * Begins a linear gradient fill defined by the line (x0, y0) to (x1, y1). This ends the current sub-path. For
example, the following code defines a black to white vertical gradient ranging from 20px to 120px, and draws a
square to display it:

     myGraphics.beginLinearGradientFill(["#000","#FFF"], [0, 1], 0, 20, 0, 120).drawRect(20, 20, 120, 120);

A tiny API method "lf" also exists.
	 */
	public final native GraphicsImpl beginLinearGradientFill(Number colors, Number ratios, Number x0, Number y0, Number x1, Number y1) /*-{
		this.beginLinearGradientFill(colors, ratios, x0, y0, x1, y1);
	}-*/;

	/**
	 * Begins a radial gradient fill. This ends the current sub-path. For example, the following code defines a red to
blue radial gradient centered at (100, 100), with a radius of 50, and draws a circle to display it:

     myGraphics.beginRadialGradientFill(["#F00","#00F"], [0, 1], 100, 100, 0, 100, 100, 50).drawCircle(100, 100, 50);

A tiny API method "rf" also exists.
	 */
	public final native GraphicsImpl beginRadialGradientFill(Number colors, Number ratios, Number x0, Number y0, Number r0, Number x1, Number y1, Number r1) /*-{
		this.beginRadialGradientFill(colors, ratios, x0, y0, r0, x1, y1, r1);
	}-*/;

	/**
	 * Begins a pattern fill using the specified image. This ends the current sub-path. A tiny API method "bf" also
exists.
	 */
	public final native GraphicsImpl beginBitmapFill(Number image, Number repetition, Number matrix) /*-{
		this.beginBitmapFill(image, repetition, matrix);
	}-*/;

	/**
	 * Ends the current sub-path, and begins a new one with no fill. Functionally identical to <code>beginFill(null)</code>.
A tiny API method "ef" also exists.
	 */
	public final native GraphicsImpl endFill() /*-{
		this.endFill();
	}-*/;

	/**
	 * Sets the stroke style for the current sub-path. Like all drawing methods, this can be chained, so you can define
the stroke style and color in a single line of code like so:

     myGraphics.setStrokeStyle(8,"round").beginStroke("#F00");

A tiny API method "ss" also exists.
	 */
	public final native GraphicsImpl setStrokeStyle(Number thickness, Number caps, Number joints, Number miterLimit, Number ignoreScale) /*-{
		this.setStrokeStyle(thickness, caps, joints, miterLimit, ignoreScale);
	}-*/;

	/**
	 * Begins a stroke with the specified color. This ends the current sub-path. A tiny API method "s" also exists.
	 */
	public final native GraphicsImpl beginStroke(Number color) /*-{
		this.beginStroke(color);
	}-*/;

	/**
	 * Begins a linear gradient stroke defined by the line (x0, y0) to (x1, y1). This ends the current sub-path. For
example, the following code defines a black to white vertical gradient ranging from 20px to 120px, and draws a
square to display it:

     myGraphics.setStrokeStyle(10).
         beginLinearGradientStroke(["#000","#FFF"], [0, 1], 0, 20, 0, 120).drawRect(20, 20, 120, 120);

A tiny API method "ls" also exists.
	 */
	public final native GraphicsImpl beginLinearGradientStroke(Number colors, Number ratios, Number x0, Number y0, Number x1, Number y1) /*-{
		this.beginLinearGradientStroke(colors, ratios, x0, y0, x1, y1);
	}-*/;

	/**
	 * Begins a radial gradient stroke. This ends the current sub-path. For example, the following code defines a red to
blue radial gradient centered at (100, 100), with a radius of 50, and draws a rectangle to display it:

     myGraphics.setStrokeStyle(10)
         .beginRadialGradientStroke(["#F00","#00F"], [0, 1], 100, 100, 0, 100, 100, 50)
         .drawRect(50, 90, 150, 110);

A tiny API method "rs" also exists.
	 */
	public final native GraphicsImpl beginRadialGradientStroke(Number colors, Number ratios, Number x0, Number y0, Number r0, Number x1, Number y1, Number r1) /*-{
		this.beginRadialGradientStroke(colors, ratios, x0, y0, r0, x1, y1, r1);
	}-*/;

	/**
	 * Begins a pattern fill using the specified image. This ends the current sub-path. Note that unlike bitmap fills,
strokes do not currently support a matrix parameter due to limitations in the canvas API. A tiny API method "bs"
also exists.
	 */
	public final native GraphicsImpl beginBitmapStroke(Number image, Number repetition) /*-{
		this.beginBitmapStroke(image, repetition);
	}-*/;

	/**
	 * Ends the current sub-path, and begins a new one with no stroke. Functionally identical to <code>beginStroke(null)</code>.
A tiny API method "es" also exists.
	 */
	public final native GraphicsImpl endStroke() /*-{
		this.endStroke();
	}-*/;

	/**
	 * Maps the familiar ActionScript <code>curveTo()</code> method to the functionally similar {{#crossLink "Graphics/quadraticCurveTo"}}{{/crossLink}}
method.
	 */
	public final native void curveTo() /*-{
		this.curveTo();
	}-*/;

	/**
	 * Maps the familiar ActionScript <code>drawRect()</code> method to the functionally similar {{#crossLink "Graphics/rect"}}{{/crossLink}}
method.
	 */
	public final native void drawRect() /*-{
		this.drawRect();
	}-*/;

	/**
	 * Draws a rounded rectangle with all corners with the specified radius.
	 */
	public final native GraphicsImpl drawRoundRect(Number x, Number y, Number w, Number h, Number radius) /*-{
		this.drawRoundRect(x, y, w, h, radius);
	}-*/;

	/**
	 * Draws a rounded rectangle with different corner radii. Supports positive and negative corner radii. A tiny API
method "rc" also exists.
	 */
	public final native GraphicsImpl drawRoundRectComplex(Number x, Number y, Number w, Number h, Number radiusTL, Number radiusTR, Number radiusBR, Number radiusBL) /*-{
		this.drawRoundRectComplex(x, y, w, h, radiusTL, radiusTR, radiusBR, radiusBL);
	}-*/;

	/**
	 * Draws a circle with the specified radius at (x, y).

     var g = new Graphics();
	    g.setStrokeStyle(1);
	    g.beginStroke(Graphics.getRGB(0,0,0));
	    g.beginFill(Graphics.getRGB(255,0,0));
	    g.drawCircle(0,0,3);

	    var s = new Shape(g);
		s.x = 100;
		s.y = 100;

	    stage.addChild(s);
	    stage.update();

A tiny API method "dc" also exists.
	 */
	public final native GraphicsImpl drawCircle(Number x, Number y, Number radius) /*-{
		this.drawCircle(x, y, radius);
	}-*/;

	/**
	 * Draws an ellipse (oval) with a specified width (w) and height (h). Similar to {{#crossLink "Graphics/drawCircle"}}{{/crossLink}},
except the width and height can be different. A tiny API method "de" also exists.
	 */
	public final native GraphicsImpl drawEllipse(Number x, Number y, Number w, Number h) /*-{
		this.drawEllipse(x, y, w, h);
	}-*/;

	/**
	 * Draws a star if pointSize is greater than 0, or a regular polygon if pointSize is 0 with the specified number of
points. For example, the following code will draw a familiar 5 pointed star shape centered at 100, 100 and with a
radius of 50:

     myGraphics.beginFill("#FF0").drawPolyStar(100, 100, 50, 5, 0.6, -90);
     // Note: -90 makes the first point vertical

A tiny API method "dp" also exists.
	 */
	public final native GraphicsImpl drawPolyStar(Number x, Number y, Number radius, Number sides, Number pointSize, Number angle) /*-{
		this.drawPolyStar(x, y, radius, sides, pointSize, angle);
	}-*/;

	/**
	 * Decodes a compact encoded path string into a series of draw instructions.
This format is not intended to be human readable, and is meant for use by authoring tools.
The format uses a base64 character set, with each character representing 6 bits, to define a series of draw
commands.

Each command is comprised of a single "header" character followed by a variable number of alternating x and y
position values. Reading the header bits from left to right (most to least significant): bits 1 to 3 specify the
type of operation (0-moveTo, 1-lineTo, 2-quadraticCurveTo, 3-bezierCurveTo, 4-closePath, 5-7 unused). Bit 4
indicates whether position values use 12 bits (2 characters) or 18 bits (3 characters), with a one indicating the
latter. Bits 5 and 6 are currently unused.

Following the header is a series of 0 (closePath), 2 (moveTo, lineTo), 4 (quadraticCurveTo), or 6 (bezierCurveTo)
parameters. These parameters are alternating x/y positions represented by 2 or 3 characters (as indicated by the
4th bit in the command char). These characters consist of a 1 bit sign (1 is negative, 0 is positive), followed
by an 11 (2 char) or 17 (3 char) bit integer value. All position values are in tenths of a pixel. Except in the
case of move operations which are absolute, this value is a delta from the previous x or y position (as
appropriate).

For example, the string "A3cAAMAu4AAA" represents a line starting at -150,0 and ending at 150,0.
<br />A - bits 000000. First 3 bits (000) indicate a moveTo operation. 4th bit (0) indicates 2 chars per
parameter.
<br />n0 - 110111011100. Absolute x position of -150.0px. First bit indicates a negative value, remaining bits
indicate 1500 tenths of a pixel.
<br />AA - 000000000000. Absolute y position of 0.
<br />I - 001100. First 3 bits (001) indicate a lineTo operation. 4th bit (1) indicates 3 chars per parameter.
<br />Au4 - 000000101110111000. An x delta of 300.0px, which is added to the previous x value of -150.0px to
provide an absolute position of +150.0px.
<br />AAA - 000000000000000000. A y delta value of 0.

A tiny API method "p" also exists.
	 */
	public final native GraphicsImpl decodePath(Number str) /*-{
		this.decodePath(str);
	}-*/;

	/**
	 * Returns a clone of this Graphics instance.
	 */
	public final native GraphicsImpl clone() /*-{
		this.clone();
	}-*/;

	/**
	 * 
	 */
	public final native void mt() /*-{
		this.mt();
	}-*/;

	/**
	 * 
	 */
	public final native void lt() /*-{
		this.lt();
	}-*/;

	/**
	 * 
	 */
	public final native void at() /*-{
		this.at();
	}-*/;

	/**
	 * 
	 */
	public final native void bt() /*-{
		this.bt();
	}-*/;

	/**
	 * 
	 */
	public final native void qt() /*-{
		this.qt();
	}-*/;

	/**
	 * 
	 */
	public final native void a() /*-{
		this.a();
	}-*/;

	/**
	 * 
	 */
	public final native void r() /*-{
		this.r();
	}-*/;

	/**
	 * 
	 */
	public final native void cp() /*-{
		this.cp();
	}-*/;

	/**
	 * 
	 */
	public final native void c() /*-{
		this.c();
	}-*/;

	/**
	 * 
	 */
	public final native void f() /*-{
		this.f();
	}-*/;

	/**
	 * 
	 */
	public final native void lf() /*-{
		this.lf();
	}-*/;

	/**
	 * 
	 */
	public final native void rf() /*-{
		this.rf();
	}-*/;

	/**
	 * 
	 */
	public final native void bf() /*-{
		this.bf();
	}-*/;

	/**
	 * 
	 */
	public final native void ef() /*-{
		this.ef();
	}-*/;

	/**
	 * 
	 */
	public final native void ss() /*-{
		this.ss();
	}-*/;

	/**
	 * 
	 */
	public final native void s() /*-{
		this.s();
	}-*/;

	/**
	 * 
	 */
	public final native void ls() /*-{
		this.ls();
	}-*/;

	/**
	 * 
	 */
	public final native void rs() /*-{
		this.rs();
	}-*/;

	/**
	 * 
	 */
	public final native void bs() /*-{
		this.bs();
	}-*/;

	/**
	 * 
	 */
	public final native void es() /*-{
		this.es();
	}-*/;

	/**
	 * 
	 */
	public final native void dr() /*-{
		this.dr();
	}-*/;

	/**
	 * 
	 */
	public final native void rr() /*-{
		this.rr();
	}-*/;

	/**
	 * 
	 */
	public final native void rc() /*-{
		this.rc();
	}-*/;

	/**
	 * 
	 */
	public final native void dc() /*-{
		this.dc();
	}-*/;

	/**
	 * 
	 */
	public final native void de() /*-{
		this.de();
	}-*/;

	/**
	 * 
	 */
	public final native void dp() /*-{
		this.dp();
	}-*/;

	/**
	 * 
	 */
	public final native void p() /*-{
		this.p();
	}-*/;

	/**
	 * 
	 */
	public final native void _updateInstructions() /*-{
		this._updateInstructions();
	}-*/;

	/**
	 * 
	 */
	public final native void _newPath() /*-{
		this._newPath();
	}-*/;

	/**
	 * Used to create Commands that set properties
	 */
	public final native void _setProp(Number name, Number value) /*-{
		this._setProp(name, value);
	}-*/;

}
