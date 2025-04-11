package sample;
import java.util.Scanner;
abstract class ATM{
	double balance;   // Initial balance
	
	ATM(double balance){ // Parent constructor
		this.balance = balance;
		
	}
	
	abstract void withDraw( double amount);
	abstract void deposit( double amount);
	abstract void checkBalance();
}
class PNB extends ATM {
	PNB(double balance){
		super(balance);
		
	}
	
	// withdraw Method
	// override
	 void withDraw( double amount){
		if(amount>0 && amount <= balance){
			balance -= amount;
			System.out.println("withDraw success:Avl:"+balance);	
			
		} 
		else {
			System.out.println("Not avl balance");
			
		}
		
		 
	 }
	
	// deposite Method
		// override
		 void deposite( double amount){
			if(amount>0 && amount <= balance){
				balance -= amount;
				System.out.println("deposite success:Avl:"+balance);	
				
			} 
			else {
				System.out.println("Deposite Failed");
}

		 }
		 
		 // CheckBal Method
		 void checkbal() {
			 System.out.println("Current Balance");
			 }
		 }

public class Main_ATM {

	public static void main(String[] args) {
		PNB obj = new PNB(50000);
		Scanner s = new Scanner(System.in);
		
		while(true) {
			System.out.println("ATM-MENU*******");
			System.out.println("**********");
			System.out.println("1.WithDraw Money");
			System.out.println("2.Deposite Money");
			System.out.println("3.Checking Money");
			System.out.println("4.Exit");
			System.out.println("Enter ur choice");
			
			
			int choice = s.nextInt();
			
			switch(choice) {
			case 1 :
				System.out.println("Enter withdraw money:");
				double with_amt = s.nextDouble();
				obj.withDraw(with_amt);
				break;
            case 2 :
				System.out.println("Enter deposite money:");
				double dep_amt = s.nextDouble();
				obj.withDraw(dep_amt);
				break;
				
            case 3 :
				
				System.out.println("Avl Balance:");
				obj.checkBalance();
				break;
            case 4 :
            	System.out.println("Thankuuuuuu");
            	System.exit(0);
            default:
            	System.out.println("Enter correct option");
				
			}
			
			
		}
	}

}
