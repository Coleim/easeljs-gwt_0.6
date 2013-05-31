package easeljs.utils;

import easeljs.utils.impl.TickerImpl;

public class Ticker {
	protected TickerImpl impl;

	public Ticker() {
		this(TickerImpl.create()); 
	}

	protected Ticker(TickerImpl impl) {
		this.impl = impl;
	}


}
