package com.norodeb.lappyworld.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.norodeb.lappyworld.dto.LappyDTORequest;
import com.norodeb.lappyworld.serviceimpl.LappyService;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping("/lappy")
public class Controller {
	
	@Autowired
	LappyService service;
	
	@RequestMapping(value = "/addNewLappy", method = RequestMethod.POST)
	public ResponseEntity<String> AddNewLappy (@RequestBody LappyDTORequest newLappy){
		
		String response = service.addNewLappy(newLappy);
		
		return new ResponseEntity<>(response,HttpStatus.OK);
	}
	
	@RequestMapping(value = "/getAllLappy", method = RequestMethod.GET)
	public ResponseEntity<String> ViewAllLappy (){
		return new ResponseEntity<>("Add feature added",HttpStatus.OK);
	}
	
	@RequestMapping(value = "/deleteLappy", method = RequestMethod.DELETE)
	public ResponseEntity<String> DeleteLappy (){
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
