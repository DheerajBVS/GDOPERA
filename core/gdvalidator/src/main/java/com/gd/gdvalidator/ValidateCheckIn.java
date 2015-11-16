package com.gd.gdvalidator;

import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

import com.gd.gdpojo.CheckInReq;
import com.gd.gdpojo.CheckInResp;
import com.google.gson.Gson;
import com.guestdriven.core.microservices.model.DELMessage;

/**
 * ValidateCheckIn
 * 
 * CheckIn  Micro-Service client side validation logic and JSON-Java,Java-JSON objects
 * conversion logic
 *
 * @author dheeraj
 * 
 */
public class ValidateCheckIn implements Validator  {

	@Override
	//Specifies which Object the validation is supported
	public boolean supports(Class clazz) {
		
		return clazz.equals(CheckInReq.class);
	}

	@Override
	//Validation Logic
	public void validate(Object obj, Errors e) {
		CheckInReq checkInReq=(CheckInReq)obj;
		if(checkInReq.getReservationRequest().getHotelReference().getHotelCode()==null)
		{
			e.reject("HotelCode.Empty", "Hotel Code cannot be empty");
		}
		if(checkInReq.getReservationRequest().getKeyTrack().getKeyTrack1()==null)
		{
			e.reject("KeyTrack1.Empty", "Key Track1 cannot be empty");
		}
	}
	//JSON to java Object
	public CheckInReq convertToObject(DELMessage delMessage)
	{
		Gson gson=new Gson();
		CheckInReq checkInReq=gson.fromJson(delMessage.getPayload().toString(),CheckInReq.class);
		return checkInReq;
	}
	//Java object to JSON
	public String convertToJSON(CheckInResp checkInResp)
	{
		Gson gson=new Gson();
		return gson.toJson(checkInResp);
	}
}
