package easeljs.client.display;

import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.core.client.JsArrayString;

public class SpriteSheetData extends JavaScriptObject {
	  protected SpriteSheetData() {}

	  public static native SpriteSheetData create(String img) /*-{
	    return {images: [img]};
	  }-*/;
	  
	  public static native SpriteSheetData create(JsArrayString imgList) /*-{
		return {images: imgList};
	  }-*/;

	  public final native void setFramesSize(int frameWidth, int frameHeight) /*-{
	  	if( this.frames ) {
	  		this.frames.width = frameWidth;
	  		this.frames.height = frameHeight;
	  	} else {
	  		this.frames = {width:frameWidth, height:frameHeight};  	
	  	}
	  }-*/;
	  
	  public final native void setFrameRegistrationPoint(int frameRegX, int frameRegY) /*-{
	  	if( this.frames ) {
	  		this.frames.regX = frameRegX;
	  		this.frames.regY = frameRegY;
	  	} else {
	  		this.frames = {regX:frameRegX, regY:frameRegY};  	
	  	}
	  }-*/;
	  
	  public final native void setFrameCount(int frameCount) /*-{
	  	if( this.frames ) {
	  		this.frames.count = frameCount;
	  		this.frames.height = frameHeight;
	  	} else {
	  		this.frames = {count:frameCount};  	
	  	}
	  }-*/;
	 
	  
	  public final native void addSprite(String img) /*-{
	    this.images.push(img);
	  }-*/;
	  
	  
	  public final native void addAnimation(String name, int frameStart, int frameEnd, String nextFrame) /*-{
	  	// Workaround to avoid failure on the "obj instanceof Array" (line ~300 of SpriteSheet.js)
	  	// Instead of using: animations: {idle: [0, 10, "idle" ]}
	  	// we should use: animations: {idle: {frames:[0,1,2,3,4,5,6,7,8,9,10], next:"idle" }}
	  	var frameArray = [];
	  	for (var i = frameStart; i <= frameEnd; ++i) {
		    frameArray.push(i);
		};


	  	if( this.animations ) {
	  		this.animations[name] = {frames: frameArray, next: nextFrame };
	  	} else {
	  		this.animations = {};
	  		this.animations[name] = {frames: frameArray, next: nextFrame };
	  	}
	  	
	  }-*/;

}
