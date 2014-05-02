package com.tcs.ops.model.incident;

public enum IssueType {
	
	INCIDENT(), PROBLEM(), SIR(), TECH_SUPPORT();
	
	private String str = null;
	
	private IssueType(){};
	
	private IssueType(String str){
		this.str = str;
	}
}
