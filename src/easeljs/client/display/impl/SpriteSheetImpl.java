package easeljs.client.display.impl;


import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.core.client.JsArrayString;
import com.google.gwt.user.client.Element;

public class SpriteSheetImpl extends JavaScriptObject {
	protected SpriteSheetImpl() {}
	
	
	public static native SpriteSheetImpl create(
			Element image, 
			int frameWidth, int frameHeight ) /*-{
			
		return new $wnd.createjs.SpriteSheet({
			images: [image],
			frames: {width: frameWidth, height: frameHeight},
			animations: {idle: {frames:[0,1,2,3,4,5,6,7,8,9,10], next:"idle"}}
			});	
			
	}-*/;
	
	public static native SpriteSheetImpl create(JavaScriptObject data) /*-{
		return new $wnd.createjs.SpriteSheet(data);	
	}-*/;
	
	public static native SpriteSheetImpl create(
			JsArrayString imageList, 
			int frameWidth, int frameHeight, JavaScriptObject obj ) /*-{
			
		console.log("----- JS OBJ ---");
		console.log(obj);
		console.log("-----");
		
		for (var Img in imageList) {
			console.log(Img);			
		}	
		console.log("-----");
		return new $wnd.createjs.SpriteSheet({
				images: [imageList[0],imageList[1]],
				frames: {width: frameWidth, height: frameHeight},
				animations: {
					idle: {frames:[0,1,2,3,4,5,6,7,8,9,10], next:"idle"},
					run: {frames:[11,12,13,14,15,16,17,18,19,20], next:"run"}
				}
				});
	}-*/;

	
	public final native Element getImage() /*-{
		return this.image;
	}-*/;
	
	public final native int getFrameWidth() /*-{
		return this.frameWidth;
	}-*/;
	
	public final native int getFrameHeight() /*-{
		return this.frameHeight;
	}-*/;
	
	public final native JavaScriptObject getFrameData() /*-{
		return this.frameData;
	}-*/;
	
	public final native boolean getLoop() /*-{
		return this.loop;
	}-*/;
	
	public final native int getTotalFrames() /*-{
		return this.totalFrames;
	}-*/;
	
	public final native void setImage(Element image) /*-{
		this.image = image;
	}-*/;
	
	public final native void setFrameWidth(int frameWidth) /*-{
		this.frameWidth = frameWidth;
	}-*/;
	
	public final native void setFrameHeight(int frameHeight) /*-{
		this.frameHeight = frameHeight;
	}-*/;
	
	public final native void setFrameData(JavaScriptObject frameData) /*-{
		this.frameData = frameData;
	}-*/;
	
	public final native void setLoop(boolean loop) /*-{
		this.loop = loop;
	}-*/;
	
	public final native void setTotalFrames(int totalFrames) /*-{
		this.totalFrames = totalFrames;
	}-*/;
	
	public final native SpriteSheetImpl clone() /*-{
		return this.clone(
			this.image,
			this.frameWidth,
			this.frameHeight,
			this.frameData);
	}-*/;
}
