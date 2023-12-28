package com.xworkz.RoadMapservice;

import com.xworkz.RoadMaprepository.StreamRepository;

public class StreamServiceImplimentation implements StreamService {

	private StreamRepository repository;
	public StreamServiceImplimentation(StreamRepository repository) {
		this.repository=repository;
	}
	@Override
	public boolean validateAndSave(String streamName) {
		if(streamName.isEmpty()
				||streamName.isBlank()
				||(streamName.length()<3
				&&streamName.length()>25)
				||streamName==null
				) {
			System.out.println("give the correct name");
	
		}else {
		
		boolean save=repository.onSave(streamName);
		if(save) {
			System.out.println("added stream succesfully");
			return true;
			}else {
			System.out.println("not added stream succesfully");
			return false;
		}}
	return false;
	}
		
}
