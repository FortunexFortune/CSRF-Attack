package com.fortune.csrf_attack.service.implementation;

import java.util.List;

import com.fortune.csrf_attack.persistence.domain.Account;
import com.fortune.csrf_attack.persistence.repository.AccountRepository;
import com.fortune.csrf_attack.service.AccountService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AccountServiceImpl implements AccountService {

    @Autowired
    AccountRepository accountRepository;


    @Override
    public List<Account> getAllAccounts() {
        return accountRepository.findAll();
    }

    
}