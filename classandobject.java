package co;

	// Defining a class
	class Car {
	    // Instance variables (state of the object)
	    String brand;
	    String model;
	    int year;

	    // Constructor to initialize object
	    Car(String brand, String model, int year) {
	        this.brand = brand;
	        this.model = model;
	        this.year = year;
	    }

	    
	    void displayCarInfo() {
	        System.out.println("Car Brand: " + brand);
	        System.out.println("Car Model: " + model);
	        System.out.println("Car Year: " + year);
	    }
	}

	// Main class
	public class classandobject {
	    public static void main(String[] args) {
	        // Creating objects of the Car class
	        Car car1 = new Car("Toyota", "Camry", 2022);
	        Car car2 = new Car("Honda", "Civic", 2023);

	      
	        System.out.println("Car 1 Details:");
	        car1.displayCarInfo();

	        System.out.println("\nCar 2 Details:");
	        car2.displayCarInfo();
	    }
	}



