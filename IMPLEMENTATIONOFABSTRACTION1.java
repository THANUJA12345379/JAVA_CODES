package sample;
import java.util.Scanner;

abstract class App{ // Abstract parent class
	

String phone_number;
String otp;
void user_input() {
	
	Scanner s = new Scanner(System.in);
	System.out.println("Enter the phone_number");
	phone_number = s.nextLine();
	System.out.println("Enter otp");
	otp = s.nextLine();
	
}
void user_login() {
	 System.out.println("Welcome to Whatsaap");
	 System.out.println("----------------------");
	 System.out.println("Please Login Here...!");
	 
}

abstract void open(); // Abstract method

}

class  Whatsapp extends App { // child class
void app_open() { // normal method
	
	while(true) {
	
	if(phone_number.equals("9120695304") && otp.equals("12345")){
		
		System.out.println(" Successfully Login , App is open...!");
		break;
		
	} else {
		
	System.out.println("Invalid phone_number&otp :Please Try again");
	user_input();
	}
	
	}
	
}

@Override
void open() {
	// TODO Auto-generated method stub
	
}

}
 
public class IMPLEMENTATIONOFABSTRACTION1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Whatsapp w = new Whatsapp();
		w.user_login();
		w.user_input();
		w.app_open();
		

	}
}



