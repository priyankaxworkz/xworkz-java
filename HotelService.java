package com.xworkz.hotel.service;

import com.xworkz.hotel.dto.HotelDto;

public interface HotelService {

	boolean validateAndSave(HotelDto hotelDto);
	
	void readAll();
	
	boolean isExist(HotelDto hotelDto);
}
