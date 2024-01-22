package com.xworkz.collection.driver;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class Company {

	public static void main(String[] args) {
		
		List<String> companyName=new ArrayList<>();
		companyName.add("Dell");
		companyName.add("hp");
		companyName.add("lenovo");
		companyName.add("apple");
		companyName.add("acer");
		
      System.out.println(companyName);
      
     

		List<List<String>> listoflist=new ArrayList<>();
		listoflist.add(companyName);
	    System.out.println(listoflist);
      
	    
	    List<List<List<String>>> listoflistoflist=new ArrayList<>();
	    listoflistoflist.add(listoflist);
	    System.out.println(listoflist);
	   
	    
	    
	    System.out.println("this is iterator method");
	    Iterator<String> iterator=companyName.iterator();
	    
	    while(iterator.hasNext()) {
	    	System.out.println(iterator.next());
	    }
	    
	    iterator.forEachRemaining((s)->System.out.println(s));
	    
//	  Iterator<List<List<String>>> listoflists=listoflistoflist.iterator();	  
//	  System.out.println(listoflists);
	    
	    
	    //list method
	   System.out.println(companyName.remove("acer"));
	   
	   System.out.println(companyName.contains("Dell"));
	   
	   companyName.forEach((s)->System.out.println(s));
	   
	   // it will give the ascending order
	   System.out.println("before sorting");
	   System.out.println(companyName);
	  Collections.sort(companyName);
	  System.out.println("after sorting");
	  System.out.println(companyName);
	  
	  //it will in which index element is present
	  System.out.println(companyName.lastIndexOf("hp"));
	  System.out.println(companyName);
	}
}
