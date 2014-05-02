package com.tcs.ops.model;


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
public class UserBean {

	private static final long serialVersionUID = -7334284948673710934L;

	@Id
	private Long id;
	
	private String employer = null;
	
	private String username = null;
	
	private String userLocation = null;
	
	private String attempts = null;
	
	private boolean changePwd = false;
	
	private String firstName = null;
	
	private String lastName = null;
	
	private String password = null;
	
	private String email = null;
	
	private String mobile1 = null;
	
	private String mobile2 = null;
	
	private String moduleID = null;
	
	private boolean active = false;
	
	private boolean emailActive = false;
	
	private boolean owner = false;
	
	private boolean requestor = false;
	
	private String empNo = null;
	
	private String description = null;

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
	 * @return the employer
	 */
	public String getEmployer() {
		return employer;
	}

	/**
	 * @param employer the employer to set
	 */
	public void setEmployer(String employer) {
		this.employer = employer;
	}

	/**
	 * @return the username
	 */
	public String getUsername() {
		return username;
	}

	/**
	 * @param username the username to set
	 */
	public void setUsername(String username) {
		this.username = username;
	}

	/**
	 * @return the userLocation
	 */
	public String getUserLocation() {
		return userLocation;
	}

	/**
	 * @param userLocation the userLocation to set
	 */
	public void setUserLocation(String userLocation) {
		this.userLocation = userLocation;
	}

	/**
	 * @return the attempts
	 */
	public String getAttempts() {
		return attempts;
	}

	/**
	 * @param attempts the attempts to set
	 */
	public void setAttempts(String attempts) {
		this.attempts = attempts;
	}

	/**
	 * @return the changePwd
	 */
	public boolean isChangePwd() {
		return changePwd;
	}

	/**
	 * @param changePwd the changePwd to set
	 */
	public void setChangePwd(boolean changePwd) {
		this.changePwd = changePwd;
	}

	/**
	 * @return the firstName
	 */
	public String getFirstName() {
		return firstName;
	}

	/**
	 * @param firstName the firstName to set
	 */
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	/**
	 * @return the lastName
	 */
	public String getLastName() {
		return lastName;
	}

	/**
	 * @param lastName the lastName to set
	 */
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	/**
	 * @return the password
	 */
	public String getPassword() {
		return password;
	}

	/**
	 * @param password the password to set
	 */
	public void setPassword(String password) {
		this.password = password;
	}

	/**
	 * @return the email
	 */
	public String getEmail() {
		return email;
	}

	/**
	 * @param email the email to set
	 */
	public void setEmail(String email) {
		this.email = email;
	}

	/**
	 * @return the mobile1
	 */
	public String getMobile1() {
		return mobile1;
	}

	/**
	 * @param mobile1 the mobile1 to set
	 */
	public void setMobile1(String mobile1) {
		this.mobile1 = mobile1;
	}

	/**
	 * @return the mobile2
	 */
	public String getMobile2() {
		return mobile2;
	}

	/**
	 * @param mobile2 the mobile2 to set
	 */
	public void setMobile2(String mobile2) {
		this.mobile2 = mobile2;
	}

	/**
	 * @return the moduleID
	 */
	public String getModuleID() {
		return moduleID;
	}

	/**
	 * @param moduleID the moduleID to set
	 */
	public void setModuleID(String moduleID) {
		this.moduleID = moduleID;
	}

	/**
	 * @return the active
	 */
	public boolean isActive() {
		return active;
	}

	/**
	 * @param active the active to set
	 */
	public void setActive(boolean active) {
		this.active = active;
	}

	/**
	 * @return the emailActive
	 */
	public boolean isEmailActive() {
		return emailActive;
	}

	/**
	 * @param emailActive the emailActive to set
	 */
	public void setEmailActive(boolean emailActive) {
		this.emailActive = emailActive;
	}

	/**
	 * @return the owner
	 */
	public boolean isOwner() {
		return owner;
	}

	/**
	 * @param owner the owner to set
	 */
	public void setOwner(boolean owner) {
		this.owner = owner;
	}

	/**
	 * @return the requestor
	 */
	public boolean isRequestor() {
		return requestor;
	}

	/**
	 * @param requestor the requestor to set
	 */
	public void setRequestor(boolean requestor) {
		this.requestor = requestor;
	}

	/**
	 * @return the empNo
	 */
	public String getEmpNo() {
		return empNo;
	}

	/**
	 * @param empNo the empNo to set
	 */
	public void setEmpNo(String empNo) {
		this.empNo = empNo;
	}

	/**
	 * @return the description
	 */
	public String getDescription() {
		return description;
	}

	/**
	 * @param description the description to set
	 */
	public void setDescription(String description) {
		this.description = description;
	}
	
	
	
}
