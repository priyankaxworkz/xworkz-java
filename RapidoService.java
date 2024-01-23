package com.xworkz.rapido.service;

import com.xworkz.rapido.dto.RapidoDto;

public interface RapidoService {

	boolean validateAndSave(RapidoDto rapidoDto);
	
	void readAll();
	
	boolean isExist(RapidoDto rapidoDto);
}
