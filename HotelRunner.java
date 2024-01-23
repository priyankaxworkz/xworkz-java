package com.xworkz.hotel.runner;

import com.xworkz.hotel.dto.HotelDto;
import com.xworkz.hotel.repository.HotelRepository;
import com.xworkz.hotel.repository.HotelRepositoryImplemenation;
import com.xworkz.hotel.service.HotelService;
import com.xworkz.hotel.service.HotelServiceImplementation;

public class HotelRunner {

	public static void main(String[] args) {
		
		HotelDto dtos=new HotelDto();
		dtos.setHotelName("anjur");
		dtos.setLocation("nelemangal");
		dtos.setNoOfDishes(100);
		dtos.setNoOfHotels(100);
		dtos.setOwnerName("girija");
		
		System.out.println(dtos.toString());
		
		HotelRepository repository=new HotelRepositoryImplemenation();
		
		HotelService service=new HotelServiceImplementation(repository);
		service.validateAndSave(dtos);
		//service.validateAndSave(dtos);
		service.readAll();
		
	}
}
