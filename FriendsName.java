package com.xworkz.collection.driver;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class FriendsName {

	public static void main(String[] args) {
		
		List<String> name=new ArrayList<>();
		name.add("divya");
		name.add("manasa");
		name.add("nayana");
		name.add("nikitha");
		name.add("ankitha");
		
		System.out.println(name);
		
		System.out.println(name.contains("nayana"));
		
		System.out.println(name.remove("divya"));
		//System.out.println(name);
		
		name.forEach((e)->System.out.println(e));
		
		System.out.println(name.get(2));
		
		System.out.println(name.set(0,"neha"));
		System.out.println(name);
		
	  //  name.clear();
	    //System.out.println(name);
		
		name.add(4,"ruchita");
		System.out.println(name);
		
		System.out.println(name.equals(name));
		
		//System.out.println(name.hashCode());
		
		System.out.println(name.indexOf("nayana"));
		
		System.out.println(name.lastIndexOf("neha"));
		
		System.out.println(name.isEmpty());
		
		System.out.println(name.size());
		
		System.out.println(name.remove(0));
		System.out.println(name);
		Iterator<String> list=name.iterator();
		
		while(list.hasNext()) {
			System.out.println(list.next());
		}
		
		list.forEachRemaining((s)->System.out.println(s));
		
//		list.remove();
//		System.out.println(list);
		
	System.out.println("before sorting");
	System.out.println(name);
	Collections.sort(name);
	System.out.println("after sorting");
	System.out.println(name);
	
	
	
	
	
		
		
	}
}
