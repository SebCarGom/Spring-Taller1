package com.nttdata.SACGspringtaller1.persistence;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface HotelRepositoryI extends JpaRepository<Hotel, Integer> {

}
