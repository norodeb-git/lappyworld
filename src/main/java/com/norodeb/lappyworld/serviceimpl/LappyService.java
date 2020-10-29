package com.norodeb.lappyworld.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.norodeb.lappyworld.dao.LappyDao;
import com.norodeb.lappyworld.dto.LappyDTORequest;
import com.norodeb.lappyworld.entity.Lappy;
import com.norodeb.lappyworld.utility.ConvertDTO;

@Service
public class LappyService {

	@Autowired
	LappyDao lappyDao;
	
	@Autowired
	ConvertDTO convertDTO;
	
	public String addNewLappy(LappyDTORequest newLappy) {
		
		String response = "";
		Lappy lappy = convertDTO.getConvertedObject(newLappy);
		try {
			Lappy result = lappyDao.save(lappy);
			
			if(result != null) {
				response = "New Lappy Added Successfully";
			}
		}catch (Exception e) {
			response = "Exception Occurred: "+e.getMessage();
		}
		return response;
	}

	public List<Lappy> getAllLaptop() {
		String response = "";
		List<Lappy> lappies = null;
		try {
			lappies = (List<Lappy>) lappyDao.findAll();
			
			if(lappies != null) {
				response = "New Lappy Added Successfully";
			}
		}catch (Exception e) {
			response = "Exception Occurred: "+e.getMessage();
		}
		return lappies;
	}
	
}
