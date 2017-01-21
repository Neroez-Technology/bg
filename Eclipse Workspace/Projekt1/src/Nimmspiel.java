import java.util.Scanner;

public class Nimmspiel {
  
	public static void main ( String[] args ){
		
		
		
        int zahl = 21;
       
        
        
        System.out.println("Willkommen bei dem Spiel, welches du nie gewinnen kannst:");
        System.out.println("---------------------------------------------------------");
        System.out.println("Die Person, bei der nur noch 1 Holz übrig ist, verliert!");
        System.out.println("---21---");  
		while (zahl > 1){
			
			
			
		    
		    Scanner sg = new Scanner(System.in);
		    System.out.println("Wievie Streichhölzer nimmst du (1-3):");
		    zahl = zahl - sg.nextInt();
		   
			if (zahl>17 && zahl < 21){
				
				zahl = 17;
				System.out.println("Es liegen jetzt : " + zahl);
			}
	    		
			if (zahl > 13 && zahl < 17){
				zahl = 13;
				System.out.println("Es liegen jetzt : " + zahl);
			}
			       
			if (zahl > 9 && zahl < 13){
				zahl = 9;
				System.out.println("Es liegen jetzt : " + zahl);
			}
			    
			if (zahl > 5 && zahl < 9){
				zahl = 5;
				System.out.println("Es liegen jetzt : " + zahl);
			}
				
			if (zahl > 1 && zahl < 3){
				zahl = 1;
				System.out.println("Es liegen jetzt : " + zahl);
				System.out.println("Du hast verloren ;)");
			}
		} 
    } 
}

