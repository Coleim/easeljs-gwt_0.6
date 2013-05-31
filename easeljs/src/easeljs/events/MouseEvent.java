package easeljs.events;

import easeljs.events.impl.MouseEventImpl;

public class MouseEvent {
	protected MouseEventImpl impl;

	public MouseEvent(String type) {
		this(MouseEventImpl.create(type)); 
	}

	protected MouseEvent(MouseEventImpl impl) {
		this.impl = impl;
	}


}
