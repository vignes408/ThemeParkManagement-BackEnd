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
import com.vickee.model.Booking;
import com.vickee.service.BookingService;


@RestController
@RequestMapping("/book")
@CrossOrigin("*")
class BookingController {
	
	@Autowired
	BookingService service;
	
	
	@PostMapping
	public void addBook(@RequestBody Booking book) {
		service.addBooking(book);
	}
	
	@GetMapping("/{id}")
    public Booking getBookingById(@PathVariable("id") Long bookid) {
        return service.getBookById(bookid);
    }
	
    @GetMapping("/regid/{regid}")
    public List<Booking> getBookingByRegid(@PathVariable String regid) {
        return service.getBookingByRegid(regid);
    }
    
    @GetMapping("allbook")
    public List<Booking> getAllBooking(){
    	return service.getAllBooking();
    }
}

