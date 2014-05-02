package com.tcs.ops.controller;

import java.io.IOException;
import java.util.List;

import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;
import org.codehaus.jackson.type.TypeReference;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.tcs.ops.model.mediation.MediationBean;
import com.tcs.ops.service.MediationService;

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

@Controller
@RequestMapping(value = "/mediation")
public class MediationController {

	
	@Autowired
	private MediationService mediationService;
	
	@RequestMapping(value = "/cdr_count", method = RequestMethod.GET)
	public ModelAndView getCDRCount(){
		ModelAndView mav =new ModelAndView();
		mav.setViewName("mediation/mediation_cdr_count");
		mav.addObject("startMonth", "01");
		mav.addObject("startDay", "01");
		mav.addObject("startYear", "2014");
		
		List<MediationBean> ret = mediationService.getWeeklyCDRCount();
		
		ObjectMapper om = new ObjectMapper();
		
		try {
			String s = om.writerWithType(new TypeReference<List<MediationBean>>() {
			    }).writeValueAsString(ret);
			mav.addObject("systemCdrCountJSON", s);
		} catch (JsonGenerationException e) {
			e.printStackTrace();
		} catch (JsonMappingException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		 
		return mav;
	}
	
	@RequestMapping(value = "/cdr_split", method = RequestMethod.GET)
	public ModelAndView getCDRSplit(){
		ModelAndView mav = new ModelAndView();
		mav.setViewName("mediation/mediation_cdr_split");
		mav.addObject("startMonth", "01");
		mav.addObject("startDay", "01");
		mav.addObject("startYear", "2014");
		
		List<MediationBean> ret = mediationService.getSystemSplit();
		
		ObjectMapper om = new ObjectMapper();
		
		try {
			String s = om.writerWithType(new TypeReference<List<MediationBean>>() {
			    }).writeValueAsString(ret);
			mav.addObject("systemSplitJSON", s);
		} catch (JsonGenerationException e) {
			e.printStackTrace();
		} catch (JsonMappingException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		 
		return mav;
		
	}
	
	@RequestMapping(value="/cdr_trend", method = RequestMethod.GET)
	public ModelAndView getCDRTrend(){
		ModelAndView mav = new ModelAndView();
		mav.setViewName("mediation/mediation_cdr_trend");
		mav.addObject("startMonth", "11");
		mav.addObject("startDay", "01");
		mav.addObject("startYear", "2013");
		
		mav.addObject("endMonth", "01");
		mav.addObject("endDay", "31");
		mav.addObject("endYear", "2014");
		
		List<MediationBean> retWireless = mediationService.getAll("WIRELESS");
		List<MediationBean> retWireline = mediationService.getAll("WIRELINE");
		
		ObjectMapper om = new ObjectMapper();
		
		try {
			String strWireless = om.writeValueAsString(retWireless);
			
			String strWireline = om.writeValueAsString(retWireline);
			
			mav.addObject("trendJSONwireLess", strWireless);
			mav.addObject("trendJSONwireLine", strWireline);
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
