package sample;

import java.util.List;
import java.util.ArrayList;


public class Collections {

	public static void main(String[] args) {
		
	int[]number = {100,200,800,900,500};
	System.out.println("My numbers Normal Array:"+number[3]);
	
   List<Integer> numbers = new ArrayList<>();
   System.out.println("My numbers list:"+numbers);
    numbers.add(100);
    numbers.add(200);
    numbers.add(800);
    numbers.add(900);
    numbers.add(500);
    
    int temp=numbers.get(0);
    System.out.println("My numbers list Temp:"+temp);
    
    System.out.println("My numbers list After:"+numbers);
    numbers.remove(4);
    System.out.println("My number list After removing:"+numbers);
    
    for(int nums: numbers) {
    	System.out.println("My numbers List using Iterators"+nums);
    	
    }
     List<String> names = new ArrayList<>();
     System.out.println("My names string:"+names);
     names.add("Rose");
     names.add("Lily");
     names.add("Lotus");
     names.add("Tulip");
     names.add("Sunflower");
     names.add("Marigold");
     names.add("Mangolia");
     names.add("Daisy");
     names.add("Water Lily");
     names.add("Dahalia");
     System.out.println("My names string After:"+names);
     names.remove(5);
     System.out.println("My names string after removing:"+names);
    
 }

}
