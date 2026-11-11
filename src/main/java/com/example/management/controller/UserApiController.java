package com.example.management.controller;



import com.example.management.entity.User;
import com.example.management.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
public class UserApiController {
    @Autowired
    UserService userService;

   /* @GetMapping("/users")
    public List<UserDTO> getAllUsers(){
        return userService.getAllUsers();
    }*/

    @GetMapping("/user/detail/{id}")
    public User getUserDetail(@PathVariable("id") Integer id){
        return userService.getUserDetail(id);

    }

}