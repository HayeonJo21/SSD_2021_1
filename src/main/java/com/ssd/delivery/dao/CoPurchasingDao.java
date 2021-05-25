package com.ssd.delivery.dao;

import java.util.List;
import org.springframework.dao.DataAccessException;

import com.ssd.delivery.domain.CoPurchasingDTO;

public interface CoPurchasingDao {
	
	void insert(CoPurchasingDTO CP) throws DataAccessException;
	
	void update(CoPurchasingDTO CP) throws DataAccessException;
	
	void delete(String CPId) throws DataAccessException;
	
	List<CoPurchasingDTO> getCPList() throws DataAccessException;
	
	CoPurchasingDTO getCPById(String CPId) throws DataAccessException;
	
	CoPurchasingDTO getCPByUsername(String username) throws DataAccessException;
	
	

}
