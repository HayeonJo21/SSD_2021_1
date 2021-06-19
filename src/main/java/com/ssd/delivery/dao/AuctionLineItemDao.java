package com.ssd.delivery.dao;

import java.util.List;
import org.springframework.dao.DataAccessException;

import com.ssd.delivery.domain.AuctionLineItemDTO;
import com.ssd.delivery.domain.CoPurchasingLineItemDTO;

public interface AuctionLineItemDao {

	void insertACLineItem(AuctionLineItemDTO ac) throws DataAccessException;
	List<AuctionLineItemDTO> getACLineItemsByACId(int auctionId) throws DataAccessException;

	

}
