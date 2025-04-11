package sample;

//Superclass

class Animal11 { 
 String name;
 
 // Constructor 
 
 public Animal11(String name) {
     this.name = name;
 }
 
 // Method
 public void makeSound() {
     System.out.println("Some generic animal sound");
 }
}


class Dog extends Animal11 {
 
 // Constructor
 public Dog(String name) {
     super(name);
 }
 
 // Overriding the method
 @Override
 public void makeSound() {
     System.out.println(name + " barks: Woof! Woof!");
 


 }
}

public class SuperClass {

	public static void main(String[] args) {
		 Animal11 myAnimal11 = new Animal11("Generic Animal11");
	     myAnimal11.makeSound();
	     
	     Dog myDog = new Dog("Buddy");
	     myDog.makeSound();
	 }
	

	}


