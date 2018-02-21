package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.security.oauth2.provider.token.TokenStore;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Employee;
import com.example.demo.service.IempService;

/**
 * @author JThakur
 *
 */
@RestController
public class EmpController {

	@Autowired
	IempService service;
	
/*	@Autowired(required =true)
	TokenStore tokenStore;*/

	/**
	 * @param emp
	 * @return
	 */
	@RequestMapping(value = "/saveEmp", method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<String> saveEmp(@RequestBody Employee emp) {
		service.addemp(emp);
		return new ResponseEntity<String>("sucessfull add user", HttpStatus.ACCEPTED);
	}

	@RequestMapping(value="/loginEmp",method=RequestMethod.GET,consumes=MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<String> loginEmp1(@RequestBody Employee emp){
		//tokenStore.
		return new ResponseEntity<String>("sucessfull login",HttpStatus.ACCEPTED);
	}
	/**
	 * @param email
	 * @return
	 */
	@RequestMapping(value = "/delEmp/email", method = RequestMethod.DELETE, consumes = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<String> deleteEmp(@PathVariable("email") Long email) {
		service.delete(email);
		return new ResponseEntity<String>("Delete emp", HttpStatus.ACCEPTED);
	}

	/**
	 * @param emp
	 * @return
	 */
	@RequestMapping(value = "/updateEmp", method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<String> update(@RequestBody Employee emp) {
		service.update(emp);
		return new ResponseEntity<String>("Update emp ", HttpStatus.ACCEPTED);
	}

	/**
	 * @param emp
	 * @return
	 */
	@RequestMapping(value = "/loginEmp", method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<String> loginEmp(@RequestBody Employee emp) {
		return new ResponseEntity<String>("login sucessfull", HttpStatus.ACCEPTED);
	}
}
