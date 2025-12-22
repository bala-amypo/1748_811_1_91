package com.example.demo.service;

import com.example.demo.model.CategorizationLog;
import java.util.List;

public interface CategorizationEngineService {
    CategorizationLog save(CategorizationLog log);
    List<CategorizationLog> getAll();
    CategorizationLog getById(Long id);
}
