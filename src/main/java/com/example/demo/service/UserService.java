package com.example.demo.service;

import com.example.demo.model.User;
import java.util.List;

public interface UserService {
    User save(User user);
    User createRegister(User register)
    List<User> getAll();
    User getById(Long id);
}
