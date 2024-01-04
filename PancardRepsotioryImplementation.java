package com.xworkz.pancard.repository;

import com.xworkz.pancard.dto.PancardDto;

public class PancardRepsotioryImplementation implements PanCardRepository{

	private PancardDto[] dtos=new PancardDto[2];
	private int index=0;
	@Override
	public boolean onSave(PancardDto pancardDto) {
		if(index<this.dtos.length) {
			dtos[this.index]=pancardDto;
			this.index++;
			System.out.println("saved method");
			return true;
		}
		return false;
	}
	@Override
	public PancardDto[] read() {
		return dtos;
	}
	@Override
	public boolean update(String email,PancardDto pancardDto) {
		for(int i=0;i<this.dtos.length;i++) {
			if(this.dtos[i]!=null) {
				if(this.dtos[i].getEmail().equalsIgnoreCase(email)) {
					this.dtos[i]=pancardDto;
					return true;
				}
			}
		}
		return false;
	}
	@Override
	public boolean delete(String email) {
		if(email!=null) {
		for(int i=0;i<this.dtos.length;i++) {
		if(this.dtos[i]!=null) {
				if(this.dtos[i].getEmail().equals(email)) {
					this.dtos[i]=null;
					return true;
				}
			}
		}
		}
		return false;
	}
	

}
