package com.xworkz.bar.runner;

import com.xworkz.bar.dto.BarDto;
import com.xworkz.bar.repository.BarRepository;
import com.xworkz.bar.repository.BarRepositoryImplementation;
import com.xworkz.bar.service.BarService;
import com.xworkz.bar.service.BarServiceImplementation;

public class BarRunner {

	public static void main(String[] args) {
		
		BarDto barDtos=new BarDto();
		barDtos.setBarName("sgv");
		barDtos.setLocation("malleswaram");
		barDtos.setNoOfBrands(50);
		barDtos.setOwner("prassana");
		barDtos.setTotalBars(100);
		
		System.out.println(barDtos.toString());
		
		 BarRepository repository=new  BarRepositoryImplementation();
		 
		 BarService service=new BarServiceImplementation(repository);
		 service.validateAndSave(barDtos);
		// service.validateAndSave(barDtos);
		 service.readAll();
	}
}
