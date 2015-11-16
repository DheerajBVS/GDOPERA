package com.guestdriven.dal.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.guestdriven.dal.models.Service;

/**
 * ServiceModeRepository
 * 
 *JPA repository 
 * 
 * @author dheeraj
 * 
 */
@Repository
public interface ServiceModeRepository extends CrudRepository<Service, Integer> {
	public Service findById(int id);
}
