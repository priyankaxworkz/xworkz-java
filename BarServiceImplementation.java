package com.xworkz.bar.service;

import java.util.List;

import com.xworkz.bar.dto.BarDto;
import com.xworkz.bar.repository.BarRepository;

public class BarServiceImplementation implements BarService {

	private BarRepository repository;
	public BarServiceImplementation(BarRepository repository) {
		this.repository=repository;
	}
	@Override
	public boolean validateAndSave(BarDto barDto) {
		if(barDto!=null) {
			System.out.println("dto is not null");
			
			boolean exist=isExist(barDto);
			if(exist!=true) {
			if(repository.onSave(barDto)) {
				System.out.println("saved succesfully");
				return true;
			}else {
				System.out.println("not saved succesfully");
				return false;
			}}else {
				System.out.println("dto is already prsent");
			}}else {
				System.out.println("dto is null");
			}
		return false;
	}
	@Override
	public void readAll() {
		List<BarDto> dto=repository.readAll();
		System.out.println("dto is reading:"+dto);
		}
	@Override
	public boolean isExist(BarDto barDto) {
		List<BarDto> dto=repository.readAll();
		if(dto.contains(barDto)) {
			return true;
		}
		return false;
	}

}
