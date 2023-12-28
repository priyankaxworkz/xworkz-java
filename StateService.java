package com.xworkz.state.service;

public interface StateService {
	
	boolean validateAndSave(String stateNames);
	
	boolean isExists(String stateNames);
	
	void read();

	boolean update(String oldName, String newName);
	
	boolean delete(String stateNames);
}
