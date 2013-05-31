package easeljs.events;

import easeljs.events.impl.EventDispatcherImpl;

public class EventDispatcher {
	protected EventDispatcherImpl impl;

	public EventDispatcher() {
		this(EventDispatcherImpl.create()); 
	}

	protected EventDispatcher(EventDispatcherImpl impl) {
		this.impl = impl;
	}


}
