package com.example.jpetstore.dao.mybatis;



public class MybatisMileageDao implements MileageDao {
	//�ö󰡳� �� ����
	private MileageMapper mileageMapper;
	
	public int getMileage(String userId) throws DataAccessException {
	
	}
	
	
	void updateMileage(String user_id, int now) throws DataAccessException{
		
	}
	
	
	List<Mileage> showMileageList(String userId) throws DataAccessException{
		
	}
	//�̰� ���ϸ��� �󼼺��� Ŭ�������� ���ư��� ��
	
	
	void insert_mileage_history( Mileage m) throws DataAccessException{
		
	}
	//���ϸ����� �����Ҷ����� �ϴ� order�� ó���Ҷ� �ҷ���
	//order���� �θ��� ���ϸ��� �������̺� �����̵ǰ� account�� mileage��  ��������ֱ� ���� 
	//updateMileage��������� ����	
	
	 void transferMileage(String user1, String user2,int mileage) throws DataAccessException{
		 
	 }
	

}
