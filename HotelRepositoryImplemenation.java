package com.xworkz.hotel.repository;

import java.util.ArrayList;
import java.util.List;

import com.xworkz.hotel.dto.HotelDto;

public class HotelRepositoryImplemenation implements HotelRepository {

	List<HotelDto> listOfHotel=new ArrayList<HotelDto>();
	
	@Override
	public boolean onSave(HotelDto hotelDto) {
		System.out.println("dto is:"+hotelDto);
		if(listOfHotel!=null) {
			System.out.println("dto is not null");
			listOfHotel.add(hotelDto);
			return true;
		}
		return false;
	}

	@Override
	public List<HotelDto> readAll() {
		return listOfHotel;
	}


	
	

}
