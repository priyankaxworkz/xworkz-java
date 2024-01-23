package com.xworkz.rapido.service;

import java.util.List;

import com.xworkz.rapido.dto.RapidoDto;
import com.xworkz.rapido.repository.RapidoRepository;

public class RapidoServiceImplementation implements RapidoService {

	private RapidoRepository repository;
	public RapidoServiceImplementation(RapidoRepository repository) {
		this.repository=repository;
	}
	@Override
	public boolean validateAndSave(RapidoDto rapidoDto) {
		if(rapidoDto!=null) {
			System.out.println("dto is not null");
			
			boolean exist=isExist(rapidoDto);
			if(exist!=true) {
			if(repository.onSave(rapidoDto)) {
				System.out.println("saved succesfully");
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
	  List<RapidoDto> dto=repository.readAll();
	  System.out.println("dto is:"+dto);
		}
	
	@Override
	public boolean isExist(RapidoDto rapidoDto) {
		List<RapidoDto> dto=repository.readAll();
		if(dto.contains(rapidoDto)) {
			return true;
		}
		return false;
	}

}
