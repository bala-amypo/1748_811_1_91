package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.example.demo.entity.Category;
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
    public StudentEntity getStudentById(@PathVariable Long id) {
        return service.getStudentById(id);
    }

    @DeleteMapping("/{id}")
    public String deleteStudent(@PathVariable Long id) {
        StudentEntity student = service.getStudentById(id);
        if (student != null) {
            service.deleteStudentById(id);
            return "Student deleted successfully";
        } else {
            return "Student not found";
        }
    }
}
