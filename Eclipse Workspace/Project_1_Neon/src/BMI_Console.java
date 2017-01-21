import javax.swing.*;

import java.util.Scanner;

class BMI_Console extends JPanel{
  public static void main ( String[] args ) throws InterruptedException{
	  
	  
	  
    double m = 0;
    double g = 0;
    
    
    System.out.println("Willkommen beim BMI Rechner");
    Thread.sleep(800);
    System.out.println("-------by Sören------------");
    Thread.sleep(1000);
    
    int fail = 0;
    do{
    	if (fail > 0){
    		System.out.println("Eingabe ungültig!");
    		System.out.println("Bitte erneut eingeben:");
    	}
    	Scanner sm = new Scanner(System.in);
        System.out.print("Gib gebe dein Gewicht ein (kg): ");
        m = sm.nextDouble();
       
        Scanner sg = new Scanner(System.in);
        System.out.print("Gib gebe deine Größe ein (m): ");
        g = sg.nextDouble();
        fail++; 
    }while ( g < 0.5 || g > 3 || m < 2 || m > 300);
    
    
   
    double bmi = m / Math.pow(g,2);
    
    System.out.println("Dein BMI ist "+ bmi);
    
       
     
    if ( bmi >= 18.5 && bmi <= 25){
      System.out.println("Du hast Normalgewicht");
      
    }
    if ( bmi > 17.0 && bmi < 18.5){
      System.out.println("Du hast leichtes Untergewicht");
      
    }
    if ( bmi > 16.0 && bmi < 17.0){
      System.out.println("Du hast mäßiges Untergewicht");
      
    }
    if ( bmi < 16.0){
      System.out.println("Du hast starkes Untergewicht");
      
    }
    if ( bmi > 25.0 && bmi <= 30.0){
      System.out.println("Du hast Präadipositas");
      
    }
    if ( bmi > 30.0 && bmi <= 35.0){
      System.out.println("Du hast Adipositas Grad I");
      
    }
    if ( bmi > 35.0 && bmi <= 40.0){
      System.out.println("Du hast Adipositas Grad II");
     
    }
    if ( bmi > 40 ){
      System.out.println("Du hast Adipositas Grad III");
      
    }
    
    String zufrieden = "-";
    
    Scanner zufrieden_s = new Scanner(System.in);
    System.out.print("Bist du zufrieden ? (j/n) :");
    zufrieden = zufrieden_s.next();
    zufrieden_s.close();
    
    System.out.println("TEST__Inhalt von String ´zufrieden´ :"+zufrieden);
    
    
    if (zufrieden.equals("j")){
    	System.out.println("Schön!");
    }
    if (zufrieden.equals("n")){
    	System.out.println("ok! Das läst sich ändern ;)");
    	int grad_wunsch = 0;
    	Scanner wahl = new Scanner(System.in);
    	System.out.println("Weche Stufe möchtest du errreichen ?");
    	System.out.println("--------------Auswahl---------------");
    	System.out.println("1 = leichtes Untergewicht");
    	System.out.println("2 = mäßiges Untergewicht");
    	System.out.println("3 = starkes Untergewicht");
    	System.out.println("4 = Normalgewicht");
    	System.out.println("5 = Präadipositas");
    	System.out.println("6 = Adipositas Grad I");
    	System.out.println("7 = Adipositas Grad II");
    	System.out.println("8 = Adipositas Grad III");
    	System.out.println("-------------------------------------");
    	System.out.println("Bitte gebe die Nummer an (1-8) :");
    	grad_wunsch = wahl.nextInt();
    	wahl.close();
    	String wahl_user;
    
    	switch (grad_wunsch) {
        case 1:  wahl_user = "leichtes Untergewicht";
                 break;
        case 2:  wahl_user = "mäßiges Untergewicht";
                 break;
        case 3:  wahl_user = "starkes Untergewicht";
                 break;
        case 4:  wahl_user = "Normalgewicht";
                 break;
        case 5:  wahl_user = "Präadipositas";
                 break;
        case 6:  wahl_user = "Adipositas Grad I";
                 break;
        case 7:  wahl_user = "Adipositas Grad II";
                 break;
        case 8:  wahl_user = "Adipositas Grad III";
                 break;
        default: wahl_user = "Ungültiger Grad !";
                 break;
    	}
    
    	double bmi_neu = 0;
    	double m_veränderung = 0;
    	String faktor = "abnehmen";
    	m_veränderung = m;
    	System.out.println("Um " + wahl_user + " zu erreichen, musst du " + m_veränderung + " " +faktor);
    }
  }  
}
/* do{
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
*/

