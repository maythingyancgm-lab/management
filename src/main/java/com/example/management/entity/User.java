package com.example.management.entity;


import com.example.management.dto.UserDTO;
import com.example.management.form.UserForm;
import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.CreationTimestamp;

import java.time.LocalDateTime;

@NoArgsConstructor
@Entity
@Data
@Table(name="users")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;
    private String email;
    private String password;

    /* *//**//*@Temporal(TemporalType.TIMESTAMP)*/
    @CreationTimestamp
    private LocalDateTime created_at;

    public User(UserForm userForm){
        this.email=userForm.getEmail();
        this.name=userForm.getName();
        this.password=userForm.getPassword();
    }

    public User(UserDTO userDTO){
        this.name=userDTO.getName();
        this.email=userDTO.getEmail();
    }

}
