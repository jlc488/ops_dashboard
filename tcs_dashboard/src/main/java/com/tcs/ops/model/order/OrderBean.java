package com.tcs.ops.model.order;

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
public class OrderBean {
	
	@Id
	Long id;
	String orderId;                                                                                                                                                                                  
	String orderStatus;                                                                                                                                                                                
	Date OrderCreatedDate;                                                                                                                                                                                 
	Date orderRequestDate;                                                                                                                                                                                      
	String orderProduct;                                                                                                                                                                                 
	String orderType;
	int orderCount;
	Date createdDate;
	int totalFailedOrders;
	int totalInprogressOrders;
	int totalCompletedOrders;
	int totalOrders;
	int totalCanceledOrders;
	String description;
	int count;
	int completed;
	int fail;
	int inprogress;
	int noOfOrders;
	int aging;
	int falloutOrderCnt;
	
	/**
	 * @return the falloutOrderCnt
	 */
	public int getFalloutOrderCnt() {
		return falloutOrderCnt;
	}
	/**
	 * @param falloutOrderCnt the falloutOrderCnt to set
	 */
	public void setFalloutOrderCnt(int falloutOrderCnt) {
		this.falloutOrderCnt = falloutOrderCnt;
	}
	/**
	 * @return the completed
	 */
	public int getCompleted() {
		return completed;
	}
	/**
	 * @param completed the completed to set
	 */
	public void setCompleted(int completed) {
		this.completed = completed;
	}
	/**
	 * @return the fail
	 */
	public int getFail() {
		return fail;
	}
	/**
	 * @param fail the fail to set
	 */
	public void setFail(int fail) {
		this.fail = fail;
	}
	/**
	 * @return the inprogress
	 */
	public int getInprogress() {
		return inprogress;
	}
	/**
	 * @param inprogress the inprogress to set
	 */
	public void setInprogress(int inprogress) {
		this.inprogress = inprogress;
	}
	/**
	 * @return the noOfOrders
	 */
	public int getNoOfOrders() {
		return noOfOrders;
	}
	/**
	 * @param noOfOrders the noOfOrders to set
	 */
	public void setNoOfOrders(int noOfOrders) {
		this.noOfOrders = noOfOrders;
	}
	/**
	 * @return the aging
	 */
	public int getAging() {
		return aging;
	}
	/**
	 * @param aging the aging to set
	 */
	public void setAging(int aging) {
		this.aging = aging;
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
	/**
	 * @return the count
	 */
	public int getCount() {
		return count;
	}
	/**
	 * @param count the count to set
	 */
	public void setCount(int count) {
		this.count = count;
	}
	
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
	 * @return the orderId
	 */
	public String getOrderId() {
		return orderId;
	}
	/**
	 * @param orderId the orderId to set
	 */
	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}
	/**
	 * @return the orderStatus
	 */
	public String getOrderStatus() {
		return orderStatus;
	}
	/**
	 * @param orderStatus the orderStatus to set
	 */
	public void setOrderStatus(String orderStatus) {
		this.orderStatus = orderStatus;
	}
	/**
	 * @return the orderCreatedDate
	 */
	public Date getOrderCreatedDate() {
		return OrderCreatedDate;
	}
	/**
	 * @param orderCreatedDate the orderCreatedDate to set
	 */
	public void setOrderCreatedDate(Date orderCreatedDate) {
		OrderCreatedDate = orderCreatedDate;
	}
	/**
	 * @return the orderRequestDate
	 */
	public Date getOrderRequestDate() {
		return orderRequestDate;
	}
	/**
	 * @param orderRequestDate the orderRequestDate to set
	 */
	public void setOrderRequestDate(Date orderRequestDate) {
		this.orderRequestDate = orderRequestDate;
	}
	/**
	 * @return the orderProduct
	 */
	public String getOrderProduct() {
		return orderProduct;
	}
	/**
	 * @param orderProduct the orderProduct to set
	 */
	public void setOrderProduct(String orderProduct) {
		this.orderProduct = orderProduct;
	}
	/**
	 * @return the orderType
	 */
	public String getOrderType() {
		return orderType;
	}
	/**
	 * @param orderType the orderType to set
	 */
	public void setOrderType(String orderType) {
		this.orderType = orderType;
	}
	/**
	 * @return the orderCount
	 */
	public int getOrderCount() {
		return orderCount;
	}
	/**
	 * @param orderCount the orderCount to set
	 */
	public void setOrderCount(int orderCount) {
		this.orderCount = orderCount;
	}
	/**
	 * @return the createdDate
	 */
	public Date getCreatedDate() {
		return createdDate;
	}
	/**
	 * @param createdDate the createdDate to set
	 */
	public void setCreatedDate(Date createdDate) {
		this.createdDate = createdDate;
	}
	/**
	 * @return the totalFailedOrders
	 */
	public int getTotalFailedOrders() {
		return totalFailedOrders;
	}
	/**
	 * @param totalFailedOrders the totalFailedOrders to set
	 */
	public void setTotalFailedOrders(int totalFailedOrders) {
		this.totalFailedOrders = totalFailedOrders;
	}
	/**
	 * @return the totalInprogressOrders
	 */
	public int getTotalInprogressOrders() {
		return totalInprogressOrders;
	}
	/**
	 * @param totalInprogressOrders the totalInprogressOrders to set
	 */
	public void setTotalInprogressOrders(int totalInprogressOrders) {
		this.totalInprogressOrders = totalInprogressOrders;
	}
	/**
	 * @return the totalCompletedOrders
	 */
	public int getTotalCompletedOrders() {
		return totalCompletedOrders;
	}
	/**
	 * @param totalCompletedOrders the totalCompletedOrders to set
	 */
	public void setTotalCompletedOrders(int totalCompletedOrders) {
		this.totalCompletedOrders = totalCompletedOrders;
	}
	/**
	 * @return the totalOrders
	 */
	public int getTotalOrders() {
		return totalOrders;
	}
	/**
	 * @param totalOrders the totalOrders to set
	 */
	public void setTotalOrders(int totalOrders) {
		this.totalOrders = totalOrders;
	}
	/**
	 * @return the totalCanceledOrders
	 */
	public int getTotalCanceledOrders() {
		return totalCanceledOrders;
	}
	/**
	 * @param totalCanceledOrders the totalCanceledOrders to set
	 */
	public void setTotalCanceledOrders(int totalCanceledOrders) {
		this.totalCanceledOrders = totalCanceledOrders;
	}
	
	                                                                                                                                                                                
	                                                                                                                                                                                  
 
	
	                                                                                                                                                                                                                                                                                                                                                               
	                                                                                                                                                                                    
	
	
	
}
