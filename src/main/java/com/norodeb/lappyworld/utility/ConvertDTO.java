package com.norodeb.lappyworld.utility;

import org.springframework.stereotype.Service;

import com.norodeb.lappyworld.dto.LappyDTORequest;
import com.norodeb.lappyworld.entity.Lappy;

@Service
public class ConvertDTO {
	
	public Lappy getConvertedObject(LappyDTORequest lappyDTO) {
		
		Lappy lappy = new Lappy();
		lappy.setBrand(lappyDTO.getBrand());
		lappy.setColor(lappyDTO.getColor());
		lappy.setMemorySize(lappyDTO.getMemorySize());
		lappy.setModelName(lappyDTO.getModelName());
		lappy.setProcessor(lappyDTO.getProcessor());
		lappy.setRam(lappyDTO.getRam());
		lappy.setScreenSize(lappyDTO.getScreenSize());
		
		return lappy;
	}

}
