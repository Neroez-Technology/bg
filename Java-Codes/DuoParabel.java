import javax.swing.*;
class DuoParabel extends JPanel{
  public static void main ( String[] args ){
    String eingabed ;
    String eingabee ;
    double d = 0;
    double e = 0;
    String eingabex2 ;
    String eingabey2 ;
    double x2 = 0;
    double y2 = 0;
    double a = 0;
    double c = 0;
    double ab = 0;
    double dd = d * -1;
    double abab = 0;
    
   
    eingabed = JOptionPane.showInputDialog("Bitte x von Scheitelpunkt eingeben: ");
    d = Double.parseDouble(eingabed);
    eingabee = JOptionPane.showInputDialog("Bitte y von Scheitelpunkt eingeben: ");
    e = Double.parseDouble(eingabee);
    
   
	
	
	eingabex2 = JOptionPane.showInputDialog("Bitte x2 eingeben: ");
    x2 = Double.parseDouble(eingabex2);
    eingabey2 = JOptionPane.showInputDialog("Bitte y2 eingeben: ");
    y2 = Double.parseDouble(eingabey2);
	
	c = (x2 -d)*(x2-d);
        a = (y2-e) / c ;
	ab = 2*a*d+a*d*d;
	abab = ab * -1;
	
	Object[] options = {"Ja, Punkte korrekt", "Nein, Falsch"};

                int selected = JOptionPane.showOptionDialog(null,
                                                            "S : (" + d + "|" + e + ")" + "\np2 : ("+ x2 + "|" +y2 + ")",
                                                            "Überprüfung",
							    JOptionPane.DEFAULT_OPTION, 
                                                            JOptionPane.INFORMATION_MESSAGE, 
							    null, options, options[0]);
		System.out.println(selected);
   if (selected == 0)
         if (d >= 0)
	     JOptionPane.showMessageDialog(null,"a = " + a + "\nf(x) = " + a +" (x -"+ d +")²+ " + e);
         else
             
             JOptionPane.showMessageDialog(null,"a = " + a + "\nf(x) = " + a +" (x +"+ dd +")²+ " + e);

         if (ab >= 0)
	     JOptionPane.showMessageDialog(null,"\nf(x) = " + a + "x²" + "+"+ ab +"x"+"+"+ e);
         else
             
             JOptionPane.showMessageDialog(null,"\nf(x) = " + a + "x²" + "+"+ abab +"x"+"+"+ e);





















        
  // if (selected == 1)
  //  //Neuer Versuch
//	eingabex1 = JOptionPane.showInputDialog("Bitte x1 eingeben: ");
  //  x1 = Double.parseDouble(eingabex1);
 //   eingabey1 = JOptionPane.showInputDialog("Bitte y1 eingeben: ");
  //  y1 = Double.parseDouble(eingabey1);
    
   
	
	
//	eingabex2 = JOptionPane.showInputDialog("Bitte x2 eingeben: ");
  //  x2 = Double.parseDouble(eingabex2);
  //  eingabey2 = JOptionPane.showInputDialog("Bitte y2 eingeben: ");
  //  y2 = Double.parseDouble(eingabey2);
	
//	m = (y2 - y1) / (x2 - x1 );
//	b = y1 - m * x1;
//	JOptionPane.showMessageDialog(null,"p1 : (" + x1 + "|" +y1 + ")" + "\np2 : ("+ x2 + "|" +y2 + ")");
   
    }



  }
  
