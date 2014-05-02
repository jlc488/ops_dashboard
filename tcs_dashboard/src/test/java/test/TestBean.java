package test;

public class TestBean {

	
	private Long id;
	
	private IssueType issuType;
	
	private String name;
	
	private String createDateStr;

	public TestBean(){}
	
	
	
	public TestBean(Long id, IssueType issuType, String name,
			String createDateStr) {
		this.id = id;
		this.issuType = issuType;
		this.name = name;
		this.createDateStr = createDateStr;
	}



	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public IssueType getIssuType() {
		return issuType;
	}

	public void setIssuType(IssueType issuType) {
		this.issuType = issuType;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCreateDateStr() {
		return createDateStr;
	}

	public void setCreateDateStr(String createDateStr) {
		this.createDateStr = createDateStr;
	}
	
	
	
}
