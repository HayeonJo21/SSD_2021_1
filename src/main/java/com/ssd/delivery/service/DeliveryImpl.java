package com.ssd.delivery.service;

import java.util.Date;
import java.util.HashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.concurrent.ThreadPoolTaskScheduler;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.ssd.delivery.dao.AccountDao;
import com.ssd.delivery.dao.AuctionDao;
import com.ssd.delivery.dao.CoPurchasingDao;
import com.ssd.delivery.dao.DeliveryDao;
import com.ssd.delivery.dao.EventDao;
import com.ssd.delivery.dao.FavoriteUserDao;
import com.ssd.delivery.dao.FleaMarketDao;
import com.ssd.delivery.dao.MessageDao;
import com.ssd.delivery.domain.AccountDTO;
import com.ssd.delivery.domain.AuctionDTO;
import com.ssd.delivery.domain.CoPurchasingDTO;
import com.ssd.delivery.domain.CoPurchasingLineItemDTO;
import com.ssd.delivery.domain.DeliveryDTO;
import com.ssd.delivery.domain.MessageDTO;
import com.ssd.delivery.domain.FavoriteUserDTO;
import com.ssd.delivery.domain.FleaMarketDTO;
import com.ssd.delivery.domain.ItemDTO;
import com.ssd.delivery.dao.CoPurchasingLineItemDao;


@Transactional
@Service
public class DeliveryImpl implements DeliveryFacade {
	
	@Autowired
	private AccountDao accountDao;
	@Autowired
	private AuctionDao auctionDao;
	@Autowired
	private CoPurchasingDao cpDao;
	@Autowired
	private DeliveryDao deliveryDao;
	@Autowired
	private FavoriteUserDao fuDao;
	@Autowired
	private FleaMarketDao fmDao;
	@Autowired
	private MessageDao messageDao;
	@Autowired
	private EventDao eventDao;
	@Autowired		// applicationContext.xml에 정의된 scheduler 객체를 주입 받음
	private ThreadPoolTaskScheduler scheduler;
	@Autowired
	private CoPurchasingLineItemDao cplineitem;
	
	// Account
	public void insertAccount(AccountDTO account) {
		accountDao.insertAccount(account);
	}
	
	public List<AccountDTO> getUserList(){
		return accountDao.getUserList();
	}

	public void updateAccount(AccountDTO account) {
		accountDao.updateAccount(account);
	}

	public void deleteAccount(String username) {
		accountDao.deleteAccount(username);
	}

	public List<AccountDTO> getUserListByAuctionId(String auctionId) {
		return accountDao.getUserListByAuctionId(auctionId);
	}

	public List<AccountDTO> getUserListByCPId(String CPId) {
		return accountDao.getUserListByCPId(CPId);
	}

	public boolean existingUser(String username) {
		return accountDao.existingUser(username);
	}

	public List<FavoriteUserDTO> getFavoriteUserList(String username) {
		return accountDao.getFavoriteUserList(username);
	}

	public AccountDTO findUser(String username) {
		return accountDao.findUser(username);
	}

	// Auction
	public void insertAuction(AuctionDTO auction) {
		auctionDao.insertAuction(auction);
	}

	public void updateAuction(AuctionDTO auction) {
		auctionDao.updateAuction(auction);
	}

	public void deleteAuction(int auctionId) {
		auctionDao.deleteAuction(auctionId);
	}

	public AuctionDTO getAuctionById(int auctionId) {
		return auctionDao.getAuctionById(auctionId);
	}

	public List<AuctionDTO> getAuctionByUsername(String username) {
		return auctionDao.getAuctionByUsername(username);
	}

	public List<AuctionDTO> getAuctionList() {
		return auctionDao.getAuctionList();
	}
	
	// CoPurchasing
	public void insertCP(CoPurchasingDTO CP) {
		cpDao.insertCP(CP);
	}

	public void updateCP(CoPurchasingDTO CP) {
		cpDao.updateCP(CP);
	}

	public void deleteCP(int CPId) {
		cpDao.deleteCP(CPId);
	}
	public List<CoPurchasingDTO> getCPList() {
		return cpDao.getCPList();
	}

	public CoPurchasingDTO getCPById(int CPId) {
		return cpDao.getCPById(CPId);
	}

	public List<CoPurchasingDTO> getCPListByUsername(String username) {
		return cpDao.getCPListByUsername(username);
	}
	
	// Delivery
	public void insertDelivery(DeliveryDTO delivery) {
		deliveryDao.insertDelivery(delivery);
	}

	public void updateDelivery(DeliveryDTO delivery) {
		deliveryDao.updateDelivery(delivery);
	}

