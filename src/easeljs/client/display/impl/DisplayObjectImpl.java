package easeljs.client.display.impl;

import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.user.client.Element;

import easeljs.client.display.Stage;
import easeljs.client.geom.Matrix2D;
import easeljs.client.geom.Point;

public class DisplayObjectImpl extends JavaScriptObject {
	protected DisplayObjectImpl() {}
	
	public static native DisplayObjectImpl create() /*-{
		return new $wnd.createjs.DisplayObject();
	}-*/;
	
	/*******************************************************
	 * Methods
	 *******************************************************/
	
	public final native void cache(float x, float y, float width, float height) /*-{
		this.cache(x, y, width, height);
	}-*/;
	
	public final native DisplayObjectImpl clone() /*-{
		try {
			return this.clone();
		} catch(e) {
			alert(e);
		}
	}-*/;
		
	public final native void draw(JavaScriptObject ctx, boolean ignoreCache) /*-{
		this.draw(ctx, ignoreCache);
	}-*/;
	
	public final native String getCacheDataURL() /*-{
		return this.getCacheDataURL();
	}-*/;
	
	public final native Matrix2D getConcatenatedMatrix() /*-{
		return this.getConcatenatedMatrix();
	}-*/;
	
	public final native Matrix2D getConcatenatedMatrix(Matrix2D mtx) /*-{
		return this.getConcatenatedMatrix(mtx);
	}-*/;

	public final native Stage getStage() /*-{
		return this.getStage();
	}-*/;	

	public final native Point globalToLocal(float x, float y) /*-{
		return this.globalToLocal(x, y);
	}-*/;

	public final native boolean hitTest(float x, float y) /*-{
		return this.hitTest(x, y);
	}-*/;

	public final native boolean isVisible() /*-{
		return this.isVisible();
	}-*/;

	public final native Point localToGlobal(float x, float y) /*-{
		return this.localToGlobal(x, y);
	}-*/;

	public final native Point localToLocal(float x, float y, DisplayObjectImpl target) /*-{
		return this.localToLocal(x, y, target);
	}-*/;

	public final native void setTransform(float x, float y, float scaleX, float scaleY, float rotation, float skewX, float skewY, float regX, float regY) /*-{
		this.localToLocal(x, y, scaleX, scaleY, rotation, skewX, skewY, regX, regY);
	}-*/;
	
	public final native void uncache() /*-{
		this.uncache();
	}-*/;
	
	public final native void updateCache(String compositeOperation) /*-{
		this.updateCache(compositeOperation);
	}-*/;
	
	public final native void updateCache() /*-{
		this.updateCache();
	}-*/;
	
	
	/*******************************************************
	 * Events
	 *******************************************************/
	
	/*

	onClick
	onDoubleClick
	onMouseOut
	onMouseOver
	onPress
	onTick

	 */
	/*******************************************************
	 * Properties
	 *******************************************************/
	
	public final native float getAlpha() /*-{
		return this.alpha;
	}-*/;
	
	public final native void setAlpha(float alpha) /*-{
		this.alpha = alpha;
	}-*/;
	

	/*
	
	alpha
	cacheCanvas
	cacheID
	compositeOperation
	filters
	id
	mouseEnabled
	name
	parent
	regX
	regY
	rotation
	scaleX
	scaleY
	shadow
	skewX
	skewY
	snapToPixel
	suppressCrossDomainErrors
	visible
	x
	y
		
	*/
	

	public final native Element getCacheCanvas() /*-{
		return this.cacheCanvas;
	}-*/;
	
	public final native void setCacheCanvas(Element canvas) /*-{
		this.cacheCanvas = canvas;
	}-*/;

	public final native boolean getMouseEnabled() /*-{
		return this.mouseEnabled;
	}-*/;
	
	public final native void setMouseEnabled(boolean mouseEnabled) /*-{
		this.mouseEnabled = mouseEnabled;
	}-*/;

	public final native int getID() /*-{
		return this.id;
	}-*/;
	
	public final native void setID(int id) /*-{
		this.id = id;
	}-*/;

	public final native String getName() /*-{
		return this.name;
	}-*/;
	
	public final native void setName(String name) /*-{
		this.name = name;
	}-*/;

	public final native float getRegX() /*-{
		return this.regX;
	}-*/;
	
	public final native void setRegX(float x) /*-{
		this.regX = x;
	}-*/;

	public final native float getRegY() /*-{
		return this.regY;
	}-*/;
	
	public final native void setRegY(float y) /*-{
		this.regY = y;
	}-*/;

	public final native float getRotation() /*-{
		return this.rotation;
	}-*/;
	
	public final native void setRotation(float degrees) /*-{
		this.rotation = degrees;
	}-*/;

	public final native float getScaleX() /*-{
		return this.scaleX;
	}-*/;
	
	public final native void setScaleX(float scaleX) /*-{
		this.scaleX = scaleX;
	}-*/;

	public final native float getScaleY() /*-{
		return this.scaleY;
	}-*/;
	
	public final native void setScaleY(float scaleY) /*-{
		this.scaleY = scaleY;
	}-*/;

	public final native ShadowImpl getShadow() /*-{
		return this.shadow;
	}-*/;
	
	public final native void setShadow(ShadowImpl shadow) /*-{
		this.shadow = shadow;
	}-*/;
	
	
	public final native void setVisible(boolean visible) /*-{
		this.visible = visible;
	}-*/;

	public final native float getX() /*-{
		return this.x;
	}-*/;
	
	public final native void setX(float x) /*-{
		this.x = x;
	}-*/;
	
	public final native float getY() /*-{
		return this.y;
	}-*/;
	
	public final native void setY(float y) /*-{
		this.y = y;
	}-*/;



	public final native void updateContext(JavaScriptObject ctx, boolean ignoreShadows) /*-{
		this.updateContext(ctx, ignoreShadows);
	}-*/;
	

	

}
