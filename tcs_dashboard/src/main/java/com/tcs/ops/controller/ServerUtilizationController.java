package com.tcs.ops.controller;

import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;
import org.joda.time.DateTime;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.tcs.ops.common.OpsUtil;
import com.tcs.ops.model.mediation.MediationBean;
import com.tcs.ops.model.serverUtilization.ServerUtilizationBean;
import com.tcs.ops.service.MediationService;
import com.tcs.ops.service.ServerUtilizationService;

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
@RequestMapping(value = "/server_utilization")

public class ServerUtilizationController {

	@Autowired
	private ServerUtilizationService serverUtilizationService;
	
	@RequestMapping(method=RequestMethod.GET, value="/server/value")
	public ModelAndView getServierUtilizationDetail() throws ParseException{
		
		ModelAndView mav = new ModelAndView();
		mav.setViewName("server_utilization/server_utilization2");
		
		List<ServerUtilizationBean> retWireless = serverUtilizationService.getServerUtilizationTrend(OpsUtil.strDateToMills("2013-10-12")+"");
		
		ObjectMapper om = new ObjectMapper();
		
		try {
			String strWireless = om.writeValueAsString(retWireless);
			
			
			mav.addObject("trendJSONwireLess", strWireless);
			
		} catch (JsonGenerationException e) {
			e.printStackTrace();
		} catch (JsonMappingException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		return mav;
	}
		
		
	
	@RequestMapping(method = RequestMethod.GET)
	public ModelAndView getServerUtilization() throws ParseException{
		ModelAndView mav = new ModelAndView();
		mav.setViewName("server_utilization/server_utilization1");
	 
		List<ServerUtilizationBean> retWireless = serverUtilizationService.getServerUtilizationTrend(OpsUtil.strDateToMills("2013-10-12")+"");
		
		ObjectMapper om = new ObjectMapper();
		
		try {
			String strWireless = om.writeValueAsString(retWireless);
			
			
			mav.addObject("trendJSONwireLess", strWireless);
			
		} catch (JsonGenerationException e) {
			e.printStackTrace();
		} catch (JsonMappingException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		return mav;
	}
}
