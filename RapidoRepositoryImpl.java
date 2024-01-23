package com.xworkz.rapido.repository;

import java.util.ArrayList;
import java.util.List;

import com.xworkz.rapido.dto.RapidoDto;

public class RapidoRepositoryImpl implements RapidoRepository {

	List<RapidoDto> listOfDto=new ArrayList<RapidoDto>();
	@Override
	public boolean onSave(RapidoDto rapidoDto) {
		System.out.println("dto is:"+rapidoDto);
		if(listOfDto!=null) {
			System.out.println("dto is not null");
			listOfDto.add(rapidoDto);
			return true;
		}
		return false;
	}
	@Override
	public List<RapidoDto> readAll() {
		return listOfDto;
	}

}
