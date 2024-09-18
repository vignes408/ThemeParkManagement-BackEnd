package com.vickee.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vickee.model.Ride;
import com.vickee.repository.RideRepo;
import com.vickee.service.RideService;

@Service
public class RideServiceImpl implements RideService{
	
	@Autowired
	RideRepo repo;
	
	@Override
	public void addRides(Ride ride) {
		repo.save(ride);	
	}

	@Override
	public List<Ride> getAllRides() {
		return (List<Ride>) repo.findAll();
	}

}

//package com.vickee.serviceimpl;
//
//import java.util.List;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
//import com.vickee.model.Ride;
//import com.vickee.repository.RideRepo;
//import com.vickee.service.RideService;
//
//@Service
//public class RideServiceImpl implements RideService {
//
//    @Autowired
//    RideRepo repo;
//
//    @Override
//    public void addRides(Ride ride) {
//        repo.save(ride);
//    }
//
//    @Override
//    public List<Ride> getAllRides() {
//        return repo.findAll();
//    }
//}

