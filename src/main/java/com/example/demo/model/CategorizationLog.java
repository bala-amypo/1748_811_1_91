package com.example.demo.model;

import jakarta.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "categorization_logs")
public class CategorizationLog {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne(optional = false)
    @JoinColumn(name = "ticket_id")
    private Ticket ticket;

    @ManyToOne(optional = false)
    @JoinColumn(name = "rule_id")
    private CategorizationRule appliedRule;

    @Column(nullable = false)
    private String matchedKeyword;

    @Column(nullable = false)
    private String assignedCategory;

    @Column(nullable = false)
    private String assignedUrgency;

    @Column(nullable = false, updatable = false)
    private LocalDateTime loggedAt;

    public CategorizationLog() {}

    @PrePersist
    protected void onCreate() {
        this.loggedAt = LocalDateTime.now();
    }

    public Long getId() { return id; }
    public Ticket getTicket() { return ticket; }
    public CategorizationRule getAppliedRule() { return appliedRule; }
    public String getMatchedKeyword() { return matchedKeyword; }
    public String getAssignedCategory() { return assignedCategory; }
    public String getAssignedUrgency() { return assignedUrgency; }
    public LocalDateTime getLoggedAt() { return loggedAt; }

    public void setId(Long id) { this.id = id; }
    public void setTicket(Ticket ticket) { this.ticket = ticket; }
    public void setAppliedRule(CategorizationRule appliedRule) { this.appliedRule = appliedRule; }
    public void setMatchedKeyword(String matchedKeyword) { this.matchedKeyword = matchedKeyword; }
    public void setAssignedCategory(String assignedCategory) { this.assignedCategory = assignedCategory; }
    public void setAssignedUrgency(String assignedUrgency) { this.assignedUrgency = assignedUrgency; }
}
