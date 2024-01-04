package com.xworkz.pancard.service;

import com.xworkz.pancard.dto.PancardDto;

public interface PanCardService {
	
	boolean validateAndSave(PancardDto pancardDto);
	
	boolean isExists(PancardDto pancardDto);
	
	void read();
	
	boolean update(String email,PancardDto pancardDto);
	
	boolean delete(String email);

}
