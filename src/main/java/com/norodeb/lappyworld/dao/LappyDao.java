package com.norodeb.lappyworld.dao;

import javax.transaction.Transactional;

import org.springframework.data.repository.CrudRepository;

import com.norodeb.lappyworld.entity.Lappy;

@Transactional
public interface LappyDao extends CrudRepository<Lappy, String>{
	
}
