package com.vickee.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.vickee.model.Attraction;
import com.vickee.service.AttractionService;
import com.vickee.service.EmailService1;

@RestController
@RequestMapping("/attract")
@CrossOrigin("*")
public class AttractionController {
	
	@Autowired
	AttractionService service;
	
	@Autowired
	EmailService1 emailService1;
	
	@PostMapping("/addattract")
	public void addAttract(@RequestBody Attraction attract) {
		service.addAttract(attract);
		emailService1.sendConfirmationEmail(attract.getEmail(), attract.getDescription(), null);
	}
}
