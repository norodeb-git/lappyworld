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
	
	
	
	@RequestMapping(value = "/home", method = RequestMethod.GET)
	public String HomePage (){
		return "Home Page";
	}
	
	@RequestMapping(value = "/errorpage", method = RequestMethod.GET)
	public ResponseEntity<String> ErrorPage (){
		return new ResponseEntity<>(HttpStatus.NOT_FOUND);
	}
}