	public void deleteDelivery(int deliveryId) {
		deliveryDao.deleteDelivery(deliveryId);
	}

	public DeliveryDTO getDeliveryById(int deliveryId) {
		return deliveryDao.getDeliveryById(deliveryId);
	}
	
	public List<DeliveryDTO> isExistingCP() {
		return deliveryDao.isExistingCP();
	}
	
	public List<DeliveryDTO> isExistingAC() {
		return deliveryDao.isExistingAC();
	}

	public List<DeliveryDTO> getDeliveryByUsername(String username) {
		return deliveryDao.getDeliveryByUsername(username);
	}

	public List<DeliveryDTO> getDeliveryList() {
		return deliveryDao.getDeliveryList();
	}
	
	@Override
	public List<CoPurchasingDTO> isExistingCPAC() {
		// TODO Auto-generated method stub
		return null;
	}
	// FavoriteUser
	public void insertFU(FavoriteUserDTO favoriteUser) {
		fuDao.insertFU(favoriteUser);
	}

	public void updateFU(FavoriteUserDTO favoriteUser) {
		fuDao.updateFU(favoriteUser);
	}

	public void deleteFU(int favId) {
		fuDao.deleteFU(favId);
	}

	public List<FavoriteUserDTO> getFUByUsername(String username) {
		return fuDao.getFUByUsername(username);
	}

	public List<FavoriteUserDTO> getFUList() {
		return fuDao.getFUList();
	}

	// FleaMarket
	public void insertFM(ItemDTO item) {
		fmDao.insertFM(item);
	}

	public void updateFM(ItemDTO item) {
		fmDao.updateFM(item);
	}

	public void deleteFM(ItemDTO item) {
		fmDao.deleteFM(item);
	}

	public ItemDTO getFMById(int itemId) {
		return fmDao.getFMById(itemId);
	}

	public List<FleaMarketDTO> getFMByUsername(String username) {
		return fmDao.getFMByUsername(username);
	}

	public List<ItemDTO> getFMList() {
		return fmDao.getFMList();
	}

	// Message
	public void insertMessage(MessageDTO message) {
		messageDao.insertMessage(message);
	}

	public void updateMessage(MessageDTO message) {
		messageDao.updateMessage(message);
	}

	public void deleteMessage(String username) {
		messageDao.deleteMessage(username);
	}

	public List<MessageDTO> getMessageListByUsername(String username) {
		return messageDao.getMessageListByUsername(username);
	}
	
	public List<MessageDTO> getMessageListByReceiverUsername(String receiver) {
		return messageDao.getMessageListByReceiverUsername(receiver);
	}

	public List<MessageDTO> getMessageContentByUsername(String sender, String receiver) {
		return messageDao.getMessageContentByUsername(sender, receiver);
	}
	
	public List<MessageDTO> getMessageContentByReceiverUsername(String sender, String receiver) {
		return messageDao.getMessageContentByReceiverUsername(sender, receiver);
	}
	
	public List<MessageDTO> getMessageList() {
		return messageDao.getMessageList();
	}
	

	//lineitem

		public List<CoPurchasingLineItemDTO> getCPLineItemsByCPId(int cpId){
			return cplineitem.getCPLineItemsByCPId(cpId);
		}
		public void insertCPLineItem(CoPurchasingLineItemDTO lineItem) {
			cplineitem.insertCPLineItem(lineItem);
		}

	public void testScheduler(Date closingTime) {
		
		Runnable updateTableRunner = new Runnable() {	
			// anonymous class 정의
			@Override
			public void run() {   // 스케쥴러에 의해 미래의 특정 시점에 실행될 작업을 정의				
				Date curTime = new Date();
				// 실행 시점의 시각을 전달하여 그 시각 이전의 closing time 값을 갖는 event의 상태를 변경 
				eventDao.closeEvent(curTime);	// EVENTS 테이블의 레코드 갱신	
				System.out.println("updateTableRunner is executed at " + curTime);
			}
		};
		
		HashMap<String, Date> hashMap = new HashMap<String, Date>();
		hashMap.put("curTime", new Date());			// 현재 시각: PK 값으로 사용
		hashMap.put("closingTime", closingTime);	// 미래의 종료 시각
		eventDao.insertNewEvent(hashMap);	// EVENTS 테이블에 레코드 삽입

		// 스케줄 생성: closingTime에 updateTableRunner.run() 메소드 실행
		scheduler.schedule(updateTableRunner, closingTime);  
		
		System.out.println("updateTableRunner has been scheduled to execute at " + closingTime);
	}
}
