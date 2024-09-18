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

import com.vickee.model.Ride;
import com.vickee.service.RideService;


@RestController
@RequestMapping("/ride")
@CrossOrigin("*")
public class RideController {
	
	@Autowired
	RideService service;
	
	@PostMapping
	public String addRides(
			@RequestParam("ridetype") String ridetype,
			@RequestParam("ridename") String ridename,
			@RequestParam("starttime") String starttime,
			@RequestParam("endtime") String endtime,
			@RequestParam("rideimage") MultipartFile rideimage)
	{
		String msg="";
		try {
			byte[] imageBytes = rideimage.getBytes();
			Ride rides = new Ride();
			rides.setRidetype(ridetype);
			rides.setRidename(ridename);
			rides.setStarttime(starttime);
			rides.setEndtime(endtime);
			rides.setRideimage(imageBytes);
			service.addRides(rides);		
			msg="success";
		}
		catch(Exception e) {
			e.printStackTrace();
			msg="failure";
		}
		return msg;
	}
	
	@GetMapping("/allRides")
	public List<Ride> getAllRides() {
		return service.getAllRides();
	}
}
