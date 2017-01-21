import javax.swing.*;
class Schnittpunkt extends JPanel{
  public static void main ( String[] args ){
    String eingabex1 ;
    String eingabey1 ;
    double x1 = 0;
    double y1 = 0;
	String eingabex2 ;
    String eingabey2 ;
    double x2 = 0;
    double y2 = 0;
	double m = 0;
	double b = 0;
    eingabex1 = JOptionPane.showInputDialog("Bitte x1 eingeben: ");
    x1 = Double.parseDouble(eingabex1);
    eingabey1 = JOptionPane.showInputDialog("Bitte y1 eingeben: ");
    y1 = Double.parseDouble(eingabey1);
    
   
	
	
	eingabex2 = JOptionPane.showInputDialog("Bitte x2 eingeben: ");
    x2 = Double.parseDouble(eingabex2);
    eingabey2 = JOptionPane.showInputDialog("Bitte y2 eingeben: ");
    y2 = Double.parseDouble(eingabey2);
	
	m = (y2 - y1) / (x2 - x1 );
	b = y1 - m * x1;
	
	//System.out.println("p1 ("+ x1 + "|" +y1 + ")");
    //System.out.println("p2 ("+ x2 + "|" +y2 + ")");
    //JOptionPane.showMessageDialog(null,"p1 : (" + x1 + "|" +y1 + ")" + "\np2 : ("+ x2 + "|" +y2 + ")");
	
	
	
	
	Object[] options = {"Ja, Punkte korrekt", "Nein, Falsch"};

                int selected = JOptionPane.showOptionDialog(null,
                                                            "p1 : (" + x1 + "|" +y1 + ")" + "\np2 : ("+ x2 + "|" +y2 + ")",
                                                            "Überprüfung",
							    JOptionPane.DEFAULT_OPTION, 
                                                            JOptionPane.INFORMATION_MESSAGE, 
							    null, options, options[0]);
		System.out.println(selected);
   if (selected == 0)
	JOptionPane.showMessageDialog(null,"m = " + m + "\nb = " + b + "\nf(x) = " + m +" * x " + " + " + b);
        
   if (selected == 1)
    //Neuer Versuch
	eingabex1 = JOptionPane.showInputDialog("Bitte x1 eingeben: ");
    x1 = Double.parseDouble(eingabex1);
    eingabey1 = JOptionPane.showInputDialog("Bitte y1 eingeben: ");
    y1 = Double.parseDouble(eingabey1);
    
   
	
	
	eingabex2 = JOptionPane.showInputDialog("Bitte x2 eingeben: ");
    x2 = Double.parseDouble(eingabex2);
    eingabey2 = JOptionPane.showInputDialog("Bitte y2 eingeben: ");
    y2 = Double.parseDouble(eingabey2);
	
	m = (y2 - y1) / (x2 - x1 );
	b = y1 - m * x1;
	JOptionPane.showMessageDialog(null,"p1 : (" + x1 + "|" +y1 + ")" + "\np2 : ("+ x2 + "|" +y2 + ")");
   
    }



  }
  
