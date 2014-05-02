package com.tcs.ops.persistence.impl;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.tcs.ops.model.serverUtilization.ServerUtilizationBean;
import com.tcs.ops.persistence.ServerUtilizationPersistence;


@Repository
public class ServerUtilizationPersistenceImpl implements
		ServerUtilizationPersistence {

	@Override
	public List<ServerUtilizationBean> getAll(String ServiceType) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<ServerUtilizationBean> getServerUtilizationTrend(String dateParm) {
		// TODO Auto-generated method stub
		return null;
	}

}
