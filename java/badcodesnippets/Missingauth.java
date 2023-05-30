package com.eva;

import com.support.BankAccount;

public class Missingauth {
	public BankAccount createBankAccount(String accountNumber, String accountType,
			String accountName, String accountSSN, double balance) {
			BankAccount account = new BankAccount();
			account.setAccountNumber(accountNumber);
			account.setAccountNumber(accountType);
			account.setAccountOwnerName(accountName);
			account.setAccountOwnerName(accountSSN);
			account.setBalance(balance);

			return account;
			}

	public static void main(String[] args) {
		System.out.println("Missing authentication...");

	}

}
