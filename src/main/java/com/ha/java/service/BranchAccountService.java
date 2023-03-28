package com.ha.java.service;


import com.ha.java.dto.AccountDto;

public interface BranchAccountService {

	AccountDto postBranchAccount(AccountDto accountDto);
	
	AccountDto getAccountByAccountNumber(String accountNumber);
	
	AccountDto getAccountByBranchId(Long id);
	
	AccountDto putPinAccount(String accountNumber);
	
	AccountDto withdraw(Long id);
	
	AccountDto deposit(Long id);
	
	String transfer(Long id, String pin, String accountNumber, Double amount, String description);
	
}
