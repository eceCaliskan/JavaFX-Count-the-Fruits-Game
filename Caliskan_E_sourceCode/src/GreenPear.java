/**
 * This class is the subclass of the PearSet class. Sets the image of the class.
 * While using the update() method makes the object move.
 * 
 *
 * @author ececaliskan
 * @date  03/03/2020
 * 
 * 
 */
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.image.Image;


public class GreenPear extends PearSet {

	int dx=2;
	public GreenPear(GraphicsContext gc, double x, double y) {
		super(gc, x, y); //call to the superclass PearSet
	}
	
	public Image getImage() {
		return new Image("image/green-pear.png"); //setting the image
	}
	
	public void update() { //makes the object move using the update method
		x+=dx;
		if(x>400 || x<0) {
			dx=-dx;
			y+=20;
		}
		super.update();  //calls the superclass appleSet
	}
}
