package com.xworkz.hotel.repository;

import java.util.List;

import com.xworkz.hotel.dto.HotelDto;

public interface HotelRepository {

	boolean onSave(HotelDto hotelDto);
	
	List<HotelDto> readAll();
}
