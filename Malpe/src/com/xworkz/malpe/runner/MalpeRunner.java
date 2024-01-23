package com.xworkz.malpe.runner;

import com.xworkz.malpe.dto.MalpeDto;
import com.xworkz.malpe.repository.MalpeRepository;
import com.xworkz.malpe.repository.MalpeRepositoryImpl;
import com.xworkz.malpe.service.MalpeService;
import com.xworkz.malpe.service.MalpeServiceImpl;

public class MalpeRunner {

	public static void main(String[] args) {
		
		MalpeDto dto=new MalpeDto();
		dto.setLocation("udupi");
		dto.setNoOfBoats(100);
		dto.setNoOfFishes(100);
		dto.setPresidentName("richard");
		
		System.out.println(dto.toString());
		
		MalpeRepository repo=new MalpeRepositoryImpl();
		
		MalpeService service=new MalpeServiceImpl(repo);
		service.validateAndSave(dto);
		//service.validateAndSave(dto);
		service.readAll();
		
		MalpeDto dto1=new MalpeDto();
		dto1.setPresidentName("subbu");
		service.update("richard", dto1);
		service.readAll();
		
//		service.delete(dto1);
//		service.readAll();
	}
}
