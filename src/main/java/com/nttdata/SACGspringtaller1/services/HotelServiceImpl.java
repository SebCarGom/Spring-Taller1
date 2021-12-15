package com.nttdata.SACGspringtaller1.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nttdata.SACGspringtaller1.persistence.Hotel;
import com.nttdata.SACGspringtaller1.persistence.HotelRepositoryI;

@Service
public class HotelServiceImpl implements HotelServiceI {

	@Autowired
	private HotelRepositoryI hotelRepositoryI;

	@Override
	public Hotel addHotel(Hotel newHotel) {
		hotelRepositoryI.save(newHotel);

		return newHotel;
	}

}
