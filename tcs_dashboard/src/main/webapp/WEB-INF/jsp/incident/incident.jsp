<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<div id="page-wrapper">
		<div class="row">
          <div class="col-lg-12 page-header">
            <ol class="breadcrumb">
              <i class="fa fa-desktop"></i> <li><spring:message code="menu.interface"/></li>
              <li class="active"><spring:message code="menu.interface.sub.incident"/></li>
            </ol>
          </div>
        </div><!-- /.row -->
	   <div class="row">
	       <div class="col-lg-12">
	            <div class="panel panel-default">
	              <div class="panel-heading">
	                <i class="fa fa-money"></i> <spring:message code="incident.chart.trend" />
	              </div>
	              <div class="panel-body">
	               <div id="trendIncident"></div>
	              </div>
	            </div>
	        </div>
          </div> <!-- Row 2 End -->
</div>

<script>
Morris.Bar({
  element: 'trendIncident',
  data: [
    { y: '2/2/2014', a: 120, b: 100, c: 20},
    { y: '3/2/2014', a: 75,  b: 65 , c: 10},
    { y: '4/2/2014', a: 50,  b: 40 , c: 10},
    { y: '5/2/2014', a: 75,  b: 65 , c: 10},
    { y: '6/2/2014', a: 50,  b: 40 , c: 10}
  ],
  xkey: 'y',
  ykeys: ['a', 'b','c'],
  labels: ['Raised', 'Resolved','Remaining']
});
</script>