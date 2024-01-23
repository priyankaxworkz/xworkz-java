 package com.xworkz.malpe.repository;

import java.util.ArrayList;
import java.util.List;

import com.xworkz.malpe.dto.MalpeDto;

public class MalpeRepositoryImpl implements MalpeRepository{

	List<MalpeDto> listofmalpeDto=new ArrayList<MalpeDto>();
	@Override
	public boolean onSave(MalpeDto malpeDto) {
		System.out.println("list of the dto:"+malpeDto);
		if(listofmalpeDto!=null) {
			System.out.println("dto is not null");
		   listofmalpeDto.add(malpeDto);
		  // listofmalpeDto.set(0, malpeDto);
		   
		   return true;
		}else {
			System.out.println("dto is null");
		}
		return false;
	}
	@Override
	public List<MalpeDto> readAll() {
		System.out.println("reading the dto");
	return listofmalpeDto;
	}
	@Override
	public boolean update(String presidentName, MalpeDto malpeDto) {
		//listofmalpeDto.forEach((s)->System.out.println(s));
		for(MalpeDto dtos:listofmalpeDto) {
		System.out.println(dtos);
		if(dtos.getPresidentName().equalsIgnoreCase(presidentName)) {
			dtos.setPresidentName(malpeDto.getPresidentName());
			return true;
		}
		}
		//listofmalpeDto.set(0,malpeDto);
		return false;
	}
	//@Override
//	public boolean delete(MalpeDto malpeDto) {
//		for(MalpeDto dtos:listofmalpeDto) {
//			System.out.println(dtos);
//			if(dtos.getPresidentName().equals(malpeDto)) {
//				dtos.setPresidentName(malpeDto.getPresidentName());
//				return true;
//			}
//		}
//		return false;
//	}

}
