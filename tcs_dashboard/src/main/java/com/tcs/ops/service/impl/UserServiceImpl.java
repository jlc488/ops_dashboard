package com.tcs.ops.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tcs.ops.model.UserBean;
import com.tcs.ops.persistence.UserPersistence;
import com.tcs.ops.service.UserService;

 /**
 * <PRE>
 * <b>Title: Dashboard Project</b> 
 * <b>
 * </b>
 *
 * <b>Copyright:</b> Copyright (c) 2012
 * <b>Company:</b> TCS
 * <b>Version:</b> 1.0
 * </PRE>
 * @author sin.kang@tcs.com aka SexySinny
 * @history <li> </li>
 */
@Service(value="userService")
public class UserServiceImpl implements UserService {

	@Autowired
	private UserPersistence userPersistence;
	
	
	@Override
	public List<UserBean> getAll() {
		return this.userPersistence.getAll();
	}

	@Override
	public UserBean getByNo(int userNo) {
		return this.userPersistence.getByNo(userNo);
	}

	@Override
	public void add(UserBean userBean) {
		this.userPersistence.add(userBean);

	}

	@Override
	public void update(UserBean userBean) {
		this.userPersistence.update(userBean);

	}

	@Override
	public void delete(int userNo) {
		this.userPersistence.delete(userNo);

	}

	@Override
	public void insertAuthority(String email, String authority) {
		this.userPersistence.insertAuthority(email, authority);
		
	}

	@Override
	public void changePassword(UserBean userBean) {
		this.userPersistence.changePassword(userBean);
		
	}

	@Override
	public void bye(UserBean userBean) {
		this.userPersistence.bye(userBean);
		
	}

	@Override
	public UserBean login(UserBean userBean) {
		return null;
	}

	

	@Override
	public UserBean getByName(String userName) {
		return this.userPersistence.getByName(userName);
	}

	@Override
	public void deleteByName(String userName) {
		this.userPersistence.deleteByName(userName);
		
	}

}
