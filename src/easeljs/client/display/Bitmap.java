package easeljs.client.display;

import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.user.client.Element;
import com.google.gwt.user.client.ui.Image;

import easeljs.client.display.impl.BitmapImpl;

public class Bitmap extends DisplayObject {
	
	public Bitmap() {
		this.overlay = BitmapImpl.create();
	}
	
	public Bitmap(Image image) {
		if (image == null) {
			this.overlay = BitmapImpl.create();
		} else {
			this.overlay = BitmapImpl.create(image.getElement());
		}
	}
	
	public Bitmap(String imageString) {
		this.overlay = BitmapImpl.create(imageString);
	}
	
	
	private Bitmap(BitmapImpl overlay) {
		this.overlay = overlay;
	}
	
	@Override
	public void cache(float x, float y, float width, float height) {
		this.overlay.cache(x, y, width, height);
	}
	
	@Override
	public DisplayObject clone() {
		return new Bitmap((BitmapImpl)this.overlay.clone());
	}
	
	@Override
	public void draw(JavaScriptObject ctx, boolean ignoreCache) {
	}
	
	public Element getImageElement() {
		return ((BitmapImpl)overlay).getImage();
	}
	
	public void setImage(Element canvasOrVideo) {
		((BitmapImpl)overlay).setImage(canvasOrVideo);
	}
	public void setImage(Image image) {
		((BitmapImpl)overlay).setImage(image.getElement());
	}
}
