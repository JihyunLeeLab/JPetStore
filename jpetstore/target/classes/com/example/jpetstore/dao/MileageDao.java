package com.example.jpetstore.dao.mybatis;


public interface MileageDao {
	//�ȴ�?!?!
	
	int getMileage(String userId) throws DataAccessException ;
	//�̰� account�� �����ִ� ���ϸ����� �׳� select�ؼ� �����ִ� ����
	
	void updateMileage(String user_id, int now) throws DataAccessException;
	//�̰� account�� �ִ�  mileage������ �����ų�� ���>>�� �� �о sum����...
	
	List<Mileage> showMileageList(String userId) throws DataAccessException;
	//�̰� ���ϸ��� �󼼺��� Ŭ�������� ���ư��� ��
	
	
	void insert_mileage_history( Mileage m) throws DataAccessException;
	//���ϸ����� �����Ҷ����� �ϴ� order�� ó���Ҷ� �ҷ���
	//order���� �θ��� ���ϸ��� �������̺��� �����̵ǰ� account�� mileage��  ��������ֱ� ���� 
	//updateMileage��������� ����	
	
	 void transferMileage(String user1, String user2,int mileage) throws DataAccessException;
	 //user1�� user2���� Mileage�� �ָ�  
	 //user1 insert_history �ϰ� user2���Ե� insert_history ��>> �۰� �Ѵ� updateMileage�ؾ��Ԥ���
	
	
	

}