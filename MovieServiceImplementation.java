package com.xworkz.movie.service;

import com.xworkz.movie.repository.MovieRepository;

public class MovieServiceImplementation implements MovieService{

	private MovieRepository repository;
	
	public MovieServiceImplementation(MovieRepository repository) {
		this.repository=repository;
	}
	@Override
	public boolean validateAndSave(String movieNames) {
		if(movieNames.isEmpty()
				||movieNames.isBlank()
				||(movieNames.length()<2
						&&movieNames.length()>13)
				||movieNames==null) {
			System.out.println("give the correct name");
	
		}else {
			
			boolean exists=isExisiting(movieNames);
			if(exists!=true) {
				
			
			boolean save=repository.onSave(movieNames);
			if(save) {
				System.out.println("added successfully");
				return true;
			}else {
				System.out.println("not added successfully");
				return false;
			}}else {
				System.out.println("movie name is already exists");
			}
		
		}
		return false;
	}

	@Override
	public boolean isExisiting(String movieNames) {
		String[] name=repository.read();
		if(name!=null&&movieNames!=null) {
			for(String names:name) {
				if(names!=null) {
					if(names.equals(movieNames)) {
					//	if(names.contains("a")) {
							return true;
						//}
					}
				}
			}
		}
		return false;
	}
	@Override
	public boolean update(String oldName, String newName) {
		if(oldName!=null&&newName!=null) {
			System.out.println("not null");
			
			boolean oldValueChecked=isExisiting(oldName);
			if(oldValueChecked!=false) {
				System.out.println("old value checked");
			}
			boolean check=repository.update(oldName,newName);
			if(check==true) {
				System.out.println("updated successfully");
				return true;}
			else {
				System.out.println("not updated successfully");
			}}else {
				System.out.println("old value not checked");
		}
		return false;
	}

}
