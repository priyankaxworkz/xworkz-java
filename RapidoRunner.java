package com.xworkz.rapido.runner;

import com.xworkz.rapido.dto.RapidoDto;
import com.xworkz.rapido.repository.RapidoRepository;
import com.xworkz.rapido.repository.RapidoRepositoryImpl;
import com.xworkz.rapido.service.RapidoService;
import com.xworkz.rapido.service.RapidoServiceImplementation;

public class RapidoRunner {

	public static void main(String[] args) {
		
		RapidoDto dtos=new RapidoDto();
		dtos.setLocation("bangaluru");
		dtos.setManager("arvaind shank");
		dtos.setTotalBranch(50);
		dtos.setTotalVehicles(100);
		
		System.out.println(dtos.toString());
		
		RapidoRepository repository=new RapidoRepositoryImpl();
		
		RapidoService service =new RapidoServiceImplementation(repository);
		service.validateAndSave(dtos);
		//service.validateAndSave(dtos);
		service.readAll();
	}
}
