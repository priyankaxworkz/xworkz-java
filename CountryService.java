package com.xworkz.country.service;

public interface CountryService {
	
	boolean validateAndSave(String countryName);
	boolean isExists(String countryName);
	
	boolean update(String oldName,String newName);
	


}
