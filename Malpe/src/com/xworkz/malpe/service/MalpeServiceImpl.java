package com.xworkz.malpe.service;

import java.util.List;

import com.xworkz.malpe.dto.MalpeDto;
import com.xworkz.malpe.repository.MalpeRepository;

public class MalpeServiceImpl implements MalpeService {

	private  MalpeRepository repository;
	public MalpeServiceImpl(MalpeRepository repository) {
		this.repository=repository;
	}
	@Override
	public boolean validateAndSave(MalpeDto malpeDto) {
		if(malpeDto!=null) {
			System.out.println("dto is not null");
		    boolean exist=isExist(malpeDto);
			if(exist!=true) {
			
			if(repository.onSave(malpeDto)) {
				System.out.println("saved successfully");
				return true;
			}else {
				System.out.println("not saved successfully");
				return false;
			}}else {
				System.out.println("dto is already existed");
			}}else {
				System.out.println("dto is null");
			}
		return false;
	}
	@Override
	public void readAll() {
		List<MalpeDto> dtos=repository.readAll();
		System.out.println("read all:"+dtos);
		}
	@Override
	public boolean isExist(MalpeDto malpeDto) {
		List<MalpeDto> dto=repository.readAll();
   if( dto.contains(malpeDto)) {
	   return true;
   }
   return false;
	}
	
	@Override
	public boolean update(String presidentName, MalpeDto malpeDto) {
		boolean updates=repository.update(presidentName, malpeDto);
		
		if(updates) {
			System.out.println("updated successfully");
			return true;
		}else {
			System.out.println("not updated");
		}
		return false;
	}
//	@Override
//	public boolean delete(MalpeDto malpeDto) {
//		boolean deletes=repository.delete(malpeDto);
//		if(deletes) {
//			System.out.println("deleted succesfully");
//			return true;
//		}else {
//			System.out.println("not deletd");
//		}
//		return false;
//	}
//	

}
