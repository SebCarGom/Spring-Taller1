package com.nttdata.SACGspringtaller1.persistence;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "NTTDATA_PERSON")

public class Person {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int personId;
	private String personName;
	private String personSurname;
	private Hotel hotel;
	
	/**
	 * @param personId
	 * @param personName
	 * @param personSurname
	 */
	public Person(int personId, String personName, String personSurname) {
		super();
		this.personId = personId;
		this.personName = personName;
		this.personSurname = personSurname;
	}

	/**
	 * @return the personId
	 */
	public int getPersonId() {
		return personId;
	}

	/**
	 * @param personId the personId to set
	 */
	public void setPersonId(int personId) {
		this.personId = personId;
	}

	/**
	 * @return the personName
	 */
	public String getPersonName() {
		return personName;
	}

	/**
	 * @param personName the personName to set
	 */
	public void setPersonName(String personName) {
		this.personName = personName;
	}

	/**
	 * @return the personSurname
	 */
	public String getPersonSurname() {
		return personSurname;
	}

	/**
	 * @param personSurname the personSurname to set
	 */
	public void setPersonSurname(String personSurname) {
		this.personSurname = personSurname;
	}

	/**
	 * @return the hotel
	 */
	public Hotel getHotel() {
		return hotel;
	}

	/**
	 * @param hotel the hotel to set
	 */
	public void setHotel(Hotel hotel) {
		this.hotel = hotel;
	}
		
}
