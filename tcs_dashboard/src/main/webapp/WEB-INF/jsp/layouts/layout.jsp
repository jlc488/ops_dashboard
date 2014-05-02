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
<link href='<c:url value="/resources/css/datepicker.css" />' rel="stylesheet">

<!-- Add custom CSS here -->
<link href='<c:url value="/resources/css/sb-admin.css" />' rel="stylesheet">
<link rel="stylesheet" href='<c:url value="/resources/font-awesome/css/font-awesome.min.css" />'>

<!-- plugins CSS -->
<link rel="stylesheet" href="<c:url value="/resources/css/plugins/morris/morris-0.4.3.min.css"/>">
<link rel="stylesheet" href="<c:url value="/resources/css/plugins/dataTables/dataTables.bootstrap.css"/>">
<link rel="stylesheet" href="<c:url value="/resources/css/plugins/social-buttons/social-buttons.css"/>">
<link rel="stylesheet" href="<c:url value="/resources/css/plugins/timeline/timeline.css"/>">
<link rel="stylesheet" href="<c:url value="/resources/css/plugins/pace/themes/pace-theme-flat-top.css"/>">

  <!--[if lt IE 9]>
      <script src="https://oss.maxcdn.com/libs/html5shiv/3.7.0/html5shiv.js"></script>
      <script src="https://oss.maxcdn.com/libs/respond.js/1.3.0/respond.min.js"></script>
    <![endif]-->
    
<!-- JavaScript Liberary-->
<script src="<c:url value="/resources/js/jquery-1.10.2.js" />"></script>
<script src="<c:url value="/resources/js/bootstrap.js" />"></script>
<script src="<c:url value="/resources/js/json2.js" />"></script>
<script src="<c:url value="/resources/js/sb-admin.js" />"></script>

<!-- Plugins JS -->
<script src="<c:url value="/resources/js/plugins/metisMenu/jquery.metisMenu.js" />"></script>
<script src="<c:url value="/resources/js/plugins/morris/raphael-2.1.0.min.js"/>"></script>
<script src="<c:url value="/resources/js/plugins/morris/morris.js" />"></script>
<script src="<c:url value="/resources/js/plugins/dataTables/jquery.dataTables.js" />"></script>
<script src="<c:url value="/resources/js/plugins/flot/excanvas.min.js" />"></script>
<script src="<c:url value="/resources/js/plugins/flot/jquery.flot.js" />"></script>
<script src="<c:url value="/resources/js/plugins/flot/jquery.flot.pie.js" />"></script>
<script src="<c:url value="/resources/js/plugins/flot/jquery.flot.resize.js" />"></script>
<script src="<c:url value="/resources/js/plugins/flot/jquery.flot.tooltip.min.js" />"></script>
<script src="<c:url value="/resources/js/bootstrap-datepicker.js" />"></script>
<script src="<c:url value="/resources/js/locales/bootstrap-datepicker.en.js" />"></script>
<script src="<c:url value="/resources/js/plugins/pace/pace.min.js" />"></script>

<script src="<c:url value="/resources/js/demo/flot-demo.js"/>" ></script>
<script src="<c:url value="/resources/js/demo/morris-demo.js"/>" ></script>
</head>

<body>

	<div id="wrapper">
		<tiles:insertAttribute name="menu"/>
		<tiles:insertAttribute name="main"/>
	</div>
</body>

</html>