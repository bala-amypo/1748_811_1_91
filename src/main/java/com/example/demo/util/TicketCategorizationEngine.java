package com.example.demo.util;

import com.example.demo.model.*;
import java.util.List;

public class TicketCategorizationEngine {

    public TicketCategorizationEngine() {
       
    }

    public void categorize(
            Ticket ticket,
            List<Category> categories,
            List<CategorizationRule> rules,
            List<UrgencyPolicy> policies,
            List<CategorizationLog> logs) {

        for (CategorizationRule rule : rules) {
            if (ticket.getDescription() != null &&
                rule.getKeyword() != null &&
                ticket.getDescription().toLowerCase()
                        .contains(rule.getKeyword().toLowerCase())) {

                ticket.setAssignedCategory(rule.getCategory());
                ticket.setUrgencyLevel(
                        rule.getCategory() != null
                                ? rule.getCategory().getDefaultUrgency()
                                : null
                );

                CategorizationLog log = new CategorizationLog();
                log.setTicket(ticket);
                log.setAppliedRule(rule);
                log.setMatchedKeyword(rule.getKeyword());
                log.setAssignedCategory(
                        rule.getCategory() != null
                                ? rule.getCategory().getCategoryName()
                                : null
                );
                log.setAssignedUrgency(ticket.getUrgencyLevel());

                logs.add(log);
                break;
            }
        }

        for (UrgencyPolicy policy : policies) {
            if (ticket.getDescription() != null &&
                policy.getKeyword() != null &&
                ticket.getDescription().toLowerCase()
                        .contains(policy.getKeyword().toLowerCase())) {

                ticket.setUrgencyLevel(policy.getUrgencyOverride());
            }
        }
    }
}
