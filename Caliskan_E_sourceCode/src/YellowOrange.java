/**
 * This is class is the subclass of OrangeSet class. Sets the image of the class.
 * While using the update() method makes the object move.
 * 
 *
 * @author ececaliskan
 * @date  03/04/2020
 * 
 */
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.image.Image;


public class YellowOrange extends OrangeSet {

	int dx=2;
	public YellowOrange(GraphicsContext gc, double x, double y) {
		super(gc, x, y); //call to the superclass
	}
	
	public Image getImage() {
		return new Image("image/yellow-orange.png");  //returns the new image
	}
	
	public void update() {
		x+=dx; //makes the object move
		if(x>400 || x<0) {
			dx=-dx;
			y+=20;
		}
		super.update(); //call to the superclass's update method
	}
}