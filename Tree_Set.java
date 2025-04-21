package Sample;
import java.util.TreeSet;
import java.util.HashSet;
import java.util.Set;



public class Tree_Set {

	public static void main(String[] args) {
		TreeSet<String> devils= new TreeSet<>();
		System.out.println("My empty Treeset:"+devils);
		devils.add("Ravan");
		devils.add("Shumbh");
		devils.add("Nishumbh");
		devils.add("Putana");
		devils.add("Kagashur");
        System.out.println("My empty Treeset after Adding:"+devils);
        devils.remove("Putana");
        System.out.println("My empty Treeset after Removing:"+devils);
        
        
        for(String temp:devils) {
        	System.out.println("My empty treeset is using Loop:"+temp);
        }
        

	}

}
