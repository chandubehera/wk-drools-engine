package com.wk.ruleengine.controller;

import com.wk.ruleengine.model.Transaction;
import com.wk.ruleengine.service.RuleService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/transactions")
public class TransactionController {

    private final RuleService ruleService;

    public TransactionController(RuleService ruleService) {
        this.ruleService = ruleService;
    }

    @PostMapping("/evaluate")
    public Transaction evaluateTransaction(@RequestBody Transaction transaction) {
        return ruleService.evaluateTransaction(transaction);
    }
}
