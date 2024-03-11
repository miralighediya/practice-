package com.example.practis.Services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.practis.Repository.DataRepository;
import com.example.practis.entity.entitydata;

@Service
public class DataServices {

	@Autowired
	private DataRepository dataRepository;
	public List<entitydata> findAllElement;

	
	public entitydata addNewUser(entitydata entity) {
		return dataRepository.save(entity);
	}

	public List<entitydata> findAllElement() {
		return dataRepository.findAll();
	}

	public entitydata updateentity(entitydata entity) {
		return dataRepository.save(entity);
	}

	public void deleteentityById(long id) {
		dataRepository.deleteById(id);
	}

}
