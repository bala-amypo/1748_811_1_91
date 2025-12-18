package com.example.demo.service;

import java.util.List;
import com.example.demo.entity.Category;

public interface CategoryService {

    Category addCategory(Category category);

    List<Category> getAllCategory();

    StudentEntity getCategoryById(Long id);

    
}
