package sample;

//ContactInfo class (Composition)
class ContactInfo {
 private String location;
 private String phoneNumber;

 public ContactInfo(String location, String phoneNumber) {
     this.location = location;
     this.phoneNumber = phoneNumber;
 }

 public String getLocation() {
     return location;
 }

 public String getPhoneNumber() {
     return phoneNumber;
 }

// @Override
// public String toString() {
//     return "Location: " + location + ", Phone: " + phoneNumber;
// }
//}
}

//Employee class (Uses Composition)
class Employee1 {
 private int employeeId;
 private String name;
 private double salary;
 private ContactInfo contactInfo; // Composition

 public Employee1(int employeeId, String name, double salary, ContactInfo contactInfo) {
     this.employeeId = employeeId;
     this.name = name;
     this.salary = salary;
     this.contactInfo = contactInfo;
 }

 public void displayEmployeeDetails() {
     System.out.println("Employee ID: " + employeeId);
     System.out.println("Name: " + name);
     System.out.println("Salary: $" + salary);
     System.out.println("Contact Details: " + contactInfo);
 }

 
}

public class Composition1 {

	public static void main(String[] args) {
		   ContactInfo contact1 = new ContactInfo("India", "9129876577");
		     Employee1 emp1 = new Employee1(101, "Shivangi Pathak", 75000.0, contact1);

		     emp1.displayEmployeeDetails();

	}

}
