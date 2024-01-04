package com.xworkz.contentcreator.repository;

import com.xxworkz.contentcreator.dto.ContentCreatorDto;

public class ContentCreatorRepositoryImplementation implements ContentCreatorRepository {

	
	private ContentCreatorDto[] dtos=new ContentCreatorDto[2];
	private int index=0;
	@Override
	public boolean onSave(ContentCreatorDto contentCreatorDto) {
		
	if(index<this.dtos.length) {
		dtos[this.index]=contentCreatorDto;
		this.index++;
		System.out.println("saved method");
		return true;
	}
		return false;
	}
	@Override
	public ContentCreatorDto[] read() {
		return dtos;
	}
	@Override
	public boolean update(String email, ContentCreatorDto contentCreatorDto) {
		for(int i=0;i<this.dtos.length;i++) {
			if(this.dtos[i]!=null) {
				if(this.dtos[i].getEmail().equals(email)) {
					this.dtos[i]=contentCreatorDto;
					return true;
				}
			}
		}
		return false;
	}
	
	

}
