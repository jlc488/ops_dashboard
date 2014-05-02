package com.tcs.ops.model.mediation;

import java.util.Date;

import com.googlecode.objectify.annotation.Cache;
import com.googlecode.objectify.annotation.Entity;
import com.googlecode.objectify.annotation.Id;
import com.googlecode.objectify.annotation.Index;


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

@Entity
@Index
@Cache
public class MediationBean {

	@Id
	private Long id;
	
	private String createdBy;
	
	private Date createdDate;
	
	private String updatedBy;
	
	private Date updatedDate;
	
	private Date requestDate;
	
	private String serviceType;
	
	private String cdrCount;
	
	private String dateFrom;
	
	private String systemName;
	
	private String cdrWeek1;
	private String cdrWeek2;
	private String cdrWeek3;
	private String cdrWeek4;
	private String cdrWeek5;
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getCreatedBy() {
		return createdBy;
	}

	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}

	public Date getCreatedDate() {
		return createdDate;
	}

	public void setCreatedDate(Date createdDate) {
		this.createdDate = createdDate;
	}

	public String getUpdatedBy() {
		return updatedBy;
	}

	public void setUpdatedBy(String updatedBy) {
		this.updatedBy = updatedBy;
	}

	public Date getUpdatedDate() {
		return updatedDate;
	}

	public void setUpdatedDate(Date updatedDate) {
		this.updatedDate = updatedDate;
	}

	public Date getRequestDate() {
		 return requestDate;
	}
	public void setRequestDate(Date requestDate) {
		this.requestDate = requestDate;
	}

	public String getServiceType() {
		return serviceType;
	}

	public void setServiceType(String serviceType) {
		this.serviceType = serviceType;
	}

	public String getCdrCount() {
		return cdrCount;
	}

	public void setCdrCount(String cdrCount) {
		this.cdrCount = cdrCount;
	}

	public String getDateFrom() {
		return dateFrom;
	}

	public void setDateFrom(String dateFrom) {
		this.dateFrom = dateFrom;
	}

	/**
	 * @return the systemName
	 */
	public String getSystemName() {
		return systemName;
	}

	/**
	 * @param systemName the systemName to set
	 */
	public void setSystemName(String systemName) {
		this.systemName = systemName;
	}

	/**
	 * @return the cdrWeek1
	 */
	public String getCdrWeek1() {
		return cdrWeek1;
	}

	/**
	 * @param cdrWeek1 the cdrWeek1 to set
	 */
	public void setCdrWeek1(String cdrWeek1) {
		this.cdrWeek1 = cdrWeek1;
	}

	/**
	 * @return the cdrWeek2
	 */
	public String getCdrWeek2() {
		return cdrWeek2;
	}

	/**
	 * @param cdrWeek2 the cdrWeek2 to set
	 */
	public void setCdrWeek2(String cdrWeek2) {
		this.cdrWeek2 = cdrWeek2;
	}

	/**
	 * @return the cdrWeek3
	 */
	public String getCdrWeek3() {
		return cdrWeek3;
	}

	/**
	 * @param cdrWeek3 the cdrWeek3 to set
	 */
	public void setCdrWeek3(String cdrWeek3) {
		this.cdrWeek3 = cdrWeek3;
	}

	/**
	 * @return the cdrWeek4
	 */
	public String getCdrWeek4() {
		return cdrWeek4;
	}

	/**
	 * @param cdrWeek4 the cdrWeek4 to set
	 */
	public void setCdrWeek4(String cdrWeek4) {
		this.cdrWeek4 = cdrWeek4;
	}

	/**
	 * @return the cdrWeek5
	 */
	public String getCdrWeek5() {
		return cdrWeek5;
	}

	/**
	 * @param cdrWeek5 the cdrWeek5 to set
	 */
	public void setCdrWeek5(String cdrWeek5) {
		this.cdrWeek5 = cdrWeek5;
	}
	
	
	
}
