package com.tcs.ops.common.login;

import org.apache.commons.lang.StringUtils;
import org.springframework.security.core.GrantedAuthority;

import com.googlecode.objectify.annotation.Cache;
import com.googlecode.objectify.annotation.Entity;
import com.googlecode.objectify.annotation.Id;
import com.googlecode.objectify.annotation.Index;
import com.tcs.ops.common.OpsConstants;

@Entity
@Cache
@Index
public class OpsGrantedAuthority implements GrantedAuthority {

	private static final long serialVersionUID = 1L;

	public OpsGrantedAuthority(){}
	
	public OpsGrantedAuthority(String userName){
		if("admin".equals(StringUtils.lowerCase(userName))){
			authority = OpsConstants.ROLE_ADMIN;
		}else{
			authority = OpsConstants.ROLE_USER;
		}
		this.username = userName;
	}
	
	
	@Id
	private Long id;
	
	private String username;
	
	private String authority;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public void setAuthority(String authority) {
		this.authority = authority;
	}


	@Override
	public String getAuthority() {
		return authority;
	}

}
