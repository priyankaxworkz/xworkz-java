package com.xworkz.voterid.runner;

import com.xworkz.voterid.dto.VoterIdDto;
import com.xworkz.voterid.repository.VoterIdRepository;
import com.xworkz.voterid.repository.VoterIdRepositoryImplementation;
import com.xworkz.voterid.service.VoterIdService;
import com.xworkz.voterid.service.VoterIdServiceImplementation;

public class VoterIdRunner {

	public static void main(String[] args) {
		
		VoterIdDto dto=new VoterIdDto();
		dto.setAddress("heble bhtkal");
		dto.setAdharNumber(966743354332l);
		dto.setAge(20);
		dto.setName("neha");
		
		
		System.out.println(dto.toString());
		
		VoterIdRepository repository=new VoterIdRepositoryImplementation();
		
		VoterIdService service=new VoterIdServiceImplementation(repository);
		
		service.validateAndSave(dto);
		//service.validateAndSave(dto1);
		//service.read();
		
		String name="neha";
		
		VoterIdDto dto1=new VoterIdDto();
//		dto1.setAddress("murdeswara");
//		dto1.setAdharNumber(987654322345l);
//		dto1.setAge(21);
		dto1.setName("vanishri");
		service.update(name, dto1);
		service.read();

		service.delete("vanishri");
		
		//service.validateAndSave(dto1);
		service.read();
	}
}
