package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.example.demo.model.Category;
import com.example.demo.service.CategoryService;

@RestController
@RequestMapping("/category")
public class CategoryController {

    @Autowired
    private CategoryService cat;

    @PostMapping("/addCategory")
    public Category addCategory(@RequestBody Category category) {
        return cat.addCategory(category);
    }

    @GetMapping("/allCategory")
    public List<Category> getAllCategory() {
        return cat.getAllCategory();
    }

    @GetMapping("/{id}")
    public Category getCategoryById(@PathVariable Long id) {
        return service.getCategoryById(id);
    }
}
