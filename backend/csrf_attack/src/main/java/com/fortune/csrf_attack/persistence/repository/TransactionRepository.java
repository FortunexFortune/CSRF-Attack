package com.fortune.csrf_attack.persistence.repository;

import com.fortune.csrf_attack.persistence.domain.Transaction;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TransactionRepository extends JpaRepository<Transaction, Integer> {


}