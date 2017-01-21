import java.util.Scanner;

public class wochentage {

	public static void main(String[] args) {
		
		int eingabe = 0;
		String ausgabe = "";
		
		Scanner eingabe_s = new Scanner(System.in);
	    System.out.print("Gebe bitte die Tageszahl ein : ");
	    eingabe = eingabe_s.nextInt();
	    eingabe_s.close();
		
		
		
		switch (eingabe) {
        case 1:  ausgabe = "Montag";
                 break;
        case 2:  ausgabe = "Dienstag";
                 break;
        case 3:  ausgabe = "Mittwoch";
                 break;
        case 4:  ausgabe = "Donnerstag";
                 break;
        case 5:  ausgabe = "Freitag";
                 break;
        case 6:  ausgabe = "Samstag";
                 break;
        case 7:  ausgabe = "Sonntag";
                 break;
     
        default: ausgabe = "Kein Wochentag!";
                 break;
    	}
		
		System.out.println(ausgabe);

	}

}
