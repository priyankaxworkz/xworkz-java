package com.xworkz.voterid.service;

import com.xworkz.voterid.dto.VoterIdDto;

public interface VoterIdService {
	
	boolean validateAndSave(VoterIdDto voterIdDto);
	
	boolean isExists(VoterIdDto voterIdDto );
	
	void read();

	boolean update(String name, VoterIdDto dto1);
	
	boolean delete(String name);

}
