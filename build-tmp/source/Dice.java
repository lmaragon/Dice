import processing.core.*; 
import processing.data.*; 
import processing.event.*; 
import processing.opengl.*; 

import java.util.HashMap; 
import java.util.ArrayList; 
import java.io.File; 
import java.io.BufferedReader; 
import java.io.PrintWriter; 
import java.io.InputStream; 
import java.io.OutputStream; 
import java.io.IOException; 

public class Dice extends PApplet {

Die one;
Die two;

public void setup()
{
	size(800,800);
	noLoop();
}

public void draw()
{
	background (255);
	one = new Die(100,400);
	two = new Die(500,400);
	one.show();
	two.show();
	textAlign(CENTER);
	textSize (30);
	text("Total Roll: "+(one.numDots+two.numDots), 400,200);
}

public void mousePressed()
{
	redraw();
}

class Die //models one single dice cube
{
	int numDots, myX, myY; //variable declarations here
	Die(int x, int y) //constructor
	{
		roll();//variable initializations here
		myX = x;
		myY = y;
	}
	public void roll()
	{
		numDots = (int)(Math.random()*6+1);
	}
	public void show()
	{
		fill(PApplet.parseInt(random(256)+50),PApplet.parseInt(random(256)+50),PApplet.parseInt(random(256)+50));
		rect(myX,myY,200,200, 25);
		if (numDots == 1)
		{
			fill(0);
			ellipse (myX+100,myY+100,75,75);
		}
		if (numDots == 2)
		{
			fill(0);
			ellipse (myX+125,myY+75,50,50);
			ellipse (myX+75,myY+125,50,50);
		}
		if (numDots == 3)
		{
			fill(0);
			ellipse (myX+150,myY+50,50,50);
			ellipse (myX+100,myY+100,50,50);
			ellipse (myX+50,myY+150,50,50);
		}
		if (numDots == 4)
		{
			fill(0);
			ellipse (myX+150,myY+50,50,50);
			ellipse (myX+150,myY+150,50,50);
			ellipse (myX+50,myY+50,50,50);
			ellipse (myX+50,myY+150,50,50);
		}
		if (numDots == 5)
		{
			fill(0);
			ellipse (myX+150,myY+50,50,50);
			ellipse (myX+150,myY+150,50,50);
			ellipse (myX+50,myY+50,50,50);
			ellipse (myX+50,myY+150,50,50);
			ellipse (myX+100,myY+100,50,50);
		}
		if (numDots == 6)
		{
			fill(0);
			ellipse (myX+150,myY+35,50,50);
			ellipse (myX+150,myY+100,50,50);
			ellipse (myX+150,myY+165,50,50);
			ellipse (myX+50,myY+35,50,50);
			ellipse (myX+50,myY+100,50,50);
			ellipse (myX+50,myY+165,50,50);

		}
	}
}
  static public void main(String[] passedArgs) {
    String[] appletArgs = new String[] { "Dice" };
    if (passedArgs != null) {
      PApplet.main(concat(appletArgs, passedArgs));
    } else {
      PApplet.main(appletArgs);
    }
  }
}
