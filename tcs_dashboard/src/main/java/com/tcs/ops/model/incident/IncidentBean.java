package com.tcs.ops.model.incident;

import com.googlecode.objectify.annotation.Cache;
import com.googlecode.objectify.annotation.Entity;
import com.googlecode.objectify.annotation.Id;
import com.googlecode.objectify.annotation.Index;


@Index
@Cache
@Entity
public class IncidentBean {

	@Id
	private Long id;
	
	private String projectName = null;
	private String incidentKey = null;
	
	// incident, problem, sir, tech support
	private String issueType = null;
	
	// resolved, open , in progress, reopened, closed
	private String status = null;
	
	// high, medium, low, critical
	private String priority = null;
	
	// fixed, open, resolved, pending, in progress, re open, 
	private String resolution = null;
	private String assignee = null;
	
	// L1ISC, L2Team, Reporting Team
	private String reporter = null;
	
	
	private String createdDate = null;
	private String updatedDate = null;
	private String resolvedDate	= null;
	private String closedDate = null;
	
	private String createdMonth = null;	
	private String updatedMonth = null;
	private String resolvedMonth = null;
	private String closedMonth = null;
	
	private int raisedWeekInNumber = 0;
	private int closedWeekInNumber = 0;
	private int differenceInWeeks = 0;

	private String components = null;
	private String subComponents = null;
	
	private String dueDate = null;
	
	// open , closed
	private String highLevelStatus = null;
	private String openAgeingTAT = null;
	private int openAgeing = 0;
	private String ageBracket = null;
	private String tcsIto = "1";
	private String AMO_IMO = null;
	private String area = null;
	
	private int totalRaisedInWeek = 0;
	
	private boolean isThisClosedWithInDueDate = true;
	
	private boolean reOpened = false;
	private int noReOpened = 0;
	
	private boolean customerSync = false;
	private boolean mastercraftCustSync = false;
	private boolean overAllCustomerSync = false;

	private boolean closedInTheSameWeek = false;
	
	private boolean closed = false;
	
	public Long getId() {
		return id;
	}
	
	public void setId(Long id) {
		this.id = id;
	}
	
