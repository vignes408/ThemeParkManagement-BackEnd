package com.vickee.service;

import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.stereotype.Service;

@Service
public class EmailService1 {
	
	 @Autowired
	 private JavaMailSender emailSender;

	    public void sendConfirmationEmail(String to, String description, String ticketDetails) {
	        jakarta.mail.internet.MimeMessage message = emailSender.createMimeMessage();
	        try {
	            MimeMessageHelper helper = new MimeMessageHelper(message, true);

	            helper.setTo(to);
	            helper.setSubject("🎢 Offers available at your WonderLAAA Theme Park! 🎟");
	            helper.setText("We are excited to tell you that we have a offer for you this month "+ description +"Your visit towards wonderlaa"
	            		+ "are always welcome❤");

	            Resource pdfResource = new ClassPathResource("static/OfferPdf.pdf");
	            if (!pdfResource.exists()) {
	                throw new IOException("PDF file not found: " + pdfResource.getFilename());
	            }
	            helper.addAttachment(pdfResource.getFilename(), pdfResource);
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
