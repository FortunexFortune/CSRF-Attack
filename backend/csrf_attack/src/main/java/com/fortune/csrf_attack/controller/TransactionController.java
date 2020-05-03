package com.fortune.csrf_attack.controller;

import java.util.List;

import com.fortune.csrf_attack.DemoApplication;
import com.fortune.csrf_attack.persistence.domain.Transaction;
import com.fortune.csrf_attack.service.TransactionService;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("${path.base.Transaction}")
public class TransactionController {
    
    @Autowired
    TransactionService transactionService;
    
    private static final Logger logger = LoggerFactory.getLogger(DemoApplication.class);

    @GetMapping
    public List<Transaction> getAllTransactions() {
        logger.info("getAllTransactions");
        return transactionService.getAllTransactions();
    }


    
}