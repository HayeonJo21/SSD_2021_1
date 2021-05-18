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
	public void create(Account account) throws DataAccessException {
		accountMapper.create(account);
	}

	@Override
	public void remove(String username) throws DataAccessException {
		accountMapper.remove(username);
	}

	@Override
	public List<Account> findUserListByAuctionId(String auctionId) throws DataAccessException {
		
		return accountMapper.findUserListByAuctionId(auctionId);
	}

	@Override
	public List<Account> findUserListByUsername(String username) throws DataAccessException {
		
		return accountMapper.findUserListByUsername(username);
	}

	@Override
	public List<Account> findUserListByBidderId(String bidderId) throws DataAccessException {
		
		return accountMapper.findUserListByBidderId(bidderId);
	}

	@Override
	public List<Account> findUserListByCPId(String CPId) throws DataAccessException {
		
		return accountMapper.findUserListByCPId(CPId);
	}

	@Override
	public boolean existingUser(String username) throws DataAccessException {
		
		return accountMapper.existingUser(username);
	}

	@Override
	public List<Account> findFavoriteUserList(String username) throws DataAccessException {
		
		return accountMapper.findFavoriteUserList(username);
	}

	@Override
	public Account findUser(String username) throws DataAccessException {
		
		return accountMapper.findUser(username);
	}

	@Override
	public void update(Account account) throws DataAccessException {
		accountMapper.update(account);
		
	}
}