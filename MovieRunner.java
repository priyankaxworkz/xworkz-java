package com.xworkz.movie.runner;

import com.xworkz.movie.repository.MovieRepository;
import com.xworkz.movie.repository.MovieRepositoryImplemetation;
import com.xworkz.movie.service.MovieService;
import com.xworkz.movie.service.MovieServiceImplementation;

public class MovieRunner {

	public static void main(String[] args) {
		
		MovieRepository repository=new MovieRepositoryImplemetation();
		
		MovieService service=new MovieServiceImplementation(repository);
		service.validateAndSave("kgf");
		service.validateAndSave("sse");
		service.validateAndSave("jawan");
		service.validateAndSave("rrr");
		service.validateAndSave("kaiva");
		
		String oldName="kgf";
		String newName="kgf2";
		service.update(oldName,newName);
		repository.read();
	}
}
