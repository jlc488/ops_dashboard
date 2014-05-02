package com.tcs.ops.model.incident;

import com.tcs.ops.common.DashboardStatus;
import com.tcs.ops.common.OpsConstants;
import com.tcs.ops.common.OpsUtil;

public class Incident implements IIncident {

	
	private IncidentBean icBean = new IncidentBean();

	public IncidentBean getIcBean() {
		return icBean;
	}

	public void setIcBean(IncidentBean icBean) {
		this.icBean = icBean;
	}
	
	public Incident(IncidentBean incBean){
		this.icBean = incBean;
	}
	
	public IncidentBean build(){
		if( this.icBean.getProjectName() == null ){
			this.defaults();
		}
		return this.icBean;
	}
	
	public Incident defaults(){
		this.icBean.setProjectName("BSS/OSS");
		this.icBean.setIncidentKey("BSS-00001");
		this.icBean.setIssueType(DashboardStatus.Incident.IssueType.INCIDENT);
		this.icBean.setStatus(DashboardStatus.Incident.Status.OPEN);
		this.icBean.setPriority(DashboardStatus.Incident.Priority.HIGH);
		this.icBean.setResolution(DashboardStatus.Incident.Resolution.OPEN);
		this.icBean.setReporter(OpsConstants.REPORTER_L1);
		
		this.icBean.setCreatedDate( OpsUtil.millsToStrDate(System.currentTimeMillis()));
		
		this.icBean.setCreatedMonth(OpsUtil.currentMonthInNum());
		this.icBean.setRaisedWeekInNumber(OpsUtil.currentWeekInNum());
		
		this.icBean.setHighLevelStatus(DashboardStatus.Incident.HighLevelStatus.OPEN);
		
		
		return this;
	}//defaults
	
	
	public Incident projectName(String name){
		this.icBean.setProjectName(name);
		return this;
	}

	@Override
	public Incident incidentKey(String key) {
		this.icBean.setIncidentKey(key);
		return this;
	}

	@Override
	public Incident issueType(String issueType) {
		this.icBean.setIssueType(issueType);
		return this;
	}

	@Override
	public Incident status(String status) {
		this.icBean.setStatus(status);
		return this;
	}

	@Override
	public Incident priority(String priority) {
		this.icBean.setPriority(priority);
		return this;
	}

	@Override
	public Incident resolution(String resolution) {
		this.icBean.setResolution(resolution);
		return this;
	}

	@Override
	public Incident byWho(String assignee) {
		this.icBean.setAssignee(assignee);
		return this;
	}

	@Override
	public Incident reportedBy(String reporter) {
		this.icBean.setReporter(reporter);
		return this;
	}

	@Override
	public Incident components(String componenets) {
		this.icBean.setComponents(componenets);
		return this;
	}

	@Override
	public Incident subComponents(String subComponenets) {
		this.icBean.setSubComponents(subComponenets);
		return this;
	}

	@Override
	public Incident dueDate(String dueDate) {
		this.icBean.setDueDate(dueDate);
		return this;
	}

	@Override
	public Incident isCustomerSyncDone(boolean bool) {
		this.icBean.setCustomerSync(bool);
		return this;
	}

	@Override
	public Incident isMastercraftCustomerSyncDone(boolean bool) {
		this.icBean.setMastercraftCustSync(bool);
		return this;
	}

	@Override
	public Incident isOverAllCustomerSyncDone(boolean bool) {
		this.icBean.setOverAllCustomerSync(bool);
		return this;
	}

	@Override
	public Incident isClosed(boolean bool) {
		this.icBean.setClosed(bool);
		return this;
	}
}
