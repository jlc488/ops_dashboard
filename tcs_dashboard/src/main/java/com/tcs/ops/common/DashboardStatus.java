package com.tcs.ops.common;

public class DashboardStatus {

	public class Incident{
		public class IssueType{
			public static final String INCIDENT = "incident";
			public static final String PROBLEM = "problem";
			public static final String SIR = "sir";
			public static final String TECH_SUPPORT = "tech support";
		}
		
		public class Status{
			public static final String RESOLVED = "resolved";
			public static final String OPEN = "open";
			public static final String IN_PROGRESS = "in progress";
			public static final String REOPENED = "reopened";
			public static final String CLOSED = "closed";
		}
		
		public class Priority{
			public static final String HIGH = "high";
			public static final String MEDIUM = "medium";
			public static final String LOW = "low";
			public static final String CRITICAL = "critical";
		}
		
		public class Resolution{
			public static final String FIXED = "fixed";
			public static final String OPEN = "open";
			public static final String RESOLVED = "resolved";
			public static final String PENDING = "pending";
			public static final String IN_PROGRESS = "in progress";
			public static final String REOPENED = "reopened";
		}
		
		public class HighLevelStatus{
			public static final String OPEN = "open";
			public static final String closed = "closed";
		}
	}

}
