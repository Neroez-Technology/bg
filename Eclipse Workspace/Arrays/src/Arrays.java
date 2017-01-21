
public class Arrays {

	public static void main(String[] args) {
		
		int [] feld1 = new int[10];
		double z = 0;
		for(int i=0; i < 10; i++){
			z = (Math.random()*100);
			feld1[i] = (int)z;
		    
		}

		System.out.println("------------------------------");
		System.out.println("           AUFGABE A          ");
		System.out.println("------------------------------"); 
		
		for(int i=0; i < 10  ; i++){
			System.out.print(i + ":  ");
			System.out.println(feld1[i]);
		}
		
		feld1[10-1] = feld1.length;
		int a = 10;
		int b = 0;
		b = a + feld1[0];
		feld1[0] = feld1[1] + feld1[2];
		System.out.println("-----  "+ feld1 [0]+ " b :" + b);
		
		
		
		
		System.out.println("------------------------------");
		System.out.println("           AUFGABE B          ");
		System.out.println("------------------------------");
		System.out.println("Pos. 5:    "+feld1[5]);
		System.out.println("Pos. 7:    "+feld1[7]);
		
		
		System.out.println("------------------------------");
		System.out.println("           AUFGABE C          ");
		System.out.println("------------------------------");
		
		for(int i=9; i > -1 ; i--){
			System.out.print(i + ":  ");
			System.out.println(feld1[i]);
		}
		
		
		System.out.println("------------------------------");
		System.out.println("           AUFGABE D          ");
		System.out.println("------------------------------");
		
		
		int [] mehrzahlen = feld1;
		
		System.out.println("------------------------------");
		System.out.println("           AUFGABE E          ");
		System.out.println("------------------------------");
		
		int [] feldE = feld1;
		for(int i=0; i < 10  ; i++){
			feldE[i] = feld1[i]+ mehrzahlen[i];
		}
		
			System.out.println("Ausgabe FeldE");
			
			for(int i=9; i > -1 ; i--){
				System.out.print(i + ":  ");
				System.out.println(feldE[i]);
			}
			
			
			System.out.println("------------------------------");
			System.out.println("           AUFGABE F          ");
			System.out.println("------------------------------");
		
			
		
		
		
		
		
		
		
		
		
	}
}
