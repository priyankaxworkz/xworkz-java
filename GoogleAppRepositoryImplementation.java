package com.xworkz.googleapps.repository;

import com.xworkz.googleapps.googleappsdto.GoogleAppsDto;

public class GoogleAppRepositoryImplementation implements GoogleAppRepository {

	private GoogleAppsDto[] appsDto=new GoogleAppsDto[5];
	private int index=0;
	
	@Override
	public boolean onSave(GoogleAppsDto googleAppsDto) {
		if(index<this.appsDto.length) {
			appsDto[this.index]=googleAppsDto;
		     this.index++;
			return true;
		}
		return false;
	}

	@Override
	public GoogleAppsDto[] read() {
		return appsDto;
	}

}
