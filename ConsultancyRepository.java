package com.xworkz.consultancy.repository;

import java.util.List;

import com.xworkz.consultancy.dto.ConsultancyDto;

public interface ConsultancyRepository {

	boolean onSave(ConsultancyDto consultancyDto);
	
	List<ConsultancyDto> readAll();
}
