package com.xworkz.state.service;

import com.xworkz.state.repository.StateRepository;

public class StateServiceImplementation implements StateService {

	private StateRepository repository;

	public StateServiceImplementation(StateRepository repository) {
		this.repository = repository;
	}

	@Override
	public boolean validateAndSave(String stateNames) {
		if (stateNames.isEmpty() || stateNames.isBlank() || (stateNames.length() < 2 && stateNames.length() > 12)
				|| stateNames == null) {
			System.out.println("give the correct name");
		} else {
			boolean exist = isExists(stateNames);
			if (exist != true) {

				boolean save = repository.onSave(stateNames);
				if (save) {
					System.out.println("added successfully");
					return true;
				} else {
					System.out.println("not added successfully");
					return false;
				}
			} else {
				System.out.println(" state names already exists");
				return false;
			}
		}
		return false;
	}

	@Override
	public boolean isExists(String stateNames) {
		String[] name = repository.read();
		if (name != null && stateNames != null) {
			for (String names : name) {
				if (names != null) {
					if (names.equals(stateNames)) {
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
			System.out.println("not null");

			boolean oldValueCheck = isExists(oldName);
//			boolean newValueCheck = isExists(newName);
//			System.out.println("new value check:" + newName);
			if (oldValueCheck != false) {
				System.out.println("old value checked");

				boolean check = repository.update(oldName, newName);
				if (check == true) {
					System.out.println("updated successfully");
					return true;
				} else {
					System.out.println("not updated");
				}
			} else {
				System.out.println("old name not checked");
			}
		}
		return false;
	}

	@Override
	public void read() {
		String[] read = repository.read();
		for (String name : read) {
			System.out.println(name);

		}

	}

	@Override
	public boolean delete(String stateNames) {
		if (stateNames != null) {
			boolean delete = repository.delete(stateNames);
			if (delete) {
				System.out.println("deleted state name successfully");
			} else {
				System.out.println("not deleted");
			}
		} else {
			System.out.println("state name is null");
		}
		return false;

	}
}
