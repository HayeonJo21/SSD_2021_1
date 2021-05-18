package com.ssd.delivery.dao;

import java.util.List;
import org.springframework.dao.DataAccessException;

import com.ssd.delivery.domain.Account;

public interface AccountDao {
	void create(Account account) throws DataAccessException;
	
	void update(Account account) throws DataAccessException;
	
	void remove(String username) throws DataAccessException;
	
	List<Account> findUserListByAuctionId(String auctionId) throws DataAccessException;
	
	List<Account> findUserListByUsername(String username) throws DataAccessException;
	
	List<Account> findUserListByBidderId(String bidderId) throws DataAccessException;
	
	List<Account> findUserListByCPId(String CPId) throws DataAccessException;
	
	boolean existingUser(String username) throws DataAccessException;
	
	List<Account> findFavoriteUserList(String username) throws DataAccessException;
	
	Account findUser(String username) throws DataAccessException;

}
