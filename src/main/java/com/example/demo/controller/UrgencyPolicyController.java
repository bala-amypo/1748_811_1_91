package com.example.demo.controller;

import com.example.demo.model.UrgencyPolicy;
import com.example.demo.service.UrgencyPolicyService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/policies")
public class UrgencyPolicyController {

    private final UrgencyPolicyService service;

    public UrgencyPolicyController(UrgencyPolicyService service) {
        this.service = service;
    }

    @PostMapping
    public UrgencyPolicy create(@RequestBody UrgencyPolicy policy) {
        return service.create(policy);
    }

    @GetMapping
    public List<UrgencyPolicy> getAll() {
        return service.getAll();
    }

    @GetMapping("/{id}")
    public UrgencyPolicy getById(@PathVariable Long id) {
        return service.getById(id);
    }
}
