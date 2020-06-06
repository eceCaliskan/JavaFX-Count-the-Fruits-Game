/**
 * This is class is the subclass of PearSet class. Sets the image of the class.
 * While using the update() method makes the object move.
 * 
 *
 * @author ececaliskan
 * @date  03/0/2020
 * 
 */

import javafx.scene.canvas.GraphicsContext;
import javafx.scene.image.Image;


public class RedPear extends AppleSet {

	int dx=2;
	
	public RedPear(GraphicsContext gc, double x, double y) {
		super(gc, x, y);  //call to the superclass
	}
	
	public Image getImage() {
		return new Image("image/redPear.png");  //gets the image
	}
	
	public void update() {  //makes the objects move
		x+=dx;
		if(x>400 || x<0) {
			dx=-dx;
			y+=20;
		}
		super.update(); //call to the superclass update method
	}
}