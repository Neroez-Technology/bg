import javax.swing.*;

import java.util.Scanner;

class BMI_2_0 extends JPanel{
  public static void main ( String[] args ) {
	  
	  
	  
    double m = 0;
    double i = 0;
    
    
    System.out.println("Willkommen beim BMI Rechner");
   
    System.out.println("-------by Sören------------");
    
    
    
    do{
    	Scanner sm = new Scanner(System.in);
        System.out.print("Gib gebe dein Gewicht ein: ");
        m = sm.nextDouble();
       
        Scanner si = new Scanner(System.in);
        System.out.print("Gib gebe deine Größe ein: ");
        i = si.nextDouble();
        
    }while ( i < 0.5 || i > 3 || m < 2 || m > 300);
    
    
   
    
    
    double iq = Math.pow(i,2);
    double bmi = m / iq;
    double bmiwunsch = 0;
    System.out.println("Dein BMI ist "+ bmi);
    
   
    
    JOptionPane.showMessageDialog(null,"Dein BMI ist "+ bmi);
       
     
    if ( bmi >= 18.5 && bmi <= 25){
      System.out.println("Du hast Normalgewicht");
      JOptionPane.showMessageDialog(null,"Du hast Normalgewicht");
    }
    if ( bmi > 17.0 && bmi < 18.5){
      System.out.println("Du hast leichtes Untergewicht");
      JOptionPane.showMessageDialog(null,"Du hast leichtes Untergewicht");
    }
    if ( bmi > 16.0 && bmi < 17.0){
      System.out.println("Du hast mäßiges Untergewicht");
      JOptionPane.showMessageDialog(null,"Du hast mäßiges Untergewicht");
    }
    if ( bmi < 16.0){
      System.out.println("Du hast starkes Untergewicht");
      JOptionPane.showMessageDialog(null,"Du hast starkes Untergewicht");
    }
    if ( bmi > 25.0 && bmi <= 30.0){
      System.out.println("Du hast Präadipositas");
      JOptionPane.showMessageDialog(null,"Du hast Präadipositas");
    }
    if ( bmi > 30.0 && bmi <= 35.0){
      System.out.println("Du hast Adipositas Grad I");
      JOptionPane.showMessageDialog(null,"Du hast Adipositas Grad I");
    }
    if ( bmi > 35.0 && bmi <= 40.0){
      System.out.println("Du hast Adipositas Grad II");
      JOptionPane.showMessageDialog(null,"Du hast Adipositas Grad II");
    }
    if ( bmi > 40 ){
      System.out.println("Du hast Adipositas Grad III");
      JOptionPane.showMessageDialog(null,"Du hast Adipositas Grad III");
    }
    Object[] options = {"Untergewichtig", "Normalgewicht", "Übergewichtig", "Nichts", "Abbrechen"};

                int selected = JOptionPane.showOptionDialog(null,
                                                            "Welche Stufe willst du erreichen ?",
                                                            "Auswahl:",
							    JOptionPane.DEFAULT_OPTION, 
                                                            JOptionPane.INFORMATION_MESSAGE, 
							    null, options, options[0]);
		System.out.println(selected);
   if (selected == 0)
	JOptionPane.showMessageDialog(null,"Unter");
                  
   if (selected == 1)
	JOptionPane.showMessageDialog(null,"Normal");
   if (selected == 2)
	JOptionPane.showMessageDialog(null,"Über");

   do{
		Scanner sm = new Scanner(System.in);
	    System.out.print("Gib gebe dein Gewicht ein: ");
	    String text_m = sm.next();
	    m = Double.parseDouble(text_m);
	    sm.close();
	    Scanner si = new Scanner(System.in);
	    System.out.print("Gib gebe deine Größe ein: ");
	    String text_i = si.next();
	    i = Double.parseDouble(text_i);
	    si.close();
	}while ( i < 0.1);
   
   
  }
  
}


