package com.xworkz.googleapps.service;

import com.xworkz.googleapps.googleappsdto.GoogleAppsDto;
import com.xworkz.googleapps.repository.GoogleAppRepository;

public class GoogleAppServiceImplementation implements  GoogleAppService  {

	private GoogleAppRepository googleAppRepository;
	
	public GoogleAppServiceImplementation(GoogleAppRepository googleAppRepository ) {
		this.googleAppRepository=googleAppRepository;
	}
	
	 boolean validateId=true;
	 boolean validateStorage=true;
	 boolean validateName=true;
	 boolean validateVersion=true;
	
	@Override
	public boolean validateAndSave(GoogleAppsDto googleAppsDto) {
		//System.out.println("this is validate and save method");
	//	System.out.println("googleAppDto:"+googleAppsDto);
		
		if(googleAppsDto==null) {
			System.out.println("apps dto is null");
		}else {	
			
	if((googleAppsDto.getApplicationId().equals("null")
					||googleAppsDto.getApplicationId()==null)
					||(googleAppsDto.getApplicationId().length()<3&&googleAppsDto.getApplicationId().length()>10)
							||(!googleAppsDto.getApplicationId().startsWith("G"))) {
				System.out.println("null check or length or starts with G");
				validateId=false;
			}
	
		
		if(googleAppsDto.getStorage()<0) {
			System.out.println("check the length");
			validateStorage=false;
		}
		
		
		if((googleAppsDto.getAppName().equals("null")
				||googleAppsDto.getAppName()==null)
				||(googleAppsDto.getAppName().length()<3&&googleAppsDto.getAppName().length()>10)
				) {
			System.out.println("null check or length of the app name");
			validateName=false;
		}
		
		if(googleAppsDto.getVersion().equals("null")
				||googleAppsDto.getVersion()==null
				||(googleAppsDto.getVersion().length()<3&&googleAppsDto.getVersion().length()>10)
				||!googleAppsDto.getVersion().endsWith("v")) {
			System.out.println("length and ends with v");
			validateVersion=false;
		
		}
		
			if(validateId&&validateStorage&&validateName&&validateVersion) {
			System.out.println("validation is done");
		boolean exists=isExisting(googleAppsDto);
		if(exists!=true) {
		boolean save=this.googleAppRepository.onSave(googleAppsDto);
		if(save) {
			System.out.println("saved successfully");
			return true;
		}else {
			System.out.println("not saved");
			return false;
		}
		}else {
			System.out.println("name already existed");
		}}}
return false;
	}

	@Override
	public boolean isExisting(GoogleAppsDto googleAppsDto) {
		GoogleAppsDto[] appsDto=this.googleAppRepository.read();
		if(appsDto!=null&&googleAppsDto!=null) {
			for(GoogleAppsDto dto:appsDto) {
				if(dto!=null) {
					if(dto.equals(googleAppsDto)) {
						return true;
					}
				}
			}
		}
		return false;
	}

	@Override
	public void read() {
		GoogleAppsDto[] appsDto=this.googleAppRepository.read();
		for(GoogleAppsDto dto:appsDto) {
			System.out.println(dto);
		}
		
	}

}
