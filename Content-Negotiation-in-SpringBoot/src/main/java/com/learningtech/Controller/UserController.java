package com.learningtech.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.learningtech.dto.UserTo;
import com.learningtech.service.IUserService;
import com.learningtech.util.GenericResponse;

@RestController
@RequestMapping("api/user")
public class UserController{
	
	@Autowired
	private IUserService service;
	
	@GetMapping("get")
	public String get() {
		return "Hii";
	}
	
	@PostMapping("register")
	public ResponseEntity<GenericResponse> createDept(@RequestBody UserTo userTo){
		return BaseController.setResponse(service.createUser(userTo));
	}
	
//	@PutMapping("updateDept/{deptId}")
//	public ResponseEntity<GenericResponse> updateDept(@RequestBody DepartmentVo department,@PathVariable String deptId){
//		return BaseController.setResponse(deptService.updateDept(department,deptId));
//	}
//	
//	@PutMapping("updateDeptStatus/{deptId}/{status}")
//	public ResponseEntity<GenericResponse> updateDeptStatus(@PathVariable String deptId, @PathVariable Boolean status){
//		return BaseController.setResponse(deptService.updateDeptStatus(deptId, status));
//		
//	}
//	

	@GetMapping("getallUser")
	public ResponseEntity<GenericResponse> getAll(){
		return BaseController.setResponse(service.getAll());
	}
//	@GetMapping("getallDept/{pageSize}/{pageNo}")
//	public ResponseEntity<GenericResponse> getAll(@PathVariable Integer pageNo, @PathVariable Integer pageSize){
//		return BaseController.setResponse(deptService.getAll(pageNo,pageSize));
//	}
//	
//	@DeleteMapping("deleteDept/{deptId}")
//	public ResponseEntity<GenericResponse> deleteDept(@PathVariable String deptId){
//		return BaseController.setResponse(deptService.deleteDept(deptId));
//	}

}
