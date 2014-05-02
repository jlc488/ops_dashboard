package com.tcs.ops.common;

import java.util.List;

import org.joda.time.DateTime;
import org.joda.time.DateTimeUtils;

import com.tcs.ops.model.mediation.MediationBean;

 /**
 * <PRE>
 * <b>Title: Dashboard Project</b> 
 * <b>
 * </b>
 *
 * <b>Copyright:</b> Copyright (c) 2012
 * <b>Company:</b> TCS
 * <b>Version:</b> 1.0
 * </PRE>
 * @author sin.kang@tcs.com aka SexySinny
 * @history <li> </li>
 */
public class OpsUtil {

	private static OpsUtil instance = null;
	
	public static OpsUtil getInstance(){
		if(instance == null){
			instance = new OpsUtil();
		}
		return instance;
	}
	
	public String jsonFormatterMediationBean(String[] keys, List<MediationBean> list){
		
		return null;
	}

	public static int currentWeekInNum(){
		DateTime dt = new DateTime();
		return dt.getWeekyear();
	}
	
	public static String currentMonthInNum(){
		DateTime dt = new DateTime();
		return dt.getMonthOfYear()+"";
	}
	
	public static long strDateToMills(String date){
		DateTime dt = new DateTime(date);
		
		return dt.getMillis();
	}
	
	public static String millsToStrDate(long mills){
		DateTime dt = new DateTime(mills);
		
		return dt.toString(OpsConstants.DATE_PATTERN);
	}
}
