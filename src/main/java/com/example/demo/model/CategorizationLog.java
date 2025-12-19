package com.example.demo.model;

import jakarta.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "categorization_logs")
public class CategorizationLog {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "ticket_id", nullable = false)
    private Ticket ticket;

    @ManyToOne
    @JoinColumn(name = "rule_id")
    private CategorizationRule appliedRule;

    private String matchedKeyword;

    private String assignedCategory;

    private String assignedUrgency;

    @Column(nullable = false, updatable = false)
    private LocalDateTime loggedAt;

    @PrePersist
    protected void onCreate() {
        this.loggedAt = LocalDateTime.now();
    }

    public CategorizationLog() {}

    // Getters & Setters
    public Long getId() { return id; }

    public void setId(Long id) { this.id = id; }

    public Ticket getTicket() { return ticket; }

    public void setTicket(Ticket ticket) { this.ticket = ticket; }

    public CategorizationRule getAppliedRule() { return appliedRule; }

    public void setAppliedRule(CategorizationRule appliedRule) {
        this.appliedRule = appliedRule;
    }

    public String getMatchedKeyword() { return matchedKeyword; }

    public void setMatchedKeyword(String matchedKeyword) {
        this.matchedKeyword = matchedKeyword;
    }

    public String getAssignedCategory() { return assignedCategory; }

    public void setAssignedCategory(String assignedCategory) {
        this.assignedCategory = assignedCategory;
    }

    public String getAssignedUrgency() { return assignedUrgency; }

    public void setAssignedUrgency(String assignedUrgency) {
        this.assignedUrgency = assignedUrgency;
    }

    public LocalDateTime getLoggedAt() { return loggedAt; }
}
