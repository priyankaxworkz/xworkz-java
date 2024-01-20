package com.xworkz.collection.driver;

import java.util.ArrayList;
import java.util.List;

public class Movie {

	public static void main(String[] args) {
		
		List<String> movieList=new ArrayList<>();
		
		movieList.add("katera");
		movieList.add("kgf");
		movieList.add("kgf-2");
		movieList.add("the code");
		movieList.add("bahubali");
		movieList.add("muginamnasu");
		movieList.add("sse");
		movieList.add("javan");
		movieList.add("animal");
		movieList.add("ss");
		movieList.add("nanna");
		movieList.add("googli");
		movieList.add("milana");
		movieList.add("ssf");
		movieList.add("pandvaru");
		movieList.add("habba");
		movieList.add("the exception");
		movieList.add("jurassic world");
		movieList.add("appu");
		movieList.add("murya");
		movieList.add("the villan");
		movieList.add("airavatha");
		movieList.add("suryakanthi");
		movieList.add("power");
		movieList.add("yuvaratna");
		movieList.add("yuva");
		movieList.add("arasu");
		movieList.add("mejestic");
		movieList.add("ranna");
		movieList.add("ega");
		movieList.add("kamali");
		movieList.add("krish");
		movieList.add("pokimon");
		movieList.add("huccha");
		movieList.add("brundavana");
		movieList.add("ambarish");
		movieList.add("ramchari");
		movieList.add("kiccha");
		movieList.add("the horror");
		movieList.add("lalihadu");
		movieList.add("jaymanmaga");
		movieList.add("duniya");
		movieList.add("salaga");
		movieList.add("jmnpmk");
		movieList.add("jangli");
		movieList.add("karnthi");
		movieList.add("sangloi rayana");
		movieList.add("bul bul");
		movieList.add("yajamana");
		movieList.add("boss");
		
		//System.out.println(movieList);
		System.out.println(movieList.equals(movieList));
	//	System.out.println(movieList.equals("boss"));
		
		for(String name:movieList) {
			System.out.println(name);
			//System.out.println(movieList.equals("boss"));
		}
		
		System.out.println("size of the movie:"+movieList.size());
	
		

		System.out.println(movieList.get(48));
		
   //String list= movieList.set(0,"sseb");
   System.out.println(movieList.set(0,"sseb"));
   System.out.println(movieList);
   
   System.out.println(movieList.contains("boss"));
	System.out.println(movieList.subList(23, 49));
	
	movieList.clear();
	System.out.println(movieList);
	
	
 //System.out.println((s)->System.out.println(s));
		
	}
}
