package com.tcs.ops.persistence;

import java.util.List;

import com.tcs.ops.model.incident.IncidentBean;

public interface IncidentPersistence {

	
	List<IncidentBean> getAll();
	
	List<IncidentBean> getAllByHighLevelStatus(String highLevelStatus);
	
	List<IncidentBean> getAllByReOpened(boolean bool);
	
	List<IncidentBean> getAllByRaisedWeekInNumber(int raisedWeekInNumber );
	
	List<IncidentBean> getAllByClosedWeekInNumber(int closedWeekInNumber);
	
	List<IncidentBean> getAllByDifferenceInWeeks(int differenceInWeeks);
	
	List<IncidentBean> getAllByClosedWithInDueDate(boolean bool);
	
	List<IncidentBean> getAllByDueDate(String dueDate);
	
	List<IncidentBean> getAllBySubComponents(String subComponenet);
	
	List<IncidentBean> getAllbyComponenet(String componenet);
	
	List<IncidentBean> getAllbyCreateDate(String createdDate);
	
	List<IncidentBean> getAllByResolvedDate(String resolvedDate);
	
	List<IncidentBean> getAllByReporter(String reporter);
	
	List<IncidentBean> getAllByResolution(String resolution);
	
	List<IncidentBean> getAllByPriority(String priority);
	
	List<IncidentBean> getAllByStatus(String status);
	
	List<IncidentBean> getAllByIssueType(String issueType);
	
	IncidentBean getIncidentByIncidentKey(String incidentKey);
	
	IncidentBean getIncidentById(Long id);
	
	
	
}
