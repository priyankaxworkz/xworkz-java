package com.xworkz.games.runner;

import com.xworkz.games.repository.IndoorGamesRepository;
import com.xworkz.games.repository.IndoorGamesRepositoryImplementation;
import com.xworkz.games.service.IndoorGameServiceImplementation;
import com.xworkz.games.service.IndoorGamesService;

public class IndoorGamesRunner {
	public static void main(String[] args) {
		
		IndoorGamesRepository repository=new IndoorGamesRepositoryImplementation();
		
		IndoorGamesService service=new IndoorGameServiceImplementation(repository);
		
		service.validateAndSave("chess");
		service.validateAndSave("carrom");
		service.validateAndSave("luddo");
		service.validateAndSave("tt");
		service.validateAndSave("card games");
		service.validateAndSave("puzzle");
		service.validateAndSave("board games");
		service.validateAndSave("online games");
		service.validateAndSave("guessing games");
		service.validateAndSave("role play games");
	
		service.read();
		
		String oldName="tt";
		String newName="stratergy game";
		
		service.update(oldName,newName);
		
		service.delete("online games");
		service.read();
	}

}
