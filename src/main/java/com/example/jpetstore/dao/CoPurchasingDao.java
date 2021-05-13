package com.example.jpetstore.dao;

import java.util.List;
import org.springframework.dao.DataAccessException;
import com.example.jpetstore.domain.CoPurchasingDTO;

public interface CoPurchasingDao {
	
	void createCP(CoPurchasingDTO CP) throws DataAccessException;
	
	void updateCP(CoPurchasingDTO CP) throws DataAccessException;
	
	void removeCP(CoPurchasingDTO CP) throws DataAccessException;
	
	List<CoPurchasingDTO> findCPList() throws DataAccessException;
	
	CoPurchasingDTO getCPById(String CPId) throws DataAccessException;
	
	CoPurchasingDTO findCPByusername(String username) throws DataAccessException;
	
	

}
