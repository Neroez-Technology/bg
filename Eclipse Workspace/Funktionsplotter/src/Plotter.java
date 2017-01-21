import java.awt.Color;
import javax.swing.*;
import ch.aplu.turtle.*;

public class Plotter extends JPanel {

	public static void main(String[] args) {
		
		double scal = 1;
		String input_scal = "0";
		//input_scal = JOptionPane.showInputDialog("Bitte Streckfaktor eingeben: ");
		//scal = Integer.parseInt(input_scal);
		
		Object[] options_scal = {"+10-10", "+20-20", "+100-100", "1000", "-----"};

        int selected_scal = JOptionPane.showOptionDialog(null,
                                                    "Skalierung wählen (von-bis); ",
                                                    "Skalierung",
					    JOptionPane.DEFAULT_OPTION, 
                                                    JOptionPane.INFORMATION_MESSAGE, 
					    null, options_scal, options_scal[0]);
             System.out.println(selected_scal);
          if (selected_scal == 0){
            scal = 20;
          }
          if (selected_scal == 1){
    	   scal = 10;
          }
          if (selected_scal == 2){
    	   scal = 2;
          }
          if (selected_scal == 3){
       	   scal = 0.2;
          }
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		TurtleFrame tf= new TurtleFrame("", 410,410);
		Turtle printer = new Turtle(tf);
		printer.setPenColor (Color.gray);
		printer.setFillColor (Color.gray);
		
		printer.hideTurtle();
		printer.setFontSize(12);
		
        printer.setPos(-200, 0);
		for (int n = 1; n < 400; n++)
	    {
	      printer.forward(0);
	      printer.setX(n-200);
	    }
     
		printer.setPos(0, -200);
		for (int n = 1; n < 400; n++)
	    {
	      printer.forward(0);
	      printer.setY(n-200);
	    }
		
		
		printer.setPos(10, 10);
		double x = -200 ;
		double y = 2;
		
		for (int k = 1; k<= 39; k++) {          //39 Striche auf x-Achse
	          for (int n = 1; n <= 5; n++){
			  printer.setPos(x, y); 
			  printer.forward(0);
			  y = y-1;
			  
			  
			  if (x%50 == 0){
				y = 4;
				
				for (int o = 1; o <= 8; o++){
				printer.setPos(x, y); 
			    printer.forward(0);
				y = y-1;
				}
				
				
				if (x != 0){               //Null nicht abbilden
				printer.setPos(x-7, -15);  // Verschiebung für Zahlen
				printer.label(""+(x)/scal);
				}
	          }
			  
		      }
		 x = x+10;
		 y = 2;  
		 }
		
		
		x = 2 ;
		y = -200;
		for (int k = 1; k<= 39; k++) {              //39 Striche auf y-Achse
	          for (int n = 1; n <= 5; n++){
			  printer.setPos(x, y); 
			  printer.forward(0);
			  x = x-1;
			  
			  if (y%50 == 0){
					x = 4;
					
					for (int o = 1; o <= 8; o++){
					printer.setPos(x, y); 
				    printer.forward(0);
					x = x-1;
					}
					
					
					if (y != 0){              // Null nicht abbilden
					printer.setPos(7, y-7);   // Verschiebung für Zahlen
					printer.label(""+(y/scal));
					}
		          }
			  
		      }
		 x = 2;
		 y = y+10;  
		 }

	      
	     
		printer.setPos(-6.5001, 180);   // Verschiebung für Zahlen
		printer.setFontSize(30);
		printer.label("^");
	     
		printer.setPos(188, -8.5);   // Verschiebung für Zahlen
		printer.setFontSize(25);
		printer.label(">");
	      
		printer.setPos(188, -20);  
		printer.setFontSize(15);
		printer.label("x");
		
		printer.setPos(-30, 190);   // Verschiebung für Zahlen
		printer.setFontSize(15);
		printer.label("f(x)");
		
		printer.setPos(-200, 190);   // Verschiebung für Zahlen
		printer.setFontSize(15);
		printer.label("Funktionsplotter v2");
	 
	     //--------------AUFBAU-------------------// 
		String z = "";
		double a = 0;
		double b = 0;
		double c = 0;
		double d = 0;
		double e = 0;
		double f = 0;
		
		printer.setPenColor (Color.red);
		   // Anzeige von Funktion bei   und nahe Y-Abschnitt
		printer.setFontSize(15);
		
		//z = JOptionPane.showInputDialog("Bitte Streckfaktor eingeben: ");
		//a = Double.parseDouble(z);
		//z = JOptionPane.showInputDialog("Bitte Steigung eingeben: ");
		//b = Double.parseDouble(z);
		//z = JOptionPane.showInputDialog("Bitte Y-Achsenabschnitt eingeben: ");
		//c = Double.parseDouble(z);
		
		
		//FARBE
		int status = 0;
		do{
		
		Object[] options_farb = {"Rot", "Grün", "Gelb", "Blau", "Orange"};

	      int selected_farb = JOptionPane.showOptionDialog(null,
	                                                  "Welche Farbe soll sie haben ",
	                                                  "Farb-Wahl",
						    JOptionPane.DEFAULT_OPTION, 
	                                                  JOptionPane.INFORMATION_MESSAGE, 
						    null, options_farb, options_farb[0]);
	           System.out.println(selected_farb);
			
	           if (selected_farb == 0){
	        	   printer.setPenColor (Color.red);  
	           }
	           
	           if (selected_farb == 1){
	        	   printer.setPenColor (Color.green);  
	           }
	           
	           if (selected_farb == 2){
	        	   printer.setPenColor (Color.yellow);  
	           }
	           
	           if (selected_farb == 3){
	        	   printer.setPenColor (Color.blue);  
	           }
	           
	           if (selected_farb == 4){
	        	   printer.setPenColor (Color.orange);  
	           }
		
		///////////////
	           //FUNKTION
	          a = 0;
	   		 b = 0;
	   		 c = 0;
	   		 d = 0;
	   		 e = 0;
	   		 f = 0;
	           
		Object[] options = {"1.Grades", "2.Grades", "3.Grades", "4.Grades", "5.Grades"};

        int selected = JOptionPane.showOptionDialog(null,
                                                    "Es entsteht eine Funktion ",
                                                    "Grad-Wahl",
					    JOptionPane.DEFAULT_OPTION, 
                                                    JOptionPane.INFORMATION_MESSAGE, 
					    null, options, options[0]);
             System.out.println(selected);
          if (selected == 0){
       JOptionPane.showMessageDialog(null,"1");
      
		  z = JOptionPane.showInputDialog("Bitte a eingeben: ");
		  e = Double.parseDouble(z);
		z = JOptionPane.showInputDialog("Bitte b eingeben: ");
		  f = Double.parseDouble(z);
		  printer.setPos(f-50, f-50);
		  printer.label("f(x)="+e + "x+" +f);	
          }
      
       if (selected == 1){
       JOptionPane.showMessageDialog(null,"2");
      
		z = JOptionPane.showInputDialog("Bitte a eingeben: ");
		  d = Double.parseDouble(z);
		  z = JOptionPane.showInputDialog("Bitte b eingeben: ");
		  e = Double.parseDouble(z);
		z = JOptionPane.showInputDialog("Bitte c eingeben: ");
		  f = Double.parseDouble(z);
		  printer.setPos(f-50, f-50);
		  printer.label("f(x)="+ d + "x^2+" + e + "x+" +f);	
       }
      if (selected == 2){
      JOptionPane.showMessageDialog(null,"3");
      
		 z = JOptionPane.showInputDialog("Bitte a eingeben: ");
		  c = Double.parseDouble(z);
		z = JOptionPane.showInputDialog("Bitte b eingeben: ");
	  d = Double.parseDouble(z);
	  z = JOptionPane.showInputDialog("Bitte c eingeben: ");
		  e = Double.parseDouble(z);
		z = JOptionPane.showInputDialog("Bitte d eingeben: ");
	  f = Double.parseDouble(z);
	  printer.setPos(f-50, f-50);
	  printer.label("f(x)="+ c + "x^3+" + d + "x^2+" + e + "x+" +f);	
      
      }
      if (selected == 3){
          JOptionPane.showMessageDialog(null,"4");
         
  		 z = JOptionPane.showInputDialog("Bitte a eingeben: ");
  		  b = Double.parseDouble(z);
  		 z = JOptionPane.showInputDialog("Bitte b eingeben: ");
  		  c = Double.parseDouble(z);
  		z = JOptionPane.showInputDialog("Bitte c eingeben: ");
		  d = Double.parseDouble(z);
		  z = JOptionPane.showInputDialog("Bitte d eingeben: ");
  		  e = Double.parseDouble(z);
  		z = JOptionPane.showInputDialog("Bitte e eingeben: ");
		  f = Double.parseDouble(z);
		  printer.setPos(f-50, f-50);
		  printer.label("f(x)=" + b + "x^4+" + c + "x^3+" + d + "x^2+" + e + "x+" +f);	
          }
      if (selected == 4){
          JOptionPane.showMessageDialog(null,"5");
         z = JOptionPane.showInputDialog("Bitte a eingeben: ");
  		  a = Double.parseDouble(z);
  		 z = JOptionPane.showInputDialog("Bitte b eingeben: ");
  		  b = Double.parseDouble(z);
  		 z = JOptionPane.showInputDialog("Bitte c eingeben: ");
  		  c = Double.parseDouble(z);
  		z = JOptionPane.showInputDialog("Bitte d eingeben: ");
		  d = Double.parseDouble(z);
		  z = JOptionPane.showInputDialog("Bitte e eingeben: ");
  		  e = Double.parseDouble(z);
  		z = JOptionPane.showInputDialog("Bitte f eingeben: ");
		  f = Double.parseDouble(z);
		  printer.setPos(f-50, f-50);
		  printer.label("f(x)="+a + "x^5+" + b + "x^4+" + c + "x^3+" + d + "x^2+" + e + "x+" +f);	
          }
    
      
		
		
		for (double x1 = -200; x1< 200; x1=x1+0.001) {
			
		    y = a*(x1*x1*x1*x1*x1)+b*(x1*x1*x1*x1)+c*(x1*x1*x1)+d*(x1*x1)+e*(x1)+f;
		    printer.setPos((x1*scal), (y*scal));
		    printer.forward(0);
		}
		
		 
		
		
		
		status = 0;
		
		Object[] options_ret = {"Eine weitere Zeichnen", "Ansehen", "Schließen"};

	      int selected_ret = JOptionPane.showOptionDialog(null,
	                                                  "Ihre Entscheidungskraft wird benötigt: ",
	                                                  "Farb-Wahl",
						    JOptionPane.DEFAULT_OPTION, 
	                                                  JOptionPane.INFORMATION_MESSAGE, 
						    null, options_ret, options_ret[0]);
	           System.out.println(selected_ret);
			
	           if (selected_ret == 0){
	        	   status = 0;  
	           }
	           if (selected_ret == 1){
	        	   status = 1;    
	           }
	           if (selected_ret == 2){
	        	   JOptionPane.showMessageDialog(null,"Bitte durch Drücken auf x das Program beenden. ");  
	           }
	           
	          
		}while (status == 0);
		
		
		while (true){
			
		 
		Object[] options_scal1 = {"+10-10", "+20-20", "+100-100", "-----", "-----"};

        int selected_scal1 = JOptionPane.showOptionDialog(null,
                                                    "Skalierung wählen (von-bis); ",
                                                    "Skalierung",
					    JOptionPane.DEFAULT_OPTION, 
                                                    JOptionPane.INFORMATION_MESSAGE, 
					    null, options_scal1, options_scal1[0]);
             System.out.println(selected_scal1);
          if (selected_scal1 == 0){
            scal = 20;
          }
          if (selected_scal1 == 1){
    	   scal = 10;
          }
          if (selected_scal1 == 2){
    	   scal = 2;
          }
          printer.clean();
          
  		printer.setPenColor (Color.gray);
  		printer.setFillColor (Color.gray);
  		
  		printer.hideTurtle();
  		printer.setFontSize(12);
  		
          printer.setPos(-200, 0);
  		for (int n = 1; n < 400; n++)
  	    {
  	      printer.forward(0);
  	      printer.setX(n-200);
  	    }
       
  		printer.setPos(0, -200);
  		for (int n = 1; n < 400; n++)
  	    {
  	      printer.forward(0);
  	      printer.setY(n-200);
  	    }
  		
  		
  		printer.setPos(10, 10);
  		x = -200 ;
  		y = 2;
  		
  		for (int k = 1; k<= 39; k++) {          //39 Striche auf x-Achse
  	          for (int n = 1; n <= 5; n++){
  			  printer.setPos(x, y); 
  			  printer.forward(0);
  			  y = y-1;
  			  
  			  
  			  if (x%50 == 0){
  				y = 4;
  				
  				for (int o = 1; o <= 8; o++){
  				printer.setPos(x, y); 
  			    printer.forward(0);
  				y = y-1;
  				}
  				
  				
  				if (x != 0){               //Null nicht abbilden
  				printer.setPos(x-7, -15);  // Verschiebung für Zahlen
  				printer.label(""+(x)/scal);
  				}
  	          }
  			  
  		      }
  		 x = x+10;
  		 y = 2;  
  		 }
  		
  		
  		x = 2 ;
  		y = -200;
  		for (int k = 1; k<= 39; k++) {              //39 Striche auf y-Achse
  	          for (int n = 1; n <= 5; n++){
  			  printer.setPos(x, y); 
  			  printer.forward(0);
  			  x = x-1;
  			  
  			  if (y%50 == 0){
  					x = 4;
  					
  					for (int o = 1; o <= 8; o++){
  					printer.setPos(x, y); 
  				    printer.forward(0);
  					x = x-1;
  					}
  					
  					
  					if (y != 0){              // Null nicht abbilden
  					printer.setPos(7, y-7);   // Verschiebung für Zahlen
  					printer.label(""+(y/scal));
  					}
  		          }
  			  
  		      }
  		 x = 2;
  		 y = y+10;  
  		 }

  	      
  	     
  		printer.setPos(-6.5001, 180);   // Verschiebung für Zahlen
  		printer.setFontSize(30);
  		printer.label("^");
  	     
  		printer.setPos(188, -8.5);   // Verschiebung für Zahlen
  		printer.setFontSize(25);
  		printer.label(">");
  	      
  		printer.setPos(188, -20);  
  		printer.setFontSize(15);
  		printer.label("x");
  		
  		printer.setPos(-30, 190);   // Verschiebung für Zahlen
  		printer.setFontSize(15);
  		printer.label("f(x)");
  		
  		printer.setPos(-200, 190);   // Verschiebung für Zahlen
  		printer.setFontSize(15);
  		printer.label("Funktionsplotter v2");

for (double x1 = -200; x1< 200; x1=x1+0.001) {
			
		    y = a*(x1*x1*x1*x1*x1)+b*(x1*x1*x1*x1)+c*(x1*x1*x1)+d*(x1*x1)+e*(x1)+f;
		    printer.setPos((x1*scal), (y*scal));
		    printer.forward(0);
		}
		}
  		
		


		
		 
	      
	    
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
     
}
