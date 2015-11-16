package com.guestdriven.dal.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.guestdriven.dal.models.PmsDetails;

@Repository
/**
 * PmsRepository
 * 
 *JPA repository 
 * 
 * @author dheeraj
 * 
 */
public interface PmsRepository extends CrudRepository<PmsDetails, Integer> {
	public PmsDetails findByHotelCode(String hotelCode);
}
