package com.tcs.ops.model;

import com.googlecode.objectify.annotation.Cache;
import com.googlecode.objectify.annotation.Entity;
import com.googlecode.objectify.annotation.Id;
import com.googlecode.objectify.annotation.Index;


 /**
 * <PRE>
 * <b>Title: DashBoard Project </b> 
 * <b>
 * </b>
 *
 * <b>Copyright:</b> Copyright (c) 2014
 * <b>Company:</b> TCS
 * <b>Version:</b> 1.0
 * </PRE>
 * @author sin.kang@tcs.com aka SexySinny
 * @history <li> </li>
 */

@Entity
@Cache
@Index
public class AuthorityBean {

	@Id
	private Long id;
	
	private String username = null;
	
	private String authority = null;

	/**
	 * @return the id
	 */
	public Long getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(Long id) {
		this.id = id;
	}

	/**
	 * @return the username
	 */
	public String getUsername() {
		return username;
	}

	/**
	 * @param username the username to set
	 */
	public void setUsername(String username) {
		this.username = username;
	}

	/**
	 * @return the authority
	 */
	public String getAuthority() {
		return authority;
	}

	/**
	 * @param authority the authority to set
	 */
	public void setAuthority(String authority) {
		this.authority = authority;
	}
	
	
}
