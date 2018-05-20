
package com.example.jpetstore.dao.mybatis.mapper;

public interface MileageMapper {
	//내가 추가한 메소드
		
   int getMileage(String userId);
   
   int getMileageSum(String user_id);//마일리지sum을 구하고
   
   void setMileage(String user_id, int now); //구한 sum을 set한다.
   
   List<Mileage> showMileageList(String userId);
	
   void insert_mileage_history(String userId, Date date, int point,
		                                           boolean transfer, String description);
   


}
