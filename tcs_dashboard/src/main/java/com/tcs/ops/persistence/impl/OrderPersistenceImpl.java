package com.tcs.ops.persistence.impl;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.tcs.ops.model.order.OrderBean;
import com.tcs.ops.persistence.OrderPersistence;


@Repository
public class OrderPersistenceImpl implements OrderPersistence {

	@Override
	public List<OrderBean> getOrderAging(String orderProduct) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<OrderBean> getOrderStatus(String orderType, String orderProduct) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<OrderBean> getOrderDetails(String createdDateInMills) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<OrderBean> getOrderDetailsHist() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<OrderBean> getOrdAgingGraph(String orderStatus) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<OrderBean> getOrderFalloutcnt() {
		// TODO Auto-generated method stub
		return null;
	}

}
