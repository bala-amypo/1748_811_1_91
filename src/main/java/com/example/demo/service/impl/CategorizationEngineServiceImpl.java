package com.example.demo.service.impl;

import com.example.demo.model.CategorizationLog;
import com.example.demo.repository.CategorizationLogRepository;
import com.example.demo.service.CategorizationLogService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategorizationLogServiceImpl implements CategorizationLogService {

    private final CategorizationLogRepository repo;

    public CategorizationLogServiceImpl(CategorizationLogRepository repo) {
        this.repo = repo;
    }

    public CategorizationLog save(CategorizationLog log) {
        return repo.save(log);
    }

    public List<CategorizationLog> getAll() {
        return repo.findAll();
    }

    public CategorizationLog getById(Long id) {
        return repo.findById(id).orElse(null);
    }
}
