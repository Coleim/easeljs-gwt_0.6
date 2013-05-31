package easeljs.display.impl;

import com.google.gwt.core.client.JavaScriptObject;

import easeljs.display.Stage;
import easeljs.geom.Matrix2D;
import easeljs.geom.Point;

public class DisplayObjectImpl extends JavaScriptObject {
	protected DisplayObjectImpl() {}

	public static native DisplayObjectImpl create() /*-{
		return new $wnd.DisplayObject();
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
	 * Returns true or false indicating whether the display object would be visible if drawn to a canvas.
This does not account for whether it would be visible within the boundaries of the stage.

NOTE: This method is mainly for internal use, though it may be useful for advanced uses.
	 */
	public final native Boolean isVisible() /*-{
		this.isVisible();
	}-*/;

	/**
	 * Draws the display object into the specified context ignoring it's visible, alpha, shadow, and transform.
Returns <code>true</code> if the draw was handled (useful for overriding functionality).

NOTE: This method is mainly for internal use, though it may be useful for advanced uses.
	 */
	public final native void draw(JavaScriptObject ctx, Boolean ignoreCache) /*-{
		this.draw(ctx, ignoreCache);
	}-*/;

	/**
	 * Applies this display object's transformation, alpha, globalCompositeOperation, clipping path (mask), and shadow
to the specified context. This is typically called prior to {{#crossLink "DisplayObject/draw"}}{{/crossLink}}.
	 */
	public final native void updateContext(JavaScriptObject ctx) /*-{
		this.updateContext(ctx);
	}-*/;

	/**
	 * Draws the display object into a new canvas, which is then used for subsequent draws. For complex content
that does not change frequently (ex. a Container with many children that do not move, or a complex vector Shape),
this can provide for much faster rendering because the content does not need to be re-rendered each tick. The
cached display object can be moved, rotated, faded, etc freely, however if it's content changes, you must
manually update the cache by calling <code>updateCache()</code> or <code>cache()</code> again. You must specify
the cache area via the x, y, w, and h parameters. This defines the rectangle that will be rendered and cached
using this display object's coordinates.

<h4>Example</h4>
For example if you defined a Shape that drew a circle at 0, 0 with a radius of 25:

     var shape = new createjs.Shape();
     shape.graphics.beginFill("#ff0000").drawCircle(0, 0, 25);
     myShape.cache(-25, -25, 50, 50);

Note that filters need to be defined <em>before</em> the cache is applied. Check out the {{#crossLink "Filter"}}{{/crossLink}}
class for more information.
	 */
	public final native void cache(Number x, Number y, Number width, Number height, Number scale) /*-{
		this.cache(x, y, width, height, scale);
	}-*/;

	/**
	 * Redraws the display object to its cache. Calling updateCache without an active cache will throw an error.
If compositeOperation is null the current cache will be cleared prior to drawing. Otherwise the display object
will be drawn over the existing cache using the specified compositeOperation.

<h4>Example</h4>
Clear the current graphics of a cached shape, draw some new instructions, and then update the cache. The new line
will be drawn on top of the old one.

     // Not shown: Creating the shape, and caching it.
     shapeInstance.clear();
     shapeInstance.setStrokeStyle(3).beginStroke("#ff0000").moveTo(100, 100).lineTo(200,200);
     shapeInstance.updateCache();
	 */
	public final native void updateCache(Number compositeOperation) /*-{
		this.updateCache(compositeOperation);
	}-*/;

	/**
	 * Clears the current cache. See {{#crossLink "DisplayObject/cache"}}{{/crossLink}} for more information.
	 */
	public final native void uncache() /*-{
		this.uncache();
	}-*/;

	/**
	 * Returns a data URL for the cache, or null if this display object is not cached.
Uses cacheID to ensure a new data URL is not generated if the cache has not changed.
	 */
	public final native void getCacheDataURL() /*-{
		this.getCacheDataURL.();
	}-*/;

	/**
	 * Returns the stage that this display object will be rendered on, or null if it has not been added to one.
	 */
	public final native Stage getStage() /*-{
		this.getStage();
	}-*/;

	/**
	 * Transforms the specified x and y position from the coordinate space of the display object
to the global (stage) coordinate space. For example, this could be used to position an HTML label
over a specific point on a nested display object. Returns a Point instance with x and y properties
correlating to the transformed coordinates on the stage.

<h4>Example</h4>

     displayObject.x = 300;
     displayObject.y = 200;
     stage.addChild(displayObject);
     var point = myDisplayObject.localToGlobal(100, 100);
     // Results in x=400, y=300
	 */
	public final native Point localToGlobal(Number x, Number y) /*-{
		this.localToGlobal(x, y);
	}-*/;

