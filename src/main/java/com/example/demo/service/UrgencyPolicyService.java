package com.example.demo.service;

import com.example.demo.model.UrgencyPolicy;
import java.util.List;

public interface UrgencyPolicyService {
    UrgencyPolicy save(UrgencyPolicy policy);
    List<UrgencyPolicy> getAll();
    UrgencyPolicy getById(Long id);
}
