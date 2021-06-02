package com.ssd.delivery.service;

import java.util.List;

import com.ssd.delivery.domain.AccountDTO;
import com.ssd.delivery.domain.AuctionDTO;
import com.ssd.delivery.domain.CoPurchasingDTO;
import com.ssd.delivery.domain.DeliveryDTO;
import com.ssd.delivery.domain.FavoriteUserDTO;
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

	void deleteAuction(AuctionDTO auction);

	AuctionDTO getAuctionById(int auctionId);

	List<AuctionDTO> getAuctionByUsername(String username);

	List<AuctionDTO> getAuctionList();

	// CoPurchasing
	void insertCP(CoPurchasingDTO CP);

	void updateCP(CoPurchasingDTO CP);

	void deleteCP(String CPId);

	List<CoPurchasingDTO> getCPList();

	CoPurchasingDTO getCPById(String CPId);

	CoPurchasingDTO getCPByUsername(String username);

	// Delivery
	void insertDelivery(DeliveryDTO delivery);

	void updateDelivery(DeliveryDTO delivery);

	void deleteDelivery(int deliveryId);

	DeliveryDTO getDeliveryById(int deliveryId);

	DeliveryDTO getDeliveryByUsername(String username);

	List<DeliveryDTO> getDeliveryList();

	// FavoriteUser
	void insertFU(FavoriteUserDTO favoriteUser);

	void updateFU(FavoriteUserDTO favoriteUser);

	void deleteFU(String username);

	FavoriteUserDTO getFUByUsername(String username);

	List<FavoriteUserDTO> getFUList();

	// FleaMarket
	void insertFM(ItemDTO item);

	void updateFM(ItemDTO item);

	void deleteFM(ItemDTO item);

	ItemDTO getFMById(int itemId);

	List<ItemDTO> getFMByUsername(String username);

	List<ItemDTO> getFMList();

	// Message
	void insertMessage(MessageDTO message);

	void updateMessage(MessageDTO message);

	void deleteMessage(String username);

	MessageDTO getMessageByUsername(String username);

	List<MessageDTO> getMessageList();

}
