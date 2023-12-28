package com.xworkz.movie.repository;

public interface MovieRepository {
	
	boolean onSave(String movieNames);
	String[] read();
	boolean update(String oldName, String newName);

}
