package com.example.demo.model;

import jakarta.persistence.*;

@Entity
public class Category{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String categoryName;
    private String description;
    private String defaultUrgency;

    public void setCate
}