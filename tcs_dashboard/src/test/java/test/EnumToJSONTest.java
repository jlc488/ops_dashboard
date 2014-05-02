package test;

import java.io.IOException;

import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class EnumToJSONTest {

	
	Logger log = LoggerFactory.getLogger(EnumToJSONTest.class);
	
	ObjectMapper om = new ObjectMapper();
	
	
	
	@Test
	public void test() {
		String str = null;
		TestBean tb = new TestBean(3l, IssueType.INCIDENT, "SexySinny", System.currentTimeMillis()+"");
		try {
			str = om.writeValueAsString(tb);
		} catch (JsonGenerationException e) {
			e.printStackTrace();
		} catch (JsonMappingException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		log.info(str);
		
		log.info(IssueType.INCIDENT.name());
		log.info(IssueType.INCIDENT.toString());
		
		log.info(IssueType.SIR.getFuck());
		log.info(IssueType.PROBLEM.toString());
	}

}
