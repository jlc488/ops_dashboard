<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="tiles" uri="http://tiles.apache.org/tags-tiles"%>

<%@ taglib prefix="c"      uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<meta name="description" content="">
<meta name="author" content="SexySinny">

<title><spring:message code="tcs.dashboard.title"/></title>

<!-- Bootstrap core CSS -->
<link href='<c:url value="/resources/css/bootstrap.min.css" />' rel="stylesheet">
<link href='<c:url value="/resources/font-awesome/css/font-awesome.min.css" />' rel="stylesheet" >

<link href='<c:url value="/resources/css/sb-admin.css" />' rel="stylesheet">

  <!--[if lt IE 9]>
      <script src="https://oss.maxcdn.com/libs/html5shiv/3.7.0/html5shiv.js"></script>
      <script src="https://oss.maxcdn.com/libs/respond.js/1.3.0/respond.min.js"></script>
    <![endif]-->
    
</head>

<body> 
	<div id="wrapper">
		<tiles:insertAttribute name="main"/>
	</div>
</body>


</html>