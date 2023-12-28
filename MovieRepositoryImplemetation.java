package com.xworkz.movie.repository;

public class MovieRepositoryImplemetation implements MovieRepository {

	private String[] name=new String[5];
	private int index=0;
	
	public String[] getName() {
		return name;
	}

	@Override
	public boolean onSave(String movieNames) {
	if(name==null||index>=name.length) {
		System.out.println("null check or array of the length");
	}
	else {
		if(index<name.length) {
			name[index]=movieNames;
			index++;
			System.out.println("saved successfully");
			return true;
		}
	}
		return false;
	}

	@Override
	public String[] read() {
		for(String names:name) {
			if(names!=null) {
				System.out.println(names);
			}
		}
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

}
