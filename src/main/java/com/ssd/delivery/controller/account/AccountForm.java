package com.ssd.delivery.controller.account;

import java.io.Serializable;

import com.ssd.delivery.domain.AccountDTO;

@SuppressWarnings("serial")
public class AccountForm implements Serializable {

	private AccountDTO account;

	private boolean newAccount;

	private String repeatedPassword;

	public AccountForm(AccountDTO account) {
		this.account = account;
		this.newAccount = false;
	}

	public AccountForm() {
		this.account = new AccountDTO();
		this.newAccount = true;
	}

	public AccountDTO getAccount() {
		return account;
	}

	public boolean isNewAccount() {
		return newAccount;
	}

	public void setRepeatedPassword(String repeatedPassword) {
		this.repeatedPassword = repeatedPassword;
	}

	public String getRepeatedPassword() {
		return repeatedPassword;
	}
}
