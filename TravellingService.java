package com.xworkz.travelling.service;

public interface TravellingService {
	
	boolean validateAndSave(String placeName);
	
	boolean isExisting(String placeName);

	boolean update(String oldName, String newName);
	
	boolean validate(String newName);

}
