package com.tcs.ops.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.googlecode.objectify.Objectify;
import com.googlecode.objectify.ObjectifyFactory;
import com.tcs.ops.common.login.OpsGrantedAuthority;
import com.tcs.ops.common.login.OpsUserDetails;
import com.tcs.ops.model.UserBean;


@Controller
@RequestMapping(value="/env")
public class EnvPrepController {

	@Autowired 
	private ObjectifyFactory objectifyFactory;
	
	@RequestMapping(value="/user/{userID}/", method = RequestMethod.GET)
	public UserBean addUsers(@PathVariable String userID){
		UserBean usr = new UserBean();
		
		usr.setActive(true);
		usr.setDescription("this is the admin user");
		usr.setEmail("i@sexysinny.com");
		usr.setFirstName("sin");
		usr.setLastName("kang");
		usr.setUsername(userID);
		
		PasswordEncoder passwordEncoder = new BCryptPasswordEncoder();
		
		usr.setPassword(passwordEncoder.encode(userID));
		
		OpsUserDetails oud = new OpsUserDetails(usr);
		
		OpsGrantedAuthority oga = new OpsGrantedAuthority(userID);
		
		Objectify ofy = objectifyFactory.begin();
		
		ofy.save().entity(usr).now();
		
		ofy.save().entity(oud).now();
		
		ofy.save().entity(oga).now();
		
		return usr;
	}
	
	
	
}
