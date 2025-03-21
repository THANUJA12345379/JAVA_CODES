package sample;
class Engine{//parent one
	void start() {
		System.out.println("Engine start");
	}
	
}
class car{//parent two
	Engine e=new Engine();
	
	void stop() {
		System.out.println("Engine stop");
		e.start();
	}
}
public class Composition {//main class

	public static void main(String[] args) {
		car c=new car();
		c.stop();

	}

}
