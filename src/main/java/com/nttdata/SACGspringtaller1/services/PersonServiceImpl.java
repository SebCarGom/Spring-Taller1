package com.nttdata.SACGspringtaller1.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nttdata.SACGspringtaller1.persistence.Person;
import com.nttdata.SACGspringtaller1.persistence.PersonRepositoryI;

@Service
public class PersonServiceImpl implements PersonServiceI {

	@Autowired
	private PersonRepositoryI personRepositoryI;

	@Override
	public Person addNewPerson(Person newPerson) {
		personRepositoryI.save(newPerson);

		return newPerson;
	}

	@Override
	public List<Person> showPeople() {
		return personRepositoryI.findAll();
	}

	@Override
	public List<Person> getPersonByName(String personName) {
		return personRepositoryI.findByPersonName(personName);
	}

	@Override
	public List<Person> getPersonBySurname(String personSurname) {
		return personRepositoryI.findByPersonSurname(personSurname);
	}

}
