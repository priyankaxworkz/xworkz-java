package com.xworkz.contentcreator.service;

import com.xworkz.contentcreator.repository.ContentCreatorRepository;
import com.xxworkz.contentcreator.dto.ContentCreatorDto;

public class ContentCreatorServiceImplementation implements ContentCreatorService{

	
	private ContentCreatorRepository contentCreatorRepository;
	public ContentCreatorServiceImplementation(ContentCreatorRepository contentCreatorRepository){
		this.contentCreatorRepository=contentCreatorRepository;
	}
	
	boolean validateUserName=true;
	boolean validatePassword=true;
	boolean validateEmail=true;
	boolean validateWebsite=true;
	boolean validatePage=true;
	boolean validateLength=true;
	boolean validateAmountPaid=true;
	@Override
	public boolean validateAndSave(ContentCreatorDto contentCreatorDto) {
		System.out.println("validation and save method");
		System.out.println("contentCreatorDto:"+contentCreatorDto);
		if(contentCreatorDto==null) {
			System.out.println("dto is null");
		}
		else {
			if(contentCreatorDto.getUserName().isEmpty()
					||contentCreatorDto.getUserName().isBlank()
					||contentCreatorDto.getEmail()==null
					||contentCreatorDto.getUserName().length()<2) {
				System.out.println("check the userName");
				validateUserName=false;
			}
			
			if(contentCreatorDto.getPassword().isEmpty()
					||contentCreatorDto.getPassword().isBlank()
					||contentCreatorDto.getPassword()==null
					||(contentCreatorDto.getPassword().length()<8 && contentCreatorDto.getPassword().length()>16)
					||contentCreatorDto.getPassword().contains("A-Z")
					||contentCreatorDto.getPassword().contains("%,^,/,~")) {
				System.out.println("check the password");
				validatePassword=false;
			}
			
			if(contentCreatorDto.getEmail().isEmpty()
					||contentCreatorDto.getEmail().isBlank()
					||contentCreatorDto.getEmail()==null
					||!contentCreatorDto.getEmail().contains("@")
					||contentCreatorDto.getEmail().length()<3) {
				System.out.println("check the email");
				validateEmail=false;
			}
			if(contentCreatorDto.getWebsite().isEmpty()
					||contentCreatorDto.getWebsite().isBlank()
					||contentCreatorDto.getWebsite()==null) {
				System.out.println("check the website");
				validateWebsite=false;
			}
			
			if(contentCreatorDto.getPage()<1) {
				System.out.println("check the page");
				validatePage=false;
			}
			
			if(contentCreatorDto.getContentLength()<30&& contentCreatorDto.getContentLength()>100) {
				System.out.println("check the length");
				validateLength=false;
			}
			
			if(contentCreatorDto.getAmountPaid()<100&&contentCreatorDto.getAmountPaid()>1000) {
				System.out.println("check the amount paid");
				validateAmountPaid=false;
			}
			
			if(validateUserName&&validatePassword&&validateEmail&&validateWebsite&&validatePage&&validateLength
					&&validateAmountPaid) {
				System.out.println("validation done");
				
				boolean exist=isExisting(contentCreatorDto);
				if(exist!=true) {
					
					boolean save=this.contentCreatorRepository.onSave(contentCreatorDto);
					if(save) {
						System.out.println("saved succesfully");
						return true;
					}else {
						System.out.println("not saved");
						return false;
					}
				}
			else {
				System.out.println("dto is already existed");
				return false;
			}}
		}
		
		return false;
	}
	@Override
	public boolean isExisting(ContentCreatorDto contentCreatorDto) {
		ContentCreatorDto[] dtos=this.contentCreatorRepository.read();
		if(dtos!=null&&contentCreatorDto!=null) {
			for(ContentCreatorDto dto:dtos) {
				if(dto!=null) {
					if(dto.equals(contentCreatorDto)) {
						return true;
				}
				}
			}
		}
		return false;
	}
	@Override
	public void read() {
		ContentCreatorDto[] dtos=this.contentCreatorRepository.read();
		for(ContentCreatorDto dto:dtos) {
				System.out.println(dto);
			}
			
		
		
	}
	@Override
	public boolean update(String email, ContentCreatorDto contentCreatorDto) {
		
		boolean update=this.contentCreatorRepository.update(email,contentCreatorDto);
		if(update) {
			System.out.println("updated successfully");
			return true;
		}else {
			System.out.println("not updated");
		}
		return false;
	}
	@Override
	public void readByWebsite() {
		ContentCreatorDto[] dtos=this.contentCreatorRepository.read();
	  for(int i=0;i<dtos.length;i++) {
		  System.out.println(dtos[i]);
	  }
		
	}
	@Override
	public void readByContentType() {
		ContentCreatorDto[] dtos=this.contentCreatorRepository.read();
		for(int i=0;i<dtos.length;i++) {
			System.out.println(dtos[i]);
		}
		
	}
	

}
