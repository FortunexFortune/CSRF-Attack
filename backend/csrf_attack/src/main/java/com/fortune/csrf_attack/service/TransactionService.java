package com.fortune.csrf_attack.service;

import java.util.List;

import com.fortune.csrf_attack.persistence.domain.Transaction;

public interface TransactionService {

    public List<Transaction> getAllTransactions();

    
}