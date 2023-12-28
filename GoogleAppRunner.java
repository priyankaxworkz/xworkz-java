package com.xworkz.googleapps.runner;

import com.xworkz.googleapps.googleappsdto.GoogleAppsDto;
import com.xworkz.googleapps.repository.GoogleAppRepository;
import com.xworkz.googleapps.repository.GoogleAppRepositoryImplementation;
import com.xworkz.googleapps.service.GoogleAppService;
import com.xworkz.googleapps.service.GoogleAppServiceImplementation;

public class GoogleAppRunner {
	
	public static void main(String[] args) {
		
		GoogleAppsDto googleAppsDto=new GoogleAppsDto();
		googleAppsDto.setApplicationId("G001");
		googleAppsDto.setAppName("googleDrive");
		googleAppsDto.setStorage(15);
		googleAppsDto.setVersion("G001v");
		googleAppsDto.setApplicationCost(0.0f);
		
		System.out.println(googleAppsDto.toString());
		
		
		GoogleAppRepository repository=new GoogleAppRepositoryImplementation();
		
		GoogleAppService service=new GoogleAppServiceImplementation(repository);
		service.validateAndSave(googleAppsDto);
		
	
		
	}

}
