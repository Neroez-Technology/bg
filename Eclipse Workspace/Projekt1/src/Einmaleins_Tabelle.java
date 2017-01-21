
public class Einmaleins_Tabelle {
  
	public static void main ( String[] args ){
	
	int x = 1;
	int y = 1;
	int zahl = 0;
	int max = 10;	
	
	
	while (max <= 100){
		while (zahl < max){
			zahl = x * y;
			if (zahl < 10)
				System.out.print("\t  "+zahl);
			if (zahl < 100 && zahl >= 10)
				System.out.print("\t "+zahl);
			if (zahl == 100 )
				System.out.print("\t"+zahl);
			
				
			
		    y++;
		}
		max = max + 10;
		y = 1;
		x++;
		System.out.print("\n");		
	}
	System.out.println("    * ");
	System.out.println("   *** ");
	System.out.println("  *****");
	System.out.println(" *******");
	System.out.println("**********");
	System.out.println("    **    ");
	System.out.println("    **    ");
	System.out.println("    **    ");
	
	}
}
