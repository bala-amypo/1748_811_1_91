package com.example.demo.controller;

import com.example.demo.model.CategorizationRule;
import com.example.demo.service.CategorizationRuleService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/rules")
public class CategorizationRuleController {

    private final CategorizationRuleService service;

    public CategorizationRuleController(CategorizationRuleService service) {
        this.service = service;
    }

    @PostMapping
    public CategorizationRule create(@RequestBody CategorizationRule rule) {
        return service.create(rule);
    }

    @GetMapping
    public List<CategorizationRule> getAll() {
        return service.getAll();
    }

    @GetMapping("/{id}")
    public CategorizationRule getById(@PathVariable Long id) {
        return service.getById(id);
    }
}
