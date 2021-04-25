package demos;

import java.util.Arrays;

import processing.core.PApplet;
import processing.core.PImage;

/** 
 * A class to illustrate some use of the PApplet class
 * Used in module 3 of the UC San Diego MOOC Object Oriented Programming in Java
 * 
 * @author UC San Diego Intermediate Software Development MOOC team
 * 
 *
 */
public class MyDisplay extends PApplet {
	
	private String url = "https://cdn.britannica.com/57/151657-131-A74A72C8/Camel-caravan-desert-sand-dunes-Sahara-North.jpg";

	///PImage object will be used to paste the image on the GUI 
	private PImage backgroundImg; 

	public void setup()
	{
		size(1000, 500);
		background(200, 200, 200);
		
		backgroundImg = loadImage(url , "jpg");
		
	}
	
	public void draw()
	{
//		fill(255, 255, 0);
//		ellipse(200, 200, 390, 390);
//		fill(0, 0, 0);
//		ellipse(120, 130, 50, 70);
//		ellipse(280, 130, 50, 70);
//		
//		noFill();
//		arc(200, 280, 75, 75, 0, PI);
		
		//method to paste image on the GUI
		//i can use height or width here both are instance variable and our image is gonna be dynamic
		//the resize method will going to fixed the image as per the size of the GUI
		backgroundImg.resize(width, height);
		//backgroundImg.resize(width, 0);
		image(backgroundImg, 0, 0);
		
		int[] color_code = method_to_create_array(second());
		fill(color_code[0], color_code[1], color_code[2]);
		
		int hour_of_the_day = hour();
		
//		if(hour_of_the_day < 18 && hour_of_the_day > 5) {
//		    fill(255, 190, 10);
//		}else {
//			fill(0,0,0);
//		}
		
		ellipse(width/4, height/5,width/10, height/5); 
		
		fill(255, 190, 10);
		ellipse(width/2, height/2, 200, 200);
		fill(0,0,0);
		ellipse(450, 200, 30, 50);
	
		ellipse(550, 200, 30, 50);
		
		//line(450,250,550,250);
		//noFill();
		arc(500, 250, 100, 100,0, HALF_PI );
		
	}
	
	public int[] method_to_create_array(int second) {
		
		//to change color every seconds you can take x to be anything but less than 4.25
		//because if in case x is 4.25 and second in near 60 it'll exceed 255
		int x=4;
		int[] array_to_fill = new int[3];
		Arrays.fill(array_to_fill, second*x);
		return array_to_fill;
				
	}
	
}
