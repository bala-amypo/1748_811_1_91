package com.example.demo.service;

import com.example.demo.model.CategorizationLog;
import java.util.List;

public interface CategorizationLogService {
    CategorizationLog create(CategorizationLog log);
    List<CategorizationLog> getAll();
}
