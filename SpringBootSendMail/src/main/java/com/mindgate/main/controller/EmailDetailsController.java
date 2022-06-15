package com.mindgate.main.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.mindgate.main.pojo.EmailDetails;
import com.mindgate.main.service.EmailDetailsService;

@RestController
public class EmailDetailsController {
	@Autowired
	private EmailDetailsService emailService;
	 
    // Sending a simple Email
    @PostMapping("/sendMail")
    public String sendMail(@RequestBody EmailDetails details)
    {
      return emailService.sendSimpleMail(details);
    }
}
