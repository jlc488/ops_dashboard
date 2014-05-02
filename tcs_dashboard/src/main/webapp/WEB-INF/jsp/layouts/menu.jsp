<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>

<nav class="navbar navbar-default navbar-static-top" role="navigation" style="margin-bottom: 0">
	<div class="navbar-header">
		<button type="button" class="navbar-toggle" data-toggle="collapse" data-target=".sidebar-collapse">
			<span class="sr-only">Toggle navigation</span> 
			<span class="icon-bar"></span>
			<span class="icon-bar"></span> 
			<span class="icon-bar"></span>
		</button>
		<a class="navbar-brand" href="<c:url value='/index' />"><spring:message code='tcs.menu.title'/></a>
	</div>
	<!-- /.navbar-header -->
	<ul class="nav navbar-top-links navbar-right">
		<!-- /.dropdown -->
		<li class="dropdown">
			<a class="dropdown-toggle" data-toggle="dropdown" href="#"> 
				<i class="fa fa-user fa-fw"></i>
				<i class="fa fa-caret-down"></i>
			</a>
			<ul class="dropdown-menu dropdown-user">
				<li><a href="<c:url value='/profile'/>"><i class="fa fa-user fa-fw"></i><spring:message code='menu.header.profile' /></a></li>
				<li><a href="<c:url value='/settings'/>"><i class="fa fa-gear fa-fw"></i><spring:message code='menu.header.settings' /></a></li>
				<li class="divider"></li>
				<li><a href="<c:url value='/good-bye_sexysinny'/>"><i class="fa fa-sign-out fa-fw"></i><spring:message code='menu.header.log_out' /></a></li>
			</ul> <!-- /.dropdown-user -->
		</li>
		<!-- /.dropdown -->
	</ul>
	<!-- /.navbar-top-links -->

</nav>
<!-- /.navbar-static-top -->

<nav class="navbar-default navbar-static-side" role="navigation">
	<div class="sidebar-collapse">
		<ul class="nav" id="side-menu">
			<li><a href="<c:url value='/index'/>"><i class="fa fa-dashboard"></i> <spring:message code='menu.dashboard' /></a></li>
			<li><a href="<c:url value='/application_health_check'/>"><i class="fa fa-bar-chart-o fa-fw"></i> <spring:message code='menu.application_health_check' /> <span class="fa arrow"></span></a>
				<ul class="nav nav-second-level">
					<li><a href="<c:url value='/application_health_check'/>"> <i class="fa fa-edit"></i> <spring:message code='menu.application_health_check.sub.application' /></a></li>
					<li><a href="<c:url value='/server_utilization'/>"> <i class="fa fa-edit"></i> <spring:message code='menu.application_health_check.sub.infra' /></a></li>
				</ul> <!-- /.nav-second-level -->
			</li>
				
			<li><a href="<c:url value='/mediation/cdr_count'/>"><i class="fa fa-bar-chart-o fa-fw"></i> <spring:message code='menu.mediation' /> <span class="fa arrow"></span></a>
				<ul class="nav nav-second-level">
					<li><a href="<c:url value='/mediation/cdr_count'/>"> <i class="fa fa-bar-chart-o fa-fw"></i> <spring:message code='menu.mediation.sub.cdr_count' /></a></li>
					<li><a href="<c:url value='/mediation/cdr_split'/>"> <i class="fa fa-bar-chart-o fa-fw"></i> <spring:message code='menu.mediation.sub.cdr_split' /></a></li>
					<li><a href="<c:url value='/mediation/cdr_trend'/>"> <i class="fa fa-bar-chart-o fa-fw"></i> <spring:message code='menu.mediation.sub.cdr_trend' /></a></li>
				</ul> <!-- /.nav-second-level -->
			</li>
			<li><a href="<c:url value='/order/aging' />"><i class="fa fa-files-o fa-fw"></i> <spring:message code='menu.order' /><span class="fa arrow"></span></a>
				<ul class="nav nav-second-level">
					<li><a href="<c:url value='/order/aging'/>"> <i class="fa fa-files-o fa-fw"></i> <spring:message code='menu.order.sub.aging' /> </a></li>
					<li><a href="<c:url value='/order/fall_out'/>"> <i class="fa fa-files-o fa-fw"></i> <spring:message code='menu.order.sub.fall_out' /> </a></li>
					<li><a href="<c:url value='/order/status'/>"> <i class="fa fa-files-o fa-fw"></i> <spring:message code='menu.order.sub.status' /> </a></li>
				</ul> <!-- /.nav-second-level -->
			</li>
			<li><a href="<c:url value='/incident'/>"><i class="fa fa-edit"></i> <spring:message code='menu.interface' /> <span class="fa arrow"></span></a>
				<ul class="nav nav-second-level">
					<li><a href="<c:url value='/incident/sla'/>"> <i class="fa fa-edit"></i> <spring:message code='menu.interface.sub.sla' /></a></li>
					<li><a href="<c:url value='/incident'/>"> <i class="fa fa-edit"></i> <spring:message code='menu.interface.sub.incident' /></a></li>
					<li><a href="<c:url value='/interface'/>"> <i class="fa fa-edit"></i> <spring:message code='menu.interface.sub.interface' /></a></li>
				</ul> <!-- /.nav-second-level -->
			</li>
		</ul>
		<!-- /#side-menu -->
	</div>
	<!-- /.sidebar-collapse -->
</nav>
<!-- /.navbar-static-side -->


