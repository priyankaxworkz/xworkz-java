package com.xworkz.contentcreator.repository;

import com.xxworkz.contentcreator.dto.ContentCreatorDto;

public interface ContentCreatorRepository {
	
	boolean onSave(ContentCreatorDto contentCreatorDto);
	
	ContentCreatorDto[] read();

	boolean update(String email, ContentCreatorDto contentCreatorDto);
	

}
