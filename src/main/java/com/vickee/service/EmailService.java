//package com.vickee.service;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.mail.SimpleMailMessage;
//import org.springframework.mail.javamail.JavaMailSender;
//import org.springframework.stereotype.Service;
//
//@Service
//public class EmailService {
//
//    @Autowired
//    private JavaMailSender emailSender;
//
//    public void sendConfirmationEmail(String to, double amount) {
//        SimpleMailMessage message = new SimpleMailMessage();
//        message.setTo(to);
//        message.setSubject("Payment Confirmation");
//        message.setText("Your payment of ₹" + amount + " was successful. Thank you for your purchase!");
//        emailSender.send(message);
//    }
//}

package com.vickee.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.Resource;
import org.springframework.core.io.ClassPathResource;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.stereotype.Service;

import java.io.IOException;

@Service
public class EmailService {

    @Autowired
    private JavaMailSender emailSender;

    public void sendConfirmationEmail(String to, double amount, String ticketDetails) {
        jakarta.mail.internet.MimeMessage message = emailSender.createMimeMessage();
        try {
            MimeMessageHelper helper = new MimeMessageHelper(message, true);

            helper.setTo(to);
            helper.setSubject("🎢 Your Ticket Confirmation for WonderLAAA Theme Park! 🎟");
            helper.setText("Thank you for choosing WonderLAAA Theme park! We are thrilled to confirm your ticket purchase and can't wait to welcome you to an unforgettable adventure."
            		+ "Your payment of ₹" + amount + " was successful. Thank you for your Booking! "
            				+ "You can download your ticket from mybooking");

            Resource pdfResource = new ClassPathResource("static/WonderlaSchedule.pdf");

            // Check if file exists
            if (!pdfResource.exists()) {
                throw new IOException("PDF file not found: " + pdfResource.getFilename());
            }

            // Add the PDF as an attachment
            helper.addAttachment(pdfResource.getFilename(), pdfResource);

            // Send the email
            emailSender.send(message);

        } catch (jakarta.mail.MessagingException e) {
            System.err.println("Error creating or sending email: " + e.getMessage());
            e.printStackTrace();
        } catch (IOException e) {
            System.err.println("Error reading PDF file: " + e.getMessage());
            e.printStackTrace(); 
        }
    }
}


