package com.tcs.ops.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.tcs.ops.common.login.OpsUserDetails;
import com.tcs.ops.model.UserBean;
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
@RequestMapping(value="/")
@Controller
public class IndexController {


	Logger log = LoggerFactory.getLogger(IndexController.class);
	
	@Autowired
	UserService userService;
	
	@Autowired
	PasswordEncoder passwordEncoder;
	
	public OpsUserDetails getUser(){
		log.error("--------------------------------------     getUser() mehtod " ); 
		return (OpsUserDetails)SecurityContextHolder.getContext().getAuthentication().getPrincipal();
	}
	
	@RequestMapping(value="/users/signup", method=RequestMethod.POST)
	public ModelAndView signUp(@ModelAttribute UserBean userBean, BindingResult bindingResult){
		
		if( bindingResult.hasErrors() ){
			//TODO 
			// need to implement 
		}
		
		userBean.setPassword(passwordEncoder.encode(userBean.getPassword()));
		
		userService.add(userBean);
		
		
		ModelAndView mav = new ModelAndView();
		mav.setViewName("/login");
		
		return mav;
	}
	
	@RequestMapping(value="/users/signup", method = RequestMethod.GET)
	public ModelAndView signUp(){
		return new ModelAndView("signup");
	}
	
	@RequestMapping(value = "/index", method = RequestMethod.GET)
    public ModelAndView index(){
        ModelAndView mav = new ModelAndView();
        mav.setViewName("index");
        mav.addObject("username", getUser().getUsername());
        log.error("------------------------------------------------------- index() method ");
        return mav;
    }
    
    @RequestMapping(value = "/users/login", method = RequestMethod.GET)
    public ModelAndView login(){
    	
        log.error("========================================================= login() method");
        return new ModelAndView("login");
    }
    
    @RequestMapping(value="/profile", method = RequestMethod.GET)
    public ModelAndView getProfile(){
    	ModelAndView mav = new ModelAndView();
    	mav.addObject("username", getUser().getUsername());
    	mav.addObject("password", getUser().getPassword());
    	mav.setViewName("profile");
    	return mav;
    }
}
