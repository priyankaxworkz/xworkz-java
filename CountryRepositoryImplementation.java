package com.xworkz.country.repository;

public class CountryRepositoryImplementation implements CountryRepository {

	private String[] name=new String[5];
	private int index=0;
	
	public String[] getName() {
		return name;
	}
	@Override
	public boolean onSave(String countryNames) {
		if(name==null||index>=name.length) {
			System.out.println("null check or array length");
		}else {
			if(index<name.length) {
				name[index]=countryNames;
				index++;
				System.out.println("saved successfully");
				return true;
			}
		}
		return false;
	}

	@Override
	public String[] read() {
		for(String list:name) {
			if(list!=null) {
				System.out.println(list);
			}
		}
		return name;
	}
	@Override
	public boolean update(String oldName, String newName) {
		for(int i=0;i<name.length;i++) {
			if(name!=null) {
				if(name[i].equalsIgnoreCase(oldName)) {
					name[i]=newName;
				return true;
					
				}
			}
		}
		return false;
	}

}
