package Sample;
import java.util.Map;
import java.util.HashMap;


public class Maps {

	public static void main(String[] args) {
		Map<String ,Integer> birds = new HashMap<>();
		System .out.println("My empty Map:"+birds);
		birds.put("Sparrow",1);
		birds.put("Eagle",2);
		birds.put("Falcon",3);
		birds.put("Pheonix",4);
		birds.put("Parrot",5);
		System.out.println("My Empty Map After Adding:"+birds);
		birds.remove("Eagle");
		System.out.println("My Empty Map After Removing:"+birds);
		
		
		for(Map.Entry<String,Integer> entry:birds.entrySet()) {
			System.out.println("Keys:=>"+entry.getKey()+", "+"Values:=>" +entry.getValue());
		}

	}
     
	
}
