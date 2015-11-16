package com.guestdriven.dal.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "pms_details")
/**
 * PmsDetails
 * 
 *Entity class fot table Pms_details
 * 
 * @author dheeraj
 * 
 */
public class PmsDetails {
	@Id
	@Column(name = "hotel_code")
	private String hotelCode;
	@Column(name = "pms_name")
	private String pmsName;
	@Column(name = "pms_url")
	private String pmsUrl;
	@Column(name = "email_id")
	private String pmsEmailId;

	public String getHotelCode() {
		return hotelCode;
	}

	public void setHotelCode(String hotelCode) {
		this.hotelCode = hotelCode;
	}

	public String getPmsName() {
		return pmsName;
	}

	public void setPmsName(String pmsName) {
		this.pmsName = pmsName;
	}

	public String getPmsUrl() {
		return pmsUrl;
	}

	public void setPmsUrl(String pmsUrl) {
		this.pmsUrl = pmsUrl;
	}

	public String getPmsEmailId() {
		return pmsEmailId;
	}

	public void setPmsEmailId(String pmsEmailId) {
		this.pmsEmailId = pmsEmailId;
	}

}
