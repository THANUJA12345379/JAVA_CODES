package statement;
import java.util.Scanner;
		public class controlFlowStatement {
		    public static void main(String[] args) {
		        Scanner scanner = new Scanner(System.in);

		        // 1. If-Else Statement
		        System.out.print("Enter a number: ");
		        int num = scanner.nextInt();
		        if (num > 0) {
		            System.out.println(num + " is positive.");
		        } else if (num < 0) {
		            System.out.println(num + " is negative.");
		        } else {
		            System.out.println("The number is zero.");
		        }

		        // 2. Switch Case Statement
		        System.out.print("Enter a day number (1-7): ");
		        int day = scanner.nextInt();
		        switch (day) {
		            case 1: System.out.println("Sunday"); break;
		            case 2: System.out.println("Monday"); break;
		            case 3: System.out.println("Tuesday"); break;
		            case 4: System.out.println("Wednesday"); break;
		            case 5: System.out.println("Thursday"); break;
		            case 6: System.out.println("Friday"); break;
		            case 7: System.out.println("Saturday"); break;
		            default: System.out.println("Invalid day number!");
		        }

		        // 3. For Loop
		        System.out.println("Numbers from 1 to 5 using for loop:");
		        for (int i = 1; i <= 5; i++) {
		            System.out.print(i + " ");
		        }
		        System.out.println();

		        // 4. While Loop
		        System.out.println("Numbers from 5 to 1 using while loop:");
		        int count = 5;
		        while (count >= 1) {
		            System.out.print(count + " ");
		            count--;
		        }
		        System.out.println();

		        // 5. Do-While Loop
		        System.out.println("Example of do-while loop:");
		        int x = 1;
		        do {
		            System.out.print(x + " ");
		            x++;
		        } while (x <= 5);
		        System.out.println();

		        // 6. Break Statement
		        System.out.println("Break statement example:");
		        for (int i = 1; i <= 5; i++) {
		            if (i == 3) {
		                System.out.println("Loop broken at i = " + i);
		                break; // Stops loop at i = 3
		            }
		            System.out.println("i = " + i);
		        }

		        // 7. Continue Statement
		        System.out.println("Continue statement example:");
		        for (int i = 1; i <= 5; i++) {
		            if (i == 3) {
		                System.out.println("Skipping i = " + i);
		                continue; // Skips the rest of the code for i = 3
		            }
		            System.out.println("i = " + i);
		        }

		        scanner.close();
		    }
		}
