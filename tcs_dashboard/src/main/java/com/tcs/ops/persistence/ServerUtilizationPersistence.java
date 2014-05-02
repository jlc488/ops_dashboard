package com.tcs.ops.persistence;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.tcs.ops.model.serverUtilization.ServerUtilizationBean;

public interface ServerUtilizationPersistence {

	List<ServerUtilizationBean> getAll(String ServiceType);
	List<ServerUtilizationBean> getServerUtilizationTrend(String dateParm);
}
