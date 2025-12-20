package com.example.demo.service.impl;

import com.example.demo.model.CategorizationLog;
import com.example.demo.repository.CategorizationLogRepository;
import com.example.demo.service.CategorizationEngineService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategorizationEngineServiceImpl implements CategorizationEngineService {

    private final CategorizationLogRepository repo;

    public CategorizationEngineServiceImpl(CategorizationLogRepository repo) {
        this.repo = repo;
    }

    @Override
    public CategorizationLog create(CategorizationLog log) {
        return repo.save(log);
    }

    @Override
    public List<CategorizationLog> getAll() {
        return repo.findAll();
    }

    @Override
    public CategorizationLog getById(Long id) {
        return repo.findById(id).orElse(null);
    }
}
