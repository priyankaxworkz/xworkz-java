package com.xworkz.jobportal.repository;

public class JobportalRepositoryImplementation implements  JobportalRepository {

	private String[] names=new String[5];
	private int index=0;
	
	public String[] getNames() {
		return names;
	}

	@Override
	public boolean onSave(String name) {
		if(names==null||index>=names.length) {
			System.out.println("null check or array of the length");
		}else {
			if(index<names.length) {
			names[index]=name;
			index++;
			System.out.println("saved successfully");
			return true;
			}
		}
		return false;
	}

	@Override
	public String[] read() {
		for(String name:names) {
			if(name!=null) {
				System.out.println(name);
			}
		}
		return names;
	}

	@Override
	public boolean update(String oldName, String newName) {
		for(int i=0;i<names.length;i++) {
			if(names!=null) {
		if(names[i].equalsIgnoreCase(oldName)) {
			names[i]=newName;
			return true;
		}
		}
		}
		return false;
	}

}
