package com.example.jpetstore.dao.mybatis.mapper;

public interface MileageMapper {
	//���� �߰��� �޼ҵ�
		
   int getMileage(String userId);
   
   void updateMileage(String user_id, int now);
   
   List<Mileage> showMileageList(String userId);
	
   void insert_mileage_history(Mileage m);
   
   void transferMileage(String user1, String user2,int mileage);
   //���⼭ mileage�� A�� B���� �ִ� ���ϸ����̴�.(���̳ʽ��ϼ��� ����)>>
   //A-mileage
   //B+mileage�̷��� �Ǿ����

}
