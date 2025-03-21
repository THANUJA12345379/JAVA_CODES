package co;
	class MathOperations {
	    // Method 1: Adding two integers
	    int add(int a, int b) {
	        return a + b;
	    }

	    // Method 2: Adding three integers (Overloaded method)
	    int add(int a, int b, int c) {
	        return a + b + c;
	    } 
	    double add(double a, double b) {
	        return a + b;
	    }

	   
	    String add(String a, String b) {
	        return a + " " + b;
	    }
	}

	// Main class
	public class methodoverloading {
	    public static void main(String[] args) {
	        MathOperations math = new MathOperations();

	        System.out.println("Sum of two integers: " + math.add(5, 10));
	        System.out.println("Sum of three integers: " + math.add(5, 10, 15));
	        System.out.println("Sum of two double numbers: " + math.add(5.5, 2.5));
	        System.out.println("Concatenated string: " + math.add("Hello", "World"));
	    }
	}




