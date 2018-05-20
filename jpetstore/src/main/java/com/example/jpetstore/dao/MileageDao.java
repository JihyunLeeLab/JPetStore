package com.example.jpetstore.dao;

import java.util.Date;
import java.util.List;

import org.springframework.dao.DataAccessException;

import com.example.jpetstore.domain.Mileage;

public interface MileageDao {
	//안뇽?!?!
	
	int getMileage(String userId) throws DataAccessException ;
	//이건 account에 원래있는 마일리지를 그냥 select해서 보여주는 것임
	
	void updateMileage(String user_id) throws DataAccessException;
	//이건 account에 있는  mileage내역을 변경시킬때 사용>>걍 다 읽어서 sum하쟈...
	
	List<Mileage> showMileageList(String userId) throws DataAccessException;
	//이건 마일리지 상세보기 클릭했을때 돌아가는 것
	
	
	void insert_mileage_history( Mileage m) throws DataAccessException;
	//마일리지를 적립할때에는 일단 order를 처리할때 불러짐
	//order에서 부르면 마일리지 세부테이블에 적립이되고 account의 mileage를  변경시켜주기 위해 
	//updateMileage실행시켜줌 ㅇㅇ	
	
	 void transferMileage(String user1, String user2,int mileage,Date date) throws DataAccessException;
	 //user1이 user2에게 Mileage를 주면  
	 //user1 insert_history 하고 user2에게도 insert_history 함>> 글고 둘다 updateMileage해야함ㅇㅇ
	
	
	

}
