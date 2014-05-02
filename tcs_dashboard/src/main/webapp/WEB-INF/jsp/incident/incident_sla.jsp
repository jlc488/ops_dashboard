<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>

<div id="page-wrapper">
	   <div class="row">
          <div class="col-lg-12 page-header">
            <ol class="breadcrumb">
              <i class="fa fa-desktop"></i> <li>Service Management</li>
              <li class="active">Application Split</li>
            </ol>
          </div>
        </div><!-- /.row -->
	    <div class="row">
	       <div class="col-lg-12">
	            <div class="panel panel-default">
	              <div class="panel-heading">
	                <h3 class="panel-title"> <i class="fa fa-money"></i> Application wise Open Tickets</h3>

	              </div>
	              <div class="panel-body">
	               <div id="morris-donut-appSplit"></div>
	              </div>
	            </div>
	        </div>
          </div> <!-- Row 2 End -->
</div>

<script>
var colors = ['#4AA02C','#37619d','#98AFC7','#38ACEC','#F6CEF5','#786D5F','#38ACEC','#F6D8CE','#BCF5A9','#ECCEF5'] ;
Morris.Donut({
	  element: 'morris-donut-appSplit',
	  data: [
	    {label: "Customer Sync", value: 1},
	    {label: "Interfaces", value: 1},
	    {label: "Mediation", value: 1},
	    {label: "BRM", value: 2},
	    {label: "PH4C", value: 2},
	    {label: "CRM", value: 11}
	  ],
	  colors: colors
	});


new Morris.Area({
	  // ID of the element in which to draw the chart.
	  element: 'morris-Area-appSplit',
	  // Chart data records -- each entry in this array corresponds to a point on
	  // the chart.
	  data: [
	    { year: '1', value: 1 },
	    { year: '2', value: 1 },
	    { year: '3', value: 1 },
	    { year: '4', value: 2 },
	    { year: '5', value: 2 },
	    { year: '6', value: 11 }
	  ],
	  // The name of the data record attribute that contains x-values.
	  xkey: 'year',
	  // A list of names of data record attributes that contain y-values.
	  ykeys: ['value'],
	  // Labels for the ykeys -- will be displayed when you hover over the
	  // chart.
	  labels: ['Value']
	});

</script>