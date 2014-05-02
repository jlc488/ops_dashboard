<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
 
<%@ taglib prefix="c"      uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form"   uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
 


 <div id="page-wrapper">

        <div class="row">
        	<div class="col-lg-12 page-header">
        	<h1><spring:message code='profile.title'/> <small>${username }</small></h1>
        		<form role="form">
				  <div class="form-group">
				    <label for="userIDLabel"><spring:message code='profile.id'/></label>
				    <input type="text" class="form-control" id="userID" value="${username }" readonly="readonly">
				  </div>
				  <div class="form-group">
				    <label for="password1Label"><spring:message code='profile.password'/></label>
				    <input type="password" class="form-control" id="pass1" value="${password }" readonly="readonly">
				  </div> 
				  <div class="form-group">
				    <label for="password2Label"><spring:message code='profile.password.confirm'/></label>
				    <input type="password" class="form-control" id="pass2" value="${password }" readonly="readonly">
				  </div>
				  <button type="submit" class="btn btn-default"><spring:message code='profile.btn.submit'/></button>
				  <button type="cancel" class="btn btn-default"><spring:message code='profile.btn.cancel'/></button>
				</form>
        	</div>
        </div>

</div>