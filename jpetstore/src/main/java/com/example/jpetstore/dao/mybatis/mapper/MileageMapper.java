
package com.example.jpetstore.dao.mybatis.mapper;

public interface MileageMapper {
	//���� �߰��� �޼ҵ�
		
   int getMileage(String userId);
   
   int getMileageSum(String user_id);//���ϸ���sum�� ���ϰ�
   
   void setMileage(String user_id, int now); //���� sum�� set�Ѵ�.
   
   List<Mileage> showMileageList(String userId);
	
   void insert_mileage_history(String userId, Date date, int point,
		                                           boolean transfer, String description);
   


}
