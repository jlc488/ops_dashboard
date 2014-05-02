package com.tcs.ops.service;

import java.util.List;

import com.tcs.ops.model.order.OrderBean;

 /**
 * <PRE>
 * <b>Title:</b> 
 * <b>
 * </b>
 *
 * <b>Copyright:</b> Copyright (c) 2012
 * <b>Company:</b> kt
 * <b>Version:</b> 1.0
 * </PRE>
 * @author user_email@email.com
 * @history <li> </li>
 */
public interface OrderService {

	List<OrderBean> getOrderAging(String orderProduct);
	
	List<OrderBean> getOrderStatus(String orderType, String orderProduct);
	
	List<OrderBean> getOrderDetails(String createdDateInMills);
	
	List<OrderBean> getOrderDetailsHist();
	
	List<OrderBean> getOrdAgingGraph(String orderStatus);
	
	List<OrderBean> getOrderFalloutcnt();
	
}
