package com.wk.ruleengine.service;

import com.wk.ruleengine.model.Transaction;
import org.kie.api.runtime.KieContainer;
import org.kie.api.runtime.KieSession;
import org.springframework.stereotype.Service;

@Service
public class RuleService {

    private final KieContainer kieContainer;

    public RuleService(KieContainer kieContainer) {
        this.kieContainer = kieContainer;
    }

    public Transaction evaluateTransaction(Transaction transaction) {
        KieSession kieSession = kieContainer.newKieSession();

        System.out.println("Before Rule Execution: " + transaction);

        kieSession.insert(transaction);
        int rulesFired = kieSession.fireAllRules();

        System.out.println("Rules Fired: " + rulesFired);

        kieSession.dispose();

        System.out.println("After Rule Execution: " + transaction);

        return transaction;
    }
}

