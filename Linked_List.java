package sample;
import java.util.LinkedList;
import java.util.List;


public class Linked_List {

	public static void main(String[] args) {
		List<String> Gods = new LinkedList<>();	
		System.out.println("My Linked List:"+Gods);
		Gods.add("Ram ji");
		Gods.add("Shyam ji");
		Gods.add("Balram ji");
		Gods.add("Hanuman ji");
		Gods.add("Mahadev ji");
		System.out.println("My Linked List After Adding:"+Gods);
		
		Gods.remove(3);
		System.out.println("My Linked List After Removing:"+Gods);
		String temp = Gods.get(0);
		System.out.println("My Linked List Ram ji:"+temp);
		
		for(String God:Gods) {
			
			System.out.println("My Linked List using Iterator:"+God);
		}
		((LinkedList<String>)Gods).addFirst("Shivangi");
		System.out.println("My Liked List Adding First:"+Gods);
		((LinkedList<String>)Gods).addLast("Pathak");
		System.out.println("My Liked List Adding Last:"+Gods);
		
		
		
	}

}
