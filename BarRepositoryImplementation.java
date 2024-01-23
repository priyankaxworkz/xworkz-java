package com.xworkz.bar.repository;

import java.util.ArrayList;
import java.util.List;

import com.xworkz.bar.dto.BarDto;

public class BarRepositoryImplementation implements BarRepository {

	List<BarDto> listOfBarDto=new ArrayList<BarDto>();
	@Override
	public boolean onSave(BarDto barDto) {
		System.out.println("dtos is:"+barDto);
		if(listOfBarDto!=null) {
			System.out.println("dto is not null");
			listOfBarDto.add(barDto);
			return true;
		}
		return false;
	}
	@Override
	public List<BarDto> readAll() {
		return listOfBarDto;
	}

}
