package com.example.demo.model;

import jakarta.persistence.*;
import java.time.LocalDateTime;
@Entity
public class Category{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String categoryName;
    private String description;
    private String defaultUrgency;
    private LocalDateTime createdAt;

    public Category(){}

    public Category(String categoryName , String description , String defaultUrgency){
        this.categoryName = categoryName;
        this.description = description;
        this.defaultUrgency = defaultUrgency;
        this.createdAt = LocalDateTime.now();
    }


    public void setCategoryName(String categoryName)
    {
        this.categoryName = categoryName;
    }
    public void setDescription(String description)
    {
        this.description = description;
    }
    public void setDefaultUrgency(String defaultUrgency)
    {
        this.defaultUrgency = defaultUrgency;
    }

    public String getCategoryName()
    {
        return categoryName;
    }
    public String getDescription()
    {
        return description;
    }
    public String getDefaultUrgency()
    {
        return defaultUrgency;
    }
    public LocalDateTime getCreatedAt()
    {
        return createdAt;
    }
}