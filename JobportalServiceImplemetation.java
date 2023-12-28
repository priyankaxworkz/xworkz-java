package com.xworkz.jobportal.service;

import com.xworkz.jobportal.repository.JobportalRepository;

public class JobportalServiceImplemetation implements JobportalService {

	private JobportalRepository repository;
	public JobportalServiceImplemetation(JobportalRepository repository) {
		this.repository=repository;
	}
	@Override
	public boolean validateAndSave(String name) {
		if(name.isEmpty()
				||name.isBlank()||
				(name.length()<2
						&&name.length()>13)
				||name==null) {
			System.out.println("give the correct name");
		}else {
			boolean exist=isExists(name);
			if(exist!=true) {
			
			boolean save=repository.onSave(name);
			if(save) {
				System.out.println("added successfully");
				return true;
				
			}else {
				System.out.println("not added succesffully");
				return false;
			}}else {
				System.out.println("name already exists");
			return false;
			}
		}
		return false;
	}

	@Override
	public boolean isExists(String name) {
		String[] names=repository.read();
		if(name!=null&&names!=null) {
			for(String search:names) {
				if(search!=null) {
					if(search.equals(name)) {
						return true;
						
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
		  boolean oldValueCheck=isExists(oldName);
			if(oldValueCheck!=false) {
				 System.out.println("old value checked");
			    boolean check=repository.update(oldName,newName);
			   System.out.println("check:"+check);
				if(check==true) {
					System.out.println("updated successfully");
					return true;
				}else {
					System.out.println("not updated");
					
				}}else {
				System.out.println("old name is not present");
			}
		}
		
		return false;
	}

}
