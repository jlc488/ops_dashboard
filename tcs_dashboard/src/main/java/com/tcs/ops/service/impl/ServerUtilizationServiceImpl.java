package com.tcs.ops.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tcs.ops.model.serverUtilization.ServerUtilizationBean;
import com.tcs.ops.persistence.ServerUtilizationPersistence;
import com.tcs.ops.service.ServerUtilizationService;

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
 * @author sin.kang@tcs.com aka SexySinny
 * @history <li> </li>
 */

@Service
public class ServerUtilizationServiceImpl implements ServerUtilizationService {
	
	@Autowired
	private ServerUtilizationPersistence serverUtilizationPersistence;

	@Override
	public List<ServerUtilizationBean> getAll(String serviceType) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<ServerUtilizationBean> getServerUtilizationTrend(String dateParm) {
		return this.serverUtilizationPersistence.getServerUtilizationTrend(dateParm);
	}

	

}
