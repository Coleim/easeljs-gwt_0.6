package easeljs.display;

import easeljs.display.impl.ContainerImpl;

public class Container extends DisplayObject {
	protected ContainerImpl impl;

	public Container() {
		this(ContainerImpl.create()); 
	}

	protected Container(ContainerImpl impl) {
		this.impl = impl;
	}


}
