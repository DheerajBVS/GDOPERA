package com.gd.gdpojo;

import java.util.List;

public class ReservationReq {
	HotelRef hotelReference;
	GDKeyTrack keyTrack;
	List<ResvId> reservationID;
	public HotelRef getHotelReference() {
		return hotelReference;
	}
	public void setHotelReference(HotelRef hotelReference) {
		this.hotelReference = hotelReference;
	}
	public GDKeyTrack getKeyTrack() {
		return keyTrack;
	}
	public void setKeyTrack(GDKeyTrack keyTrack) {
		this.keyTrack = keyTrack;
	}
	public List<ResvId> getReservationID() {
		return reservationID;
	}
	public void setReservationID(List<ResvId> reservationID) {
		this.reservationID = reservationID;
	}
	
}
