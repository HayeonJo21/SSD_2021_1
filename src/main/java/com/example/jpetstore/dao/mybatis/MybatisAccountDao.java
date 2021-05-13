package com.example.jpetstore.dao.mybatis;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Repository;

import com.example.jpetstore.dao.AccountDao;
import com.example.jpetstore.dao.mybatis.mapper.AccountMapper;
import com.example.jpetstore.domain.Account;

/**
 * @author Juergen Hoeller
 * @author Colin Sampaleanu
 */
@Repository
public class MybatisAccountDao implements AccountDao {

	@Autowired
	private AccountMapper accountMapper;

	@Override
	public void createAccount(Account account) throws DataAccessException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void removeAccount(Account account) throws DataAccessException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Account> findUserListByAuctionId(String auctionId) throws DataAccessException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Account> findUserListByUsername(String username) throws DataAccessException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Account> findUserListByBidderId(String bidderId) throws DataAccessException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Account> findUserListByCPId(String CPId) throws DataAccessException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean existingUser(String username) throws DataAccessException {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public List<Account> findFavoriteUserList(String username) throws DataAccessException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Account findUser(String username) throws DataAccessException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void updateAccount(Account account) throws DataAccessException {
		// TODO Auto-generated method stub
		
	}
}