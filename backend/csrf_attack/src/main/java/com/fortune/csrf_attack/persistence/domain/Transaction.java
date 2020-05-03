package com.fortune.csrf_attack.persistence.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@Entity
@Table(name = "transaction")
public class Transaction {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="transaction_id")
    private int transactionId;

	@Column(name="sender")
    private String sender;

	@Column(name="receiver")
    private String receiver;

	@Column(name="ammount")
    private int ammount;


}