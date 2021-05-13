package com.example.jpetstore.dao.mybatis;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Repository;

import com.example.jpetstore.dao.CoPurchasingDao;
import com.example.jpetstore.dao.mybatis.mapper.CoPurchasingMapper;
import com.example.jpetstore.domain.CoPurchasingDTO;

/**
 * @author Juergen Hoeller
 * @author Colin Sampaleanu
 */
@Repository
public class MybatisCoPurchasingDao implements CoPurchasingDao {

	@Autowired
	private CoPurchasingMapper CPMapper;
	
	@Override
	public void createCP(CoPurchasingDTO CP) throws DataAccessException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void updateCP(CoPurchasingDTO CP) throws DataAccessException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void removeCP(CoPurchasingDTO CP) throws DataAccessException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<CoPurchasingDTO> findCPList() throws DataAccessException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public CoPurchasingDTO getCPById(String CPId) throws DataAccessException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public CoPurchasingDTO findCPByusername(String username) throws DataAccessException {
		// TODO Auto-generated method stub
		return null;
	}
}