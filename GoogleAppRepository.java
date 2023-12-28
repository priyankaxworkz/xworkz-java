package com.xworkz.googleapps.repository;

import com.xworkz.googleapps.googleappsdto.GoogleAppsDto;

public interface GoogleAppRepository {
	
	boolean onSave(GoogleAppsDto googleAppsDto);
	
	GoogleAppsDto[] read();

}
