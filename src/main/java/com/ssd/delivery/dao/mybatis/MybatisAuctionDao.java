package com.ssd.delivery.dao.mybatis;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import com.ssd.delivery.dao.AuctionDao;
import com.ssd.delivery.dao.SequenceDao;
import com.ssd.delivery.dao.mybatis.mapper.AuctionMapper;
import com.ssd.delivery.dao.mybatis.mapper.LineItemMapper;
import com.ssd.delivery.dao.mybatis.mapper.OrderMapper;
import com.ssd.delivery.domain.AuctionDTO;
import com.ssd.delivery.domain.BidderLineItemDTO;

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
	public List<AuctionDTO> getAuctionByUsername(String username){
	    return auctionMapper.getAuctionByUsername(username);
	};
	@Override
	public List<AuctionDTO> getAuctionList(){
	    return auctionMapper.getAuctionList();
	}

	
	
}