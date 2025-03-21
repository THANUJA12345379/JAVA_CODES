package co;
//Class with static variable
class Employee {
 
 static String companyName = "TechCorp";

 
 String name;
 int id;

 // Constructor
 Employee(String name, int id) {
     this.name = name;
     this.id = id;
 }


 void displayEmployee() {
     System.out.println("Employee ID: " + id);
     System.out.println("Employee Name: " + name);
     System.out.println("Company Name: " + companyName);
     System.out.println();
 }
}

//Main class
public class staticvariable {
 public static void main(String[] args) {
    
     Employee emp1 = new Employee("Alice", 101);
     Employee emp2 = new Employee("Bob", 102);

     emp1.displayEmployee();
     emp2.displayEmployee();
    
     Employee.companyName = "GlobalTech";
     System.out.println("After Changing Company Name:");
     emp1.displayEmployee();
     emp2.displayEmployee();
 }
}




