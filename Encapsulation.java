package oop;

//Encapsulated class
class Person {

 private String name;
 private int age;

 //  getter method 
 public String getName() {
     return name;
 }

 // setter method 
 public void setName(String name) {
     this.name = name;
 }

 
 public int getAge() {
     return age;
 }

 public void setAge(int age) {
     if (age > 0) {
         this.age = age;
     } else {
         System.out.println("Age must be positive!");
     }
 }
}

//Main class
public class Encapsulation {
 public static void main(String[] args) {
     // Creating an object of the encapsulated class
     Person person = new Person();

     // Setting values using setter methods
     person.setName("Alice");
     person.setAge(25);

     // Getting values using getter methods
     System.out.println("Name: " + person.getName());
     System.out.println("Age: " + person.getAge());

    
     person.setAge(-5);  
 }
}

