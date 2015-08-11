package com.tcs.ops.model.incident;

public interface IIncident {

	public IncidentBean build();
	
	public String toJSON();
	
	public Incident projectName(String name);
	
	public Incident incidentKey(String key);
	
	public Incident issueType(String issueType);
	
	public Incident status(String status);
	
	public Incident priority(String priority);
	
	public Incident resolution(String resolution);
	
	public Incident byWho(String assignee);
	
	public Incident reportedBy(String reporter);
	
	public Incident components(String componenets);
	
	public Incident subComponents(String subComponenets);
	
	public Incident dueDate(String dueDate);
	
	public Incident isCustomerSyncDone(boolean bool);
	
	public Incident isMastercraftCustomerSyncDone(boolean bool);
	
	public Incident isOverAllCustomerSyncDone(boolean bool);
	
	public Incident isClosed(boolean bool);
	
	public Incident defaults();
	
}
