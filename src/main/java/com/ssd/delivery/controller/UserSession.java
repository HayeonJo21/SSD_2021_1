package com.ssd.delivery.controller;

import java.io.Serializable;
import org.springframework.beans.support.PagedListHolder;

import com.ssd.delivery.domain.Account;
import com.ssd.delivery.domain.AccountDTO;
import com.ssd.delivery.domain.Product;

/**
 * @author Juergen Hoeller
 * @since 30.11.2003
 */
@SuppressWarnings("serial")
public class UserSession implements Serializable {

	private Account account;

	private PagedListHolder<Product> myList;

	public UserSession(Account account2) {
		this.account = account2;
	}

	public Account getAccount() {
		return account;
	}

	public void setMyList(PagedListHolder<Product> myList) {
		this.myList = myList;
	}

	public PagedListHolder<Product> getMyList() {
		return myList;
	}
}
