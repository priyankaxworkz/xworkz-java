package com.xworkz.contentcreator.service;

import com.xxworkz.contentcreator.dto.ContentCreatorDto;

public interface ContentCreatorService {
	
	boolean validateAndSave(ContentCreatorDto contentCreatorDto);
	
    boolean isExisting(ContentCreatorDto contentCreatorDto);
    
    void read();
    
    void readByWebsite();
    
    void readByContentType();
    
    boolean update(String email,ContentCreatorDto contentCreatorDto);

}
