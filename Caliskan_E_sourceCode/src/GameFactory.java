/**
 * This is class implements the interface called GameInterface. Holds key names to create 
 * suitable object. 
 * 
 *
 * @author ececaliskan
 * @date  03/03/2020
 * 
 */
import javafx.scene.canvas.GraphicsContext;

public class GameFactory implements GameInterface {
	GraphicsContext gc; //This class is used to issue draw calls to a Canvas using a buffer.
	public GameFactory(GraphicsContext gc) {
		// TODO Auto-generated constructor stub]
		this.gc = gc;
	}
	public GameObject createProduct(String discrim, double x, double y) {
		// TODO Auto-generated method stub
		
		if(discrim.contentEquals("farmer")) { //if the method is called using farmer keyword a new farmer object is created
			return new Farmer(gc, x, y);
		}
		if(discrim.contentEquals("redApple")) {//if the method is called using redApple keyword a new RedApple object is created
			return new RedApple(gc, x, y) ;
			
		}
		if(discrim.contentEquals("blueApple")) { //if the method is called using blueApple keyword a new BlueApple object is created
			return new BlueApple(gc, x, y) ;
		}
		
		if(discrim.contentEquals("pinkApple")) { //if the method is called using pinkApple keyword a new PinkApple object is created
			return new PinkApple(gc, x, y) ;
		}
		
		if(discrim.contentEquals("redPear")) { //if the method is called using redPear keyword a new redPear object is created
			return new RedPear(gc, x, y) ;
		}
		
		if(discrim.contentEquals("yellowPear")) { //if the method is called using yellowPear keyword a new yellowPear object is created
			return new YellowPear(gc, x, y) ;
		}
		
		if(discrim.contentEquals("greenPear")) {//if the method is called using greenPear keyword a new greenPear object is created
			return new GreenPear(gc, x, y) ;
		}
		
		if(discrim.contentEquals("orange")) {//if the method is called using orange keyword a new Orange object is created
			return new Orange(gc, x, y) ;
		}
		
		if(discrim.contentEquals("greenOrange")) {//if the method is called using greenOrange keyword a new greenOrange object is created
			return new GreenOrange(gc, x, y) ;
		}
		
		if(discrim.contentEquals("yellowOrange")) {//if the method is called using yellowOrange keyword a new yellowOrange object is created
			return new YellowOrange(gc, x, y) ;
		}
		
		if(discrim.contentEquals("blackberry")) {//if the method is called using blackberry keyword a new BlackBerry object is created
			return new BlackBerry(gc, x, y) ;
		}
		
		if(discrim.contentEquals("purpleberry")) {//if the method is called using purpleberry keyword a new PurpleBerry object is created
			return new PurpleBerry(gc, x, y) ;
		}
		if(discrim.contentEquals("blueberry")) {//if the method is called using blueberry keyword a new BlueBerry object is created
			return new BlueBerry(gc, x, y) ;
		}
		
		if(discrim.contentEquals("tree")) { //if the method is called using tree keyword a new Tree object is created
			return new Tree(gc, x, y) ;
		}
		return null;
	}
	
}
