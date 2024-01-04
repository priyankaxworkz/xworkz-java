package com.xworkz.voterid.repository;

import com.xworkz.voterid.dto.VoterIdDto;

public interface VoterIdRepository {

	boolean Onsave(VoterIdDto voterIdDto);
	
	VoterIdDto[] read();

	boolean update(String name, VoterIdDto dto1);

	boolean delete(String name);
}
