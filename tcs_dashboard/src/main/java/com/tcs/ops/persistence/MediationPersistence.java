package com.tcs.ops.persistence;

import java.util.List;

import com.tcs.ops.model.mediation.MediationBean;

public interface MediationPersistence {

	List<MediationBean> getAll(String ServiceType);
	List<MediationBean> getMediationByCRDID(Long crdID);
	List<MediationBean> getMediationByServiceType(String ServiceType);
	List<MediationBean> getSystemSplit();
	List<MediationBean> getWeeklyCDRCount();
	
	
}
