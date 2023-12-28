package com.xworkz.country.runner;

import com.xworkz.country.repository.CountryRepository;
import com.xworkz.country.repository.CountryRepositoryImplementation;
import com.xworkz.country.service.CountryService;
import com.xworkz.country.service.CountryServiceImplemetation;

public class CountryRunner {
	
	public static void main(String[] args) {
		CountryRepository repository=new CountryRepositoryImplementation();
		
		CountryService service=new CountryServiceImplemetation(repository);
		
		service.validateAndSave("india");
		service.validateAndSave("usa");
		service.validateAndSave("china");
		service.validateAndSave("bangaldesh");
		service.validateAndSave("china");
		
		String oldName="india";
		String newName="hyderbad";
		service.update(oldName,newName);
		repository.read();
	}

}
