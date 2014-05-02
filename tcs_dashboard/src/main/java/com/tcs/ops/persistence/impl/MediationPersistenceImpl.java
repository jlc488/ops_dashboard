package com.tcs.ops.persistence.impl;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.tcs.ops.model.mediation.MediationBean;
import com.tcs.ops.persistence.MediationPersistence;


@Repository
public class MediationPersistenceImpl implements MediationPersistence {

	@Override
	public List<MediationBean> getAll(String ServiceType) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<MediationBean> getMediationByCRDID(Long crdID) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<MediationBean> getMediationByServiceType(String ServiceType) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<MediationBean> getSystemSplit() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<MediationBean> getWeeklyCDRCount() {
		// TODO Auto-generated method stub
		return null;
	}

}
