import org.w3c.dom.Text;
import processing.core.PApplet;
import processing.core.PImage;


public class Sketch extends PApplet {

  // initializing variables to be used for multiple keys moving circle 
  boolean upPressed = false;
  boolean downPressed = false;
  boolean leftPressed = false;
  boolean rightPressed = false;

  float circleX = 200;
  float circleY = 200;

  PImage birds;
  PImage cloud;
  PImage cloud2;
  PImage kanye;
  PImage ye;

  /**
   * Called once at the beginning of execution, put your size all in this method
   */
  public void settings() {
	// put your size call here
    size(800, 800);
    birds = loadImage("birds.png");
    birds.resize(100,100);

    cloud = loadImage("cloud.png");
    cloud.resize(50,50);

    cloud2 = loadImage("cloud 2.png");
    cloud2.resize(50,50);

    ye = loadImage("ye.png");
    ye.resize(100,100);

    kanye = loadImage("kanye.png");
    kanye.resize(200,200);
  }

  /** 
   * Called once at the beginning of execution.  Add initial set up
   * values here i.e background, stroke, fill etc.
   */
  public void setup() {
    background(31, 153, 255);
    size(800, 800);

  }

  /**
   * Called repeatedly, anything drawn to the screen goes here
   */
  public void draw() { 
    // checks if a key is pressed, and if so will apply approriate movements to dot on screen based on what key is pressed 
    if (keyPressed){
  if (upPressed) {
    circleY--;
  }
  
  if (downPressed) {
    circleY++;
  }
  
  if (leftPressed) {
    circleX--;
  }
  
  if (rightPressed) {
    circleX++;
  }
  
  // prints circle using given values 
  ellipse(circleX, circleY, 10, 10);
}
  }
    // method call for when the mouse is cliked 
    public void mouseClicked() {
      // creates building at point of where mouse is lcoked on screen 
      fill(153, 153, 153);
      rect(mouseX, mouseY, 150, 800);

      for (int i=0; i< (800-mouseY); i++){
        fill(53);
        rect(mouseX + 15, mouseY + 20 + (i*60), 45,45);
        rect(mouseX + 85, mouseY + 20 + (i*60), 45,45);
      }
    }

    // method call for when the mouse is moved
    public void mouseMoved() {
      // replaces the grass on lower part of sceen each time the mouse is moved 
      fill(0,153,0); 
      rect(0,700,800,100);
    }

    // method call for when the mouse is dragged
    public void mouseDragged(){
      // places birds on screen at location of mouse on screen whenever mouse is dragged 
      image(birds, mouseX, mouseY);
    }

    // method call for when the mouse is pressed
    public void mousePressed(){
      // if mouse is pressed an image of a cloud will be randomly produced on the screen 
      if (mousePressed){
      image(cloud, random(0,800), random(0,200));
      }
    }

    // method call for when the mouse is released 
    public void mouseReleased(){
      // image of cloud is randomly produced on screen if mouse is released 
      image(cloud2, random(0,800), random(0,200));
    }

    // method call for when the mouse wheel is used 
    public void mouseWheel(){
      // creates a tree using shapes on the screen at loation of mouse 
    fill(153,102,0);
    rect(mouseX - 10, mouseY - 10, 20, 800);

    fill(0,153,0); 
    ellipse(mouseX + 25, mouseY,50,50);

    fill(0,153,0); 
    ellipse(mouseX - 25, mouseY,50,50);

    fill(0,153,0); 
    ellipse(mouseX , mouseY - 25,50,50);
    }

    // method call for when a key is released 
    public void keyReleased(){

      // changes values of booleans to false whenever certain keys are released 
      if (keyCode == UP) {
        upPressed = false;
      }
      else if (keyCode == DOWN) {
        downPressed = false;
      }
      else if (keyCode == LEFT) {
        leftPressed = false;
      }
      else if (keyCode == RIGHT) {
        rightPressed = false;
      }

      // prints kanyeville onto top of screen 
      textSize(100);
      fill(0);
      text("KANYEVILLE", 100, 100);
    }

    public void keyPressed(){
      // changes values of booleans to true whenever certain keys are pressed 
      if (keyCode == UP) {
        upPressed = true;
      }
      else if (keyCode == DOWN) {
        downPressed = true;
      }
      else if (keyCode == LEFT) {
        leftPressed = true;
      }
      else if (keyCode == RIGHT) {
        rightPressed = true;
      }

      // loads images to be printed 

      // prints kanye face randomly on screen 
      if (keyCode == ENTER){
        image(kanye, random(-50,750), random(-20,780));
      }

      // prints TLOP kanye on bottom of screen 
      if (key == 'y'){
        image(ye, random(-10,800), 700);
      }
    }
}
