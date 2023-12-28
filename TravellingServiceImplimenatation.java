package com.xworkz.travelling.service;

import com.xworkz.travelling.repository.TravellingRepository;

public class TravellingServiceImplimenatation implements TravellingService {

	private TravellingRepository repository;
	
	public TravellingServiceImplimenatation(TravellingRepository repository) {
		this.repository=repository;
	}
	@Override
	public boolean validateAndSave(String placeName) {
		
		if(placeName.isEmpty()
				||placeName.isBlank()
				||(placeName.length()<2
						&&placeName.length()>30)
				||placeName==null) {
			System.out.println("give the correct name");
		//check the duplicate method
		}else {
			boolean exists= isExisting(placeName);
			if(exists!=true) {
				
        boolean save=repository.onSave(placeName);
		if(save) {
			System.out.println("saved successfully");
			return true;
		}else {
			System.out.println("not saved succesfully");
			return false;
		}}else {
			System.out.println("place name already exist");
			return false;
		}
	}
		return false;
	}
	@Override
	public boolean isExisting(String placeName) {
		String[] name=repository.read();
		if(name!=null&&placeName!=null) {
			for(String names:name) {
				if(names!=null) {
					if(names.equals(placeName)){
						return true;
					
				}
			}
		}
		}
		return false;
	

	}
	@Override
	public boolean update(String oldName, String newName) {
		if(oldName!=null&&newName!= null) {
			System.out.println("not null");
			
			boolean oldValueCheck=isExisting(oldName);
			boolean newValueCheck=isExisting(newName);
			System.out.println("new name is exist:"+newName);
			
			if(oldValueCheck!=false&&newValueCheck!=false) {
				System.out.println("old value checkd");
				
				boolean check=repository.update(oldName, newName);
				if(check!=false) {
					System.out.println("updated successfully");
					return true;
				}else {
					System.out.println("not updated");
				}}else {
					System.out.println("old name is not null");
			}
		}
		return false;
	}
	@Override
	public boolean validate(String newName) {
		if(newName.isEmpty()
				||newName.isBlank()
				||newName.length()<2
						||newName.length()>30
				||newName==null) {
			System.out.println("new name checked");
		}
		return false;
	}}
