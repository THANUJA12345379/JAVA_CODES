package Sample;
import java.util.TreeMap;
import java.util.HashMap;
import java.util.Map;

public class Tree_Map {

	public static void main(String[] args) {
		TreeMap<String ,Integer> Fruits = new TreeMap<>();
		System .out.println("My empty Map:"+Fruits);
		Fruits.put("Apple",1);
		Fruits.put("Banana",2);
		Fruits.put("Orange",3);
		Fruits.put("Papaya",4);
		Fruits.put("Grapes",5);
		System.out.println("My Empty TreeMap After Adding:"+Fruits);
		Fruits.remove("Papaya");
		System.out.println("My Empty TreeMap After Removing:"+Fruits);
		
		
		for(Map.Entry<String,Integer> entry:Fruits.entrySet()) {
			System.out.println("Keys:=>"+entry.getKey()+", "+"Values:=>" +entry.getValue());
		}

	}
     
	}


