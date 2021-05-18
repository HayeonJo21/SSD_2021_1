package com.ssd.delivery.dao;

import java.util.List;
import org.springframework.dao.DataAccessException;

import com.ssd.delivery.domain.CoPurchasingDTO;

public interface CoPurchasingDao {
	
	void create(CoPurchasingDTO CP) throws DataAccessException;
	
	void update(CoPurchasingDTO CP) throws DataAccessException;
	
	void remove(String CPId) throws DataAccessException;
	
	List<CoPurchasingDTO> findCPList() throws DataAccessException;
	
	CoPurchasingDTO getCPById(String CPId) throws DataAccessException;
	
	CoPurchasingDTO findCPByusername(String username) throws DataAccessException;
	
	

}