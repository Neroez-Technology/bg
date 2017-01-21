public class MyName{
   public static void main(String[] args) {
      System.out.println("Hallo hier spricht:") ;
      try {
       Thread.sleep(1000);
     } catch(InterruptedException ex) {
       Thread.currentThread().interrupt();
     }
      System.out.println("Sören") ;
   }
}