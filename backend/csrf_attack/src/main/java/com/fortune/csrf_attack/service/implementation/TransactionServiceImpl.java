package com.fortune.csrf_attack.service.implementation;

import java.util.List;

import com.fortune.csrf_attack.persistence.domain.Transaction;
import com.fortune.csrf_attack.persistence.repository.TransactionRepository;
import com.fortune.csrf_attack.service.TransactionService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TransactionServiceImpl implements TransactionService {

    @Autowired
    TransactionRepository transactionRepository;

    @Override
    public List<Transaction> getAllTransactions() {
        return transactionRepository.findAll();
    }
    
}