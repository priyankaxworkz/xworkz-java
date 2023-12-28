package com.xworkz.games.service;

import com.xworkz.games.repository.IndoorGamesRepository;

public class IndoorGameServiceImplementation implements IndoorGamesService {

	private IndoorGamesRepository repository;

	public IndoorGameServiceImplementation(IndoorGamesRepository repository) {
		this.repository = repository;
	}

	@Override
	public boolean validateAndSave(String gameNames) {
		if (gameNames.isEmpty() || gameNames.isBlank() || (gameNames.length() < 2 && gameNames.length() > 30)
				|| gameNames == null) {
			System.out.println("give the correct name");
		} else {

			boolean exist = isExisting(gameNames);
			if (exist != true) {

				boolean save = repository.onSave(gameNames);
				if (save) {
					System.out.println("saved succesfully");
					return true;
				} else {
					System.out.println("not saved");
					return false;
				}
			} else {
				System.out.println("name already exisited");
				return false;
			}
		}
		return false;
	}

	@Override
	public void read() {
		String[] name = repository.read();
		for (String read : name) {
			System.out.println(read);
		}

	}

	@Override
	public boolean isExisting(String gameNames) {
		String[] name = repository.read();
		if (name != null && gameNames != null) {
			for (String names : name) {
				if (names != null) {
					if (names.equalsIgnoreCase(gameNames)) {
						return true;
					}
				}
			}
		}
		return false;
	}

	@Override
	public boolean update(String oldName, String newName) {
		if (oldName != null && newName != null) {

			boolean oldNameCheck = isExisting(oldName);
			if (oldNameCheck != false) {
				System.out.println("old value is checked");
				boolean newNameCheck=isExisting(newName);
				if(newNameCheck!=false) {
					System.out.println("new name is already exicted");
				}else {
				
             boolean check = repository.update(oldName, newName);
				if (check == true) {
					System.out.println("added successfully");
					return true;
				} else {
					System.out.println("not added");
					return false;
				}
			} }else {
				System.out.println("not checked");
			}
			}
		
		return false;
	}

	@Override
	public boolean delete(String gameNames) {
		if (gameNames != null) {

			boolean delete = repository.delete(gameNames);
			if (delete) {
				System.out.println("deleted succeessfully");

			} else {
				System.out.println("not deleted successfully");

			}
		} else {
			System.out.println("not null");
		}
		return false;
	}

}
