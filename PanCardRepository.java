package com.xworkz.pancard.repository;

import com.xworkz.pancard.dto.PancardDto;

public interface PanCardRepository {
	
	boolean onSave(PancardDto pancardDto);

	PancardDto[] read();
	
	boolean update(String email,PancardDto pancardDto);

	boolean delete(String userName);
}
