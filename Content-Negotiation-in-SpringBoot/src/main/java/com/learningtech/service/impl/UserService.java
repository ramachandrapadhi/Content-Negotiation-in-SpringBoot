package com.learningtech.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import com.learningtech.dto.UserTo;
import com.learningtech.entity.User;
import com.learningtech.repository.UserRepository;
import com.learningtech.service.IUserService;
import com.learningtech.util.BaseUtil;
import com.learningtech.util.BeanMapperUtils;
import com.learningtech.util.GenericResponse;

@Service
public class UserService implements IUserService{

	@Autowired
	private UserRepository repo;
	
	@Override
	public GenericResponse createUser(UserTo userTo) {
		GenericResponse resp = new GenericResponse();
		User user = new User();
		BeanMapperUtils.copy(userTo, user);
		BaseUtil.created(user);
		user.setUserId(BaseUtil.getId());
		user = repo.save(user);
		BeanMapperUtils.copy(user,userTo);
		
		resp.setStatus(true);
		resp.setMessage("User created successfully");
		resp.setData(userTo.getUserId());
		resp.setStatusCode(HttpStatus.CREATED.value());

		return resp;
	}

	@Override
	public GenericResponse getAll() {
		GenericResponse resp = new GenericResponse();
		List<User> userList = repo.findAll();
		List<UserTo> userToList = BeanMapperUtils.copyList(userList, UserTo.class);
		
		resp.setStatus(true);
		resp.setMessage("User list successfully retrieved");
		resp.setData(userToList);
		resp.setStatusCode(HttpStatus.OK.value());
		
		return resp;
	}

}
