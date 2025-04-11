package sample;

//Using final with classes, methods, and variables in Java

//Final class cannot be extended
final class FinalClass {
 public void showMessage() {
     System.out.println("This is a final class.");
 }
}

//Class with final method and final variable
class Example {
 // Final variable (constant)
 final double PI = 3.14159;
 

 public final void display() {
     System.out.println("This is a final method.");
 }
 
 public void showPI() {
     System.out.println("Value of PI: " + PI);
 }
}

//class ChildClass extends FinalClass {}

class Main {
 public static void main(String[] args) {
     Example obj = new Example();
     obj.display();
     obj.showPI();
     
    
 }
}




 

