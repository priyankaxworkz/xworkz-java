package com.xworkz.jobportal.runner;

import com.xworkz.jobportal.repository.JobportalRepository;
import com.xworkz.jobportal.repository.JobportalRepositoryImplementation;
import com.xworkz.jobportal.service.JobportalService;
import com.xworkz.jobportal.service.JobportalServiceImplemetation;

public class JobportalRunner {
	public static void main(String[] args) {
		JobportalRepository repository=new JobportalRepositoryImplementation();
		
		JobportalService service=new JobportalServiceImplemetation(repository);
		service.validateAndSave("naukri");
		service.validateAndSave("indeed");
		service.validateAndSave("linkdin");
		service.validateAndSave("apna");
		service.validateAndSave("linkdin");
		
		String oldName="naukri";
		String newName="coding";
		service.update(oldName,newName);
		repository.read();
	}

}
