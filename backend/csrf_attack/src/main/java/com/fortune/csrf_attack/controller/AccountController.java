package com.fortune.csrf_attack.controller;

import org.springframework.web.bind.annotation.RestController;

import java.util.List;

import com.fortune.csrf_attack.DemoApplication;
import com.fortune.csrf_attack.persistence.domain.Account;
import com.fortune.csrf_attack.service.AccountService;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;


@RestController
@RequestMapping("${path.base.account}")
public class AccountController {

    @Autowired
    AccountService accountService;

    private static final Logger logger = LoggerFactory.getLogger(DemoApplication.class);


    @GetMapping
    public List<Account> getAllAccounts() {
        logger.info("getAllAccounts");
        return accountService.getAllAccounts();
    }
    
    
}