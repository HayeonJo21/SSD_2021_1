package com.ssd.delivery.dao.mybatis.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.ssd.delivery.domain.AuctionLineItemDTO;

@Mapper
public interface AuctionLineItemMapper {
  List<AuctionLineItemDTO> getACLineItemsByACId(int acId);

  void insertACLineItem(AuctionLineItemDTO ACLineId);

}
