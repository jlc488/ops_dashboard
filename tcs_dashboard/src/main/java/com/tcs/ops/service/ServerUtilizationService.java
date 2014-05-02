package com.tcs.ops.service;

import java.util.List;

import com.tcs.ops.model.serverUtilization.ServerUtilizationBean;

 /**
 * <PRE>
 * <b>Title: Dashboard Project</b> 
 * <b>
 * </b>
 *
 * <b>Copyright:</b> Copyright (c) 2012
 * <b>Company:</b> kt
 * <b>Version:</b> 1.0
 * </PRE>
 * @author sin.kang@tcs.com aka SexySinny
 * @history <li> </li>
 */
public interface ServerUtilizationService {
	 List<ServerUtilizationBean> getAll(String serviceType);
	 List<ServerUtilizationBean> getServerUtilizationTrend(String dateParm);
}
