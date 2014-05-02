package com.tcs.ops.persistence;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.tcs.ops.model.order.OrderBean;


public interface OrderPersistence {

	
List<OrderBean> getOrderAging(String orderProduct);
	
	List<OrderBean> getOrderStatus(String orderType, String orderProduct);
	
	List<OrderBean> getOrderDetails(String createdDateInMills);
	
	List<OrderBean> getOrderDetailsHist();
	
	List<OrderBean> getOrdAgingGraph(String orderStatus);
	
	List<OrderBean> getOrderFalloutcnt();
	
}
