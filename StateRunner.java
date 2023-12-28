package com.xworkz.state.runner;

import com.xworkz.state.repository.StateRepository;
import com.xworkz.state.repository.StateRepositoryImplementation;
import com.xworkz.state.service.StateService;
import com.xworkz.state.service.StateServiceImplementation;

public class StateRunner {
	
	public static void main(String[] args) {
		StateRepository repository=new StateRepositoryImplementation();
		
		StateService service=new StateServiceImplementation(repository);
		
		service.validateAndSave("karnataka");
		service.validateAndSave("mahrastra");
		service.validateAndSave("goa");
		service.validateAndSave("telegana");
		service.validateAndSave("kerala");
		service.read();
		String oldName="mahrastra";
		String newName="tamilnadu";
		service.update(oldName,newName);
	//	repository.read();
		
		service.delete("goa");
		service.read();
		//repository.read();
	}

}
