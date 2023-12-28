package com.xworkz.travelling.repository;

public interface TravellingRepository {
	
	boolean onSave(String placeName);
	
	String[] read();

	boolean update(String oldName, String newName);

}
