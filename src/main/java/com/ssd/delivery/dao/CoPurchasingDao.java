package com.ssd.delivery.dao;

import java.util.List;
import org.springframework.dao.DataAccessException;

import com.ssd.delivery.domain.CoPurchasingDTO;

public interface CoPurchasingDao {
	
	void insertCP(CoPurchasingDTO CP) throws DataAccessException;
	
	void updateCP(CoPurchasingDTO CP) throws DataAccessException;
	
	void deleteCP(int CPId) throws DataAccessException;
	
	List<CoPurchasingDTO> getCPList() throws DataAccessException;
	
	CoPurchasingDTO getCPById(int CPId) throws DataAccessException;
	
	List<CoPurchasingDTO> getCPListByUsername(String username) throws DataAccessException;

	List<CoPurchasingDTO> isExsitingCPAC() throws DataAccessException;
	
	

	int isCPUploader(String username, int cpId)throws DataAccessException;

	int isCPPurchaser(String username, int cpId) throws DataAccessException;
	
	

}
