package sample;

public class Exception_Handling {

	public static void main(String[] args) {
		
		
		try {
			int a =10;
			int b = 0;
			int div= a/b;
			System.out.println("Div of:"+div);
			
		}
       catch(ArithmeticException e){
    	   System.out.println("My Error"+e);
       }
    	   
      
		finally {
			System.out.println("Error Solving");
			
		}
		
	}

}
