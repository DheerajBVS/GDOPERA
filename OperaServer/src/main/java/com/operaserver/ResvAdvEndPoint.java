package com.operaserver;

import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

import com.micros.webservices.og._4_3.common.KeyTrack;
import com.micros.webservices.og._4_3.common.ResultStatus;
import com.micros.webservices.og._4_3.common.ResultStatusFlag;
import com.micros.webservices.og._4_3.resvadvanced.CheckInComplete;
import com.micros.webservices.og._4_3.resvadvanced.CheckInRequest;
import com.micros.webservices.og._4_3.resvadvanced.CheckInResponse;

@Endpoint
/**
 * ResvAdvEndPoint
 * 
 *EndPoint that serves All Reservation Advanced Functions like CheckIn
 *
 * @author dheeraj
 * 
 */
public class ResvAdvEndPoint {
	private static final String NAMESPACE_URI = "http://webservices.micros.com/og/4.3/ResvAdvanced/";

	@PayloadRoot(namespace = NAMESPACE_URI, localPart = "CheckInRequest")
	@ResponsePayload
	public CheckInResponse checkIn(@RequestPayload CheckInRequest request) {
		CheckInResponse response = new CheckInResponse();
		CheckInComplete checkInComp = new CheckInComplete();
		KeyTrack keyTrack = new KeyTrack();
		keyTrack.setKey1Track("12345678");
		ResultStatus result = new ResultStatus();
		result.setResultStatusFlag(ResultStatusFlag.SUCCESS);
		checkInComp.setKeyTrack(keyTrack);
		response.setCheckInComplete(checkInComp);
		response.setResult(result);
		return response;
	}

}
