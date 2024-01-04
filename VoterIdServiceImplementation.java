package com.xworkz.voterid.service;

import com.xworkz.voterid.dto.VoterIdDto;
import com.xworkz.voterid.repository.VoterIdRepository;

public class VoterIdServiceImplementation implements VoterIdService {

	private VoterIdRepository voterIdRepository;
	public VoterIdServiceImplementation(VoterIdRepository voterIdRepository) {
		this.voterIdRepository=voterIdRepository;
	}
	
	boolean validateAdharNumber=true;
	boolean validateName=true;
	boolean validateAddress=true;
	boolean validateAge=true;
	@Override
	public boolean validateAndSave(VoterIdDto voterIdDto) {
		System.out.println("validate and save method");
		//System.out.println("voterIdDto:"+voterIdDto);
		if(voterIdDto==null) {
			System.out.println("dto is null");
		}else {
			if(voterIdDto.getName().equals("null")
					||voterIdDto.getName()==null
					||voterIdDto.getName().length()<3) {
				System.out.println("check name and length");
				validateName=false;
			}
			if(voterIdDto.getAddress().equals("null")
					||voterIdDto.getAddress()==null
					||(voterIdDto.getAddress().length()<3&&voterIdDto.getAddress().length()>25)) {
				System.out.println("check the null and length of the address");
				validateAddress=false;
			}
			if(voterIdDto.getAge()<=18
					//||voterIdDto.getAge()==18
					||(voterIdDto.getAge()==0
					&&voterIdDto.getAge()!=-1)) {
				System.out.println("check the age");
				validateAge=false;
			}
			
		    long adharNumber=voterIdDto.getAdharNumber();
			int count=0;
			while(adharNumber>0) {
				adharNumber=adharNumber/10;
				count++;
			}
			if(count!=12) {
				System.out.println("adhar number not contains 12");
				return false;
			}
			
			if(validateName&&validateAddress&&validateAge&&validateAdharNumber) {
				System.out.println("validation is done");
				
			boolean exist=isExists(voterIdDto);
			if(exist!=true) {
				
		      boolean save=this.voterIdRepository.Onsave(voterIdDto);
				if(save) {
					System.out.println("saved successfully");
					return true;
				}else {
					System.out.println("not saved");
					return false;
				}
			}else {
					System.out.println("name already existed");
				}
			}
		}
		return false;
	}
	@Override
	public boolean isExists(VoterIdDto voterIdDto) {
		VoterIdDto[] dtos= this.voterIdRepository.read();
		if(dtos!=null&&voterIdDto!=null) {
			for(VoterIdDto dto:dtos) {
				if(dto!=null) {
					if(dto.equals(voterIdDto)) {
						return true;
					}
				}
			}
		}
		return false;
	}
	@Override
	public void read() {
		VoterIdDto[] dtos=this.voterIdRepository.read();
		for(VoterIdDto dto:dtos) {
			System.out.println(dto);
			}
		}
	@Override
	public boolean update(String name, VoterIdDto dto1) {
		
		boolean update=this.voterIdRepository.update(name,dto1);
		if(update) {
			System.out.println("updated successfully");
			return true;
		}else {
			System.out.println("not updated");
		}
		return false;
	}
	@Override
	public boolean delete(String name) {
		if(name!=null) {

			boolean delete=this.voterIdRepository.delete(name);
		if(delete) {
			System.out.println("deleted successfully");
			return true;
		}else {
			System.out.println("not deleted");
			return false;
		}}else {
			System.out.println("not null");
		}
	return false;
	}

}
