package com.xworkz.games.repository;

public class IndoorGamesRepositoryImplementation implements IndoorGamesRepository {

	
	private String[] name=new String[10];
	private int index=0;
	
	public String[] name() {
		return name;
	}
	@Override
	public boolean onSave(String gameName) {
		if(name==null||index>=name.length) {
			System.out.println("null check and array of the length");
		}else {
			if(index<name.length) {
				name[index]=gameName;
				index++;
				System.out.println("saved successfully");
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
	public boolean delete(String gameName) {
	for(int i=0;i<name.length;i++) {
		if(name[i]!=null) {
			if(name[i].equalsIgnoreCase(gameName)) {
				name[i]=null;
				return true;
			}
		}
	}
		return false;
	}

}
