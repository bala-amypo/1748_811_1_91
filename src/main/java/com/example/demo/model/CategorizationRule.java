package com.example.demo.model;

import jakarta.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "categorization_rules")
public class CategorizationRule {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne(optional = false)
    @JoinColumn(name = "category_id")
    private Category category;

    @Column(nullable = false)
    private String keyword;

    @Column(nullable = false)
    private String matchType;

    @Column(nullable = false)
    private Integer priority;

    @Column(nullable = false, updatable = false)
    private LocalDateTime createdAt;

    public CategorizationRule() {}

    public CategorizationRule(String keyword, String matchType) {
        this.keyword = keyword;
        this.matchType = matchType;
    }

    @PrePersist
    protected void onCreate() {
        this.createdAt = LocalDateTime.now();
        if (this.priority == null) {
            this.priority = 1;
        }
    }

    public Long getId() { return id; }
    public Category getCategory() { return category; }
    public String getKeyword() { return keyword; }
    public String getMatchType() { return matchType; }
    public Integer getPriority() { return priority; }
    public LocalDateTime getCreatedAt() { return createdAt; }

    public void setId(Long id) { this.id = id; }
    public void setCategory(Category category) { this.category = category; }
    public void setKeyword(String keyword) { this.keyword = keyword; }
    public void setMatchType(String matchType) { this.matchType = matchType; }
    public void setPriority(Integer priority) { this.priority = priority; }
}
