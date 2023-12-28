package com.xworkz.games.repository;

public interface IndoorGamesRepository {
	
	boolean onSave(String gameName);
	String[] read();
	boolean update(String oldName, String newName);
	boolean delete(String gameName);
	

}
