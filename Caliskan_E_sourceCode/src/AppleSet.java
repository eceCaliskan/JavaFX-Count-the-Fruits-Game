/*
 * This class is the superclass of RedApple, PinkApple and  BlueApple,
 
 * and subclass of the GameObject class, sets the size of the image. 
 * 
 */

import javafx.scene.canvas.GraphicsContext;
import javafx.scene.image.Image;


public class AppleSet extends GameObject {

	public AppleSet(GraphicsContext gc, double x, double y)  {
		// TODO Auto-generated constructor stub
		super(gc, x, y);  //call to the superclass GameObject
	    img = getImage(); 
	    update();  //call to the update method
	}

	public Image getImage() {
		// TODO Auto-generated method stub
		return img;
	}
	public void update()
	   {
	        if(img!=null )
		    gc.drawImage(img, x, y, 90, 90);  //set the size of the image
	        
	   }
}



	