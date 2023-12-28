package com.xworkz.jobportal.service;

public interface JobportalService {

	boolean validateAndSave(String name);
	boolean isExists(String name);
	boolean update(String oldName, String newName);
	
}
