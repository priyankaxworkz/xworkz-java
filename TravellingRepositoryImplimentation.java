package com.xworkz.travelling.repository;

public class TravellingRepositoryImplimentation implements TravellingRepository {

	
	private String[] name=new String[5];
	private int index=0;
	
	
	public String[] getName() {
		return name;
	}

   @Override
	public boolean onSave(String placeName) {
		if(name==null||index>=name.length) {
			System.out.println("null check or length of the array");
		}else {
			if(index<name.length) {
				name[index]=placeName;
				index++;
				System.out.println("added successfully");
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
