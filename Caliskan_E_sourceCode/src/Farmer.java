/**
 * This is class is the subclass of GameObject class. Sets the image of the class.
 * 
 * @author ececaliskan
 * @date  03/03/2020
 * 
 */
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.image.Image;

public class Farmer extends GameObject{
	
	public Farmer(GraphicsContext gc, double x, double y) {
		super(gc, x, y); //call to the superclass
		img = new Image("image/farmer.png");  //setting the image
		 gc.drawImage(img, x, y, 10, 0);  //to execute the image
		update();
	}
	public void update()
	   {
	        if(img!=null )
		    gc.drawImage(img, x, y, 400, 500); //sets the size of the image
	        
	   }
}
	
	
