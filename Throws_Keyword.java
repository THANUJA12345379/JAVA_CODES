package sample;

class NTR extends Exception{
	public NTR(String msg) {
		super(msg);
	}
}
public class Throws_Keyword {

	public static void main(String[] args) {
		try {
			// throw new NTR("I love my India");
			 checkFan("Fan");
		}catch(NTR e){
			System.out.println("My error:"+e);
		}finally {
			System.out.println("My NTR error...");
		}
		
	}
	public static void checkFan(String Fan) throws NTR{
		if(Fan.equals("Fan")) {
			throw new NTR ("I love my India");
		}else {
			System.out.println("I do not love Bangladesh");
		}
		
	}
}
