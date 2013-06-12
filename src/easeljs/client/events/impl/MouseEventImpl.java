package easeljs.client.events.impl;

import com.google.gwt.core.client.JavaScriptObject;

import easeljs.client.display.impl.DisplayObjectImpl;


public class MouseEventImpl extends JavaScriptObject {
	protected MouseEventImpl() {}
	
	public static native MouseEventImpl create(String type, double stageX, double stageY, DisplayObjectImpl target, MouseEventImpl nativeEvent, int pointerID, Boolean primary, double rawX, double rawY) /*-{
		return new $wnd.createjs.MouseEvent(type, stageX, stageY, target, nativeEvent, pointerID, primary, rawX, rawY);
	}-*/;
	
	public final native String getType() /*-{
		return this.type;
	}-*/;
	
	public final native DisplayObjectImpl getTarget() /*-{
		return this.target;
	}-*/;
	
	public final native float getStageX() /*-{
		return this.stageX;
	}-*/;
		
	public final native float getStageY() /*-{
		return this.stageY;
	}-*/;
	
	public final native MouseEventImpl getNativeEvent() /*-{
		return this.nativeEvent;
	}-*/;
	
	public final native int getButton() /*-{
		return this.nativeEvent.button;
	}-*/;
	
	public final native boolean isAltKeyPressed() /*-{
		return this.nativeEvent.altKey;
	}-*/;
	
	public final native boolean isCtrlKeyPressed() /*-{
		return this.nativeEvent.ctrlKey;
	}-*/;
	
	public final native boolean isShiftKeyPressed() /*-{
		return this.nativeEvent.shiftKey;
	}-*/;

}


 




