package com.xworkz.RoadMaprunner;

import com.xworkz.RoadMaprepository.StreamRepository;
import com.xworkz.RoadMaprepository.StreamRepositoryImplimentation;
import com.xworkz.RoadMapservice.StreamService;
import com.xworkz.RoadMapservice.StreamServiceImplimentation;

public class StreamRunner {
	
	public static void main(String[] args) {
		 StreamRepository repository=new  StreamRepositoryImplimentation();
		 
		boolean save= repository.onSave("cse");
		//System.out.println(save);
		
		
		StreamService service= new  StreamServiceImplimentation(repository);
		service.validateAndSave("mechanical");
		service.validateAndSave("civil");

	}

}
