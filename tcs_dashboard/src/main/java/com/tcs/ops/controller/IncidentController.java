package com.tcs.ops.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

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
 * @author Mayank Tantuway
 * @history <li> </li>
 */
@Controller
@RequestMapping(value = "/incident")
public class IncidentController {

	@RequestMapping(method = RequestMethod.GET)
	public ModelAndView getCustomerSync(){
		ModelAndView mav = new ModelAndView();
		mav.setViewName("incident/incident");
		return mav;
	}
	
	@RequestMapping(value = "/sla", method = RequestMethod.GET)
	public ModelAndView getSLA(){
		ModelAndView mav = new ModelAndView();
		mav.setViewName("incident/incident_sla");
		return mav;
	}
}
