package collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class ArrayListExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//how to declare array list
		
		ArrayList<String> arrayList1 = new ArrayList<String>(); //using array list you can store links
		
		arrayList1.add("Raj"); // 0 index
		arrayList1.add("Priya"); // 1 index
		arrayList1.add("Srini"); // 2 index
		arrayList1.add("Mani");// 3 index
		
		System.out.println("The size of arrayList is "  + arrayList1.size());
		
		System.out.println(arrayList1); // print all values
		System.out.println("The element at 0 index is "  + arrayList1.get(0)); // get particular element from get function
	arrayList1.remove(0); // this will remove Raj
	
	System.out.println("The size of arrayList is "  + arrayList1.size());
	System.out.println(arrayList1);
	
	arrayList1.set(1, "supriya"); //to replace the value from priya to  supriya at 1 st position 
	
	// Iterating through array list
	
	for(int index = 0;index<arrayList1.size();index++) {  //first way to print all the names in iterative
		System.out.println(arrayList1.get(index));
	}

	for (String name: arrayList1) {  // second way to iterate all the elements  - WILL print priya, srini and mani as raj is removed
		System.out.println(name);
	}
	
	// iterate thru all elements - 3rd way to iterate all elements
	
	Iterator<String> itr = arrayList1.iterator();
	
	while(itr.hasNext()) {
		
		System.out.println(itr.next());

	}
   
	//Collections.sort(arrayList1()); ascending order
	// 	System.out.println(arrayList1);
	
	Collections.sort(arrayList1, Collections.reverseOrder()); // descending order
	System.out.println(arrayList1);
	
}
	
}