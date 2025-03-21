package myjava;

class Vehicales{   //parent class
	public void vehicles_details() {
		System.out.println("Vehicles_Details");
	}
}

class Car1 extends Vehicales{   //child class
	@Override
	public void vehicles_details() {
		System.out.println("Car1_Name:");
		System.out.println("Car1_Colour:");
	}
}

class Car2 extends Vehicales{   //child class
	@Override
	public void vehicles_details() {
		System.out.println("Car2_Name:");
		System.out.println("Car2_Colour:");
	}
}

public class Dynamicbindingpolymorphism {
	public static void main(String[] args) {
		System.out.println();
		Car1 c1 = new Car1();
		Car2 c2 = new Car2();
		c1.vehicles_details();
		c2.vehicles_details();
		
	}
}