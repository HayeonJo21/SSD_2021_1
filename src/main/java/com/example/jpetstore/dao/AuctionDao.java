package com.example.jpetstore.dao;

import java.util.List;

import org.springframework.dao.DataAccessException;

import com.example.jpetstore.domain.AuctionDTO;

import com.example.jpetstore.domain.Order;

public interface AuctionDao {
	
	  
	  void create(AuctionDTO auction) throws DataAccessException;
	  void update(AuctionDTO auction) throws DataAccessException;
	  void remove(AuctionDTO auction) throws DataAccessException;
	  
	  AuctionDTO getAuctionById(int auctionId) throws DataAccessException;
	  List<AuctionDTO> findAuctionByUsername(String username) throws DataAccessException;
	  List<AuctionDTO> findAuctionList() throws DataAccessException;
	  

}
