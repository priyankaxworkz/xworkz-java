package com.xworkz.jobportal.repository;

public interface JobportalRepository {
  
	boolean onSave(String name);
	String[] read();
	boolean update(String oldName, String newName);

}
