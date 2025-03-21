package operator;

public class javaOperators {

	public static void main(String[] args) {
		
		        // Arithmetic Operators
		        int a = 10, b = 5;
		        System.out.println("Addition: " + (a + b));   // 10 + 5 = 15
		        System.out.println("Subtraction: " + (a - b)); // 10 - 5 = 5
		        System.out.println("Multiplication: " + (a * b)); // 10 * 5 = 50
		        System.out.println("Division: " + (a / b));  // 10 / 5 = 2
		        System.out.println("Modulus: " + (a % b));  // 10 % 5 = 0
		        
		     // Relational (Comparison) Operators
		        System.out.println("a > b: " + (a > b));  // true
		        System.out.println("a < b: " + (a < b));  // false
		        System.out.println("a == b: " + (a == b)); // false
		        System.out.println("a != b: " + (a != b)); // true

		        // Logical Operators
		        boolean x = true, y = false;
		        System.out.println("x && y: " + (x && y)); // false
		        System.out.println("x || y: " + (x || y)); // true
		        System.out.println("!x: " + (!x)); // false

		        // Bitwise Operators
		        int p = 5, q = 3;
		        System.out.println("p & q: " + (p & q)); // Bitwise AND
		        System.out.println("p | q: " + (p | q)); // Bitwise OR
		        System.out.println("p ^ q: " + (p ^ q)); // Bitwise XOR

		        // Assignment Operators
		        int num = 10;
		        num += 5; // num = num + 5
		        System.out.println("num after += 5: " + num); // 15

		        // Unary Operators
		        int value = 10;
		        System.out.println("Post-increment: " + (value++)); // 10, then value becomes 11
		        System.out.println("Pre-increment: " + (++value)); // 12
		        System.out.println("Post-decrement: " + (value--)); // 12, then value becomes 11
		        System.out.println("Pre-decrement: " + (--value)); // 10
	}

}
