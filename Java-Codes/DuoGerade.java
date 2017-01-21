import javax.swing.*;
class DuoGerade extends JPanel{
  public static void main ( String[] args ){

    double m1 = Double.parseDouble (JOptionPane.showInputDialog(null, "Bitte m1 eingeben: ","Eingabe", JOptionPane.QUESTION_MESSAGE));
    double b1 = Double.parseDouble (JOptionPane.showInputDialog(null, "Bitte b1 eingeben: ","Eingabe", JOptionPane.QUESTION_MESSAGE));
    double m2 = Double.parseDouble (JOptionPane.showInputDialog(null, "Bitte m2 eingeben: ","Eingabe", JOptionPane.QUESTION_MESSAGE));
    double b2 = Double.parseDouble (JOptionPane.showInputDialog(null, "Bitte b2 eingeben: ","Eingabe", JOptionPane.QUESTION_MESSAGE));

    double x = 0;
    double y = 0;
    x = (b1-b2)/(m2-m1);
    y = m1*x+b1;

	
	Object[] options = {"Ja, Funktionen korrekt", "Nein, Falsch"};

                int selected = JOptionPane.showOptionDialog(null,
                                                            "f(x) = " + m1 + "x" + "+"+ b1  + "\nf(x) = " + m2 + "x" + "+"+ b2,
                                                            "Überprüfung",
							    JOptionPane.DEFAULT_OPTION, 
                                                            JOptionPane.INFORMATION_MESSAGE, 
							    null, options, options[0]);
  	System.out.println(selected);
	
      if (selected == 0)
           if (Math.abs(m2-m1) > 0.00000000000001)
	       JOptionPane.showMessageDialog(null, "Schnittpunkt \nS : ("+ x +"|"+ y + ")","Eingabe", JOptionPane.Plain_MESSAGE);
           else
	       JOptionPane.showMessageDialog(null, "Schnittpunkt: Nicht bestimmbar.","Eingabe", JOptionPane.ERROR_MESSAGE); 
      if (selected == 1)

  }
}


