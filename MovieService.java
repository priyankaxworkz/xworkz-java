package com.xworkz.movie.service;

public interface MovieService  {
	
	boolean validateAndSave(String movieNames);
	
	boolean isExisiting(String movieNames);

	boolean update(String oldName, String newName);

}
