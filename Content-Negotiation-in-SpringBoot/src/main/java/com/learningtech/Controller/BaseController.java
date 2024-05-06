package com.learningtech.Controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import com.learningtech.util.GenericResponse;

public interface BaseController {
	public static ResponseEntity<GenericResponse> setResponse(GenericResponse resp ){
		return new ResponseEntity<>(resp,HttpStatus.valueOf(resp.getStatusCode()));
	}
}
