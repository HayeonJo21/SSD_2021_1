package com.ssd.delivery.dao;

import java.util.List;

import org.springframework.dao.DataAccessException;

import com.ssd.delivery.domain.Category;

public interface CategoryDao {

	List<Category> getCategoryList() throws DataAccessException;

	Category getCategory(String categoryId) throws DataAccessException;

}
