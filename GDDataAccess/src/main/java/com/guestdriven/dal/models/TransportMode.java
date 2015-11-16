package com.guestdriven.dal.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "transport_mode")
/**
 * TransportMode
 * 
 *Entity class fot table transport_mode
 * 
 * @author dheeraj
 * 
 */
public class TransportMode {
	@Id
	@GeneratedValue
	@Column(name = "t_id")
	private int transId;
	@Column(name = "mode")
	private String transMode;
	public int getTransId() {
		return transId;
	}
	public void setTransId(int transId) {
		this.transId = transId;
	}
	public String getTransMode() {
		return transMode;
	}
	public void setTransMode(String transMode) {
		this.transMode = transMode;
	}
}
