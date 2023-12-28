package com.xworkz.foods.repository;

public interface FoodRepository {
	
	boolean onSave(String foodName);
	
	String[] read();

	boolean update(String oldName, String newName);

}
