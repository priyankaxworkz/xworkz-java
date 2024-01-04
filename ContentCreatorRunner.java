package com.xworkz.contentcreator.runner;

import com.xworkz.contentcreator.repository.ContentCreatorRepository;
import com.xworkz.contentcreator.repository.ContentCreatorRepositoryImplementation;
import com.xworkz.contentcreator.service.ContentCreatorService;
import com.xworkz.contentcreator.service.ContentCreatorServiceImplementation;
import com.xxworkz.contentcreator.constants.ContentType;
import com.xxworkz.contentcreator.dto.ContentCreatorDto;

public class ContentCreatorRunner {
	
	public static void main(String[] args) {
		
		ContentCreatorDto dto=new ContentCreatorDto();
		dto.setAmountPaid(500);
		dto.setContentLength(50);
		dto.setEmail("sahana@gmail.com");
		dto.setUserName("Sahana");
		dto.setWebsite("javahungry");
		dto.setPassword("A%^/~hyvv1");
		dto.setPage(20);
		dto.setType(ContentType.C01.toString());
		System.out.println(dto.toString());
		
		ContentCreatorRepository repository=new ContentCreatorRepositoryImplementation();
		
		ContentCreatorService service=new ContentCreatorServiceImplementation(repository);
		//service.validateAndSave(dto);
		//service.validateAndSave(dto);
	//	service.read();
		
		
		ContentCreatorDto dto2=new ContentCreatorDto();
		dto2.setEmail("anjana@gamil2.com");
		dto2.setAmountPaid(800);
		dto2.setContentLength(50);
		dto2.setPage(70);
		dto2.setPassword("Q%^/~hyvv1");
		dto2.setType(ContentType.C02.toString());
		dto2.setContentLength(90);
		dto2.setUserName("anjana");
		dto2.setWebsite("javatpoint");
		
		service.validateAndSave(dto);
		//service.validateAndSave(dto1);
		service.validateAndSave(dto2);
	//	service.read();
		
		

		String email="sahana@gmail.com";
		ContentCreatorDto dto1=new ContentCreatorDto();
		dto1.setEmail("ruchita@gamil2.com");
//		dto1.setAmountPaid(900);
//		dto1.setContentLength(60);
//		dto1.setPage(40);
//		dto1.setPassword("S%^/~hyvv1");
//		dto1.setType(ContentType.C02.toString());
//		dto1.setContentLength(40);
//		dto1.setUserName("ruchita");
//		dto1.setWebsite("javacode");
		service.update(email, dto1);
		//service.validateAndSave(dto1);
	//service.readByWebsite();
	//service.readByContentType();
		service.read();
	}

}
