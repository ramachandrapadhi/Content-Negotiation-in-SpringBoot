package com.learningtech.service;

import com.learningtech.dto.UserTo;
import com.learningtech.util.GenericResponse;

public interface IUserService {
	
	public GenericResponse createUser(UserTo user);

	public GenericResponse getAll();

}
