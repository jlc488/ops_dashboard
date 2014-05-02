<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>

<div id="page-wrapper">
		 <div class="row">
          <div class="col-lg-12 page-header">
            <ol class="breadcrumb">
              <i class="fa fa-desktop"></i> <li><spring:message code="menu.order"/></li>
              <li class="active"><spring:message code="menu.order.sub.aging"/></li>
            </ol>
          </div>
        </div><!-- /.row -->
	   <div class="row">
	       <div class="col-lg-6">
	            <div class="panel panel-default">
	              <div class="panel-heading">
	               <i class="fa fa-money"></i> <spring:message code="order.aging.chart.lob.ip.tv" />
	              </div>
	              <div class="panel-body">
	               <div id="trendDonut"></div>
	              </div>
	            </div>
	        </div>
	        <div class="col-lg-6">
	            <div class="panel panel-default">
	              <div class="panel-heading">
	                <i class="fa fa-money"></i> <spring:message code="order.aging.chart.lob.internet" />
	              </div>
	              <div class="panel-body">
	               <div id="trendDonut2"></div>
	              </div>
	            </div>
	          </div>
          </div> <!-- Row 1 End -->
          <div class="row">
         	 <div class="col-lg-6">
            	<div class="panel panel-default">
	              <div class="panel-heading">
	                <i class="fa fa-money"></i> <spring:message code="order.aging.chart.overall.inprogress" />
	              </div>
	              <div class="panel-body">
	               <div id=morris-chart-bar></div>
	              </div>
            	</div>
          	</div>
          	<div class="col-lg-6">
            	<div class="panel panel-default">
	              <div class="panel-heading">
	                <i class="fa fa-money"></i> <spring:message code="order.aging.chart.overall.failed.trend"/>
	              </div>
	              <div class="panel-body">
	               <div id=morris-chart-bar2></div>
	              </div>
            	</div>
          	</div>
          </div> <!-- Row 2 End -->
</div>
<!-- Components Code -->
<script>
 var splitData =  [];
 var splitData2 = [];
 var colors = ['#D58025','#37619d','#98AFC7','#4AA02C','#F87431','#786D5F','#38ACEC'] ;
 var colors2 = ['#98AFC7'] ;
 var rawData  = ${agingJSONIPTV};
 var rawData2 = ${agingJSONINTERNET};
 var rawData3 = ${agingJSONinprogress};
 var rawData4 = ${agingJSONfailed};
 
 for(var i =0; i< rawData.length; i++){//for-1
	 splitData.push({
		 label : rawData[i]["description"],
		 value : rawData[i]["count"]
		 });
 }//for-1

 for(var i =0; i< rawData2.length; i++){//for-1
	 splitData2.push({
		 label : rawData2[i]["description"],
		 value : rawData2[i]["count"]
		 });
 }//for-1

 Morris.Donut({
 element: 'trendDonut',
 data: splitData,
 colors: colors
 });
 
 Morris.Donut({
	 element: 'trendDonut2',
	 data: splitData2,
	 colors: colors
	 });

 Morris.Bar ({
	  element: 'morris-chart-bar',
	  data: rawData3,
	  xkey: 'noOfOrders',
	  ykeys: ['noOfOrders'],
	  labels: ['aging'],
	  barRatio: 0.4,
	  xLabelAngle: 35,
	  hideHover: 'auto'
	});
 Morris.Bar ({
	  element: 'morris-chart-bar2',
	  data: rawData4,
	  xkey: 'aging',
	  ykeys: ['noOfOrders'],
	  labels: ['aging'],
	  barRatio: 0.4,
	  xLabelAngle: 35,
	  barColors:colors2,
	  hideHover: 'auto',
	  barFillColors: [
	    '#aaa #555',      // from light gray to dark gray (top to bottom)
	    '#555 #aaa black' // from dark day, through light gray, to black
	  ]
	});
 </script>