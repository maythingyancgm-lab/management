package com.example.management.controller;



import com.example.management.dto.UserDTO;
import com.example.management.form.UserForm;
import com.example.management.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@Controller
public class UserController {

    @Autowired
    UserService userService;

    @GetMapping("/")
    public String goHome() {
        return "home";
    }

    @GetMapping("/detail")
    public String goDetail() {
        return "detail";
    }

    @GetMapping("/createUser")
    public String showForm(Model model) {
        model.addAttribute("userForm", new UserForm());
        return "create";
    }

    @PostMapping("/create")
    public String createUser(@ModelAttribute UserForm userForm) {
        userService.createUser(userForm);
        return "complete";
    }
    @GetMapping("/users")
    public List<UserDTO> getAllUsers(){
        return userService.getAllUsers();
    }


}