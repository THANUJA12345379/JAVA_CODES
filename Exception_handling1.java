package sample;

public class Exception_handling1 {

	public static void main(String[] args) {
		int []numbers = {1,2,3,4,5};
		System.out.println("My array:"+numbers[0]);
		try {
			
			int []numbers1= {1,2,3,4,5};
			System.out.println("My array:"+numbers[0]);
		} catch(ArrayaIndexOutOfBoundsException e) {
			System.out.println("My  Error:"+e);
			
		}
		
		
			
		

	}

}
