package collections;

import java.util.LinkedList;

public class LinkListExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LinkedList<String> list1 = new LinkedList<String>(); // prefer this. fast retrieval of data. Internal mechanism to create data list. Add first and Add last are the only difference.
        
		list1.add("John");
		list1.add("Donald");
		list1.add("Singh");
		list1.add("John");
		list1.add("Donald");
		list1.addFirst("Rick");
		
		System.out.println(list1);
		
		for(int index = 0;index<list1.size();index++) {  //first way to print all the names in iterative
			System.out.println(list1.get(index));
			
	}
		list1.add(2,"Bharat");  // added data in between index
        System.out.println(list1);
}

}