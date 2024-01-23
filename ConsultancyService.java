package com.xworkz.consultancy.service;

import com.xworkz.consultancy.dto.ConsultancyDto;

public interface ConsultancyService {
	
	boolean validateAndSave(ConsultancyDto consultancyDto);
    
	void readAll();
	
	boolean isExist(ConsultancyDto consultancyDto);
}
