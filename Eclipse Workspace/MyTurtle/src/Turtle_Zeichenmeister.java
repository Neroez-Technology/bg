
import javax.swing.*;
import ch.aplu.turtle.*;
import java.util.Scanner;
import java.awt.Color;
import java.awt.color.*;

public class Turtle_Zeichenmeister extends JPanel{

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	        
	    String col = "GREEN";
	    
	   
		Turtle hans = new Turtle();
		hans.setPenColor (Color.green);
		hans.setFillColor (Color.green);
		System.out.println("hi");
		
		double x = 0;
		double y = 0;
		double r = 0;
		String eingabex ;
	    String eingabey ;
	    String eingaber ;
		
		
	    

	    JOptionPane.showMessageDialog(null, "Willkommen beim Zeichenmeister!!!");
	    
	    
	    Object[] options = {"Kreis", "Rechteck", "N-Eck" , "Dreieck"};

        int selected = JOptionPane.showOptionDialog(null,
                                                    "Formen Auswahl",
                                                    "Überprüfung",
					    JOptionPane.DEFAULT_OPTION, 
                                                    JOptionPane.INFORMATION_MESSAGE, 
					    null, options, options[0]);
        System.out.println(selected);
        if (selected == 0){
            
        	
        	eingabex = JOptionPane.showInputDialog("Bitte x Wert eingeben: ");
    	    x = Double.parseDouble(eingabex);
    	    eingabey = JOptionPane.showInputDialog("Bitte y Wert eingeben: ");
    	    y = Double.parseDouble(eingabey);
    	    eingaber = JOptionPane.showInputDialog("Bitte Radius Wert eingeben: ");
    	    r = Double.parseDouble(eingaber);
    	    
    	    
    	    
        	hans.hideTurtle();
            while(r>0){
    		  for(double i = 0; i<2*Math.PI; i+= (Math.PI/180)*0.5){
    			 
    		     hans.setX(r*Math.cos(i)+x);
    		     hans.setY(r*Math.sin(i)+y);
    		     hans.forward(0);
    		  } 
    		 
    		  r = r - 0.1;
    	    }
        	
        }
        if (selected == 1){
        
        	JOptionPane.showMessageDialog(null, "Die Funktion ist noch nicht verfügbar..leider !");
        	
        	
        }
        if (selected == 2){
            double n = 5;
            double l = 50;
            String eingaben ;
    	    String eingabel ;
            eingaben = JOptionPane.showInputDialog("Bitte Anzahl der Ecken eingeben: ");
    	    n = Double.parseDouble(eingaben);
    	    eingabel = JOptionPane.showInputDialog("Bitte Länge der Einzelstücke eingeben eingeben: ");
    	    l = Double.parseDouble(eingabel);
        	for (double i = 0 ; i< n; i++){
        	  hans.left(360/n);
        	  hans.forward(l);
        	}
        }
        if (selected == 3){
        	JOptionPane.showMessageDialog(null, "Die Funktion ist noch nicht verfügbar..leider !");
        	//for (int n = 1; n < 50; n++)
    	    //{
    	    //   hans.forward(100);
    	    //}
        	
        }
       

      

 
 
 
		
	   
	    
	    
	    
	    
	    
	}

}

