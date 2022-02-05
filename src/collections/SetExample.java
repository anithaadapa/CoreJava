package collections;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class SetExample {  // does not allow to enter duplicate values. Only contains unique elements. avoid duplicates. Will print null.

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HashSet<String>  set1 = new HashSet<String>(); // no guarantee for order of data
		
		set1.add("name1");
		set1.add("name2");
		set1.add("name3");
		set1.add("name4");
		set1.add("name5");
        set1.add("name6");
        set1.add(null);
        
        System.out.println(set1);
        
        
    // LinkedHashSet
        
    	
        LinkedHashSet<String>  set2 = new LinkedHashSet<String>(); //  maintain the order of data in which it is stored
		
		set2.add("name1");
		set2.add("name2");
		set2.add("name10");
		set2.add("name4");
		set2.add("name5");
        set2.add("name13");
        set2.add(null);
        
        System.out.println(set2);
        
        // TreeSet
        
        
    TreeSet<String>  set3 = new TreeSet<String>(); //  maintain the order in ascending order
		
		set3.add("name1");
		set3.add("name2");
		set3.add("name3");
		set3.add("name4");
		set3.add("name5");
        set3.add("name6");
       //  set3.add(null); cannot add null 
        
        System.out.println(set3);
        
      // how to remove duplicates word from string
        
        String str1 = "Clean World Green World";
        HashSet<String>  set4 = new HashSet<String>();
        set4.add("Clean");
		set4.add("World");
		set4.add("Green");
		set4.add("World");
		  System.out.println(set4);
        

	        // How to remove duplicate word from string
	        String str2 = "Clean World Green World";
	        HashSet<String> hs1 = new HashSet<String>();
	        for (String word : str1.split(" ")) {
	            hs1.add(word);
	        }
	        System.out.println(hs1);
	    }
        
	

}