	/**
	 * Transforms the specified x and y position from the global (stage) coordinate space to the
coordinate space of the display object. For example, this could be used to determine
the current mouse position within the display object. Returns a Point instance with x and y properties
correlating to the transformed position in the display object's coordinate space.

<h4>Example</h4>

     displayObject.x = 300;
     displayObject.y = 200;
     stage.addChild(displayObject);
     var point = myDisplayObject.globalToLocal(100, 100);
     // Results in x=-200, y=-100
	 */
	public final native Point globalToLocal(Number x, Number y) /*-{
		this.globalToLocal(x, y);
	}-*/;

	/**
	 * Transforms the specified x and y position from the coordinate space of this display object to the coordinate
space of the target display object. Returns a Point instance with x and y properties correlating to the
transformed position in the target's coordinate space. Effectively the same as using the following code with
{{#crossLink "DisplayObject/localToGlobal"}}{{/crossLink}} and {{#crossLink "DisplayObject/globalToLocal"}}{{/crossLink}}.

     var pt = this.localToGlobal(x, y);
     pt = target.globalToLocal(pt.x, pt.y);
	 */
	public final native Point localToLocal(Number x, Number y, Number target) /*-{
		this.localToLocal(x, y, target);
	}-*/;

	/**
	 * Shortcut method to quickly set the transform properties on the display object. All parameters are optional.
Omitted parameters will have the default value set.

<h4>Example</h4>

     displayObject.setTransform(100, 100, 2, 2);
	 */
	public final native DisplayObjectImpl setTransform(Number x, Number y, Number scaleX, Number scaleY, Number rotation, Number skewX, Number skewY, Number regX, Number regY) /*-{
		this.setTransform(x, y, scaleX, scaleY, rotation, skewX, skewY, regX, regY);
	}-*/;

	/**
	 * Returns a matrix based on this object's transform.
	 */
	public final native Matrix2D getMatrix(Number matrix) /*-{
		this.getMatrix(matrix);
	}-*/;

	/**
	 * Generates a concatenated Matrix2D object representing the combined transform of the display object and all of its
parent Containers up to the highest level ancestor (usually the {{#crossLink "Stage"}}{{/crossLink}}). This can
be used to transform positions between coordinate spaces, such as with {{#crossLink "DisplayObject/localToGlobal"}}{{/crossLink}}
and {{#crossLink "DisplayObject/globalToLocal"}}{{/crossLink}}.
	 */
	public final native Matrix2D getConcatenatedMatrix(Number mtx) /*-{
		this.getConcatenatedMatrix(mtx);
	}-*/;

	/**
	 * Tests whether the display object intersects the specified local point (ie. draws a pixel with alpha > 0 at
the specified position). This ignores the alpha, shadow and compositeOperation of the display object, and all
transform properties including regX/Y.

<h4>Example</h4>

     stage.addEventListener("stagemousedown", handleMouseDown);
     function handleMouseDown(event) {
         var hit = myShape.hitTest(event.stageX, event.stageY);
     }

Please note that shape-to-shape collision is not currently supported by EaselJS.
	 */
	public native Boolean hitTest(Number x, Number y) /*-{
		this.hitTest(x, y);
	}-*/;

	/**
	 * Provides a chainable shortcut method for setting a number of properties on a DisplayObject instance.

<h4>Example</h4>

     var myGraphics = new createjs.Graphics().beginFill("#ff0000").drawCircle(0, 0, 25);
     var shape = stage.addChild(new Shape())
         .set({graphics:myGraphics, x:100, y:100, alpha:0.5});
	 */
	public final native DisplayObjectImpl set(Number props) /*-{
		this.set(props);
	}-*/;

	/**
	 * Returns a clone of this DisplayObject. Some properties that are specific to this instance's current context are
reverted to their defaults (for example .parent).
	 */
	public final native DisplayObjectImpl clone() /*-{
		this.clone();
	}-*/;

	/**
	 * 
	 */
	public final native void cloneProps(Number o) /*-{
		this.cloneProps(o);
	}-*/;

	/**
	 * 
	 */
	public final native void _applyShadow(Number ctx, Number shadow) /*-{
		this._applyShadow(ctx, shadow);
	}-*/;

	/**
	 * 
	 */
	public final native void _tick() /*-{
		this._tick();
	}-*/;

	/**
	 * 
	 */
	public final native Boolean _testHit(Number ctx) /*-{
		this._testHit(ctx);
	}-*/;

	/**
	 * 
	 */
	public final native void _applyFilters() /*-{
		this._applyFilters();
	}-*/;

	/**
	 * Indicates whether the display object has a listener of the corresponding event types.
	 */
	public final native Boolean _hasMouseHandler(Number typeMask) /*-{
		this._hasMouseHandler(typeMask);
	}-*/;

	/**
	 * 
	 */
	public final native void exec(Number scope) /*-{
		this.exec(scope);
	}-*/;

}
