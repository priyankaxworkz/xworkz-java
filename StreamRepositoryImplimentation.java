package com.xworkz.RoadMaprepository;

public class StreamRepositoryImplimentation implements StreamRepository {

	private String[] strems= new String[3];
	private int index=0;
	
	public String[] getStrems() {
		return strems;
	}

	@Override
	public boolean onSave(String streamName) {
		if(strems==null||index>=strems.length) {
			System.out.println("streams is null or check the length ");
		}else {
	if(index<strems.length) {
		strems[index]=streamName;
		index++;
		//System.out.println("stream is saved succesfully");
		return true;
		
	}
	}
	return false;
	}

	@Override
	public String[] read() {
		return strems;
	}

}
