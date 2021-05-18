package com.example.jpetstore.dao.mybatis;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import com.example.jpetstore.dao.SequenceDao;
import com.example.jpetstore.dao.mybatis.mapper.LineItemMapper;
import com.example.jpetstore.dao.mybatis.mapper.OrderMapper;

import com.example.jpetstore.dao.AuctionDao;


import com.example.jpetstore.dao.mybatis.mapper.AuctionMapper;


import com.example.jpetstore.domain.BidderLineItemDTO;
import com.example.jpetstore.domain.AuctionDTO;



import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Repository;

@Repository
public class MybatisAuctionDao implements AuctionDao {
	
	@Autowired
	protected OrderMapper orderMapper;
	@Autowired
	protected LineItemMapper lineItemMapper;
	@Autowired
	private SequenceDao sequenceDao;
	
	@Autowired
	private AuctionMapper auctionMapper;
	
	
	@Override
	public void create(AuctionDTO auction) throws DataAccessException {  
    	auction.setAuctionId(sequenceDao.getNextId("auctionId"));
    	auctionMapper.create(auction);
	}
	@Override
	public void update(AuctionDTO auction) throws DataAccessException {  
    	auctionMapper.update(auction);
	}
	@Override
	public void remove(AuctionDTO auction) throws DataAccessException {  
    	auctionMapper.remove(auction);
	}
	@Override
	public AuctionDTO getAuctionById(int auctionId) {
		AuctionDTO auction = auctionMapper.getAuctionById(auctionId);
		return auction;
	};
	@Override
	public List<AuctionDTO> findAuctionByUsername(String username){
	    return auctionMapper.findAuctionByUsername(username);
	};
	@Override
	public List<AuctionDTO> findAuctionList(){
	    return auctionMapper.findAuctionList();
	}

	
	
}