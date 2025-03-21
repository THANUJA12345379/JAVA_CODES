package co;

	// Parent class
	class Person {
	    public String name = "Alice"; 
	    private int age = 25;          
	    protected String address = "123 Main Street";  
	    String phone = "9120695304";  

	    // Public method
	    public void displayPublic() {
	        System.out.println("Public Method: Name is " + name);
	    }

	    // Private method 
	    private void displayPrivate() {
	        System.out.println("Private Method: Age is " + age);
	    }

	    // Protected method
	    protected void displayProtected() {
	        System.out.println("Protected Method: Address is " + address);
	    }

	    // Default method (package-private)
	    void displayDefault() {
	        System.out.println("Default Method: Phone is " + phone);
	    }

	    public void accessPrivateMethod() {
	        displayPrivate();  
	    }
	}

	// Child class 
	class Student extends Person {
	    void displayStudentDetails() {
	        System.out.println("\n--- Accessing Parent Class Members in Subclass ---");
	        System.out.println("Public Variable: " + name);  
	        // System.out.println("Private Variable: " + age);  
	        System.out.println("Protected Variable: " + address);  
	        System.out.println("Default Variable: " + phone);  

	        displayPublic();  
	        displayProtected();  
	        displayDefault();   
	    }
	}

	// Main class
	public class Modifiers {
	    public static void main(String[] args) {
	        Person person = new Person();
	        System.out.println("--- Accessing Members from Main Method ---");
	        System.out.println("Public Variable: " + person.name);
	        System.out.println("Protected Variable: " + person.address);
	        System.out.println("Default Variable: " + person.phone);

	        person.displayPublic();  
	        person.displayProtected(); 
	        person.displayDefault();  
	        person.accessPrivateMethod();  

	 
	        Student student = new Student();
	        student.displayStudentDetails();
	    }
	
	}

	

