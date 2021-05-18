package com.ssd.delivery.dao;

import java.util.List;

import org.springframework.dao.DataAccessException;

import com.ssd.delivery.domain.AuctionDTO;
import com.ssd.delivery.domain.Order;

public interface AuctionDao {
	
	  
	  void insert(AuctionDTO auction) throws DataAccessException;
	  void update(AuctionDTO auction) throws DataAccessException;
	  void delete(AuctionDTO auction) throws DataAccessException;
	  
	  AuctionDTO getAuctionById(int auctionId) throws DataAccessException;
	  List<AuctionDTO> getAuctionByUsername(String username) throws DataAccessException;
	  List<AuctionDTO> getAuctionList() throws DataAccessException;
	  

}
