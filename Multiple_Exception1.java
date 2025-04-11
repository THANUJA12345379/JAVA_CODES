package sample;

public class Multiple_Exception1 {

	public static void main(String[] args) {
	try {
		//ArrayIndexOutOfBoundsException
		
		String[]fruits= {"APPLE","BANANA","MANGO","ORANGE","PAPAYA"};
		System.out.println("My Fruit:"+fruits[5]);
	}catch(ArrayIndexOutOfBoundsException e) {
		   System.out.println("My First:"+e);
	} finally {
				System.out.println("My First Exception is Solving");
			}
		

	}

	}
