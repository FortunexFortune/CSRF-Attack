package com.fortune.csrf_attack.service;

import java.util.List;

import com.fortune.csrf_attack.persistence.domain.Account;

public interface AccountService {

    public List<Account> getAllAccounts();

    
}