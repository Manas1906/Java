class Display {
 
   //Private nested or inner class 
   private class InnerDisplay {
      public void display() {
         System.out.println("Private inner class method called");
      }
   }
 
   void display() {
      System.out.println("Outer class (Display) method called");
      // Access the private inner class
      InnerDisplay innerDisplay = new InnerDisplay();
      innerDisplay.display();
   }
}
 
public class Main {
 
   public static void main(String args[]) {
      // Create object of the outer class (Display)
      Display object = new Display();
 
      // method invocation
      object.display();
   }
}