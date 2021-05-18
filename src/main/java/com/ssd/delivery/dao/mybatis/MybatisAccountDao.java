package com.ssd.delivery.dao.mybatis;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Repository;

import com.ssd.delivery.dao.AccountDao;
import com.ssd.delivery.dao.mybatis.mapper.AccountMapper;
import com.ssd.delivery.domain.Account;

/**
 * @author Juergen Hoeller
 * @author Colin Sampaleanu
 */
@Repository
public class MybatisAccountDao implements AccountDao {

	@Autowired
	private AccountMapper accountMapper;

	@Override
	public void insert(Account account) throws DataAccessException {
		accountMapper.insert(account);
	}

	@Override
	public void delete(String username) throws DataAccessException {
		accountMapper.delete(username);
	}

	@Override
	public List<Account> getUserListByAuctionId(String auctionId) throws DataAccessException {
		
		return accountMapper.getUserListByAuctionId(auctionId);
	}

	@Override
	public List<Account> getUserListByUsername(String username) throws DataAccessException {
		
		return accountMapper.getUserListByUsername(username);
	}

	@Override
	public List<Account> getUserListByBidderId(String bidderId) throws DataAccessException {
		
		return accountMapper.getUserListByBidderId(bidderId);
	}

	@Override
	public List<Account> getUserListByCPId(String CPId) throws DataAccessException {
		
		return accountMapper.getUserListByCPId(CPId);
	}

	@Override
	public boolean existingUser(String username) throws DataAccessException {
		
		return accountMapper.existingUser(username);
	}

	@Override
	public List<Account> getFavoriteUserList(String username) throws DataAccessException {
		
		return accountMapper.getFavoriteUserList(username);
	}

	@Override
	public Account findUser(String username) throws DataAccessException {
		
		return accountMapper.getUser(username);
	}

	@Override
	public void update(Account account) throws DataAccessException {
		accountMapper.update(account);
		
	}
}