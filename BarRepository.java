package com.xworkz.bar.repository;

import java.util.List;

import com.xworkz.bar.dto.BarDto;

public interface BarRepository {
	
	boolean onSave(BarDto barDto);
	
	List<BarDto> readAll();

}
