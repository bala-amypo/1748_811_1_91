package com.example.demo.service.impl;

import com.example.demo.model.Ticket;
import com.example.demo.repository.TicketRepository;
import com.example.demo.service.TicketService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TicketServiceImpl implements TicketService {

    private final TicketRepository repo;

    public TicketServiceImpl(TicketRepository repo) {
        this.repo = repo;
    }

    @Override
    public Ticket create(Ticket ticket) {
        return repo.save(ticket);
    }

    @Override
    public List<Ticket> getAll() {
        return repo.findAll();
    }

    @Override
    public Ticket getById(Long id) {
        return repo.findById(id).orElse(null);
    }
}
