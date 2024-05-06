package com.learningtech.util;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

import lombok.Data;

@Data
@JsonInclude(Include.NON_NULL)
public class GenericResponse {
	
	private Boolean status; 
	private Integer statusCode; 
	private String message;
	private Object data;

}
