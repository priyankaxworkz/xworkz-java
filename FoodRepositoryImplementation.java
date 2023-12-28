package com.xworkz.foods.repository;

public class FoodRepositoryImplementation implements FoodRepository {

	 private String[] names=new String[4];
	private int index=0;
	
	public String[] getNames() {
		return names;
	}

	@Override
	public boolean onSave(String foodName) {
		if(foodName==null||index>=names.length) {
			System.out.println("stream name is null or check the length");
		}else {
			if(index<names.length) {
				names[index]=foodName;
				index++;
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
