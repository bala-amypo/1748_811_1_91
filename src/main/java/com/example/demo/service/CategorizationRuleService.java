package com.example.demo.service;

import com.example.demo.model.CategorizationRule;
import java.util.List;

public interface CategorizationRuleService {
    CategorizationRule save(CategorizationRule rule);
    List<CategorizationRule> getAll();
    CategorizationRule getById(Long id);
}
