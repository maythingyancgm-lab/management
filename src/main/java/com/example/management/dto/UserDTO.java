package com.example.management.dto;


import com.example.management.entity.User;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Data
public class UserDTO {
    String name;
    String email;

    public  UserDTO(User user){
        this.name=user.getName();
        this.email= user.getEmail();
    }


}
