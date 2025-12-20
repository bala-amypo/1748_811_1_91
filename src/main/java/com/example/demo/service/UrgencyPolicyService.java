package com.example.demo.service;

import com.example.demo.model.UrgencyPolicy;
import java.util.List;

public interface UrgencyPolicyService {
    UrgencyPolicy create(UrgencyPolicy policy);
    List<UrgencyPolicy> getAll();
}
