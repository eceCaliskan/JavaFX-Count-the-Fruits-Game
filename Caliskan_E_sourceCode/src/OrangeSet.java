/**
 * This class is the subclass of the GameObject. Sets the size of the images. Includes calls to the superclass

 * 
 * 
 * @author ececaliskan
 * @date  03/04/2020
 */
import javafx.scene.canvas.GraphicsContext;

import javafx.scene.image.Image;

public class OrangeSet extends GameObject {

	public OrangeSet(GraphicsContext gc, double x, double y)  {
		// TODO Auto-generated constructor stub
		super(gc, x, y); //calling the superclass GameObject
	    img = getImage();
	    update();
	}

	public Image getImage() {
		// TODO Auto-generated method stub
		return img; //returns the image
	}
	public void update()
	   {
	        if(img!=null )
		    gc.drawImage(img, x, y, 70, 90); //sets the size of the image
	        
	   }
}