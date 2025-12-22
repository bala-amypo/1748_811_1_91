package com.example.demo.service;

import com.example.demo.model.Category;
import java.util.List;

public interface CategoryService {
    Category save(Category category);
    List<Category> getAll();
    Category getById(Long id);
}
