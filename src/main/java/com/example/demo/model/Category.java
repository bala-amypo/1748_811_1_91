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
}