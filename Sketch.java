import org.w3c.dom.Text;

import processing.core.PApplet;
import processing.core.PImage;


public class Sketch extends PApplet {
	
  /**
   * Called once at the beginning of execution, put your size all in this method
   */
  public void settings() {
	// put your size call here
    size(800, 800);
  }

  /** 
   * Called once at the beginning of execution.  Add initial set up
   * values here i.e background, stroke, fill etc.
   */
  public void setup() {
    background(31, 153, 255);

  }

  /**
   * Called repeatedly, anything drawn to the screen goes here
   */
  public void draw() { 
    }

    public void mouseClicked() {
      fill(153, 153, 153);
      rect(mouseX, mouseY, 150, 800);

      for (int i=0; i< (800-mouseY); i++){
        fill(53);
        rect(mouseX + 15, mouseY + 20 + (i*60), 45,45);
        rect(mouseX + 85, mouseY + 20 + (i*60), 45,45);
      }
    }


    //public void mouseMoved() {
    //fill(0);
    //ellipse(mouseX,mouseY,3,3);
    //}

    public void mouseDragged(){
      PImage birds = loadImage("birds.png");
      birds.resize(100,100);
      image(birds, mouseX, mouseY);
    }

    public void mousePressed(){
      if (mousePressed){
      PImage cloud = loadImage("cloud.png");
      cloud.resize(50,50);
      image(cloud, random(0,800), random(0,200));
      }
    }
    public void mouseReleased(){
      PImage cloud2 = loadImage("cloud 2.png");
      cloud2.resize(50,50);
      image(cloud2, random(0,800), random(0,200));
    }

    public void mouseWheel(){
    fill(153,102,0);
    rect(mouseX - 10, mouseY - 10, 20, 800);

    fill(0,153,0); 
    ellipse(mouseX + 25, mouseY,50,50);

    fill(0,153,0); 
    ellipse(mouseX - 25, mouseY,50,50);

    fill(0,153,0); 
    ellipse(mouseX , mouseY - 25,50,50);
    }


    public void keyReleased(){
      textSize(100);
      fill(0);
      text("KANYEVILLE", 100, 100);
    }

    public void keyPressed(){
      PImage ye = loadImage("ye.png");
      ye.resize(100,100);
      PImage kanye = loadImage("kanye.png");
      kanye.resize(200,200);

      if (keyCode == ENTER){
        image(kanye, random(0,800), random(0,800));
      }

      if (key == 'y'){
        image(ye, random(0,800), 700);
      }
    }
}
