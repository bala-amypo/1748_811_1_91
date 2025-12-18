package com.example.demo.model;

import jakarta.persistence.*;
//import java.time.LocalDateTime;
@Entity
public class User{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String fullname;
    private String email;
    private String password;
    private String role;
    //private LocalDateTime createdAt;


    protected void onCreate(){
        //this.createdAt = LocalDateTime.now();
        if(this.role == null)
        {
            this.role = "USER";
        }
    }

    public User(String fullname , String email , String password , String role )
    {
        this.fullname = fullname;
        this.email = email;
        this.password = password;
        this.role = role;
    }
    public User(){

    }

    public Long getId()
    {
        return id;
    }
    public void setFullName(String fullname)
    {
        this.fullname = fullname;
    }
    public void setEmail(String email)
    {
        this.email = email;
    }
    public void setPassword(String password)
    {
        this.password = password;
    }
    public void setRole(String role)
    {
        this.role = role;
    }

    public String getFullName()
    {
        return fullname;
    }
    public String getPassword()
    {
        return password;
    }
    public String getEmail()
    {
        return email;
    }
    public String getRole()
    {
        return role;
    }
    // public LocalDateTime getCreatedAt()
    // {
    //     return createdAt;
    // }


}