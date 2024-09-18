package com.vickee.service;

import java.util.List;

import com.vickee.model.Ride;

public interface RideService {
	
	public void addRides(Ride ride);
	public List<Ride> getAllRides();
}
