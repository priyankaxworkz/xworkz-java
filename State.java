package com.xworkz.collection.driver;

import java.util.ArrayList;
import java.util.List;

public class State {
	public static void main(String[] args) {
		
		List stateNames=new ArrayList();
		stateNames.add("karnataka");
		stateNames.add("goa");
		stateNames.add("kerala");
		stateNames.add("tamilnadu");
		stateNames.add("arunchalpradesh");
		stateNames.add("uttarkhand");
		stateNames.add("jammu and kasmir");
		stateNames.add("andrapradesh");
		stateNames.add("mahrastra");
		stateNames.add("bihar");
		stateNames.add("chattisgarh");
		stateNames.add("assam");
		stateNames.add("gujarath");
		stateNames.add("uttarpradesh");
		stateNames.add("telangana");
		stateNames.add("meghalya");
		stateNames.add("jharkand");
		stateNames.add("rajastan");
		stateNames.add("punjab");
		stateNames.add("orrissa");
		stateNames.add("sikkim");
		stateNames.add("haryan");
		stateNames.add("himachalpradesh");
		stateNames.add("madyapradesh");
		stateNames.add("manipur");
		stateNames.add("mizoram");
		stateNames.add("nagalnd");
		stateNames.add("tripur");
		stateNames.add("westbengal");
		
		//System.out.println("size is:"+stateNames.size());
		System.out.println(stateNames);
		System.out.println("if karantaka is present:"+stateNames.contains("karnataka"));
		
		System.out.println("remove tamilnadu:"+stateNames.remove("tamilnadu"));
		
		System.out.println("size of the list:"+stateNames.size());
		}

}
