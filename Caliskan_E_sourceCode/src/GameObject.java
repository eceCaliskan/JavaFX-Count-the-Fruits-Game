/**
 * This is class is the superclass of all the objects in the application.
 * 
 *
 * @author ececaliskan
 * @date  03/03/2020
 * 
 */
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.image.Image;


public class GameObject {
   protected Image img; 
   protected double x, y; 
   protected GraphicsContext gc;
	
   public GameObject(GraphicsContext gc, double x, double y)
   {
        this.gc=gc;
        this.x=x;
        this.y=y;
   }
	

   public void update()  //setting the size of the images
   {
        if(img!=null )
	    gc.drawImage(img, x, y, 30, 30);
        
   }
}

