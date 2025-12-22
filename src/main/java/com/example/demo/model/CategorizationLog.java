package com.example.demo.model;

import jakarta.persistence.*;

@Entity
@Table(name = "categorization_logs")
public class CategorizationLog {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String matchedKeyword;
    private String assignedCategory;
    private String assignedUrgency;

    // Default constructor
    public CategorizationLog() {}

    // Parameterized constructor
    public CategorizationLog(Long id, String matchedKeyword, String assignedCategory, String assignedUrgency) {
        this.id = id;
        this.matchedKeyword = matchedKeyword;
        this.assignedCategory = assignedCategory;
        this.assignedUrgency = assignedUrgency;
    }

    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public String getMatchedKeyword() { return matchedKeyword; }
    public void setMatchedKeyword(String matchedKeyword) { this.matchedKeyword = matchedKeyword; }

    public String getAssignedCategory() { return assignedCategory; }
    public void setAssignedCategory(String assignedCategory) { this.assignedCategory = assignedCategory; }

    public String getAssignedUrgency() { return assignedUrgency; }
    public void setAssignedUrgency(String assignedUrgency) { this.assignedUrgency = assignedUrgency; }
}
