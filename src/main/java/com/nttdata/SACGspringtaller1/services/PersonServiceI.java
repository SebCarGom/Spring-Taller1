package com.nttdata.SACGspringtaller1.services;

import java.util.List;

import com.nttdata.SACGspringtaller1.persistence.Person;

public interface PersonServiceI {
	
	public void addNewPerson (final Person newPerson);
	
	public List<Person> showPeople();
	
	public Person getPersonByName(String personName);
	
	public Person getPersonBySurname(String personSurname);
}
