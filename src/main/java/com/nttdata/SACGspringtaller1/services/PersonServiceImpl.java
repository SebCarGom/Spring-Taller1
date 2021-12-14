package com.nttdata.SACGspringtaller1.services;

import java.util.List;

import com.nttdata.SACGspringtaller1.persistence.Person;
import com.nttdata.SACGspringtaller1.persistence.PersonRepositoryI;

public class PersonServiceImpl implements PersonServiceI{
	
	private PersonRepositoryI personRepositoryI;

	@Override
	public void addNewPerson(Person newPerson) {
		personRepositoryI.save(newPerson);
		
	}

	@Override
	public List<Person> showPeople() {
		return personRepositoryI.findAll();
	}

	@Override
	public Person getPersonByName(String personName) {
		return personRepositoryI.findByName(personName);
	}

	@Override
	public Person getPersonBySurname(String personSurname) {
		return personRepositoryI.findBySurname(personSurname);
	}

}
