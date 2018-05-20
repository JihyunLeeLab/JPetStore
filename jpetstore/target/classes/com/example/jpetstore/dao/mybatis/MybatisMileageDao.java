package com.example.jpetstore.dao.mybatis;



public class MybatisMileageDao implements MileageDao {
	//올라가나 함 보쟈
	private MileageMapper mileageMapper;
	
	public int getMileage(String userId) throws DataAccessException {
	
	}
	
	
	void updateMileage(String user_id, int now) throws DataAccessException{
		
	}
	
	
	List<Mileage> showMileageList(String userId) throws DataAccessException{
		
	}
	//이건 마일리지 상세보기 클릭했을때 돌아가는 것
	
	
	void insert_mileage_history( Mileage m) throws DataAccessException{
		
	}
	//마일리지를 적립할때에는 일단 order를 처리할때 불러짐
	//order에서 부르면 마일리지 세부테이블에 적립이되고 account의 mileage를  변경시켜주기 위해 
	//updateMileage실행시켜줌 ㅇㅇ	
	
	 void transferMileage(String user1, String user2,int mileage) throws DataAccessException{
		 
	 }
	

}
