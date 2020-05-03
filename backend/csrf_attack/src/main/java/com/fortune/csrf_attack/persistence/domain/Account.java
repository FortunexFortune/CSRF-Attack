package com.fortune.csrf_attack.persistence.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@Entity
@Table(name = "account")
public class Account {

	@Id
	@Column(name="first_name")
    private String firstName;

	@Column(name="password")
    private  String password;

	@Column(name="balance")
    private int balance;

    
}