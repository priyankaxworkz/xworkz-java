package com.xworkz.state.repository;

public class StateRepositoryImplementation implements StateRepository {

	private String[] name=new String[5];
	private int index=0;
	
	public String[] getName() {
		return name;
	}

	
	@Override
	public boolean onSave(String stateNames) {
		if(name==null||index>=name.length) {
			System.out.println("null check or array of the length");
			}else {
				if(index<name.length) {
					name[index]=stateNames;
					index++;
				//	System.out.println("saved successfully");
					return true;
				}
			}
		return false;
	}

	@Override
	public String[] read() {
	return name;
	}


	@Override
	public boolean update(String oldName, String newName) {
		for(int i=0;i<name.length;i++) {
			if(name[i]!=null) {
				if(name[i].equalsIgnoreCase(oldName)) {
					name[i]=newName;
					return true;
				}
			}
		}
		return false;
	}


	@Override
	public boolean delete(String stateNames) {
		if(name!=null) {
			for(int i=0;i<name.length;i++) {
			if(name[i].equalsIgnoreCase(stateNames)) {
				name[i]=null;
				return true;
			}
		}
			
		}
		return false;
	}

}
