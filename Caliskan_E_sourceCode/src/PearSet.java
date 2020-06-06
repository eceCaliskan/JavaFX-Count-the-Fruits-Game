/**
 * This is class is the subclass of GameObject class, superclass of GreenPear, RedPear and YellowPear
 * While using the update() method sets the size of the images.
 * 
 *
 * @author ececaliskan
 * @date  03/03/2020
 * 
 */
import javafx.scene.canvas.GraphicsContext;

import javafx.scene.image.Image;

public class PearSet extends GameObject {

	public PearSet(GraphicsContext gc, double x, double y)  {
		// TODO Auto-generated constructor stub
		super(gc, x, y);     //call to the superclass
	    img = getImage();   
	    update();            //call to the update method 
	}

	public Image getImage() {
		// TODO Auto-generated method stub
		return img;
	}
	public void update()  //sets the image size
	   {
	        if(img!=null )
		    gc.drawImage(img, x, y, 70, 90);
	        
	   }
}