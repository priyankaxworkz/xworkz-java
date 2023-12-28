package com.xworkz.travelling.runner;

import com.xworkz.travelling.repository.TravellingRepository;
import com.xworkz.travelling.repository.TravellingRepositoryImplimentation;
import com.xworkz.travelling.service.TravellingService;
import com.xworkz.travelling.service.TravellingServiceImplimenatation;

public class TravellingRunner {

	public static void main(String[] args) {
		
		TravellingRepository repository=new TravellingRepositoryImplimentation();
		
		TravellingService service=new TravellingServiceImplimenatation(repository);
		service.validateAndSave("gokarna");
		service.validateAndSave("mirjan");
		service.validateAndSave("murdeswara");
		service.validateAndSave("mysore");
		service.validateAndSave("banglore");
		
		String oldName="gokarna";
		String newName="";
		service.update(oldName,newName);
		repository.read();
		
//	service.validate(newName);
//	repository.read();
//	
	}
}
