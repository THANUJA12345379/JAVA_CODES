package mypackage;
class Addition{
	public void add() {//default method
		int a=20;
		int b=30;
		System.out.println("sum of a&b is:"+(a+b));
		
	}
	public int add(int a, int b) {//parameter method
		return a+b;
	}
	
	public int add(int a, int b,int c) {
		return a+b+c;
	}
}

public class MethodOverloading {

	public static void main(String[] args) {
		Addition a=new Addition() ;
			a.add();
			System .out.println("sum of a&b:"+a.add(200,300));
			System .out.println("sum of a&b&c:"+a.add(200,300,500));
		
		

	}
	

}
