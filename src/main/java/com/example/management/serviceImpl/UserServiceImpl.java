package com.example.management.serviceImpl;


import com.example.management.dto.UserDTO;
import com.example.management.entity.User;
import com.example.management.form.UserForm;
import com.example.management.repository.UserRepository;
import com.example.management.service.EmailSenderService;
import com.example.management.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service

public class UserServiceImpl implements UserService {
    @Autowired
    UserRepository userRepo;
    @Autowired
    EmailSenderService emailSenderService;
    @Override
    public void createUser(UserForm userForm) {
        User user=new User(userForm);
        userRepo.save(user);
        emailSenderService.sendCompleteMail(userForm);

    }

    @Override
    public List<UserDTO> getAllUsers() {
        List<User> userList=userRepo.findAll();
        List<UserDTO> bookDtoList=new ArrayList<>();
        for(User user:userList){
            UserDTO dto=new UserDTO(user);
            bookDtoList.add(dto);
        }
        return bookDtoList;
    }


    @Override
    public User getUserDetail(Integer id) {
        return userRepo.findById(id).orElse(null);
    }

}
