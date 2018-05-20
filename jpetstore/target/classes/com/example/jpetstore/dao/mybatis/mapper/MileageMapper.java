package com.example.jpetstore.dao.mybatis.mapper;

public interface MileageMapper {
	//내가 추가한 메소드
		
   int getMileage(String userId);
   
   void updateMileage(String user_id, int now);
   
   List<Mileage> showMileageList(String userId);
	
   void insert_mileage_history(Mileage m);
   
   void transferMileage(String user1, String user2,int mileage);
   //여기서 mileage는 A가 B에게 주는 마일리지이다.(마이너스일수가 없음)>>
   //A-mileage
   //B+mileage이렇게 되어야함

}
