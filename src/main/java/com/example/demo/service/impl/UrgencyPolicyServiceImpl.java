package com.example.demo.service.impl;

import com.example.demo.model.UrgencyPolicy;
import com.example.demo.repository.UrgencyPolicyRepository;
import com.example.demo.service.UrgencyPolicyService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UrgencyPolicyServiceImpl implements UrgencyPolicyService {

    private final UrgencyPolicyRepository repo;

    public UrgencyPolicyServiceImpl(UrgencyPolicyRepository repo) {
        this.repo = repo;
    }

    @Override
    public UrgencyPolicy create(UrgencyPolicy policy) {
        return repo.save(policy);
    }

    @Override
    public List<UrgencyPolicy> getAll() {
        return repo.findAll();
    }

    @Override
    public UrgencyPolicy getById(Long id) {
        return repo.findById(id).orElse(null);
    }
}
