package com.example.management.serviceImpl;

import com.example.management.form.UserForm;
import com.example.management.service.EmailSenderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

@Service
public class EmailSenderServiceImpl implements EmailSenderService {
    @Autowired
    private JavaMailSender mailSender;
    @Override
    public void sendCompleteMail(UserForm userForm) {
        SimpleMailMessage message=new SimpleMailMessage();
        message.setTo(userForm.getEmail());
        message.setSubject("Registration Complete");
        message.setText("Thanks for registration!!\nName: "+userForm.getName()+ "\nEmail: "+userForm.getEmail());
        mailSender.send(message);
    }
}
