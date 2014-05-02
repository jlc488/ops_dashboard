package com.tcs.ops.persistence.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.googlecode.objectify.Key;
import com.googlecode.objectify.Objectify;
import com.googlecode.objectify.ObjectifyFactory;
import com.tcs.ops.model.AuthorityBean;
import com.tcs.ops.model.UserBean;
import com.tcs.ops.persistence.UserPersistence;


@Repository
public class UserPersistenceImpl implements UserPersistence {

	@Autowired 
	private ObjectifyFactory objectifyFactory;
	
	
	@Override
	public List<UserBean> getAll() {
		Objectify ofy = objectifyFactory.begin();
		
		List<UserBean> list = ofy.load().type(UserBean.class).list();
		
		return list;
	}

	@Override
	public UserBean getByNo(int userNo) {
		Objectify ofy = objectifyFactory.begin();
		
		UserBean usr = ofy.load().type(UserBean.class).id(userNo).now();
		
		return usr;
	}

	@Override
	public UserBean getByName(String userName) {
		
		Objectify ofy = objectifyFactory.begin();
		
		UserBean usr = ofy.load().type(UserBean.class).filter("username", userName).first().now();
		
		return usr;
	}

	@Override
	public void add(UserBean userBean) {
		Objectify ofy = objectifyFactory.begin();
		
		ofy.save().entity(userBean);

	}

	@Override
	public void update(UserBean userBean) {
		Objectify ofy = objectifyFactory.begin();
		
		ofy.save().entity(userBean);

	}

	@Override
	public void delete(int userNo) {
		Objectify ofy = objectifyFactory.begin();

		ofy.delete().type(UserBean.class).id(userNo).now();
	}

	@Override
	public void deleteByName(String userName) {
		Objectify ofy = objectifyFactory.begin();
		
		Key<UserBean> qKey = ofy.load().type(UserBean.class).filter("userName", userName).keys().first().now();
		
		ofy.delete().key(qKey);
	}

	@Override
	public void changePassword(UserBean userBean) {
		Objectify ofy = objectifyFactory.begin();

		ofy.save().entity(userBean);
		
	}

	@Override
	public void bye(UserBean userBean) {
		Objectify ofy = objectifyFactory.begin();

		Key<UserBean> key = ofy.load().type(UserBean.class).filter("id", userBean.getId()).keys().first().now();
		
		ofy.delete().key(key).now();
		
	}

	@Override
	public void insertAuthority(String email, String authority) {
		Objectify ofy = objectifyFactory.begin();
		
		AuthorityBean ab = new AuthorityBean();
		ab.setAuthority(authority);
		ab.setUsername(email);
		
		ofy.save().entity(ab).now();
	}

}
