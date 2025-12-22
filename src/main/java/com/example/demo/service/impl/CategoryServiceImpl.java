package com.example.demo.service.impl;

import com.example.demo.model.Category;
import com.example.demo.repository.CategoryRepository;
import com.example.demo.service.CategoryService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoryServiceImpl implements CategoryService {

    private final CategoryRepository repo;

    public CategoryServiceImpl(CategoryRepository repo) {
        this.repo = repo;
    }

    public Category save(Category category) {
        return repo.save(category);
    }

    public List<Category> getAll() {
        return repo.findAll();
    }

    public Category getById(Long id) {
        return repo.findById(id).orElse(null);
    }
}
