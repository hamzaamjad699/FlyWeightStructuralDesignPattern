package FlyWeightDesignPattern2;

import java.util.HashMap;



public class ShapeFactory {
	private static final HashMap shapes = new HashMap ();
public static IMyShape getShape (String label)
{
	IMyShape p = null; 

	
	if (shapes.containsKey(label)) 
			p = (IMyShape) shapes.get(label); 
	else
	{ 
		/* create an object of a shape */
		switch(label) 
		{ 
		case "R": 
			System.out.println("Rectangle Created"); 
			p = new MyRectangle(); 
			break; 
		case "O": 
			System.out.println("Oval Created"); 
			p = new MyOval(); 
			break; 
		default : 
			System.out.println("Unreachable code!"); 
		} 

		// Once created insert it into the HashMap 
		shapes.put(label, p); 
	} 
	return p; 
} 
} 
