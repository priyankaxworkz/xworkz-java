package com.xworkz.state.repository;

public interface StateRepository {
	
	boolean onSave(String stateNames);
	String[] read();
	boolean update(String oldName, String newName);
	boolean delete(String stateNames);

}
