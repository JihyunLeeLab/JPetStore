package com.example.jpetstore.dao;

import java.util.List;

import org.springframework.dao.DataAccessException;

import com.example.jpetstore.domain.Item;
import com.example.jpetstore.domain.Order;

public interface ItemDao {
/*
  void updateQuantity(Order order) throws DataAccessException;

  boolean isItemInStock(String itemId) throws DataAccessException;
*/
	
  List<Item> getItemListByProduct(String productId) throws DataAccessException;//종류별 판매상품 가져오기

  Item getItem(String itemId) throws DataAccessException;  //아이템가져오기
  
  //여기서부터 또히가 정의한 메소드
  
  void insertItem(Item item) throws DataAccessException;
  
  int deleteItem(String itemId)throws DataAccessException;
  
  void update_Item(String itemId , Item b)throws DataAccessException;
  
  
  

}
