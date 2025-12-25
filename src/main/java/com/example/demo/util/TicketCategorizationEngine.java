package com.example.demo.util;

import java.util.List;

import org.springframework.stereotype.Component;

import com.example.demo.model.Category;
import com.example.demo.model.CategorizationLog;
import com.example.demo.model.CategorizationRule;
import com.example.demo.model.Ticket;
import com.example.demo.model.UrgencyPolicy;

@Component
public class TicketCategorizationEngine {

    public void categorize(
            Ticket ticket,
            List<Category> categories,
            List<CategorizationRule> rules,
            List<UrgencyPolicy> policies,
            List<CategorizationLog> logs) {

        CategorizationRule matchedRule = null;

        for (CategorizationRule rule : rules) {
            if (rule.getKeyword() == null || rule.getMatchType() == null) {
                continue;
            }

            String description = ticket.getDescription() == null
                    ? ""
                    : ticket.getDescription().toLowerCase();

            if ("CONTAINS".equalsIgnoreCase(rule.getMatchType())
                    && description.contains(rule.getKeyword().toLowerCase())) {

                if (matchedRule == null
                        || rule.getPriority() > matchedRule.getPriority()) {
                    matchedRule = rule;
                }
            }
        }

        if (matchedRule != null) {
            ticket.setAssignedCategory(matchedRule.getCategory());
            ticket.setUrgencyLevel(
                    matchedRule.getCategory().getDefaultUrgency());

            CategorizationLog log = new CategorizationLog();
            log.setTicket(ticket);
            log.setAppliedRule(matchedRule);
            logs.add(log);
        }

        for (UrgencyPolicy policy : policies) {
            if (policy.getKeyword() != null
                    && ticket.getDescription() != null
                    && ticket.getDescription()
                             .toLowerCase()
                             .contains(policy.getKeyword().toLowerCase())) {

                ticket.setUrgencyLevel(policy.getUrgencyOverride());
            }
        }
    }
}
