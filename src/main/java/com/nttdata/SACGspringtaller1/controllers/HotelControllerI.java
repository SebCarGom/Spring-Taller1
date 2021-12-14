package com.nttdata.SACGspringtaller1.controllers;

import com.nttdata.SACGspringtaller1.persistence.Hotel;
import com.nttdata.SACGspringtaller1.persistence.Person;

public interface HotelControllerI {

	public String addHotel(final Hotel hotel);
	
	public String showFloors();
	
	public String showApartments();

	public String addPerson(final Person person);
	
	public String showPeople();

	public String showPeopleByName(final String personName);
	
	public String showPeopleBySurname(final String personSurname);
}
