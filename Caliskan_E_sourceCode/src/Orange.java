/**
 * This class is the subclass of the OrangeSet. Sets the orange image

 * While using the update() method makes the object move.
 * 
 * @author ececaliskan
 * @date  03/04/2020
 */

import javafx.scene.canvas.GraphicsContext;
import javafx.scene.image.Image;


public class Orange extends OrangeSet {

	int dx=2;
	public Orange(GraphicsContext gc, double x, double y) {
		super(gc, x, y); //call to the superclass
	}
	
	
	public Image getImage() {
		return new Image("image/orange.png");  //setting the image
	}
	
	public void update() {  //update method to make the object move
		x+=dx;
		if(x>400 || x<0) {
			dx=-dx;
			y+=20;
		}
		super.update(); //calling the superclass's update method
	}
}
