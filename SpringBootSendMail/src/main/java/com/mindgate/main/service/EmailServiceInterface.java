package com.mindgate.main.service;

import com.mindgate.main.pojo.EmailDetails;

public interface EmailServiceInterface {
    // Method
    // To send a simple email
    String sendSimpleMail(EmailDetails details);
}
