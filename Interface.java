//interface in java//interface is also known as instance of class
package sample;
interface Animal{//interface do not required class
	abstract void sound();
		
}
class Horse implements Animal{
	 public void sound() {
		System.out.println("woof woof woof");
		
	}
}
class Tiger implements Animal{
	public void sound() {
		System.out.println("roara roara roara");
	}	 
	
}

public class Interface {

	public static void main(String[] args) {
		Horse a=new Horse();
		Tiger t=new Tiger();
		a.sound();
		t.sound();
		
		
		
		

	}

}
