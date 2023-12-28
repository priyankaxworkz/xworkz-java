package com.xworkz.googleapps.service;

import com.xworkz.googleapps.googleappsdto.GoogleAppsDto;

public interface GoogleAppService {
	
	boolean validateAndSave(GoogleAppsDto googleAppsDto);
	
	boolean isExisting(GoogleAppsDto googleAppsDto);
	
	void read();

}
