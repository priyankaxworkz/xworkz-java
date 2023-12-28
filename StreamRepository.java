package com.xworkz.RoadMaprepository;

public interface StreamRepository {
	
	boolean onSave(String streamName);

	 String[] read();
}
