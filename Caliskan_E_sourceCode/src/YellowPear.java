/**
 * This is class is the subclass of AppleSet class. Sets the image of the class.
 * While using the update() method makes the object move.
 * 
 *
 * @author ececaliskan
 * @date  03/04/2020
 * 
 */
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.image.Image;


public class YellowPear extends AppleSet {

	int dx=2;
	
	public YellowPear(GraphicsContext gc, double x, double y) {
		super(gc, x, y);  //call to the superclass to inherit the fields
	}
	
	public Image getImage() {
		return new Image("image/yellow-pear.png");  //returns the new image
	}
	
	public void update() { //moves the object
		x+=dx;
		if(x>400 || x<0) {
			dx=-dx;
			y+=20;
		}
		super.update(); //call to the superclass's update method
	}
}