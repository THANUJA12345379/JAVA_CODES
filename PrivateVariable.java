package sample;

class Employees {
    // Private variables
    private int id;
    private String name;
    private double salary;
    
    // Constructor
    public Employees(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }
    
    // Getter methods to access private variables
    public int getId() {
        return id;
    }
    
    public String getName() {
        return name;
    }
    
    public double getSalary() {
        return salary;
    }
    
    // Setter methods to modify private variables
    
    public void setSalary(double salary) {
        if (salary > 0) {
            this.salary = salary;
        } else {
            System.out.println("Invalid salary amount!");
        }
    }
}

// Main class
public class PrivateVariable {
    public static void main(String[] args) {
       
        Employees emp = new Employees(101, "Shivangi Pathak", 60000);
        
        // Accessing private variables using getter methods 
        
        System.out.println("Employees ID: " + emp.getId());
        System.out.println("Employees Name: " + emp.getName());
        System.out.println("Employees Salary: " + emp.getSalary());
        
        // Modifying salary using setter method
        
        emp.setSalary(60000);
        System.out.println("Updated Salary: " + emp.getSalary());
    }
}

