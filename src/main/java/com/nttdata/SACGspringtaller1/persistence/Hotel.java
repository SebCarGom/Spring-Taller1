package com.nttdata.SACGspringtaller1.persistence;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "NTTDATA_HOTEL")

public class Hotel {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int hotelId;
	private int hotelFloors;
	private int hotelApartmentsPerFloor;

	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER, mappedBy = "hotel")
	private List<Person> peopleList;

	/**
	 * @return the hotelId
	 */
	public int getHotelId() {
		return hotelId;
	}

	/**
	 * @param hotelId
	 *            the hotelId to set
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
	 * @param hotelFloors
	 *            the hotelFloors to set
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
	 * @param hotelApartmentsPerFloor
	 *            the hotelApartmentsPerFloor to set
	 */
	public void setHotelApartmentsPerFloor(int hotelApartmentsPerFloor) {
		this.hotelApartmentsPerFloor = hotelApartmentsPerFloor;
	}

	/**
	 * @return the personList
	 */
	public List<Person> getPeopleList() {
		return peopleList;
	}

	/**
	 * @param personList
	 *            the personList to set
	 */
	public void setPeopleList(List<Person> peopleList) {
		this.peopleList = peopleList;
	}

}
