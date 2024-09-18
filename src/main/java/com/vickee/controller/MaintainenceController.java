package com.vickee.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.vickee.model.Maintainence;
import com.vickee.service.MaintainenceService;

@RestController
@RequestMapping("/maintain")
@CrossOrigin("*")
public class MaintainenceController {
	
	@Autowired
	MaintainenceService service;
	
	@PostMapping
	public void addMaintainence(@RequestBody Maintainence maintain) {
    	service.addMaintainence(maintain);
    }
	
	@GetMapping("/allMaintain")
	public List<Maintainence> getAllMaintain(){
		return service.getAllMaintence();
	}
}
