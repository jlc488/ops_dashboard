package com.tcs.ops.common.login;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.apache.commons.lang.StringUtils;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import com.googlecode.objectify.annotation.Cache;
import com.googlecode.objectify.annotation.Entity;
import com.googlecode.objectify.annotation.Id;
import com.googlecode.objectify.annotation.Index;
import com.tcs.ops.common.OpsConstants;
import com.tcs.ops.model.UserBean;



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
 * @author sin.kang@tcs.com
 * @history <li> </li>
 */

@Entity
@Cache
@Index
public class OpsUserDetails implements UserDetails {

	private static final long serialVersionUID = -6459703280691320983L;
	
	@Id
	private Long id;
	
	private String username = null;
	
    private String password = null;
    
    public OpsUserDetails(){};
    
    
    public OpsUserDetails( UserBean userBean){
    	
    	this.username = userBean.getUsername();
    	
    	this.password = userBean.getPassword();
    }
    
	@Override
	public Collection<? extends GrantedAuthority> getAuthorities() {
		
		List<GrantedAuthority> authorities = new ArrayList<GrantedAuthority>();   
		
		if( "admin".equals(StringUtils.lowerCase(this.username))){
			authorities.add(new SimpleGrantedAuthority(OpsConstants.ROLE_ADMIN));
		}else{
			authorities.add(new SimpleGrantedAuthority(OpsConstants.ROLE_USER));
		}
        
        return authorities;
	}


	@Override
	public boolean isAccountNonExpired() {
		return true;
	}


	@Override
	public boolean isAccountNonLocked() {
		return true;
	}


	@Override
	public boolean isCredentialsNonExpired() {
		return true;
	}


	@Override
	public boolean isEnabled() {
		return true;
	}


	@Override
	public String getPassword() {
		return this.password;
	}


	@Override
	public String getUsername() {
		return this.username;
	}


	public Long getId() {
		return id;
	}


	public void setId(Long id) {
		this.id = id;
	}


	public void setUsername(String username) {
		this.username = username;
	}


	public void setPassword(String password) {
		this.password = password;
	}

}
