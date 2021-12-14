package com.nttdata.SACGspringtaller1.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.nttdata.SACGspringtaller1.persistence.Hotel;
import com.nttdata.SACGspringtaller1.persistence.Person;
import com.nttdata.SACGspringtaller1.services.HotelServiceI;
import com.nttdata.SACGspringtaller1.services.PersonServiceI;

@Controller
@RequestMapping("/home/")
public class HotelController implements HotelControllerI{

	@Autowired
	private HotelServiceI hotelService;
	
	@Autowired
	private PersonServiceI personService;
	
	@Override
	@PostMapping("/addHotel")
	public String addHotel(Hotel hotel) {

		final String viewResult = "erroresV";
		
		hotelService.addHotel(hotel);
		
		return viewResult;
		
	}

	@Override
	@GetMapping("/showFloors")
	public String showFloors() {

		final String viewResult = "listaPlantasV";
		
		return viewResult;
	}

	@Override
	@GetMapping("/showApartments")
	public String showApartments() {
		final String viewResult = "listaApartamentosV";
		
		return viewResult;
	}

	@Override
	@PostMapping("/addPerson")
	public String addPerson(Person person) {
		final String viewResult = "erroresV";
		
		personService.addNewPerson(person);;
		
		return viewResult;
	}

	@Override
	@GetMapping("/showPeople")
	public String showPeople() {
		final String viewResult = "listaPersonasV";
		
		personService.showPeople();
		
		return viewResult;
	}

	@Override
	@GetMapping("/showPerson")
	public String showPeopleByName(final String Name) {
		final String viewResult = "PersonaV";
		
		personService.getPersonByName(Name);
		
		return viewResult;
	}

	@Override
	@GetMapping("/showPerson")
	public String showPeopleBySurname(final String personSurname) {
		final String viewResult = "PersonaV";
		
		personService.getPersonBySurname(personSurname);
		
		return viewResult;
	}
	
}
