package test;

public enum IssueType {

	
	INCIDENT("INCIDENT2"){

		@Override
		public String toString() {
			return "FUCK";
		}
		
		
	}, PROBLEM("PROBLEM2"), SIR("SIR2"), TECH_SUPPORT("TECH_SUPPORT2");
	
	private String str = null;
	
	private IssueType(String str){
		this.str = str;
	}
	
	public String getFuck(){
		return this.str;
	}
	
}
