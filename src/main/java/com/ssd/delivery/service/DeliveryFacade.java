package com.ssd.delivery.service;

import java.util.Date;
import java.util.List;

import com.ssd.delivery.domain.AccountDTO;
import com.ssd.delivery.domain.AuctionDTO;
import com.ssd.delivery.domain.CoPurchasingDTO;
import com.ssd.delivery.domain.CoPurchasingLineItemDTO;
import com.ssd.delivery.domain.DeliveryDTO;
import com.ssd.delivery.domain.FavoriteUserDTO;
import com.ssd.delivery.domain.FleaMarketDTO;
import com.ssd.delivery.domain.ItemDTO;
import com.ssd.delivery.domain.MessageDTO;

public interface DeliveryFacade {

	// Account
	void insertAccount(AccountDTO accountDTO);

	void updateAccount(AccountDTO account);

	void deleteAccount(String username);

	List<AccountDTO> getUserListByAuctionId(String auctionId);

	List<AccountDTO> getUserListByCPId(String CPId);

	boolean existingUser(String username);

	List<FavoriteUserDTO> getFavoriteUserList(String username);
	
	List<AccountDTO> getUserList();

	AccountDTO findUser(String username);

	// Auction
	void insertAuction(AuctionDTO auction);

	void updateAuction(AuctionDTO auction);

	void deleteAuction(int auctionId);

	AuctionDTO getAuctionById(int auctionId);

	List<AuctionDTO> getAuctionByUsername(String username);

	List<AuctionDTO> getAuctionList();
	
	void testScheduler(Date closingTime);

	// CoPurchasing
	void insertCP(CoPurchasingDTO CP);

	void updateCP(CoPurchasingDTO CP);

	void deleteCP(int cpId);

	List<CoPurchasingDTO> getCPList();

	CoPurchasingDTO getCPById(int CPId);

	List<CoPurchasingDTO> getCPListByUsername(String username);
	
	List<CoPurchasingDTO> isExistingCPAC();

	// Delivery
	void insertDelivery(DeliveryDTO delivery);

	void updateDelivery(DeliveryDTO delivery);

	void deleteDelivery(int deliveryId);

	DeliveryDTO getDeliveryById(int deliveryId);

	List<DeliveryDTO> getDeliveryByUsername(String username);

	List<DeliveryDTO> getDeliveryList();
	
	List<DeliveryDTO> isExistingCP();
	
	List<DeliveryDTO> isExistingAC();

	// FavoriteUser
	void insertFU(FavoriteUserDTO favoriteUser);

	void updateFU(FavoriteUserDTO favoriteUser);

	void deleteFU(int favId);

	List<FavoriteUserDTO> getFUByUsername(String username);

	List<FavoriteUserDTO> getFUList();

	// FleaMarket
	void insertFM(ItemDTO item);

	void updateFM(ItemDTO item);

	void deleteFM(ItemDTO item);

	ItemDTO getFMById(int itemId);

	List<FleaMarketDTO> getFMByUsername(String username);

	List<ItemDTO> getFMList();

	// Message
	void insertMessage(MessageDTO message);

	void updateMessage(MessageDTO message);

	void deleteMessage(String username);

	List<MessageDTO> getMessageListByUsername(String username);
	
	List<MessageDTO> getMessageListByReceiverUsername(String receiver);
	
	List<MessageDTO> getMessageContentByUsername(String sender, String receiver);
	
	List<MessageDTO> getMessageContentByReceiverUsername(String sender, String receiver);

	List<MessageDTO> getMessageList();


	//lineitem

		List<CoPurchasingLineItemDTO> getCPLineItemsByCPId(int cpId);
		void insertCPLineItem(CoPurchasingLineItemDTO lineItem);

	
}
