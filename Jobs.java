package com.xworkz.collection.driver;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class Jobs {
	
	public static void main(String[] args) {
		
		List<String> jobsRole=new ArrayList<>();
		
		jobsRole.add("developer");
		jobsRole.add("full stack developer");
		jobsRole.add("front nd developer");
		jobsRole.add("backend developer");
		jobsRole.add("devopps");
		jobsRole.add("sql developer");
		jobsRole.add("hacking");
		jobsRole.add("network admin");
		
List<String> jobsRole1=new ArrayList<>();
		
		jobsRole1.add("developer");
		jobsRole1.add("full stack developer");
		jobsRole1.add("front nd developer");
		jobsRole1.add("backend developer");
		jobsRole1.add("devopps");
		jobsRole1.add("sql developer");
		jobsRole1.add("hacking");
		jobsRole1.add("network admin");
		
List<String> jobsRole2=new ArrayList<>();
		
		jobsRole2.add("developer");
		jobsRole2.add("full stack developer");
		jobsRole2.add("front nd developer");
		jobsRole2.add("backend developer");
		jobsRole2.add("devopps");
		jobsRole2.add("sql developer");
		jobsRole2.add("hacking");
		jobsRole2.add("network admin");
		
		
		//sorted
		
		System.out.println("before sorting");
		System.out.println(jobsRole1);
		
		Collections.sort(jobsRole1);
		System.out.println("after sorting");
		System.out.println(jobsRole1);
		
	List<List<String>> list=new ArrayList<>();
	list.add(jobsRole);
	list.add(jobsRole1);
	list.add(jobsRole2);
		
//	for each will comes under the iterable or in collection
	list.forEach((s)->System.out.println(s));
	
	Iterator<List<String>> listoflist= list.iterator();
		
		//for each remaining will comes under iterator
	listoflist.forEachRemaining((s)->System.out.println(s));
	
	while(listoflist.hasNext()) {
		System.out.println(listoflist.next());
	}
	
		
}

}
