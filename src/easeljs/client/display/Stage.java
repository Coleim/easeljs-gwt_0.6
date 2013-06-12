package easeljs.client.display;

import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.user.client.Element;
import easeljs.client.display.impl.StageImpl;

public class Stage extends Container {
	
	private StageImpl impl;
	
	public Stage(Element canvas) {
		overlay = impl = StageImpl.create(canvas);
	}
	
	public Stage(String canvas) {
		overlay = impl = StageImpl.create(canvas);
	}
	
	public void clear() {
		impl.clear();
	}
	
	
	public void enableDOMEvents(Boolean enable) {
		impl.enableDOMEvents(enable);
	}
		
	public void enableMouseOver(Number frequency) {
		impl.enableMouseOver(frequency);
	}
	
	public String toDataURL(String backgroundColor, String mimeType) {
		return impl.toDataURL(backgroundColor, mimeType);
	}
	
	public void update() {
		impl.update();
	}
		
	public JavaScriptObject addEventListener(String type, JavaScriptObject listener) {
		return impl.addEventListener(type, listener);
	}
	
	/*public DisplayObject getObjectUnderPoint(float x, float y) {
		DisplayObjectImpl o = impl.getObjectUnderPoint(x, y);
		if (o != null) {
			return new DisplayObject(o);
		} else {
			return null;
		}
	}*/
	
	/*public ArrayList<DisplayObject> getObjectsUnderPoint(float x, float y) {
		ArrayList<DisplayObject> objects = 
			new ArrayList<DisplayObject>();
		JsArray<DisplayObjectImpl> objs = impl.getObjectsUnderPoint(x, y);
		for (int i = 0; i < objs.length(); i++) {
			DisplayObjectImpl obj = objs.get(i);
			if (obj instanceof ContainerImpl) {
				objects.add(new Container((ContainerImpl)obj));
			} else if (obj instanceof ShapeImpl) {
				objects.add(new Shape((ShapeImpl)obj));
			} else {
				objects.add(new DisplayObject(obj));
			}
		}
		return objects;
	}*/
	
}
