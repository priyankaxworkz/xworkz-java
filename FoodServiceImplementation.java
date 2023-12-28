package com.xworkz.foods.service;

import com.xworkz.foods.repository.FoodRepository;

public class FoodServiceImplementation implements FoodService{

	private FoodRepository repository;
	public FoodServiceImplementation( FoodRepository repository) {
		this.repository=repository;
	}
	@Override
	public boolean validateAndSave(String foodName) {
		if(foodName.isEmpty()
				||foodName.isBlank()
				||(foodName.length()<3
					&&foodName.length()>25)
				||foodName==null) {
			
			System.out.println("give the correct name");
		
		}else{
			boolean exists=isExisting(foodName);
			if(exists!=true) {
				
			boolean save=repository.onSave(foodName);
			if(save) {
				System.out.println("added name succesfully");
				return true;
			}else {
					System.out.println("not added name successfully");
					return false;
			}
			}else {
				System.out.println("stream name is already exist");
				return false;
			}
		}
		return false;
	}
	@Override
	public boolean isExisting(String foodName) {
		String[] names=repository.read();
		if(names!=null) {
		if(foodName!=null) {
			for(String name:names) {
				if(name!=null) {
					if(name.equals(foodName)) {
						return true;
					}
				}
			}
		}
		}
		return false;
	}
	@Override
	public boolean update(String oldName, String newName) {
		if(oldName!=null&&newName!=null) {
		//	System.out.println("not null");
			
			boolean oldValueCheck=isExisting(oldName);
			if(oldValueCheck!=false) {
				System.out.println("old value checked");
				}
			boolean check=repository.update(oldName,newName);
			if(check!=false) {
				System.out.println("updated successfully");
				return true;
			}else {
				System.out.println("not updated succeessfully");
				
			}}else {
				System.out.println("old name doest not exist");
		}
		return false;
	}

}
