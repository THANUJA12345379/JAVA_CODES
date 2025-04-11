package sample;

class ShivangiException extends Exception{
	public ShivangiException(String msg) {  // constructor
		super(msg);
	}
	
}
public class Custom_Exception {

	public static void main(String[] args) {
		try {
			
			throw new ShivangiException("My constructor");
		}catch(ShivangiException e){
			System.out.println("My Custom Error:"+e);
			
		}finally {
			System.out.println("My Custom Error created successfully");
		}
		
	

	}

}
