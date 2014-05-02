package com.tcs.ops.common.login;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

import com.googlecode.objectify.Objectify;
import com.googlecode.objectify.ObjectifyFactory;


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
public class OpsUserDetailService implements UserDetailsService {

	@Autowired 
	private ObjectifyFactory objectifyFactory;
	
	@Override
	public OpsUserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		
		Objectify ofy = objectifyFactory.begin();
		
		OpsUserDetails opsUser = ofy.load().type(OpsUserDetails.class).filter("username", username).first().now();
		if( opsUser == null ){
			
			throw new UsernameNotFoundException(username+" does not exists");
		}
		
		return opsUser;
		
	}

	
}
