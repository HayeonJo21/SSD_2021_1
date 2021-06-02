package com.ssd.delivery.dao.mybatis;

import java.util.HashMap;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Repository;

import com.ssd.delivery.dao.FleaMarketDao;
import com.ssd.delivery.dao.mybatis.mapper.FleaMarketMapper;
import com.ssd.delivery.domain.ItemDTO;

<<<<<<< HEAD
@Repository
=======
<<<<<<< HEAD
@Repository
public class MybatisFleaMarketDao implements FleaMarketDao{
=======
>>>>>>> branch 'master' of https://github.com/choi1k/SSD_2021_1.git
public class MybatisFleaMarketDao implements FleaMarketDao {
	
<<<<<<< HEAD
=======
>>>>>>> refs/remotes/origin/master
	
	@Autowired
<<<<<<< HEAD
=======
	private ItemMapper itemMapper;
>>>>>>> branch 'master' of https://github.com/choi1k/SSD_2021_1.git
	@Autowired
>>>>>>> refs/remotes/origin/master
	private FleaMarketMapper fleaMarketMapper;
	
<<<<<<< HEAD
=======
	
<<<<<<< HEAD
=======
	
>>>>>>> refs/remotes/origin/master
>>>>>>> branch 'master' of https://github.com/choi1k/SSD_2021_1.git
	public void insertFM(ItemDTO item) throws DataAccessException{
		fleaMarketMapper.insertFM(item);
	};
	
	public void updateFM(ItemDTO item) throws DataAccessException{
		fleaMarketMapper.updateFM(item);
	};
	
	public void deleteFM(ItemDTO item) throws DataAccessException{
		fleaMarketMapper.deleteFM(item);
	};
	
<<<<<<< HEAD
=======
	

>>>>>>> refs/remotes/origin/master
	public ItemDTO getFMById(int itemId) throws DataAccessException{
		return fleaMarketMapper.getFMById(itemId);
	};
	
	public List<ItemDTO> getFMByUsername(String username) throws DataAccessException{
		return fleaMarketMapper.getFMByUsername(username);
	};
	
	public List<ItemDTO> getFMList() throws DataAccessException{
		return fleaMarketMapper.getFMList();
	};

}
