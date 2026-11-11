package com.example.management.service;


import com.example.management.dto.UserDTO;
import com.example.management.entity.User;
import com.example.management.form.UserForm;

import java.util.List;

public interface UserService {
    public void createUser(UserForm userForm);
    List<UserDTO> getAllUsers();
    public User getUserDetail(Integer id);
}
