package Sample;
import java.util.Set;
import java.util.HashSet;


public class Sets {

	public static void main(String[] args) {
		Set<String> flowers= new HashSet<>();
		System.out.println("My empty set:"+flowers);
		flowers.add("Rose");
		flowers.add("Lily");
		flowers.add("Lotus");
		flowers.add("Marigold");
		flowers.add("Tulip");
        System.out.println("My empty set after Adding:"+flowers);
        flowers.remove("Lotus");
        System.out.println("My empty set after Removing:"+flowers);
        
        
        for(String temp: flowers) {
        	System.out.println("My empty set using Loop:"+temp);
        }
	}

}
