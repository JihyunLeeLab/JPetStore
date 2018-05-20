/*
 *    Copyright 2010-2013 the original author or authors.
 *
 *    Licensed under the Apache License, Version 2.0 (the "License");
 *    you may not use this file except in compliance with the License.
 *    You may obtain a copy of the License at
 *
 *       http://www.apache.org/licenses/LICENSE-2.0
 *
 *    Unless required by applicable law or agreed to in writing, software
 *    distributed under the License is distributed on an "AS IS" BASIS,
 *    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *    See the License for the specific language governing permissions and
 *    limitations under the License.
 */

package com.example.jpetstore.dao.mybatis.mapper;

import java.util.List;
import java.util.Map;

import org.springframework.dao.DataAccessException;

import com.example.jpetstore.domain.Item;

/**
 * @author Eduardo Macarron
 *
 */
public interface ItemMapper {
/*
  void updateInventoryQuantity(Map<String, Object> param);
  int getInventoryQuantity(String itemId); 
  boolean isItemInStock(String itemId);
*/
	
  List<Item> getItemListByProduct(String productId);

  Item getItem(String itemId);
  
 
  //여기서부터 추가한 메소드
  //사용자가 등록한 아이템을 보여주는 메소드
  List<Item> getItemByUser(String userId) throws DataAccessException;
  
  
  //아이템을 넣는것
  void insertItem(String itemId,String proId,String catId,double lp,double up,
		  String suppId,String status,String a1,String a2,String a3,String a4,String a5,
		  int isAuction);
  
  
  int deleteItem(String itemId);
  
  //아이템 수정페이지 자체가 이미 전체 수정이 가능하게 되어있으므로 그냥 아이템하나 자체를 다 바꾼다는 생각으로 이렇게 코딩
  void update_Item(String itemId,String proId,String catId,double lP,double uP,
		  String suppId,String status,String a1,String a2,String a3,String a4,String a5,
		  int isAuction);
  

}
