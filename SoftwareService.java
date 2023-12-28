package com.xworkz.software.service;

public interface SoftwareService {

	boolean validateAndSave(String softwareNames);
	
	boolean isExisiting(String softwareNames);

	boolean update(String oldName, String newName);
}
