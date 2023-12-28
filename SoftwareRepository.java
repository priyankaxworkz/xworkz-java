package com.xworkz.software.repository;

public interface SoftwareRepository {
	
	boolean onSave(String softwareNames);

	String[] read();

	boolean update(String oldName, String newName);
}
