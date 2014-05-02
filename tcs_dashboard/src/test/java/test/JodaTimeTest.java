package test;

import org.joda.time.DateTime;
import org.junit.Test;

import com.tcs.ops.common.OpsConstants;

public class JodaTimeTest {

	@Test
	public void test() {
		DateTime dt = new DateTime("2014-03-29T14:22:00");
		
		
		System.out.println("year : "+dt.getYear());
		
		System.out.println("month : "+dt.getMonthOfYear() );
		
		System.out.println("day : " + dt.getDayOfMonth());
		
		System.out.println(dt.getMillis());
		System.out.println(dt.toString(OpsConstants.DATE_PATTERN));
		//System.out.println(System.currentTimeMillis());
		
		
		DateTime dt2 = new DateTime(1396070520000l);
		System.out.println(dt2.toString());
		System.out.println(dt2.getYear() +" : "+dt2.getMonthOfYear()+" : "+dt2.getDayOfMonth()+" : "+dt2.getHourOfDay()+" : "+dt2.getMinuteOfHour()+" : "+dt2.getSecondOfMinute());
		
	}

}
