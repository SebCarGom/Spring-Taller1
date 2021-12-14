package com.nttdata.SACGspringtaller1.services;

import org.springframework.stereotype.Service;

import com.nttdata.SACGspringtaller1.persistence.Hotel;
import com.nttdata.SACGspringtaller1.persistence.HotelRespositoryI;

@Service
public class HotelServiceImpl implements HotelServiceI {

	private HotelRespositoryI hotelRepositoryI;
	
	@Override
	public void addHotel(Hotel newHotel) {
		hotelRepositoryI.save(newHotel);
	}

}
