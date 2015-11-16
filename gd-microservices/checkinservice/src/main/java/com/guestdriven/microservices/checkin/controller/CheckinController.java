package com.guestdriven.microservices.checkin.controller;

import static javax.ws.rs.core.MediaType.APPLICATION_JSON;

import javax.ws.rs.Consumes;
import javax.ws.rs.Produces;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindException;
import org.springframework.validation.ObjectError;
import org.springframework.validation.ValidationUtils;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.gd.gdpojo.CheckInReq;
import com.gd.gdpojo.CheckInResp;
import com.gd.gdvalidator.ValidateCheckIn;
import com.gddecorator.MySqlDecorator;
import com.guestdriven.core.microservices.model.DELMessage;
import com.guestdriven.core.microservices.model.DELMessageAcknowledgement;
import com.guestdriven.core.util.ServiceUtils;
import com.guestdriven.dal.models.PmsDetails;
import com.guestdrivenopera.bridge.GDOperaCheckInBridge;

/**
 * Checkin controller
 * 
 * Recieves the request from GD and uses PMS-Bridge API to transform the request
 * into SOAP request, to transform the Opera response to GD specific response
 * 
 * @authors gurrams,dheeraj
 * 
 */

@Produces(APPLICATION_JSON)
@Consumes(APPLICATION_JSON)
@RestController
public class CheckinController {

	private static final Logger LOG = LoggerFactory
			.getLogger(CheckinController.class);

	@Autowired
	ServiceUtils util;
	String jSONString;

	@RequestMapping(value = "/", method = RequestMethod.POST)
	public ResponseEntity<DELMessageAcknowledgement> checkin(
			@RequestBody DELMessage message) {
		
		LOG.info("CheckinController.checkin() -> Start");
		LOG.info("CheckinController.checkin()-> DelMessage = {}",
				message.getPayload());
		
		//Class that implements Spring Validtor interface, methods to convert JSON to Java Object and vice versa
		ValidateCheckIn checkInValidator = new ValidateCheckIn();
		
		// Call to a method that converts a JSON object to Java Object
		CheckInReq checkInReq = checkInValidator.convertToObject(message);
		
		//object that holds validation errors, if exists
		BindException errors = new BindException(checkInReq,
				CheckInReq.class.getName());
		
		//Invoking Validator
		ValidationUtils.invokeValidator(checkInValidator, checkInReq, errors);
		
		if (errors.hasErrors()) {
		//If validation errors are there, then the following code executes
			LOG.info("Errors: " + errors.getErrorCount());
			for (ObjectError error : errors.getAllErrors()) {
				LOG.info(error.getDefaultMessage());
			}
			
			//returns Message Acknowledgement that the request has validation errors
			return util.createOkResponse(new DELMessageAcknowledgement(message
					.getId(), "Received with Validation Errors", message
					.getPayload().toString()));
		}
		
		//Object that acts as  a mediator between the microservice and database access logic
		MySqlDecorator decorator = new MySqlDecorator();

		// Object that will be used to get the PMS related details like PMS_URL etc
		PmsDetails pmsDetails = decorator.getPmsDetails(checkInReq
				.getReservationRequest().getHotelReference().getHotelCode());
       
		//Object that bridges the GD specific request/response <--> opera specific request/response
		GDOperaCheckInBridge checkInBridge = new GDOperaCheckInBridge();
		
		//call for the GD-Opera bridge methods 
		CheckInResp checkInResp = checkInBridge.checkInSoapCall(checkInReq,
				pmsDetails.getPmsUrl());
		
		// the response string
		jSONString = checkInValidator.convertToJSON(checkInResp);
		
		// returns a succesfull response
		return util.createOkResponse(new DELMessageAcknowledgement(message
				.getId(), "Response is received", jSONString));
	}
}