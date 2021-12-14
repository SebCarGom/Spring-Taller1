package com.nttdata.SACGspringtaller1.persistence;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "NTTDATA_HOTEL")

public class Hotel {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int hotelId;
	private int hotelFloors;
	private int hotelApartmentsPerFloor;
	private List<Person> personList;
	
	/**
	 * @return the hotelId
	 */
	public int getHotelId() {
		return hotelId;
	}
	/**
	 * @param hotelId the hotelId to set
	 */
	public void setHotelId(int hotelId) {
		this.hotelId = hotelId;
	}
	/**
	 * @return the hotelFloors
	 */
	public int getHotelFloors() {
		return hotelFloors;
	}
	/**
	 * @param hotelFloors the hotelFloors to set
	 */
	public void setHotelFloors(int hotelFloors) {
		this.hotelFloors = hotelFloors;
	}
	/**
	 * @return the hotelApartmentsPerFloor
	 */
	public int getHotelApartmentsPerFloor() {
		return hotelApartmentsPerFloor;
	}
	/**
	 * @param hotelApartmentsPerFloor the hotelApartmentsPerFloor to set
	 */
	public void setHotelApartmentsPerFloor(int hotelApartmentsPerFloor) {
		this.hotelApartmentsPerFloor = hotelApartmentsPerFloor;
	}
	/**
	 * @return the personList
	 */
	public List<Person> getPersonList() {
		return personList;
	}
	/**
	 * @param personList the personList to set
	 */
	public void setPersonList(List<Person> personList) {
		this.personList = personList;
	}

	
	
}
