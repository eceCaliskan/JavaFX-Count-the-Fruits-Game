/**
 * This is class is the subclass of BerrySet class. Sets the image of the class.
 * While using the update() method makes the object move.
 * 
 *
 * @author ececaliskan
 * @date  03/04/2020
 * 
 */
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.image.Image;

public class BlueBerry extends BerrySet {
int dx=2;
	public BlueBerry(GraphicsContext gc, double x, double y) {
		super(gc, x, y); //call to the superclass
	}
	
	public Image getImage() {
		return new Image("image/blueBerry.png");  //returns the new image
	}
	public void update() { //this method makes the object move
		x+=dx;
		if(x>400 || x<0) {
			dx=-dx;
			y+=20;
		}
		super.update(); //call to the superclass's update method
	}
}
