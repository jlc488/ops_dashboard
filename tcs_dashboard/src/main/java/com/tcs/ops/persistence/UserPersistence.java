package com.tcs.ops.persistence;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.tcs.ops.model.UserBean;


public interface UserPersistence {

List<UserBean> getAll();
	
	UserBean getByNo(int userNo);
	
	UserBean getByName(String userName);
	
	void add( UserBean userBean);
	
	void update( UserBean userBean);
	
	void delete( int userNo);
	
	void deleteByName( String userName);
	
	void changePassword( UserBean userBean);
	
	void bye(UserBean userBean);
	
	public void insertAuthority(String email,String authority);
	
}
