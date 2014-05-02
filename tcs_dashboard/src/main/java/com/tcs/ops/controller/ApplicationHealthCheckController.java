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
 * @author sin.kang@tcs.com aka SexySinny
 * @history <li> </li>
 */
@Controller
@RequestMapping(value = "/application_health_check")
public class ApplicationHealthCheckController {

	@RequestMapping(method = RequestMethod.GET)
	public ModelAndView getApplicationHealthCheck(){
		ModelAndView mav = new ModelAndView();
		mav.setViewName("application_health_check/application_health_check");
		return mav;
	}
}
