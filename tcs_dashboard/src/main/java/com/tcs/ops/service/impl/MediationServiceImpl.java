package com.tcs.ops.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tcs.ops.model.mediation.MediationBean;
import com.tcs.ops.persistence.MediationPersistence;
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
 * @author sin.kang@tcs.com aka SexySinny
 * @history <li> </li>
 */

@Service
public class MediationServiceImpl implements MediationService {

	@Autowired
	private MediationPersistence merdiationPersistence;

	@Override
	public List<MediationBean> getAll(String serviceType) {
		return this.merdiationPersistence.getAll(serviceType);
	}

	@Override
	public List<MediationBean> getSystemSplit() {
		return this.merdiationPersistence.getSystemSplit();
	}

	@Override
	public List<MediationBean> getWeeklyCDRCount() {
		return this.merdiationPersistence.getWeeklyCDRCount();
	}

}
