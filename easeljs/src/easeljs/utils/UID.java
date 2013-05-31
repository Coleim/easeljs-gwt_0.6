package easeljs.utils;

import easeljs.utils.impl.UIDImpl;

public class UID {
	protected UIDImpl impl;

	public UID() {
		this(UIDImpl.create()); 
	}

	protected UID(UIDImpl impl) {
		this.impl = impl;
	}


}
