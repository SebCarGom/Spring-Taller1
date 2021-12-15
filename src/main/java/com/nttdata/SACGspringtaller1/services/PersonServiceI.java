package com.nttdata.SACGspringtaller1.services;

import java.util.List;

import com.nttdata.SACGspringtaller1.persistence.Person;

public interface PersonServiceI {

	public Person addNewPerson(final Person newPerson);

	public List<Person> showPeople();

	public List<Person> getPersonByName(String personName);

	public List<Person> getPersonBySurname(String personSurname);
}
