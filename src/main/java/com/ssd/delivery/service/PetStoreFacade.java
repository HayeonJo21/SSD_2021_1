package com.ssd.delivery.service;

import java.util.List;

import com.ssd.delivery.domain.Account;
import com.ssd.delivery.domain.AccountDTO;
import com.ssd.delivery.domain.Category;
import com.ssd.delivery.domain.Item;
import com.ssd.delivery.domain.Order;
import com.ssd.delivery.domain.Product;

/**
 * JPetStore's central business interface.
 *
 * @author Juergen Hoeller
 * @since 30.11.2003
 */
public interface PetStoreFacade {

	Account getAccount(String username);
	
	AccountDTO getAccountDTO(String username);

	Account getAccount(String username, String password);

	void insertAccount(Account account);

	void updateAccount(Account account);

	List<String> getUsernameList();
	
	List<AccountDTO> findUserList();


	List<Category> getCategoryList();

	Category getCategory(String categoryId);
	

	List<Product> getProductListByCategory(String categoryId);

	List<Product> searchProductList(String keywords);

	Product getProduct(String productId);


	List<Item> getItemListByProduct(String productId);

	Item getItem(String itemId);

	boolean isItemInStock(String itemId);


	void insertOrder(Order order);

	Order getOrder(int orderId);

	List<Order> getOrdersByUsername(String username);

}