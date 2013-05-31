package easeljs.display;

import com.google.gwt.dom.client.Element;

import easeljs.display.impl.DOMElementImpl;

public class DOMElement extends DisplayObject {
	protected DOMElementImpl impl;

	public DOMElement(Element htmlElement) {
		this(DOMElementImpl.create(htmlElement)); 
	}

	protected DOMElement(DOMElementImpl impl) {
		this.impl = impl;
	}


}
