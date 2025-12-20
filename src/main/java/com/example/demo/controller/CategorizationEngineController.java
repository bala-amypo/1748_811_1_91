package com.example.demo.controller;

import com.example.demo.model.CategorizationLog;
import com.example.demo.repository.CategorizationLogRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/logs")
public class CategorizationLogController {

    private final CategorizationLogRepository repo;

    public CategorizationLogController(CategorizationLogRepository repo) {
        this.repo = repo;
    }

    @PostMapping
    public CategorizationLog create(@RequestBody CategorizationLog log) {
        return repo.save(log);
    }

    @GetMapping
    public List<CategorizationLog> getAll() {
        return repo.findAll();
    }
}
