package com.xworkz.malpe.service;

import com.xworkz.malpe.dto.MalpeDto;

public interface MalpeService {

	boolean validateAndSave(MalpeDto malpeDto);
	
	void readAll();
	
	boolean isExist(MalpeDto malpeDto);
	
	boolean update(String presidentName, MalpeDto malpeDto);
	
	//boolean delete(MalpeDto malpeDto);
}
