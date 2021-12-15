package com.nttdata.SACGspringtaller1.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.nttdata.SACGspringtaller1.persistence.Hotel;
import com.nttdata.SACGspringtaller1.persistence.Person;
import com.nttdata.SACGspringtaller1.services.HotelServiceI;
import com.nttdata.SACGspringtaller1.services.PersonServiceI;

@Controller
@RequestMapping("/home/")
public class HotelController implements HotelControllerI {

	@Autowired
	private HotelServiceI hotelService;

	@Autowired
	private PersonServiceI personService;

	@Override
	@GetMapping
	public String homeHotel() {
		return "/home";
	}

	@Override
	@PostMapping("/addHotel")
	public String addHotel(Hotel hotel) {

		String viewResult = "errorsV";

		hotel = hotelService.addHotel(hotel);

		if (hotel != null) {
			viewResult = "/home";
		}

		return viewResult;
	}

	@Override
	@PostMapping("/addPerson")
	public String addPerson(Person person) {

		String viewResult = "errorsV";

		person = personService.addNewPerson(person);
		;

		if (person != null) {
			viewResult = "/home";
		}

		return viewResult;
	}

	@Override
	@GetMapping("/showPeople")
	public String showPeople(Model model) {
		final String viewResult = "peopleListView";

		final List<Person> results = personService.showPeople();

		model.addAttribute("peopleList", results);

		return viewResult;
	}

	@Override
	@PostMapping("/findByName")
	public String findByName(String personName, Model model) {
		final String viewResult = "personFullNameView";

		final List<Person> result = personService.getPersonByName(personName);

		model.addAttribute("peopleFullName", result);

		return viewResult;
	}

	@Override
	@PostMapping("/findBySurname")
	public String findBySurname(String personSurname, Model model) {
		final String viewResult = "personFullNameView";

		final List<Person> result = personService.getPersonBySurname(personSurname);

		model.addAttribute("peopleFullName", result);

		return viewResult;
	}

}
