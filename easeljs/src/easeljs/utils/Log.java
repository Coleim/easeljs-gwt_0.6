package easeljs.utils;

import easeljs.utils.impl.LogImpl;

public class Log {
	protected LogImpl impl;

	public Log() {
		this(LogImpl.create()); 
	}

	protected Log(LogImpl impl) {
		this.impl = impl;
	}


}
