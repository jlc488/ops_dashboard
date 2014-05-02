package com.tcs.ops.service.impl;

import java.sql.Date;
import java.util.List;

import org.springframework.stereotype.Service;

import com.tcs.ops.model.order.OrderBean;
import com.tcs.ops.persistence.OrderPersistence;
import com.tcs.ops.service.OrderService;

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

@Service
public class OrderServiceImpl implements OrderService {

	private OrderPersistence orderPersistence;
	
	@Override
	public List<OrderBean> getOrderAging(String orderProduct) {
		List<OrderBean > ret = orderPersistence.getOrderAging(orderProduct);
		return ret;
	}

	@Override
	public List<OrderBean> getOrderStatus(String orderType, String orderProduct) {
		List<OrderBean> ret = orderPersistence.getOrderStatus(orderType,orderProduct);
		return ret;
	}

	@Override
	public List<OrderBean> getOrderDetails(String createdDateInMills) {
		List<OrderBean> ret=orderPersistence.getOrderDetails(createdDateInMills);
		return ret;
	}

	@Override
	public List<OrderBean> getOrderDetailsHist() {
		List<OrderBean> ret = orderPersistence.getOrderDetailsHist();
		return ret;
	}

	@Override
	public List<OrderBean> getOrdAgingGraph(String orderStatus) {
		List<OrderBean> ret = orderPersistence.getOrdAgingGraph(orderStatus);
		return ret;
	}
	
	public List<OrderBean> getOrderFalloutcnt() {
		List<OrderBean> ret = orderPersistence.getOrderFalloutcnt();
		return ret;
	
	}

}
