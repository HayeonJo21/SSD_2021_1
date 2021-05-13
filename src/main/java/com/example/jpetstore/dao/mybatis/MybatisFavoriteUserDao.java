package com.example.jpetstore.dao.mybatis;

import java.util.List;
import org.springframework.stereotype.Repository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;

import com.example.jpetstore.dao.FavoriteUserDao;
import com.example.jpetstore.dao.mybatis.mapper.FavoriteUserMapper;
import com.example.jpetstore.domain.FavoriteUserDTO;

@Repository
public class MybatisFavoriteUserDao implements FavoriteUserDao{
	
	@Autowired
	private FavoriteUserMapper favoriteUserMapper;
	
	public void create(FavoriteUserDTO favoriteUser) throws DataAccessException {
		favoriteUserMapper.create(favoriteUser);
	}
	
	public void update(FavoriteUserDTO favoriteUser) throws DataAccessException {
		favoriteUserMapper.update(favoriteUser);
	}
	
	public void delete(String username) throws DataAccessException {
		favoriteUserMapper.remove(username);
	}
	
	public FavoriteUserDTO getFUByUsername(String username) throws DataAccessException {
		return favoriteUserMapper.getFUByUsername(username);
	}
	
	public List<FavoriteUserDTO> getFUList() throws DataAccessException {
		return favoriteUserMapper.getFUList();
	}
}
