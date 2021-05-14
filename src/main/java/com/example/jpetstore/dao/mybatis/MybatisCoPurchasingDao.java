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
	public void create(CoPurchasingDTO CP) throws DataAccessException {
		CPMapper.create(CP);
		
	}

	@Override
	public void update(CoPurchasingDTO CP) throws DataAccessException {
		CPMapper.update(CP);
		
	}

	@Override
	public void remove(String CPId) throws DataAccessException {
		CPMapper.remove(CPId);
		
	}

	@Override
	public List<CoPurchasingDTO> findCPList() throws DataAccessException {
		return CPMapper.findCPList();
	}

	@Override
	public CoPurchasingDTO getCPById(String CPId) throws DataAccessException {
		return CPMapper.getCPById(CPId);
	}

	@Override
	public CoPurchasingDTO findCPByusername(String username) throws DataAccessException {
		return CPMapper.findCPByusername(username);
	}
}