	public String getProjectName() {
		return projectName;
	}
	public void setProjectName(String projectName) {
		this.projectName = projectName;
	}
	public String getIncidentKey() {
		return incidentKey;
	}
	public void setIncidentKey(String incidentKey) {
		this.incidentKey = incidentKey;
	}
	public String getIssueType() {
		return issueType;
	}
	public void setIssueType(String issueType) {
		this.issueType = issueType;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getPriority() {
		return priority;
	}
	public void setPriority(String priority) {
		this.priority = priority;
	}
	public String getResolution() {
		return resolution;
	}
	public void setResolution(String resolution) {
		this.resolution = resolution;
	}
	public String getAssignee() {
		return assignee;
	}
	public void setAssignee(String assignee) {
		this.assignee = assignee;
	}
	public String getReporter() {
		return reporter;
	}
	public void setReporter(String reporter) {
		this.reporter = reporter;
	}
	public String getCreatedDate() {
		return createdDate;
	}
	public void setCreatedDate(String createdDate) {
		this.createdDate = createdDate;
	}
	public String getUpdatedDate() {
		return updatedDate;
	}
	public void setUpdatedDate(String updatedDate) {
		this.updatedDate = updatedDate;
	}
	public String getResolvedDate() {
		return resolvedDate;
	}
	public void setResolvedDate(String resolvedDate) {
		this.resolvedDate = resolvedDate;
	}
	public String getCreatedMonth() {
		return createdMonth;
	}
	public void setCreatedMonth(String createdMonth) {
		this.createdMonth = createdMonth;
	}
	public String getResolvedMonth() {
		return resolvedMonth;
	}
	public void setResolvedMonth(String resolvedMonth) {
		this.resolvedMonth = resolvedMonth;
	}
	public String getComponents() {
		return components;
	}
	public void setComponents(String components) {
		this.components = components;
	}
	public String getSubComponents() {
		return subComponents;
	}
	public void setSubComponents(String subComponents) {
		this.subComponents = subComponents;
	}
	public String getDueDate() {
		return dueDate;
	}
	public void setDueDate(String dueDate) {
		this.dueDate = dueDate;
	}
	public String getHighLevelStatus() {
		return highLevelStatus;
	}
	public void setHighLevelStatus(String highLevelStatus) {
		this.highLevelStatus = highLevelStatus;
	}
	public String getOpenAgeingTAT() {
		return openAgeingTAT;
	}
	public void setOpenAgeingTAT(String openAgeingTAT) {
		this.openAgeingTAT = openAgeingTAT;
	}
	public int getOpenAgeing() {
		return openAgeing;
	}
	public void setOpenAgeing(int openAgeing) {
		this.openAgeing = openAgeing;
	}
	public String getAgeBracket() {
		return ageBracket;
	}
	public void setAgeBracket(String ageBracket) {
		this.ageBracket = ageBracket;
	}
	public String getTcsIto() {
		return tcsIto;
	}
	public void setTcsIto(String tcsIto) {
		this.tcsIto = tcsIto;
	}
	public String getAMO_IMO() {
		return AMO_IMO;
	}
	public void setAMO_IMO(String aMO_IMO) {
		AMO_IMO = aMO_IMO;
	}
	public String getArea() {
		return area;
	}
	public void setArea(String area) {
		this.area = area;
	}
	public int getRaisedWeekInNumber() {
		return raisedWeekInNumber;
	}
	public void setRaisedWeekInNumber(int raisedWeekInNumber) {
		this.raisedWeekInNumber = raisedWeekInNumber;
	}
	public int getClosedWeekInNumber() {
		return closedWeekInNumber;
	}
	public void setClosedWeekInNumber(int closedWeekInNumber) {
		this.closedWeekInNumber = closedWeekInNumber;
	}
	public int getDifferenceInWeeks() {
		return differenceInWeeks;
	}
	public void setDifferenceInWeeks(int differenceInWeeks) {
		this.differenceInWeeks = differenceInWeeks;
	}
	public int getTotalRaisedInWeek() {
		return totalRaisedInWeek;
	}
	public void setTotalRaisedInWeek(int totalRaisedInWeek) {
		this.totalRaisedInWeek = totalRaisedInWeek;
	}
	public boolean isThisClosedWithInDueDate() {
		return isThisClosedWithInDueDate;
	}
	public void setThisClosedWithInDueDate(boolean isThisClosedWithInDueDate) {
		this.isThisClosedWithInDueDate = isThisClosedWithInDueDate;
	}
	public boolean isReOpened() {
		return reOpened;
	}
	public void setReOpened(boolean reOpened) {
		this.reOpened = reOpened;
	}
	public int getNoReOpened() {
		return noReOpened;
	}
	public void setNoReOpened(int noReOpened) {
		this.noReOpened = noReOpened;
	}
	public boolean isCustomerSync() {
		return customerSync;
	}
	public void setCustomerSync(boolean customerSync) {
		this.customerSync = customerSync;
	}
	public boolean isMastercraftCustSync() {
		return mastercraftCustSync;
	}
	public void setMastercraftCustSync(boolean mastercraftCustSync) {
		this.mastercraftCustSync = mastercraftCustSync;
	}
	public boolean isOverAllCustomerSync() {
		return overAllCustomerSync;
	}
	public void setOverAllCustomerSync(boolean overAllCustomerSync) {
		this.overAllCustomerSync = overAllCustomerSync;
	}
	public boolean isClosedInTheSameWeek() {
		return closedInTheSameWeek;
	}
	public void setClosedInTheSameWeek(boolean closedInTheSameWeek) {
		this.closedInTheSameWeek = closedInTheSameWeek;
	}
	public boolean isClosed() {
		return closed;
	}
	public void setClosed(boolean closed) {
		this.closed = closed;
	}

	public String getClosedDate() {
		return closedDate;
	}

	public void setClosedDate(String closedDate) {
		this.closedDate = closedDate;
	}

	public String getUpdatedMonth() {
		return updatedMonth;
	}

	public void setUpdatedMonth(String updatedMonth) {
		this.updatedMonth = updatedMonth;
	}

	public String getClosedMonth() {
		return closedMonth;
	}

	public void setClosedMonth(String closedMonth) {
		this.closedMonth = closedMonth;
	}
	
	
	
	
}
