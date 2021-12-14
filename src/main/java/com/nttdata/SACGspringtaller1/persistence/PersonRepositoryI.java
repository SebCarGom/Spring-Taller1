package com.nttdata.SACGspringtaller1.persistence;

import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonRepositoryI extends JpaRepository<Person, Integer>{

	public Person findByName(final String nameToSearch);
	
	public Person findBySurname(final String SurnameToSearch);
}
