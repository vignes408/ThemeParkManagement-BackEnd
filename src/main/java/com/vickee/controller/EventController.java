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

import com.vickee.model.Events;
import com.vickee.service.EventService;

@RestController
@RequestMapping("/events")
@CrossOrigin("*")
public class EventController {
	
	@Autowired
	EventService service;
	
	@PostMapping
	public String addEvents(
			@RequestParam("eventname") String eventname,
			@RequestParam("description")String description,
			@RequestParam("eventimage") MultipartFile eventimage){
				String msg="";
				try {
					byte[] imageBytes = eventimage.getBytes();
					Events events = new Events();
					events.setEventname(eventname);
					events.setDescription(description);
					events.setEventimage(imageBytes);
					service.addEvents(events);
					msg="success";
				}
				catch(Exception e) {
					e.printStackTrace();
					msg="failure";
				}
				return msg;
			}
	@GetMapping("/allEvents")
	public List<Events> getAllEvents() {
		return service.getAllEvents();
	}
}
