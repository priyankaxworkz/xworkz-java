package com.xworkz.country.service;

import com.xworkz.country.repository.CountryRepository;

public class CountryServiceImplemetation implements CountryService{

	private CountryRepository repository;
	public CountryServiceImplemetation(CountryRepository repository) {
		this.repository=repository;
	}
	@Override
	public boolean validateAndSave(String countryName) {
	if(countryName.isEmpty()
			||countryName.isBlank()
			||(countryName.length()<2
					&&countryName.length()>30)
					||countryName==null
			) {
		System.out.println("give the correct name");
	}else {
		boolean exist=isExists(countryName);
		if(exist!=true) {
			
		
		boolean save=repository.onSave(countryName);
			if(save) {
				System.out.println("added successfully");
				return true;
			}else {
				System.out.println("not added successfully");
				return false;
			}}else {
				System.out.println("already exist");
				return false;
			}
		}
	
	
		return false;
	}

	@Override
	public boolean isExists(String countryName) {
		String[] name=repository.read();
		if(name!=null&&countryName!=null) {
			for(String names:name) {
				if(names!=null) {
					if(names.equalsIgnoreCase(countryName)) {
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
		System.out.println("old value checked");
		if(oldValueCheck!=false) {
			boolean check=repository.update(oldName,newName);
			System.out.println("check:"+check);
			if(check==true) {
				System.out.println("updated succesfully");
				
				return true;
			}else {
				System.out.println("not updated");
			}}else {
				System.out.println("old name not present");
			}
			
		}
		return false;

	}

}
