package com.example.practis.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.practis.Services.DataServices;
import com.example.practis.entity.entitydata;

@RestController
@RequestMapping("/user")
public class DataController {
	@Autowired
	private DataServices dataservices;

	@PostMapping("/add")
	public entitydata usercreate(@RequestBody entitydata entity) {
		return dataservices.addNewUser(entity);
	}

	@GetMapping("/list")
	public List<entitydata> getentitydatahigher() {
		List<entitydata> entitydataList = dataservices.findAllElement();
		return entitydataList;
	}
	@PutMapping("/update/{id}")
	public  entitydata updateentity(@RequestBody entitydata entity)
	{
		return dataservices.updateentity(entity);
	}
	
	@DeleteMapping("/delete/{id}")
		public void deleteentityById(@PathVariable int id)
		{
		dataservices.deleteentityById(id);
		}

}
