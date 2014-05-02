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
import com.tcs.ops.model.order.OrderBean;
import com.tcs.ops.service.OrderService;

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
@RequestMapping(value = "/order")
public class OrderController {
	
	@Autowired
	private OrderService orderService;
	
	@RequestMapping(value="/aging" , method = RequestMethod.GET)
	public ModelAndView getOrderAging(){
		ModelAndView mav = new ModelAndView();
		mav.setViewName("order/order_aging");
		List<OrderBean> ret = orderService.getOrderAging("IPTV");
		List<OrderBean> ret2 = orderService.getOrderAging("INTERNET");
		List<OrderBean> ret3 = orderService.getOrdAgingGraph("INPROGRESS");
		List<OrderBean> ret4 = orderService.getOrdAgingGraph("FAILED");
		ObjectMapper om = new ObjectMapper();
		try {
			String s = om.writerWithType(new TypeReference<List<OrderBean>>(){}).writeValueAsString(ret);
			String s2 = om.writerWithType(new TypeReference<List<OrderBean>>(){}).writeValueAsString(ret2);
			String s3 = om.writerWithType(new TypeReference<List<OrderBean>>(){}).writeValueAsString(ret3);
			String s4 = om.writerWithType(new TypeReference<List<OrderBean>>(){}).writeValueAsString(ret4);
			
			mav.addObject("agingJSONIPTV", s);
			mav.addObject("agingJSONINTERNET", s2);
			mav.addObject("agingJSONinprogress", s3);
			mav.addObject("agingJSONfailed", s4);
			
		} catch (JsonGenerationException e) {
			e.printStackTrace();
		} catch (JsonMappingException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		 
		return mav;
	}
	
	/* @RequestMapping(value = "/fall_out" , method = RequestMethod.GET)
	public ModelAndView getOrderFallOut(){
		ModelAndView mav = new ModelAndView();
		
		mav.setViewName("order/order_fall_out");
		
		return mav;
	} */
	
	@RequestMapping(value = "/fall_out" , method = RequestMethod.GET)
	public ModelAndView getOrderFallOut(){
		ModelAndView mav = new ModelAndView();
		mav.setViewName("order/order_fall_out");
		mav.addObject("startMonth", "11");
		mav.addObject("startDay", "01");
		mav.addObject("startYear", "2013");
		
		mav.addObject("endMonth", "01");
		mav.addObject("endDay", "31");
		mav.addObject("endYear", "2014");
		
		List<OrderBean> retOrderFallcount = orderService.getOrderFalloutcnt();
		
		
		ObjectMapper om = new ObjectMapper();
		
		try {
			String strOrderFalloutcnt = om.writeValueAsString(retOrderFallcount);
			
			
			
			mav.addObject("trendJSONorderFalloutcnt", strOrderFalloutcnt);
			
		} catch (JsonGenerationException e) {
			e.printStackTrace();
		} catch (JsonMappingException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		return mav;
	}
	
	
	@RequestMapping(value = "/status", method = RequestMethod.GET)
	public ModelAndView getOrderStatus(){
		ModelAndView mav = new ModelAndView();
		
		mav.setViewName("order/order_status");
		mav.addObject("startMonth", "11");
		mav.addObject("startDay", "01");
		mav.addObject("startYear", "2013");
		
		mav.addObject("endMonth", "01");
		mav.addObject("endDay", "31");
		mav.addObject("endYear", "2014");
		
		List<OrderBean> retNewOrderStatusIPTV = orderService.getOrderStatus("NEW","IPTV");
		List<OrderBean> retModifyOrderStatusIPTV = orderService.getOrderStatus("MODIFY","IPTV");
		List<OrderBean> retTerminateOrderStatusIPTV = orderService.getOrderStatus("TERMINATE","IPTV");
		
		
		ObjectMapper om = new ObjectMapper();
		
		try {
			String strNewOrderIPTVcnt = om.writeValueAsString(retNewOrderStatusIPTV);
			String strModifyOrderIPTVcnt = om.writeValueAsString(retModifyOrderStatusIPTV);
			String strTerminateOrderIPTVcnt = om.writeValueAsString(retTerminateOrderStatusIPTV);
			mav.addObject("tcountJSONnewOrderIPTV", strNewOrderIPTVcnt);
			mav.addObject("tcountJSONmodifyOrderIPTV", strModifyOrderIPTVcnt);
			mav.addObject("tcountJSONterminateOrderIPTV", strTerminateOrderIPTVcnt);
			
		} catch (JsonGenerationException e) {
			e.printStackTrace();
		} catch (JsonMappingException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		return mav;
	}
	
	@RequestMapping(value = "/summary", method = RequestMethod.GET)
	public ModelAndView getOrderSummary(){
		ModelAndView mav = new ModelAndView();
		
		mav.setViewName("order/order_summary");
		
		return mav;
	}

}
