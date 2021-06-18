package com.ssd.delivery.dao;

import java.util.List;
import org.springframework.dao.DataAccessException;

import com.ssd.delivery.domain.CoPurchasingDTO;
import com.ssd.delivery.domain.CoPurchasingLineItemDTO;

public interface CoPurchasingLineItemDao {

	void insertCPLineItem(CoPurchasingLineItemDTO cp) throws DataAccessException;
	List<CoPurchasingLineItemDTO> getCPLineItemsByCPId(int coPurchasingId) throws DataAccessException;

	

}
