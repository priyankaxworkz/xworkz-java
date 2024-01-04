package com.xworkz.voterid.repository;

import com.xworkz.voterid.dto.VoterIdDto;

public class VoterIdRepositoryImplementation implements VoterIdRepository {

	private VoterIdDto[] dtos=new VoterIdDto[2];
	private int index=0;
	@Override
	public boolean Onsave(VoterIdDto voterIdDto) {
		if(index<this.dtos.length) {
			dtos[this.index]=voterIdDto;
			this.index++;
			System.out.println("added successfully");
			return true;
		}
		return false;
	}
	@Override
	public VoterIdDto[] read() {
	  return dtos;
	}
	@Override
	public boolean update(String name, VoterIdDto dto1) {
		for(int i=0;i<this.dtos.length;i++) {
			if(this.dtos[i]!=null) {
				System.out.println("index:"+i);
				if(this.dtos[i].getName().equals(name)) {
					this.dtos[i]=dto1;
					return true;
				}
			}
		}
		return false;
	}
	@Override
	public boolean delete(String name) {
		for(int i=0;i<this.dtos.length;i++) {
			if(this.dtos[i]!=null) {
				if(this.dtos[i].getName().equals(name)) {
					this.dtos[i]=null;
					return true;
				}
			}
		}
		return false;
	}

}
