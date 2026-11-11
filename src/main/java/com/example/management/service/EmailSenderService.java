package com.example.management.service;


import com.example.management.form.UserForm;

public interface EmailSenderService {
    public void sendCompleteMail(UserForm userForm);
}
