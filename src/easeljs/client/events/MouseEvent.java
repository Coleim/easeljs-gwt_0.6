package easeljs.client.events;

import com.google.gwt.core.client.JavaScriptObject;

import easeljs.client.display.DisplayObject;
import easeljs.client.events.impl.MouseEventImpl;

public class MouseEvent {

	protected MouseEventImpl impl;
	
	public MouseEvent(MouseEventImpl impl) {
		this.impl = impl;
	}
	
	public MouseEvent(JavaScriptObject mouseObject) {
		this.impl = mouseObject.cast();
	}
	
	public String getType() {	
		return this.impl.getType();
	}
	
	public DisplayObject getTarget() {
		return new DisplayObject(this.impl.getTarget());
	}
	
	public float getStageX() {
		return this.impl.getStageX();
	}
		
	public float getStageY() {
		return this.impl.getStageY();
	}
	
	public MouseEventImpl getNativeEvent() {
		return this.impl.getNativeEvent();
	}
	
	public int getButton() {
		return this.impl.getButton();
	}
	
	public Boolean rightClicked() {
		return this.impl.getButton() == 2;
	}
	
	public Boolean leftClicked() {
		return this.impl.getButton() == 0;
	}
	
	public Boolean middleClicked() {
		return this.impl.getButton() == 1;
	}

	public Boolean isAltKeyPressed() {
		return this.impl.isAltKeyPressed();
	}
	
	public Boolean isCtrlKeyPressed() {
		return this.impl.isCtrlKeyPressed();
	}

	public Boolean isShiftKeyPressed() {
		return this.impl.isShiftKeyPressed();
	}
	
	
}
