package com.xworkz.hotel.service;

import java.util.List;

import com.xworkz.hotel.dto.HotelDto;
import com.xworkz.hotel.repository.HotelRepository;

public class HotelServiceImplementation implements HotelService{

	private HotelRepository repository;
	public HotelServiceImplementation(HotelRepository repository) {
		this.repository=repository;
	}
	@Override
	public boolean validateAndSave(HotelDto hotelDto) {
		if(hotelDto!=null) {
			System.out.println("dto is not null");
			boolean exist=isExist(hotelDto);
			if(exist!=true) {
			if(repository.onSave(hotelDto)) {
				System.out.println("saved successfully");
				return true;
			}else {
				System.out.println("not saved");
			}}else {
				System.out.println("dto is already existed");
			}}else {
				System.out.println("dto is null");
		}
		return false;
	}
	@Override
	public void readAll() {
		List<HotelDto> dto=repository.readAll();
		System.out.println("dto is:"+dto);
		}
	@Override
	public boolean isExist(HotelDto hotelDto) {
		List<HotelDto> dto=repository.readAll();
		if(dto.contains(hotelDto)) {
			return true;
		}
		return false;
	}

}
