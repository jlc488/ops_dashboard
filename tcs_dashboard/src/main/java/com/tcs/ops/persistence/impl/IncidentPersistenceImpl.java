package com.tcs.ops.persistence.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.googlecode.objectify.Objectify;
import com.googlecode.objectify.ObjectifyFactory;
import com.tcs.ops.model.incident.IncidentBean;
import com.tcs.ops.persistence.IncidentPersistence;


@Repository
public class IncidentPersistenceImpl implements IncidentPersistence {

	@Autowired 
	private ObjectifyFactory objectifyFactory;
	
	
	@Override
	public List<IncidentBean> getAll() {
		Objectify ofy = objectifyFactory.begin();
		
		List<IncidentBean> ret = ofy.load().type(IncidentBean.class).list();
		
		return ret;
	}

	@Override
	public List<IncidentBean> getAllByHighLevelStatus(String highLevelStatus) {
		Objectify ofy = objectifyFactory.begin();
		
		List<IncidentBean> ret = ofy.load().type(IncidentBean.class).filter("highLeverlStatus", highLevelStatus).list();
		
		return ret;
	}

	@Override
	public List<IncidentBean> getAllByReOpened(boolean bool) {
		Objectify ofy = objectifyFactory.begin();
		
		List<IncidentBean> ret = ofy.load().type(IncidentBean.class).filter("reOpened", bool).list();
		
		return ret;
	}

	@Override
	public List<IncidentBean> getAllByRaisedWeekInNumber(int raisedWeekInNumber) {
		Objectify ofy = objectifyFactory.begin();
		
		List<IncidentBean> ret = ofy.load().type(IncidentBean.class).filter("raisedWeekInNumber", raisedWeekInNumber).list();
		
		return ret;
	}

	@Override
	public List<IncidentBean> getAllByClosedWeekInNumber(int closedWeekInNumber) {
		Objectify ofy = objectifyFactory.begin();
		
		List<IncidentBean> ret = ofy.load().type(IncidentBean.class).filter("closedWeekInNumber", closedWeekInNumber).list();
		
		return ret;
	}

	@Override
	public List<IncidentBean> getAllByDifferenceInWeeks(int differenceInWeeks) {
		Objectify ofy = objectifyFactory.begin();
		
		List<IncidentBean> ret = ofy.load().type(IncidentBean.class).filter("differenceInWeeks", differenceInWeeks).list();
		
		return ret;
	}

	@Override
	public List<IncidentBean> getAllByClosedWithInDueDate(boolean bool) {
		Objectify ofy = objectifyFactory.begin();
		
		List<IncidentBean> ret = ofy.load().type(IncidentBean.class).filter("isThisClosedWithInDueDate", bool).list();
		
		return ret;
	}

	@Override
	public List<IncidentBean> getAllByDueDate(String dueDate) {
		Objectify ofy = objectifyFactory.begin();
		
		List<IncidentBean> ret = ofy.load().type(IncidentBean.class).filter("dueDate", dueDate).list();
		
		return ret;
	}

	@Override
	public List<IncidentBean> getAllBySubComponents(String subComponenet) {
		Objectify ofy = objectifyFactory.begin();
		
		List<IncidentBean> ret = ofy.load().type(IncidentBean.class).filter("subComponenet", subComponenet).list();
		
		return ret;
	}

	@Override
	public List<IncidentBean> getAllbyComponenet(String componenet) {
		Objectify ofy = objectifyFactory.begin();
		
		List<IncidentBean> ret = ofy.load().type(IncidentBean.class).filter("componenet", componenet).list();
		
		return ret;
	}

	@Override
	public List<IncidentBean> getAllbyCreateDate(String createdDate) {
		Objectify ofy = objectifyFactory.begin();
		
		List<IncidentBean> ret = ofy.load().type(IncidentBean.class).filter("createdDate", createdDate).list();
		
		return ret;
	}

	@Override
	public List<IncidentBean> getAllByResolvedDate(String resolvedDate) {
		Objectify ofy = objectifyFactory.begin();
		
		List<IncidentBean> ret = ofy.load().type(IncidentBean.class).filter("resolvedDate", resolvedDate).list();
		
		return ret;
	}

	@Override
	public List<IncidentBean> getAllByReporter(String reporter) {
		Objectify ofy = objectifyFactory.begin();
		
		List<IncidentBean> ret = ofy.load().type(IncidentBean.class).filter("reporter", reporter).list();
		
		return ret;
	}

	@Override
	public List<IncidentBean> getAllByResolution(String resolution) {
		Objectify ofy = objectifyFactory.begin();
		
		List<IncidentBean> ret = ofy.load().type(IncidentBean.class).filter("resolution", resolution).list();
		
		return ret;
	}

	@Override
	public List<IncidentBean> getAllByPriority(String priority) {
		Objectify ofy = objectifyFactory.begin();
		
		List<IncidentBean> ret = ofy.load().type(IncidentBean.class).filter("priority", priority).list();
		
		return ret;
	}

	@Override
	public List<IncidentBean> getAllByStatus(String status) {
		Objectify ofy = objectifyFactory.begin();
		
		List<IncidentBean> ret = ofy.load().type(IncidentBean.class).filter("status", status).list();
		
		return ret;
	}

	@Override
	public List<IncidentBean> getAllByIssueType(String issueType) {
		Objectify ofy = objectifyFactory.begin();
		
		List<IncidentBean> ret = ofy.load().type(IncidentBean.class).filter("issueType", issueType).list();
		
		return ret;
	}

	@Override
	public IncidentBean getIncidentByIncidentKey(String incidentKey) {
		Objectify ofy = objectifyFactory.begin();
		
		IncidentBean ret = ofy.load().type(IncidentBean.class).first().now();
		
		return ret;
	}

	@Override
	public IncidentBean getIncidentById(Long id) {
		Objectify ofy = objectifyFactory.begin();
		
		IncidentBean ret = ofy.load().type(IncidentBean.class).id(id).now();
		
		return ret;
	}

}
