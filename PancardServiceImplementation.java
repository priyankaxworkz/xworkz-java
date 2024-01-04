package com.xworkz.pancard.service;

import com.xworkz.pancard.dto.PancardDto;
import com.xworkz.pancard.repository.PanCardRepository;

public class PancardServiceImplementation implements PanCardService {

	private PanCardRepository panCardRepository;
	
	public PancardServiceImplementation(PanCardRepository panCardRepository) {
		this.panCardRepository=panCardRepository;
	}
	
	boolean validateUserName=true;
	boolean validateAdharNumber=true;
	boolean validateEmail=true;
	boolean validateContactNumber=true;
	boolean validateAddress=true;
	boolean validatePanNumber=true;
	boolean validatePassword=true;
	@Override
	public boolean validateAndSave(PancardDto pancardDto) {
		System.out.println("validtae an save method");
		System.out.println("pancardDto:"+pancardDto);
		if(pancardDto==null) {
		System.out.println("dto is null");
		}else {
		
		if(pancardDto.getUserName().isEmpty()||pancardDto.getUserName().isBlank()||
				pancardDto.getUserName()==null||pancardDto.getUserName().length()<2) {
			System.out.println("give the correct name");
			validateUserName= false;
		}
		
		
		long adharNumber=pancardDto.getAdharNumber();
		int count1=0;
		while(adharNumber>0) {
			adharNumber=adharNumber/10;
			count1++;
		}
		if(count1!=12) {
			System.out.println("adhar number not contain 12 digit");
			return false;
		}
		
		if(pancardDto.getEmail().isEmpty()
				||pancardDto.getEmail().isBlank()
				||pancardDto.getEmail()==null
				||(!pancardDto.getEmail().contains("@"))
				||pancardDto.getEmail().length()<2) {
			System.out.println("check the email");
			validateEmail=false;
		}
		
		long contact=pancardDto.getCotactNumber();
		int count=0;
		while(contact>0) {
			contact=contact/10;
			count++;
		}
		if(count!=10) {
			System.out.println("contact number not contain 10 digit");
			return false;
		}
		
		
     if(pancardDto.getPresentAddress().isEmpty()||
				pancardDto.getPresentAddress().isBlank()
				||pancardDto.getPresentAddress()==null
				||pancardDto.getPresentAddress().length()<5) {
			System.out.println("check the present address");
			validateAddress=false;
		}
		
		if(pancardDto.getPanNumber().isEmpty()
				||pancardDto.getPanNumber().isBlank()
				||pancardDto.getPanNumber()==null
				||pancardDto.getPanNumber().length()!=10
			
				) {
			System.out.println(" check the pan number");
			validatePanNumber=false;
			}
		
		char firstLetter=pancardDto.getPanNumber().charAt(0);
		if(!(Character.isUpperCase(firstLetter))) {
			System.out.println("pan first number is capital");
			return false;
		}
		
		char secondLetter=pancardDto.getPanNumber().charAt(1);
		if(!(Character.isLowerCase(secondLetter))) {
			System.out.println("pancard second letter is small");
			return false;
		}
		
		//last number should be digit
		
		char lastNumber=pancardDto.getPanNumber().charAt(9);
		if(!(Character.isDigit(lastNumber))) {
			System.out.println("last number should not be digit");
			return false;
		}
		if(pancardDto.getPassword().isEmpty()
				||pancardDto.getPassword().isBlank()
				||pancardDto.getPassword()==null
				||(pancardDto.getPassword().length()<8
						&&pancardDto.getPassword().length()>16)
				//||pancardDto.getPassword().endsWith("")
				||pancardDto.getPassword().startsWith("A-Z")
				||pancardDto.getPassword().contains("@,#,&,*")){
			System.out.println("check the password");
			validatePassword=false;
		}
		
		if(validateUserName&&validateAdharNumber&&validateEmail&&validateContactNumber&&validateAddress&&validatePanNumber
				&&validatePassword) {
			System.out.println("validation done");
			
		
		boolean exist=isExists(pancardDto);
		if(exist!=true) {
		
		boolean save=this.panCardRepository.onSave(pancardDto);
		if(save) {
			System.out.println("saved successfully");
			return true;
		}else {
			System.out.println("not saved");
			return false;
		}
		
		}else {
			System.out.println("dto alredy existed");
		}
		}
		}
	
		return false;
		
	
	}
	@Override
	public boolean isExists(PancardDto pancardDto) {
		PancardDto[] dtos= this.panCardRepository.read();
		if(dtos!=null&&pancardDto!=null) {
			for(PancardDto dto:dtos) {
				if(dto!=null) {
					if(dto.equals(pancardDto)) {
						return true;
					}
				}
			}
		}
	
		return false;
	}
	@Override
	public void read() {
		PancardDto[] dtos=this.panCardRepository.read();
		for(PancardDto dto:dtos) {
			System.out.println(dto);
		}
		
	}
	@Override
	public boolean update(String email,PancardDto pancardDto) {
		
		boolean update=this.panCardRepository.update(email, pancardDto);
		if(update) {
			System.out.println("updated successfully");
              return true;
              }else {
            	  System.out.println("not updated");
              }
		return false;
	}
	@Override
	public boolean delete(String email) {
		
	boolean delete=this.panCardRepository.delete(email);
		if(delete) {
			System.out.println("deleted succesfully");
			return true;
		}else {
			System.out.println("not deleted");
		
		}
		
		return false;
	}
}

	
	