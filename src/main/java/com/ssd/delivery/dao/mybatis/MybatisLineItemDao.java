package com.ssd.delivery.dao.mybatis;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Repository;

import com.ssd.delivery.dao.CoPurchasingDao;
import com.ssd.delivery.dao.LineItemDao;
import com.ssd.delivery.dao.mybatis.mapper.CoPurchasingMapper;
import com.ssd.delivery.dao.mybatis.mapper.LineItemMapper;
import com.ssd.delivery.domain.CoPurchasingDTO;
import com.ssd.delivery.domain.CoPurchasingLineItemDTO;

/**
 * @author Juergen Hoeller
 * @author Colin Sampaleanu
 */
@Repository
public class MybatisLineItemDao implements  LineItemDao {

	@Autowired
	private CoPurchasingMapper CPMapper;
	private LineItemMapper  lineItemMapper;
	@Override
	public void insertCP(CoPurchasingDTO CP) throws DataAccessException {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void updateCP(CoPurchasingDTO CP) throws DataAccessException {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void deleteCP(int CPId) throws DataAccessException {
		// TODO Auto-generated method stub
		
	}
	@Override
	public List<CoPurchasingDTO> getCPList() throws DataAccessException {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public CoPurchasingDTO getCPById(int CPId) throws DataAccessException {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public List<CoPurchasingDTO> getCPListByUsername(String username) throws DataAccessException {
		// TODO Auto-generated method stub
		return null;
	}
	
	
	
	
	
	
}