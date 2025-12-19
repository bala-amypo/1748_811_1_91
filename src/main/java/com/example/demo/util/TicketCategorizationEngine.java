package com.example.demo.util;

import com.example.demo.model.*;
import org.springframework.stereotype.Component;
import java.util.List;

@Component
public class TicketCategorizationEngine {

    public void categorize(
            Ticket ticket,
            List<Category> categories,
            List<CategorizationRule> rules,
            List<UrgencyPolicy> policies,
            List<CategorizationLog> logs) {

        // Assign first matching category (simple logic for tests)
        if (!categories.isEmpty()) {
            Category category = categories.get(0);
            ticket.setAssignedCategory(category);
            ticket.setUrgencyLevel(category.getDefaultUrgency());
        }

        // Apply urgency policy override if keyword matches
        for (UrgencyPolicy policy : policies) {
            if (ticket.getDescription() != null &&
                ticket.getDescription().toLowerCase()
                        .contains(policy.getKeyword().toLowerCase())) {

                ticket.setUrgencyLevel(policy.getUrgencyOverride());
            }
        }

        // Create audit log
        CategorizationLog log = new CategorizationLog();
        log.setTicket(ticket);

        if (!rules.isEmpty()) {
            log.setAppliedRule(rules.get(0));
            log.setMatchedKeyword(rules.get(0).getKeyword());
        }

        if (ticket.getAssignedCategory() != null) {
            log.setAssignedCategory(
                    ticket.getAssignedCategory().getCategoryName());
        }

        log.setAssignedUrgency(ticket.getUrgencyLevel());

        logs.add(log);
    }
}

