package com.goshala.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.goshala.dto.User;
import com.goshala.dto.UserResponseListDTO;
import com.goshala.service.impl.GoshalaServiceImpl;

@RestController
@CrossOrigin
public class GoshalaController {
	
	@Autowired
	private GoshalaServiceImpl goshalaServiceImpl;
	
	@RequestMapping(value ="/saveEntity" ,method = RequestMethod.POST)
	public boolean SaveEntity(@RequestBody User user) {
		return goshalaServiceImpl.SaveEntity(user);
	}

	
	@RequestMapping(value = "/getAll",method = RequestMethod.GET)
	public ResponseEntity<UserResponseListDTO> findAllEntity() {
		UserResponseListDTO userResponseListDTO=new UserResponseListDTO();
		userResponseListDTO.setUserList(goshalaServiceImpl.findAllEntity());
		return new ResponseEntity<UserResponseListDTO>(userResponseListDTO,HttpStatus.OK);
	}
	
	@RequestMapping(value = "/deleteEntity", method = RequestMethod.POST)
	public String deleteEntity(@RequestBody User user) {
		return goshalaServiceImpl.deleteEntity(user.getUserId());
	}
}
