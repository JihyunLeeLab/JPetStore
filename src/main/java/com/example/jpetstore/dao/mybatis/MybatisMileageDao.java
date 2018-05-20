package com.example.jpetstore.dao.mybatis;

import java.util.Date;
import java.util.List;

import org.springframework.dao.DataAccessException;

import com.example.jpetstore.dao.MileageDao;
import com.example.jpetstore.dao.mybatis.mapper.MileageMapper;
import com.example.jpetstore.domain.Mileage;


public class MybatisMileageDao implements MileageDao {
	//�ö󰡳� �� ����
	private MileageMapper mileageMapper;
	
	public int getMileage(String userId) throws DataAccessException {
		return mileageMapper.getMileage(userId);
	}
	
	
	public void updateMileage(String user_id) throws DataAccessException{
		int now_mileage;
		now_mileage = mileageMapper.getMileageSum(user_id); //�����丮���� sum�� ���ϰ�
		mileageMapper.setMileage(user_id,now_mileage);  //�ش� sum_Mileage�� �ִ´�.
	}
	
	
	public List<Mileage> showMileageList(String userId) throws DataAccessException{
		return mileageMapper.showMileageList(userId);
	}

	
	public void insert_mileage_history( Mileage m) throws DataAccessException{
		mileageMapper.insert_mileage_history(m.getUser_id(),m.getDate(),m.getPoint(),m.isTransfer()
				,m.getDescription());
		mileageMapper.getMileageSum(m.getUser_id()); //account������ ���ϸ��� ����
	}
	
	
	 public void transferMileage(String user1, String user2,int mileage, Date date) throws DataAccessException{
		 mileageMapper.insert_mileage_history(user1,date,(-1)*mileage,1,"transfer");
		 mileageMapper.insert_mileage_history(user2,date,mileage,1,"transfer");
		 updateMileage(user1);
		 updateMileage(user2);
	 }
	

}
