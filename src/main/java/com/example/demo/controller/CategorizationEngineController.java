package com.example.demo.controller;

import com.example.demo.model.CategorizationLog;
import com.example.demo.service.CategorizationEngineService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/logs")
public class CategorizationEngineController {

    private final CategorizationEningeService service;

    public CategorizationEngineController(CategorizationEningeService service) {
        this.service = service;
    }

    @PostMapping
    public CategorizationLog create(@RequestBody CategorizationLog log) {
        return service.create(log);
    }

    @GetMapping
    public List<CategorizationLog> getAll() {
        return service.getAll();
    }

    @GetMapping("/{id}")
    public CategorizationLog getById(@PathVariable Long id) {
        return service.getById(id);
    }
}
