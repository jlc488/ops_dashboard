package com.tcs.ops.model.serverUtilization;

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
@Cache
@Index
public class ServerUtilizationBean {
	
	@Id
	private Long id;
	private Date dateparm;
	private String timeSlot;
	
	public String sbSveAp;
	private String aiaPipDb;
	private String osbDB;
	
	private String bisAp;
	private String bisDb;
	private String stagingDb;
	
	private String egiDb;
	private String aiaPipAp;
	private String egiAp;
	
	private String sblConf;
	private String sblOm;
	private String sblDb;
	private String osbAp;

	/**
	 * @return the id
	 */
	public Long getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(Long id) {
		this.id = id;
	}

	/**
	 * @return the dateparm
	 */
	public Date getDateparm() {
		return dateparm;
	}

	/**
	 * @param dateparm the dateparm to set
	 */
	public void setDateparm(Date dateparm) {
		this.dateparm = dateparm;
	}

	/**
	 * @return the timeSlot
	 */
	public String getTimeSlot() {
		return timeSlot;
	}

	/**
	 * @param timeSlot the timeSlot to set
	 */
	public void setTimeSlot(String timeSlot) {
		this.timeSlot = timeSlot;
	}

	/**
	 * @return the sbSveAp
	 */
	public String getSbSveAp() {
		return sbSveAp;
	}

	/**
	 * @param sbSveAp the sbSveAp to set
	 */
	public void setSbSveAp(String sbSveAp) {
		this.sbSveAp = sbSveAp;
	}

	/**
	 * @return the aiaPipDb
	 */
	public String getAiaPipDb() {
		return aiaPipDb;
	}

	/**
	 * @param aiaPipDb the aiaPipDb to set
	 */
	public void setAiaPipDb(String aiaPipDb) {
		this.aiaPipDb = aiaPipDb;
	}

	/**
	 * @return the osbDB
	 */
	public String getOsbDB() {
		return osbDB;
	}

	/**
	 * @param osbDB the osbDB to set
	 */
	public void setOsbDB(String osbDB) {
		this.osbDB = osbDB;
	}

	/**
	 * @return the bisAp
	 */
	public String getBisAp() {
		return bisAp;
	}

	/**
	 * @param bisAp the bisAp to set
	 */
	public void setBisAp(String bisAp) {
		this.bisAp = bisAp;
	}

	/**
	 * @return the bisDb
	 */
	public String getBisDb() {
		return bisDb;
	}

	/**
	 * @param bisDb the bisDb to set
	 */
	public void setBisDb(String bisDb) {
		this.bisDb = bisDb;
	}

	/**
	 * @return the stagingDb
	 */
	public String getStagingDb() {
		return stagingDb;
	}

	/**
	 * @param stagingDb the stagingDb to set
	 */
	public void setStagingDb(String stagingDb) {
		this.stagingDb = stagingDb;
	}

	/**
	 * @return the egiDb
	 */
	public String getEgiDb() {
		return egiDb;
	}

	/**
	 * @param egiDb the egiDb to set
	 */
	public void setEgiDb(String egiDb) {
		this.egiDb = egiDb;
	}

	/**
	 * @return the aiaPipAp
	 */
	public String getAiaPipAp() {
		return aiaPipAp;
	}

	/**
	 * @param aiaPipAp the aiaPipAp to set
	 */
	public void setAiaPipAp(String aiaPipAp) {
		this.aiaPipAp = aiaPipAp;
	}

	/**
	 * @return the egiAp
	 */
	public String getEgiAp() {
		return egiAp;
	}

	/**
	 * @param egiAp the egiAp to set
	 */
	public void setEgiAp(String egiAp) {
		this.egiAp = egiAp;
	}

	/**
	 * @return the sblConf
	 */
	public String getSblConf() {
		return sblConf;
	}

	/**
	 * @param sblConf the sblConf to set
	 */
	public void setSblConf(String sblConf) {
		this.sblConf = sblConf;
	}

	/**
	 * @return the sblOm
	 */
	public String getSblOm() {
		return sblOm;
	}

	/**
	 * @param sblOm the sblOm to set
	 */
	public void setSblOm(String sblOm) {
		this.sblOm = sblOm;
	}

	/**
	 * @return the sblDb
	 */
	public String getSblDb() {
		return sblDb;
	}

	/**
	 * @param sblDb the sblDb to set
	 */
	public void setSblDb(String sblDb) {
		this.sblDb = sblDb;
	}

	/**
	 * @return the osbAp
	 */
	public String getOsbAp() {
		return osbAp;
	}

	/**
	 * @param osbAp the osbAp to set
	 */
	public void setOsbAp(String osbAp) {
		this.osbAp = osbAp;
	}
	
	
}
