package com.norodeb.lappyworld.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping("/lappy")
public class Controller {
	
	@RequestMapping(value = "/addNewLappy", method = RequestMethod.GET)
	public ResponseEntity<String> AddNewLappy (){
		return new ResponseEntity<>("Add feature added",HttpStatus.OK);
	}
	
	@RequestMapping(value = "/getAllLappy", method = RequestMethod.GET)
	public ResponseEntity<String> ViewAllLappy (){
		return new ResponseEntity<>("Add feature added",HttpStatus.OK);
	}
	
	@RequestMapping(value = "/home", method = RequestMethod.GET)
	public String HomePage (){
		return "Home Page";
	}
	
	@RequestMapping(value = "/errorpage", method = RequestMethod.GET)
	public ResponseEntity<String> ErrorPage (){
		return new ResponseEntity<>(HttpStatus.NOT_FOUND);
	}
}
