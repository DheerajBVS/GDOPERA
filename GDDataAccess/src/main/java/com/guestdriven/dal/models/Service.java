package com.guestdriven.dal.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "service")
/**
 * Service
 * 
 *Entity class fot table service
 * 
 * @author dheeraj
 * 
 */
public class Service {
	@Id
	@GeneratedValue
	@Column(name = "id")
	private int id;
	@OneToOne
	@JoinColumn(name="transport_id")
	private TransportMode mode;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public TransportMode getMode() {
		return mode;
	}

	public void setMode(TransportMode mode) {
		this.mode = mode;
	}

}
