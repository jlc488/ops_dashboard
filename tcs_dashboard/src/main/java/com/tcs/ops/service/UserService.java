package com.tcs.ops.service;

import java.util.List;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.stereotype.Service;

import com.tcs.ops.model.UserBean;

 /**
 * <PRE>
 * <b>Title:  Dashboard Project</b> 
 * <b>
 * </b>
 *
 * <b>Copyright:</b> Copyright (c) 2012
 * <b>Company:</b> TCS
 * <b>Version:</b> 1.0
 * </PRE>
 * @author sin.kang@tcs.com
 * @history <li> </li>
 */
public interface UserService{
	List<UserBean> getAll();
	
	UserBean getByName( String userName);
	
	UserBean getByNo(int userNo);
	
	void add(UserBean userBean);
	
	void update( UserBean userBean);
	
	void delete( int userNo);
	
	void deleteByName(String userName);
	
	void changePassword(UserBean userBean);
	
	void bye(UserBean userBean);
	UserBean login(UserBean userBean);
	
	public void insertAuthority(String email,String authority);
}
