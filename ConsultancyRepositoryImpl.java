package com.xworkz.consultancy.repository;

import java.util.ArrayList;
import java.util.List;

import com.xworkz.consultancy.dto.ConsultancyDto;

public class ConsultancyRepositoryImpl implements ConsultancyRepository {

	List<ConsultancyDto> listOfDto=new ArrayList<ConsultancyDto>();
	@Override
	public boolean onSave(ConsultancyDto consultancyDto) {
		System.out.println("dto is:"+consultancyDto);
		if(listOfDto!=null) {
			System.out.println("dto is not null");
			listOfDto.add(consultancyDto);
			return true;
		}
		return false;
	}
	@Override
	public List<ConsultancyDto> readAll() {
		return listOfDto;
	}

}
