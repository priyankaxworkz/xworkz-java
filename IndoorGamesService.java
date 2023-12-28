package com.xworkz.games.service;

public interface IndoorGamesService {
	
	boolean validateAndSave(String gameNames);
	void read();
	boolean isExisting(String gameNames);
	boolean update(String oldName, String newName);
	boolean delete(String gameNames);
	

}
