package com.xworkz.foods.service;

public interface FoodService {

	boolean validateAndSave(String foodName);
	
	boolean isExisting(String foodName);

	boolean update(String oldName, String newName);
}
