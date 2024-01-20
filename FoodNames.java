package com.xworkz.collection.driver;

import java.util.ArrayList;
import java.util.List;

public class FoodNames {

	public static void main(String[] args) {
		
		List foodNames=new ArrayList();
		//List<E> foodNames=new ArrayList<E>();
		 foodNames.add("puri");
		 foodNames.add("masaldossa");
		 foodNames.add("dossa");
		 foodNames.add("briyani");
		 foodNames.add("rotti");
		 foodNames.add("rasgula");
		 foodNames.add("panirbiryani");
		 foodNames.add("palva");
		 foodNames.add("fish curry");
		 foodNames.add("chicken curry");
		 foodNames.add("burger");
		 foodNames.add("pizza");
		 foodNames.add("frenchfires");
		 foodNames.add("momose");
		 foodNames.add("bisket");
		 foodNames.add("lays");
		 foodNames.add("egg");
		 foodNames.add("thandori");
		 foodNames.add("kesaribath");
		 foodNames.add("bisibelebath");
		 foodNames.add("pulivogre");
		 foodNames.add("idli");
		 foodNames.add("pongal");
		 foodNames.add("paddu");
		 foodNames.add("sherra");
		 foodNames.add("cheeze");
		 foodNames.add("laddu");
		 foodNames.add("juice");
		 foodNames.add("dalmakni");
		 foodNames.add("chitranna");
		 
		// System.out.println("size of the lis:"+foodNames.size());
		 
		 System.out.println("food names are:"+foodNames);
		 
		 System.out.println("dossa is present:"+foodNames.contains("dossa"));
		 
		 System.out.println("removing the object:"+foodNames.remove("bisibelebath"));
		 
		 System.out.println("size of the lis:"+foodNames.size());
		 
		// System.out.println("food names are:"+foodNames);
		 
	}
}
