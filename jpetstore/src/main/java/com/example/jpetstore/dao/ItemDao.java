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
	
  List<Item> getItemListByProduct(String productId) throws DataAccessException;//������ �ǸŻ�ǰ ��������

  Item getItem(String itemId) throws DataAccessException;  //�����۰�������
  
  //���⼭���� ������ ������ �޼ҵ�
  
  void insertItem(Item item) throws DataAccessException;
  
  int deleteItem(String itemId)throws DataAccessException;
  
  void update_Item(String itemId , Item b)throws DataAccessException;
  
  
  

}
