/*
 * This class contains main methods and builds the game using multiple scenes. 
 * Has an association with the GameFactory class to create suitable objects, adds them to the list.
 * 
 * @ECE CALISKAN
 * @03/03/2020
 * 
 * */

import java.util.ArrayList;
import java.util.Random;
import javafx.animation.AnimationTimer;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class GameApp extends Application {
	private Pane root;
	private Scene scene;
	private Scene scene1;
	private Scene scene2;
	private Scene scene3;
	private Scene scene4;
	private Scene scene5;
	private Scene scene6;
	private Canvas canvas;
	private GameFactory game;
	private GraphicsContext graphicsC;
	private ArrayList<GameObject> list = new ArrayList<GameObject>();
	private Random rnd = new Random(System.currentTimeMillis());
	private int count=0;
	private Image img;
	private Button button1;
	private Button button2;
	private Button button3;
	private Button button4;
	private Button button5;

	AnimationTimer timer = new AnimationTimer() {

		@Override
		public void handle(long arg0) {
			// TODO Auto-generated method stub
			graphicsC.fillRect(0, 0, canvas.getWidth(), canvas.getHeight());
			
			for(GameObject obj : list) {      //handles the elements in the list
				obj.update();
		    }
        }};
   
  
		public GameApp() {
		// TODO Auto-generated constructor stub
	    }

	
		public static void main(String[] args) {
		// TODO Auto-generated method stub
        launch(args);
	    }

	
	   @Override
	    public void start(Stage primaryStage) throws Exception {
		
		    this.scene1(primaryStage);
			this.scene2(primaryStage);
			this.scene6(primaryStage);
			this.scene5(primaryStage);
            this.scene4(primaryStage);
			timer.start();
			this.scene3(primaryStage);
			timer.start();
			
			primaryStage.setScene(scene);
	    }
	
	
	/**
	 * This method sets the welcome scene
	 * @param primaryStage
	 */
	    public void scene1(Stage primaryStage)
	    {
		
		     root = new Pane();
		     scene = new Scene(root,850,500);
             primaryStage.setScene(scene);
		     primaryStage.show();
		
		     Label l = new Label("WELCOME TO MY FARM");     //adding a new label 
		     l.setFont(new Font("Arial", 70));
		     l.setTextFill(Color.DARKGREEN);
		     canvas = new Canvas (950, 600);
		
		     graphicsC = canvas.getGraphicsContext2D();
		     graphicsC.setFill(Color.WHITE);
		     graphicsC.fillRect(0, 0, canvas.getWidth(), canvas.getHeight());
		     root.getChildren().addAll(canvas);
		
	         img = new Image("image/cartoon.jpg");         //including image as a background
		     graphicsC.drawImage(img ,0,0);
		
		     Button button1 = new Button("START");         //setting the position and designing the start button
             button1.setOnAction(e->primaryStage.setScene(scene1));
		     button1.setLayoutX(280);
		     button1.setLayoutY(150);
		     button1.setMinSize(280, 180);
		     button1.setStyle("-fx-background-color: green;  -fx-font-size:50; -fx-text-fill: white" );
		     root.getChildren().add(button1);
		     root.getChildren().add(l);
	
	    }
	
	    
	/**
	 * This method sets the main scene, which contains four buttons
	 * @param primaryStage
	 */
	public void scene2(Stage primaryStage) {
		
		root = new Pane();
		scene1 = new Scene(root,850,480);
		primaryStage.setScene(scene1);
		primaryStage.show();
		canvas = new Canvas (950, 600);
		
		graphicsC = canvas.getGraphicsContext2D();
		graphicsC.setFill(Color.WHITE);
		graphicsC.fillRect(0, 0, canvas.getWidth(), canvas.getHeight());
		root.getChildren().addAll(canvas);
		
		img = new Image("image/cartoon.jpg");  //setting the background image
		graphicsC.drawImage(img ,0,0);
		
		Button button1 = new Button();         //setting the button which contains red apple image and navigates 
		                                       //user to the scene3 
		button1.setOnAction(e->this.scene3(primaryStage));
		button1.setLayoutX(520);
		button1.setLayoutY(20);
		button1.setMinSize(310, 160);
		button1.setGraphic(new ImageView("image/red_apple.png"));
		
	
		Button button2 = new Button();                  //setting the button which contains red apple image and navigates 
                                                        //user to the scene4
		button2.setOnAction(e->this.scene4(primaryStage));
		button2.setLayoutX(10);
		button2.setLayoutY(20);
		button2.setMinSize(310, 190);
		button2.setGraphic(new ImageView("image/green-pear2.png"));
		button2.setId("yellowPear");
		
		
        
		Button button3 = new Button();                        //setting the button which contains red apple image and navigates 
                                                              //user to the scene
		button3.setOnAction(e->this.scene5(primaryStage));
		button3.setLayoutX(10);
		button3.setLayoutY(280);
		button3.setMinSize(310, 190);
		button3.setGraphic(new ImageView("image/orange.png"));
		
		
		
		
		Button button4 = new Button();                       //setting the button which contains red apple image and navigates 
                                                             //user to the scene
		button4.setOnAction(e->this.scene6(primaryStage));
		button4.setLayoutX(520);
		button4.setLayoutY(280);
		button4.setMinSize(310, 190);
		button4.setGraphic(new ImageView("image/blackberry.png"));
		button4.setId("yellowPear");
	
		
		root.getChildren().addAll(button1,button2,button3,button4);
		
	
	}
	

	            
	    
	/**
	 * This method sets the apple scene, creates objects using for loop, adds those apple objects to the list
	 * 
	 * @param primaryStage
	 */
	public void scene3(Stage primaryStage) {

		root = new Pane();
		scene2 = new Scene(root,850,480);
		primaryStage.setScene(scene2);
		primaryStage.show();
		canvas = new Canvas (950, 600);
		
		graphicsC = canvas.getGraphicsContext2D();
		graphicsC.setFill(Color.ALICEBLUE);
		graphicsC.fillRect(0, 0, canvas.getWidth(), canvas.getHeight());
		root.getChildren().addAll(canvas);
		
		
	    game = new GameFactory(graphicsC);
		Random m = new Random();
		int f = m.nextInt(5);
		
		int x = m.nextInt(20);
		int y = m.nextInt(20);
		
		for(int i =0; i<=f; i++) {  //to create multiple objects
		     
			 
			  list.add(game.createProduct("redApple", x, y));   //creates RedApple object and add it to the list
			  x = m.nextInt(250);
		      y = m.nextInt(200);
		      list.add(game.createProduct("pinkApple", x, y));  //creates PinkApple object and add it to the list
		
		      x = m.nextInt(300);
              y = m.nextInt(300);
              list.add(game.createProduct("blueApple", x, y)); //creates YellowApple object and add it to the list
        }
		
		
		Label label = new Label("How many RED APPLES do I have?" ); //setting the label
		label.setFont(new Font("Arial", 20));
		label.setLayoutX(510);
		label.setLayoutY(200);
	    root.getChildren().add(label);
	    check(f, label, primaryStage, "scene3"); //calling the method check() to check the result
		
	}
	
	
	
	/**
	 * This method sets the pear scene, creates objects using for loop, adds those pear objects to the list
	 * 
	 * @param primaryStage
	 */
	public void scene4(Stage primaryStage) {

		root = new Pane();
		scene2 = new Scene(root,850,480);
		primaryStage.setScene(scene2);
		primaryStage.show();
		canvas = new Canvas (950, 600);
		graphicsC = canvas.getGraphicsContext2D();
		graphicsC.setFill(Color.ALICEBLUE);
		graphicsC.fillRect(0, 0, canvas.getWidth(), canvas.getHeight());
		root.getChildren().addAll(canvas);
		
	    game = new GameFactory(graphicsC);
		
		Random m = new Random();
		
		int f = m.nextInt(5);
		int x = m.nextInt(20);
		int y = m.nextInt(20);
		
		for(int i =0; i<=f; i++) { //to create multiple objects
		     
			   list.add(game.createProduct("greenPear", x, y));  //creates GreenPear objects and add it to the list
		
		       x = m.nextInt(250);
		       y = m.nextInt(200);
	    	
		       list.add(game.createProduct("yellowPear", x, y)); //creates YellowPear objects and add it to the list
		
	    	
		       x = m.nextInt(350);
	           y = m.nextInt(300);
		       list.add(game.createProduct("redPear", x, y));    //creates RedPear objects and add it to the list
        }
		
		
		Label label = new Label("How many GREEN PEARS do I have?" );  //setting the label
		label.setFont(new Font("Arial", 20));
		label.setLayoutX(510);
		label.setLayoutY(200);
	    root.getChildren().add(label);
		
	    check(f, label, primaryStage, "scene4");  //calling the method check() to check the result
	}


	/**
	 * This method sets the orange scene, creates objects using for loop, adds those orange objects to the list
	 * 
	 * @param primaryStage
	 */
	public void scene5(Stage primaryStage) {

		root = new Pane();
		scene2 = new Scene(root,850,480);
		primaryStage.setScene(scene2);
		primaryStage.show();
		canvas = new Canvas (950, 600);
		graphicsC = canvas.getGraphicsContext2D();
		graphicsC.setFill(Color.ALICEBLUE);
		graphicsC.fillRect(0, 0, canvas.getWidth(), canvas.getHeight());
		root.getChildren().addAll(canvas);
		
	    game = new GameFactory(graphicsC);
		
		Random m = new Random();
		
		int f = m.nextInt(5);
		
		int x = m.nextInt(20);
		int y = m.nextInt(20);
		
		for(int i =0; i<=f; i++) { //to create multiple objects
		     
			
			 list.add(game.createProduct("orange", x, y)); //creates orange object and add it to the list
		    
			 x = m.nextInt(250);
		     y = m.nextInt(200);
	    	
		     list.add(game.createProduct("yellowOrange", x, y)); //creates a YellowOrange object and add it to the list
		
	    	 x = m.nextInt(350);
	         y = m.nextInt(300);
	        
	         list.add(game.createProduct("greenOrange", x, y)); //creates a GreenOrange Object and add it to the list

       }
		
		
		Label label = new Label("How many ORANGES do I have?" ); //creating a label object
		label.setFont(new Font("Arial", 20));
		label.setLayoutX(510);
		label.setLayoutY(200);
	    root.getChildren().add(label);
		
	    check(f, label, primaryStage, "scene5");  //calling the method check() to check the result
		
	        
	}
	
	
	/**
	 * This method sets the berry scene, creates objects using for loop, adds those berries objects to the list
	 * 
	 * @param primaryStage
	 */
	public void scene6(Stage primaryStage) {

		root = new Pane();
		scene2 = new Scene(root,850,480);
		primaryStage.setScene(scene2);
		primaryStage.show();
		canvas = new Canvas (950, 600);
		graphicsC = canvas.getGraphicsContext2D();
		graphicsC.setFill(Color.ALICEBLUE);
		graphicsC.fillRect(0, 0, canvas.getWidth(), canvas.getHeight());
		root.getChildren().addAll(canvas);
		
		game = new GameFactory(graphicsC);
		
		Random m = new Random();
		int f = m.nextInt(5);
		int x = m.nextInt(20);
		int y = m.nextInt(20);
		
		for(int i =0; i<=f; i++) {   //to create multiple objects
		     
		   list.add(game.createProduct("blueberry", x, y)); //create a new Blueberry object and add it to the list
		   
		    x = m.nextInt(250);
		    y = m.nextInt(200);
		    
	    	list.add(game.createProduct("blackberry", x, y));  //create a new Blackberry object and add it to the list
		
	    	x = m.nextInt(350);
	        y = m.nextInt(300);
	        
	        list.add(game.createProduct("purpleberry", x, y)); //create a new Purpleberry object and add it to the list

       }
		
		
		Label label = new Label("How many Blackberries do I have?" );
		label.setFont(new Font("Arial", 20));
		label.setLayoutX(510);
		label.setLayoutY(200);
	    root.getChildren().add(label);
		
	    check(f, label, primaryStage, "scene6");  //calling the method check() to check the result
		
	        
	}

	
	
	
	
	/**
	 * This method creates exit button, adds farmer and tree objects to the list and checks the answer of the questions
	 * 
	 * @param f
	 * @param label
	 * @param primaryStage
	 * @param scene88
	 */
	public void check(int f, Label label, Stage primaryStage, String scene88) {
	    
		Button exit = new Button("EXIT"); 
		exit.setLayoutX(620);
		exit.setLayoutY(380);
		exit.setMinSize(200, 80);
		exit.setOnAction(e->this.scene2(primaryStage));
		exit.setStyle("-fx-background-color: green;" );
		root.getChildren().add(exit);
		
	    StackPane sp = new StackPane();
		list.add(game.createProduct("farmer", 500, 00));
		list.add(game.createProduct("tree", -100, -70));
	    
		
		button1 = new Button("1");  //creating the button 1
	    button1.setLayoutX(550);
	    button1.setLayoutY(280);
	    button1.setStyle("-fx-background-color: red;");
	    EventHandler<ActionEvent> event = new EventHandler<ActionEvent>() { 
	            public void handle(ActionEvent e) 
	            { 
	            	if(f==0) {                         //if the answer is 0 
	            		 if(scene88=="scene3") {       //if the scene is 3, calls the scene3() method
	            		    	scene3(primaryStage);
	            		  }else if(scene88=="scene4") {//if the scene is 4, calls the scene4() method
	            			    scene4(primaryStage);
	            		  }else if(scene88=="scene5") {//if the scene is 5, calls the scene5() method
	            			    scene5(primaryStage);
	            		  }else if(scene88=="scene6") {//if the scene is 6, calls the scene6() method
	            			    scene6(primaryStage);
	            		  }
	             
	            } else {                               //if the answer is not 0
	            	  label.setText(" INCORRECT ");        // text
	            	}
	            }
	        }; 
	  
	   button1.setOnAction(event);
	  
	    
	   button2 = new Button("2");   //creating the button 2
	   button2.setStyle("-fx-background-color: orange;");
	   button2.setLayoutX(600);
	   button2.setLayoutY(280);
	   EventHandler<ActionEvent> event2 = new EventHandler<ActionEvent>() { 
	             public void handle(ActionEvent e) 
                 { 
            	     if(f==1) {                           //if the answer is 1
            		      if(scene88=="scene3") {         //if the scene is 3, calls the scene3() method
         		    	         scene3(primaryStage);
         		          }else if(scene88=="scene4") {   //if the scene is 4, calls the scene4() method
         			             scene4(primaryStage);
         		          }else if(scene88=="scene5") {   //if the scene is 5, calls the scene5() method
         			             scene5(primaryStage);
         		          }else if(scene88=="scene6") {   //if the scene is 6, calls the scene6() method
         			             scene6(primaryStage);
         		          }
                  } else {                                //if the answer is not 1
            	          label.setText(" INCORRECT ");       // text
            	  }
                  }
        }; 
        
        button2.setOnAction(event2);
        
	    
	    button3 = new Button("3");          //creating the button 3
	    button3.setLayoutX(650);
	    button3.setLayoutY(280);
	    button3.setStyle("-fx-background-color: blue;");
	        
	    EventHandler<ActionEvent> event3 = new EventHandler<ActionEvent>() { 
		        public void handle(ActionEvent e) 
	            { 
	            	if(f==2) {                             //if the answer is 2
	            		 if(scene88=="scene3") {           //if the scene is 3, calls the scene3() method
	            		    	scene3(primaryStage);
	            		  }else if(scene88=="scene4") {    //if the scene is 4, calls the scene4() method
	            			    scene4(primaryStage);
	            		  }else if(scene88=="scene5") {    //if the scene is 5, calls the scene5() method
	            			    scene5(primaryStage);
	            		  }else if(scene88=="scene6") {    //if the scene is 6, calls the scene6() method
	            			    scene6(primaryStage);
	            		  }
	            } else {                                   //if the answer is not 2
	            	  label.setText(" INCORRECT ");            // text
	            	}
	            }
	        };  
	   button3.setOnAction(event3);
	        
	  
	   button4 = new Button("4");                           //creating the button 4
	   button4.setLayoutX(700); 
       button4.setLayoutY(280);
       button4.setStyle("-fx-background-color: red;");
	         
       EventHandler<ActionEvent> event4 = new EventHandler<ActionEvent>() { 
		        public void handle(ActionEvent e) 
	            { 
	            	if(f==3) {
	            		 if(scene88=="scene3") {            //if the scene is 3, calls the scene3() method
	            		    	scene3(primaryStage);
	            		  }else if(scene88=="scene4") {     //if the scene is 4, calls the scene4() method
	            			    scene4(primaryStage);
	            		  }else if(scene88=="scene5") {     //if the scene is 5, calls the scene5() method
	            			    scene5(primaryStage);
	            		  }else if(scene88=="scene6") {     //if the scene is 6, calls the scene6() method
	            			    scene6(primaryStage);
	            		  }
	            } else {                                     //if the answer is not 3
	            	  label.setText(" INCORRECT ");      // text
	                }
	            }
	        };  
	        
	  button4.setOnAction(event4);
	       
	  button5 = new Button("5");                           //creating the button 5
	  button5.setLayoutX(750);
      button5.setLayoutY(280);
      button5.setStyle("-fx-background-color: yellow;");
	        
	  EventHandler<ActionEvent> event5 = new EventHandler<ActionEvent>() { 
		        public void handle(ActionEvent e) 
	            { 
	            	if(f==4) {
	            		 if(scene88=="scene3") {           //if the scene is 3, calls the scene3() method
	            		    	scene3(primaryStage);
	            		  }else if(scene88=="scene4") {    //if the scene is 4, calls the scene4() method
	            			    scene4(primaryStage);
	            		  }else if(scene88=="scene5") {    //if the scene is 5, calls the scene5() method
	            			    scene5(primaryStage);
	            		  }else if(scene88=="scene6") {    //if the scene is 6, calls the scene6() method
	            			    scene6(primaryStage);
	            		  }
	            } else {                                   //if the answer is not 3
	            	label.setText(" INCORRECT");      // text
	            	}
	            }
	        };  
     button5.setOnAction(event5);  
     
	 root.getChildren().addAll(button1,button2, button3, button4, button5);
	     
	}
	

	
}

	
	
	
