package FlyWeightDesignPattern2;

import java.awt.Color;
import java.awt.Graphics;

public class MyRectangle implements IMyShape 
{	
	private Color color;
	private int x,y,height, width;
	private Graphics g;
	private boolean fill;
	private String font;
	public MyRectangle(){	
		this.color=color;
		this.x=x;
		this.y=y;
		this.width = width;
		this.fill = fill;
		this.height = height;
		this.font = font;
		this.g = g;
	   }

	   public void setX(int x) {
	      this.x = x;
	   }

	   public void setY(int y) {
	      this.y = y;
	   }

	   public void setWidth(int width) {
	      this.width = width;
	   }
	   public void setHeight(int height) {
		      this.height = height;
		   }
	   public void setFill(boolean fill) {
		      this.fill = fill;
		   }
	   public void setFont(String font) {
		      this.font = font;
		   }
	   public void setGraphics(Graphics g) {
		   this.g = g;
	   }
	   public void setColor(Color color) {
		   this.color = color;
	   }
	   public int getX() {
		   return x;
		}
	   public int getY()
		{
			   return y;
		}
	   public int getWidth()
		{
			   return width;}
	   public int getHeight() {
		
			   return height;
		}
	   public Color getColor() {
			   return color;
		}
	   public boolean getFill() {
			   return fill;
		}
	   public Graphics getGraphics() {
		   return g;
	   }
		  
		public String draw(Graphics g, int x, int y, int width, int height, Color color, boolean fill, String font) {
					System.out.println("This Rectangle has the following parameters: X:" + getX() + 
							" Y:"+getY() + " Width:"+ getWidth() + " Height :" + getHeight()+ " Color: "+
							getColor()+ " Fill:" + getFill() + " Graphics:" + getGraphics()+"/n");
			return null;
		}
}
