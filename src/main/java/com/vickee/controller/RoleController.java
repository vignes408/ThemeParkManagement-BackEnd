package com.vickee.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.vickee.model.Role;
import com.vickee.service.RoleService;

@RestController
@RequestMapping("/role")
@CrossOrigin("*")
public class RoleController {

	@Autowired
	private RoleService service;

	@PostMapping
	public String addRoles(
			@RequestParam("personname") String personname,
			@RequestParam("gender") String gender,
			@RequestParam("rolename") String rolename,
			@RequestParam("description") String description,
			@RequestParam("roleimage") MultipartFile roleimage) {
		String msg="";
		try {
			byte[] imageBytes = roleimage.getBytes();
			Role role = new Role();
			role.setPersonname(personname);
			role.setGender(gender);
			role.setRolename(rolename);
			role.setDescription(description);
			role.setRoleimage(imageBytes);
			service.addRole(role);
			msg="success";
		}
		catch(Exception e) {
			e.printStackTrace();
			msg="failure";
		}
		return msg;
	}

	@GetMapping("/personname")
	public List<String> getAllNames() {
		return service.getAllNames();
	}

	@GetMapping("/allrids")
	public List<Long> getAllRids(){
		return service.fetchAllRids();
	}

	@GetMapping("/allRoles")
	public List<Role> getAllRoles() {
		return service.getAllRoles();
	}
}
