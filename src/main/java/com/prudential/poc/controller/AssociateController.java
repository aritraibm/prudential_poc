package com.prudential.poc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.prudential.poc.entity.Associate;
import com.prudential.poc.repository.AssociateRepo;

@RestController
@RequestMapping(value = "/prudential")
public class AssociateController {
	
	@Autowired
	private AssociateRepo associateRepo;
	
	
	@PostMapping(value = "/save-associate")
	public Associate saveAssociate(@RequestBody Associate formData) {
		
		return associateRepo.save(formData);
	}

}
