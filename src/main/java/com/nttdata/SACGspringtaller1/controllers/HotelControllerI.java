package com.nttdata.SACGspringtaller1.controllers;

import org.springframework.ui.Model;

import com.nttdata.SACGspringtaller1.persistence.Hotel;
import com.nttdata.SACGspringtaller1.persistence.Person;

public interface HotelControllerI {

	public String homeHotel();

	public String addHotel(final Hotel hotel);

	public String addPerson(final Person person);

	public String showPeople(Model model);

	public String findByName(final String personName, Model model);

	public String findBySurname(final String personSurname, Model model);
}
