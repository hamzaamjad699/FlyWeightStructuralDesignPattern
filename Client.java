package FlyWeightDesignPattern2;

import java.awt.Color;
import java.awt.Graphics;

public class Client
{
	public Client() {    

	    for(int i = 0; i < 1; i++) {
	      
	         MyRectangle rectangle= (MyRectangle) ShapeFactory.getShape(getRectShape());
	         
	         rectangle.setX(HEIGHT*2);
	         rectangle.setY(WIDTH*3);
	         rectangle.setGraphics(null);
	         rectangle.setColor(colors[1]);
	         rectangle.setFill(fill[0]);
	         rectangle.setFont(font[0]);
	         rectangle.setHeight(HEIGHT);
	         rectangle.setWidth(WIDTH);
	         rectangle.draw(null, HEIGHT, WIDTH, WIDTH, HEIGHT, colors[0], fill[0], font[0]);
	         System.out.println("");
	         MyOval oval =(MyOval) ShapeFactory.getShape(getOvalShape());
	         oval.setX(HEIGHT*4);
	         oval.setY(WIDTH);
	         oval.setGraphics(null);
	         oval.setColor(colors[2]);
	         oval.setFill(fill[1]);
	         oval.setFont(font[1]);
	         oval.setHeight(HEIGHT*3);
	         oval.setWidth(WIDTH);
	         oval.draw(null, HEIGHT, WIDTH, WIDTH, HEIGHT, colors[0], fill[0], font[0]);
	         
	} 
	    }
	private static final int WIDTH = 1800, HEIGHT = 1600;
	private static final String shapes[] = { "R", "O" };
	private static final Color colors[] = { Color.red, Color.green, Color.blue };
	private static final boolean fill[] = { true, false };
	private static final String font[] = { "Arial", "Courier" };
	//Write the remaining code according to your understanding
	public static void main(String[] args) {
        Client client = new Client();
        
   	 
    }


	private static String getRectShape() {
		   return shapes[0];
	}
	private static String getOvalShape() {
		   return shapes[1];
	}
	private static int getX() {
		   return (int) (WIDTH*0.9);
	}
	private static int getY()
	{
		   return (int)(HEIGHT*0.8);
	}
	private static int getWidth()
	{
		   return (int)(WIDTH/7);}
	private static int getHeight() {
	
		   return (int)(HEIGHT / 7);
	}
	private static Color getColorR() {
		   return colors[0];
	}
	private static boolean getFillR() {
		   return fill[0];
	}
	
	public static String DataString() {
		   return "Shape"+ getRectShape()+ "X: " + getX()+"Y:"+ getY()+"Width:"+ 
				   getWidth()+"Height" +getHeight()+"Color: " + getColorR()+ 
				   "Fill: " + getFillR();
	}
}