package com.xworkz.rapido.repository;

import java.util.List;

import com.xworkz.rapido.dto.RapidoDto;

public interface RapidoRepository {
	
	boolean onSave(RapidoDto rapidoDto);
	
	List<RapidoDto> readAll();

}
