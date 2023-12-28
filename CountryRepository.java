package com.xworkz.country.repository;

public interface CountryRepository {
	
	boolean onSave(String countryNames);
	String[] read();
	boolean update(String oldName, String newName);

}
