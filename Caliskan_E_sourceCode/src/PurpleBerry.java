/**
 * This is class is the subclass of BerrySet class. Sets the image of the class.
 * While using the update() method makes the object move.
 * 
 *
 * @author ececaliskan
 * @date  03/03/2020
 * 
 */
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.image.Image;

public class PurpleBerry extends BerrySet {
int dx=2;
	public PurpleBerry(GraphicsContext gc, double x, double y) {
		super(gc, x, y);      //call to the superclass
	}
	
	public Image getImage() {
		return new Image("image/purpleBerry.png"); //Gets the image of the class.
	}
	
	
	public void update() { //to make the objects move
		x+=dx;
		if(x>400 || x<0) {
			dx=-dx;
			y+=20;
		}
		super.update(); //call to superclass's update method
	}
}