

import ch.aplu.turtle.*;
import java.util.Scanner;
import java.awt.Color;
import java.awt.color.*;

public class Turtle_RING {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	        
	    String col = "GREEN";
	    
	   
		Turtle hans = new Turtle();
		hans.setPenColor (Color.green);
		hans.setFillColor (Color.green);
		
		
		
		
		for (int n = 1; n < 50; n++)
	    {
	      hans.forward(100);
	      hans.left(110);
	    }

	
		
		

	}

}

