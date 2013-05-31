package easeljs.display.impl;

import java.util.ArrayList;

import com.google.gwt.core.client.JavaScriptObject;

import easeljs.display.DisplayObject;

public class ContainerImpl extends DisplayObjectImpl {
	protected ContainerImpl() {}

	public static native ContainerImpl create() /*-{
		return new $wnd.Container();
	}-*/;

	/*******************************************************
	 * Methods
	 *******************************************************/

	/**
	 * Adds a child to the top of the display list.

<h4>Example</h4>
     container.addChild(bitmapInstance);

 You can also add multiple children at once:

     container.addChild(bitmapInstance, shapeInstance, textInstance);
	 */
	public final native DisplayObject addChild(Number child) /*-{
		this.addChild(child);
	}-*/;

	/**
	 * Adds a child to the display list at the specified index, bumping children at equal or greater indexes up one, and
setting its parent to this Container.

<h4>Example</h4>
     addChildAt(child1, index);

You can also add multiple children, such as:

     addChildAt(child1, child2, ..., index);

The index must be between 0 and numChildren. For example, to add myShape under otherShape in the display list,
you could use:

     container.addChildAt(myShape, container.getChildIndex(otherShape));

This would also bump otherShape's index up by one. Fails silently if the index is out of range.
	 */
	public final native DisplayObject addChildAt(Number child, Number index) /*-{
		this.addChildAt(child, index);
	}-*/;

	/**
	 * Removes the specified child from the display list. Note that it is faster to use removeChildAt() if the index is
already known.

<h4>Example</h4>
     container.removeChild(child);

You can also remove multiple children:

     removeChild(child1, child2, ...);

Returns true if the child (or children) was removed, or false if it was not in the display list.
	 */
	public final native Boolean removeChild(Number child) /*-{
		this.removeChild(child);
	}-*/;

	/**
	 * Removes the child at the specified index from the display list, and sets its parent to null.

<h4>Example</h4>

     container.removeChildAt(2);

You can also remove multiple children:

     container.removeChild(2, 7, ...)

Returns true if the child (or children) was removed, or false if any index was out of range.
	 */
	public final native Boolean removeChildAt(Number index) /*-{
		this.removeChildAt(index);
	}-*/;

	/**
	 * Removes all children from the display list.

<h4>Example</h4>
     container.removeAlLChildren();
	 */
	public final native void removeAllChildren() /*-{
		this.removeAllChildren();
	}-*/;

	/**
	 * Returns the child at the specified index.

<h4>Example</h4>
     container.getChildAt(2);
	 */
	public final native DisplayObject getChildAt(Number index) /*-{
		this.getChildAt(index);
	}-*/;

	/**
	 * Returns the child with the specified name.
	 */
	public final native DisplayObject getChildByName(Number name) /*-{
		this.getChildByName(name);
	}-*/;

	/**
	 * Performs an array sort operation on the child list.

<h4>Example</h4>
     var sortFunction = function(item1, item2, options) {
         if (item1 > item2) { return 1; }
         if (item1 < item2) { return -1; }
         return 0;
     }
     container.sortChildren(sortFunction);
	 */
	public final native void sortChildren(Number sortFunction) /*-{
		this.sortChildren(sortFunction);
	}-*/;

	/**
	 * Returns the index of the specified child in the display list, or -1 if it is not in the display list.

<h4>Example</h4>
     var index = container.getChildIndex(child);
	 */
	public final native Number getChildIndex(Number child) /*-{
		this.getChildIndex(child);
	}-*/;

	/**
	 * Returns the number of children in the display list.
	 */
	public final native Number getNumChildren() /*-{
		this.getNumChildren();
	}-*/;

	/**
	 * Swaps the children at the specified indexes. Fails silently if either index is out of range.
	 */
	public final native void swapChildrenAt(Number index1, Number index2) /*-{
		this.swapChildrenAt(index1, index2);
	}-*/;

	/**
	 * Swaps the specified children's depth in the display list. Fails silently if either child is not a child of this
Container.
	 */
	public final native void swapChildren(Number child1, Number child2) /*-{
		this.swapChildren(child1, child2);
	}-*/;

	/**
	 * Changes the depth of the specified child. Fails silently if the child is not a child of this container, or the index is out of range.
	 */
	public final native void setChildIndex(Number child, Number index) /*-{
		this.setChildIndex(child, index);
	}-*/;

	/**
	 * Returns true if the specified display object either is this container or is a descendent (child, grandchild, etc)
of this container.
	 */
	public final native Boolean contains(Number child) /*-{
		this.contains(child);
	}-*/;

	/**
	 * Tests whether the display object intersects the specified local point (ie. draws a pixel with alpha > 0 at the
specified position). This ignores the alpha, shadow and compositeOperation of the display object, and all
transform properties including regX/Y.
	 */
	public final native Boolean hitTest(Number x, Number y) /*-{
		this.hitTest(x, y);
	}-*/;

	/**
	 * Returns an array of all display objects under the specified coordinates that are in this container's display
list. This routine ignores any display objects with mouseEnabled set to false. The array will be sorted in order
of visual depth, with the top-most display object at index 0. This uses shape based hit detection, and can be an
expensive operation to run, so it is best to use it carefully. For example, if testing for objects under the
mouse, test on tick (instead of on mousemove), and only if the mouse's position has changed.
	 */
	public final native ArrayList<JavaScriptObject> getObjectsUnderPoint(Number x, Number y) /*-{
		this.getObjectsUnderPoint(x, y);
	}-*/;

	/**
	 * Similar to {{#crossLink "Container/getObjectsUnderPoint()"}}{{/crossLink}}, but returns only the top-most display
object. This runs significantly faster than <code>getObjectsUnderPoint()<code>, but is still an expensive
operation. See {{#crossLink "Container/getObjectsUnderPoint"}}{{/crossLink}} for more information.
	 */
	public final native DisplayObject getObjectUnderPoint(Number x, Number y) /*-{
		this.getObjectUnderPoint(x, y);
	}-*/;

	/**
	 * Returns a clone of this Container. Some properties that are specific to this instance's current context are
reverted to their defaults (for example .parent).
	 */
	public final native ContainerImpl clone(Number recursive) /*-{
		this.clone(recursive);
	}-*/;


}
