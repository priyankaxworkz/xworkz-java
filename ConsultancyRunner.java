package com.xworkz.consultancy.runner;

import com.xworkz.consultancy.dto.ConsultancyDto;
import com.xworkz.consultancy.repository.ConsultancyRepository;
import com.xworkz.consultancy.repository.ConsultancyRepositoryImpl;
import com.xworkz.consultancy.service.ConsultancyService;
import com.xworkz.consultancy.service.ConsultancyServiceImpl;

public class ConsultancyRunner {
	public static void main(String[] args) {
		
		ConsultancyDto dto=new ConsultancyDto();
		dto.setClinicName("aparna");
		dto.setDoctorName("ashok");
		dto.setFees(250);
		dto.setLocation("rajainagar");
		System.out.println(dto.toString());
		
		ConsultancyRepository repository=new ConsultancyRepositoryImpl();
		
		ConsultancyService service =new ConsultancyServiceImpl(repository);
		service.validateAndSave(dto);
		//service.validateAndSave(dto);
		service.readAll();
	}

}
