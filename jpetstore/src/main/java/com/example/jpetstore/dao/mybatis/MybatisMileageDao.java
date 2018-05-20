package com.example.jpetstore.dao.mybatis;

import com.example.jpetstore.domain.Mileage;

public class MybatisMileageDao implements MileageDao {
	//올라가나 함 보쟈
	private MileageMapper mileageMapper;
	
	public int getMileage(String userId) throws DataAccessException {
		return mileageMapper.getMileage(userId);
	}
	
	
	public void updateMileage(String user_id) throws DataAccessException{
		int now_mileage;
		now_mileage = mileageMapper.getMileageSum(user_id); //히스토리에서 sum을 구하고
		mileageMapper.setMileage(user_id,now_mileage);  //해당 sum_Mileage를 넣는다.
	}
	
	
	public List<Mileage> showMileageList(String userId) throws DataAccessException{
		return mileageMapper.showMileageList(userId);
	}

	
	public void insert_mileage_history( Mileage m) throws DataAccessException{
		mileageMapper.insert_mileage_history(m.getUser_id(),m.getDate(),m.getPoint(),m.isTransfer()
				,m.getDescription());
		mileageMapper.updateMileage(m.getUser_id()); //account내역의 마일리지 갱신
	}
	
	
	 public void transferMileage(String user1, String user2,int mileage, Date date) throws DataAccessException{
		 mileageMapper.insert_mileage_history(user1,date,(-1)*mileage,true,"transfer");
		 mileageMapper.insert_mileage_history(user2,date,mileage,true,"transfer");
		 mileageMapper.updateMileage(user1);
		 mileageMapper.updateMileage(user2);
	 }
	

}
