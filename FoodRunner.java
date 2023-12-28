package com.xworkz.foodsrunner;

import com.xworkz.foods.repository.FoodRepository;
import com.xworkz.foods.repository.FoodRepositoryImplementation;
import com.xworkz.foods.service.FoodService;
import com.xworkz.foods.service.FoodServiceImplementation;

public class FoodRunner {

	public static void main(String[] args) {
		
		FoodRepository repository=new FoodRepositoryImplementation();
	//boolean save=repository.onSave("masalaDossa");
	
	FoodService service=new FoodServiceImplementation(repository);
	service.validateAndSave("briyani");
	service.validateAndSave("palav");
	service.validateAndSave("dossa");
	service.validateAndSave("pulivogare");
	service.validateAndSave("chitrana");
	String oldName="briyani";
	String newName="jamun";
	
	service.update(oldName,newName);
	repository.read();
	}
}
