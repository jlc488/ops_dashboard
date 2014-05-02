package com.tcs.ops.common;

import com.tcs.ops.common.DashboardStatus.Incident;
import com.tcs.ops.common.DashboardStatus.Incident.IssueType;
import com.tcs.ops.model.incident.IncidentBean;
import com.tcs.ops.model.incident.IncidentBuilder;




public class Test {


	
	public void gogo(){
	
		String a = DashboardStatus.Incident.IssueType.INCIDENT;
		String b = Incident.IssueType.INCIDENT;
		String c = IssueType.INCIDENT;
		
		
		IncidentBean tmp = IncidentBuilder.init().build();
		IncidentBuilder.init().projectName("prjName").byWho("sexy")
		.isClosed(false).isCustomerSyncDone(false).isMastercraftCustomerSyncDone(false)
		.isOverAllCustomerSyncDone(false);
		
	}
}
