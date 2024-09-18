package com.vickee.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.vickee.model.Register;
import com.vickee.repository.RegisterRepo;
import com.vickee.service.EmailService1;
import com.vickee.service.RegisterService;

@RestController
@RequestMapping("/addregister")
@CrossOrigin("*")
public class RegisterController {
	
	@Autowired
	RegisterService service;
	
	@Autowired
	RegisterRepo repo;
	
	@Autowired
	EmailService1 emailService1;
	
	@PostMapping
	public void addRegister(@RequestBody Register register) {
		service.addRegister(register);
	}
	
	@PostMapping("/login")
	public Register login(@RequestBody Register register) {
		return service.login(register);
	}
	
	@GetMapping("/{id}")
    public Register getRegisterById(@PathVariable("id") Long regid) {
        return service.getRegisterById(regid);
    }
	
    @GetMapping("/sendEmails")
    public String sendEmails() {
        List<Register> users = repo.findAll();
        for (Register user : users) {
            emailService1.sendConfirmationEmail(user.getEmail(), user.getUsername(),null);
        }
        return "Emails sent successfully!";
    }
}
