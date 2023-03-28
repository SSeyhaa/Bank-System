package com.ha.java.service;

import com.ha.java.dto.AccountDto;

public interface UserAccountService {

	AccountDto postAccount(AccountDto accountDto);
	
	AccountDto getAccountByUserId(Long id);
		
	AccountDto putPinAccountByUserId(Long id, String newPin);
	
	String transferByUserId(Long id, String pin, String accountNumber, Double amount, String description);
	
	String withdrawByUserId(Long id, String pin, String accountNumber, Double amount, String description); //send money to branchAccount in order to withdraw money
	
	//AccountDto deposit(Long id); in real world , user gives money to Branch and Branch transfer money to account user
	
	
}
