package com.vickee.serviceimpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vickee.model.Payment;
import com.vickee.repository.PaymentRepo;
import com.vickee.service.PaymentService;

@Service
public class PaymentServiceImpl implements PaymentService {
	
	
	@Autowired
	PaymentRepo repo;
	@Override
	public void addPayment(Payment pay) {
		repo.save(pay);

	}

}
