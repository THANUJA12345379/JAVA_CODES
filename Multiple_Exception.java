package sample;

public class Multiple_Exception {

	public static void main(String[] args) {
		
		try {
			// ArithmeticException
			
			int div = 10/0;
			
			//ArrayIndexOutOfBoundsException
			
			int[]numbers= {1,2,3,4,5};
			System.out.println("My number:"+numbers[10]);
			
			//StringIndexOutOfBoundsException
			
			String name="Shivangi";
			System.out.println("My name:"+name.charAt(15));
			
			//NullPointerException
			
			String a = null;
			System.out.println("My String:"+a.length());
			
		} catch(ArithmeticException e) {
			System.out.println("My First:"+e);
			
		}catch(ArrayIndexOutOfBoundsException e) {
		   System.out.println("My Second:"+e);
		}catch(StringIndexOutOfBoundsException e) {
			System.out.println("My Third:"+e);
		}catch(NullPointerException e) {
			System.out.println("My Fourth:"+e);
			
		}
		
		
		finally {
			System.out.println("My four Exception is Solving");
		}
		

	}

}
