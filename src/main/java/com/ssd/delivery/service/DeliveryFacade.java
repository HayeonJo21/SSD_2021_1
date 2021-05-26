package com.ssd.delivery.service;

import java.util.List;

import org.springframework.dao.DataAccessException;

import com.ssd.delivery.domain.Account;
import com.ssd.delivery.domain.AuctionDTO;
import com.ssd.delivery.domain.CoPurchasingDTO;

public interface DeliveryFacade {

	void insertDelivery(Account account);

	void updateDelivery(Account account);

	void deleteDelivery(String username);

	List<Account> getUserListByAuctionId(String auctionId)
			throws DataAccessException;

	List<Account> getUserListByCPId(String CPId) throws DataAccessException;

	boolean existingUser(String username) throws DataAccessException;

	List<Account> getFavoriteUserList(String username)
			throws DataAccessException;

	Account findUser(String username) throws DataAccessException;

	void insert(AuctionDTO auction) throws DataAccessException;

	void update(AuctionDTO auction) throws DataAccessException;

	void delete(AuctionDTO auction) throws DataAccessException;

	AuctionDTO getAuctionById(int auctionId) throws DataAccessException;

	List<AuctionDTO> getAuctionByUsername(String username)
			throws DataAccessException;

	List<AuctionDTO> getAuctionList() throws DataAccessException;
void insert(CoPurchasingDTO CP) throws DataAccessException;
	
	void update(CoPurchasingDTO CP) throws DataAccessException;
	
	void delete(String CPId) throws DataAccessException;
	
	List<CoPurchasingDTO> getCPList() throws DataAccessException;
	
	CoPurchasingDTO getCPById(String CPId) throws DataAccessException;
	
	CoPurchasingDTO getCPByUsername(String username) throws DataAccessException;
	
}
