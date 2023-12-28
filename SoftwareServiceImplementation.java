package com.xworkz.software.service;

import com.xworkz.software.repository.SoftwareRepository;

public class SoftwareServiceImplementation implements  SoftwareService{

	private SoftwareRepository repository;
	public SoftwareServiceImplementation (SoftwareRepository repository) {
		this.repository=repository;
	}
	@Override
	public boolean validateAndSave(String softwareNames) {
		if(softwareNames.isEmpty()
				||softwareNames.isBlank()
				||(softwareNames.length()<2
						&& softwareNames.length()>30)
				||softwareNames==null
				) {
			System.out.println("give the correct name");
			
		}else {
			
			boolean exists=isExisiting(softwareNames);
			if(exists!=true) {
			
			boolean save=repository.onSave(softwareNames);
			if(save) {
				System.out.println("added successfully");
				return true;
			}else {
				System.out.println("not added succesfully");
				return false;
			}}else {
				System.out.println("software names already exists");
			return false;
			}
		}
		
return false;
	}
	@Override
	public boolean isExisiting(String softwareNames) {
		String[] name=repository.read();
		if(name!=null&&softwareNames!=null) {
			for(String names:name) {
				if(names!=null) {
					if(names.equals(softwareNames)){
						
						
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
			
			boolean oldValueCheck=isExisiting(oldName);
			if(oldValueCheck!=false) {
				System.out.println("old value checked");
			
			boolean check=repository.update(oldName, newName);
			System.out.println("check:"+check);
			if(check==true) {
				System.out.println("updated successfully");
				return true;
			}else {
				System.out.println("not updated successfully");
				
			}}else {
				System.out.println("old name is not checked");
		}
		}
		return false;
	}

}
