package com.nttdata.SACGspringtaller1.persistence;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PersonRepositoryI extends JpaRepository<Person, Integer> {

	public List<Person> findByPersonName(final String nameToSearch);

	public List<Person> findByPersonSurname(final String SurnameToSearch);
}
