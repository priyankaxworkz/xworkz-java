package com.xworkz.software.runner;

import com.xworkz.software.repository.SoftwareRepository;
import com.xworkz.software.repository.SoftwareRepositoryImplementation;
import com.xworkz.software.service.SoftwareService;
import com.xworkz.software.service.SoftwareServiceImplementation;

public class SoftwareRunner {

	public static void main(String[] args) {
		
		SoftwareRepository repository=new SoftwareRepositoryImplementation();
		
		SoftwareService service=new SoftwareServiceImplementation(repository);
		
		service.validateAndSave("mac");
		service.validateAndSave("window");
		service.validateAndSave("window");
		service.validateAndSave("microsoft");
		service.validateAndSave("google");
		
		String oldName="mac";
		String newName="Os";
		service.update(oldName,newName);
		repository.read();
	}
}
