package com.vickee.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.vickee.model.Payment;
import com.vickee.service.EmailService;
import com.vickee.service.PaymentService;

@RestController
@RequestMapping("/pay")
@CrossOrigin("*")
public class PaymentController {

    @Autowired
    PaymentService service;
    
    @Autowired
    EmailService emailService;
    
    @PostMapping
    public void addPayment(@RequestBody Payment pay) {
        service.addPayment(pay);
        String ticketDetails = String.format(
            "Email: %s\n, Total Amount: ₹%.2f",
            pay.getEmail(), pay.getAmount()
        );

        emailService.sendConfirmationEmail(pay.getEmail(), pay.getAmount(), ticketDetails);
    }
}
