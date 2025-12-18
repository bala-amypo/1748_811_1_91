package com.example.demo.model;

import jakarta.persistence.*;
import java.time.LocalDateTime;
@Entity
public class User{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String fullname;
    private String email;
    private String password;
    private String role;
    private LocalDateTime createdAt;

    public User(String fullname , String email , String password , String role )
    {
        this.fullname = fullname;
        this.email = email;
        this.password = password;
        this.role = role;
    }
    public User(){

    }

    

}