package co;

public class constructor {
	// Defining a class with multiple constructors
	class Student {
	    String name;
	    int age;
	    String course;

	    Student() {
	        System.out.println("Default Constructor Called");
	        name = "Unknown";
	        age = 0;
	        course = "Not Assigned";
	    }
	   
	    Student(String name, int age, String course) {
	        System.out.println("Parameterized Constructor Called");
	        this.name = name;
	        this.age = age;
	        this.course = course;
	    }

	    Student(Student s) {
	        System.out.println("Copy Constructor Called");
	        this.name = s.name;
	        this.age = s.age;
	        this.course = s.course;
	    }

	   
	    void display() {
	        System.out.println("Name: " + name);
	        System.out.println("Age: " + age);
	        System.out.println("Course: " + course);
	        System.out.println();
	    }
	}


	    public static void main(String[] args) {
	    	
	        Student student1 = new Student();
	        student1.display();
	        Student student2 = new Student("Alice", 20, "Computer Science");
	        student2.display();
	        Student student3 = new Student(student2);
	        student3.display();
	    }
	}


}
