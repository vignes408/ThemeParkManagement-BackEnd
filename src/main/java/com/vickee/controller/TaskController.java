package com.vickee.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.vickee.model.Tasks;
import com.vickee.service.RoleService;
import com.vickee.service.TaskService;

@RestController
@RequestMapping("/tasks")
@CrossOrigin("*")
public class TaskController {
	
	@Autowired
	TaskService taskservice;
	
	@Autowired
	RoleService roleservice;
	
	@PostMapping
	public void addTasks(@RequestBody Tasks tasks) {
		taskservice.addTasks(tasks);
	}
	@GetMapping("/allTasks")
	public List<Tasks> getAllTasks() {
		return taskservice.getAllTasks();
	}

}
