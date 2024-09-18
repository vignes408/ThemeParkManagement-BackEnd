//package com.vickee.serviceimpl;
//import java.util.List;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
//
//import com.vickee.model.Booking;
//import com.vickee.repository.BookingRepo;
//import com.vickee.service.BookingService;
//
//@Service
//public class BookingServiceImpl implements BookingService{
//	
//	@Autowired
//	BookingRepo repo;
//	@Override
//	public void addBooking(Booking book) {
//		repo.save(book);
//		
//	}
//	@Override
//	public Booking getBookById(Long bookid) {
//		return repo.findById(bookid).orElse(null);
//	}
//	@Override
//	public List<Booking> getBookingByRegid(String regid) {
//		return repo.findByRegid(regid);
//	}
//	@Override
//	public List<Booking> getAllBooking() {
//		return  (List<Booking>) repo.findAll();
//	}
//
//	
//}

package com.vickee.serviceimpl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.vickee.model.Booking;
import com.vickee.repository.BookingRepo;
import com.vickee.service.BookingService;

@Service
public class BookingServiceImpl implements BookingService {

    @Autowired
    BookingRepo repo;

    @Override
    public void addBooking(Booking book) {
        repo.save(book);
    }

    @Override
    public Booking getBookById(Long bookid) {
        return repo.findById(bookid);
    }

    @Override
    public List<Booking> getBookingByRegid(String regid) {
        return repo.findByRegid(regid);
    }

    @Override
    public List<Booking> getAllBooking() {
        return repo.findAll();
    }
}
