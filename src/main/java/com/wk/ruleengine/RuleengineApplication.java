package com.wk.ruleengine;

import com.wk.ruleengine.model.Transaction;
import com.wk.ruleengine.service.RuleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class RuleengineApplication implements CommandLineRunner {

	@Autowired
	private RuleService ruleService;

	public static void main(String[] args) {
		SpringApplication.run(RuleengineApplication.class, args);
	}

	@Override
	public void run(String... args) {
		Transaction tx = new Transaction(75000);
		ruleService.evaluateTransaction(tx);
		System.out.println("Final Transaction: " + tx);
	}
}

