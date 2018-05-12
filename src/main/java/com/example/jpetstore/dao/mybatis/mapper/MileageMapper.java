package com.example.jpetstore.dao.mybatis.mapper;

public interface MileageMapper {
	//내가 추가한 메소드
	
   void insert_mileage_history(String user_id,int mileage);
   
   int display_mileage(String user_id);
   
   void update_mileage(String user_id,int mileage);

}
