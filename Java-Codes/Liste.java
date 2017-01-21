
import java.util.Scanner;



public class Liste{
   public static void main(String[] args) {
      double aS = Double.parseDouble(args[0]);
      double SL = Double.parseDouble(args[1]);



      System.out.println("Arbeitsstunden:      " + aS ) ;
      System.out.println("Stundenlohn in EUR:  " + SL) ;
      System.out.println("Damit habe ich letzte Woche " + (aS + SL) + " EUR verdient.") ;
   }
}