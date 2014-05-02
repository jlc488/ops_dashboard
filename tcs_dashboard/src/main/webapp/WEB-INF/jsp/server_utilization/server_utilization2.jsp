<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>


<div id="page-wrapper">
	 <div class="row">
	          <div class="col-lg-12">
	          	<div class="alert alert-success alert-dismissable" id="alert" style="display:none;">
	              <strong>&nbsp;</strong>
	             	<div >           	
	             	<span align="right" class="add-on">Parameter </span>
				    <select>
				     <option value="CPU Max">CPU Max</option>
					  <option value="CPU Avg">CPU Avg</option>
					  <option value="Memory Max">Memory Max</option>
					  <option value="Memory Avg">Memory Avg</option>
				    </select>
				    </div>
	            </div>
	          </div>
	</div><!-- /.row -->
	 <div class="row">
          <div class="col-lg-12">
            <div class="panel panel-default">
              <div class="panel-heading">
                <h3 class="panel-title"><i class="fa fa-bar-chart-o"></i> Server utilization Trend</h3>
                 <div class="pull-right">
                   <div class="btn-group">
                       <button type="button" class="btn btn-default btn-xs dropdown-toggle" data-toggle="dropdown">
                           --Select--
                           <span class="caret"></span>
                       </button>
                       <ul class="dropdown-menu pull-right" role="menu">
                           <li><a href="#">CPU Max</a>
                           </li>
                           <li><a href="#">CPU AVG</a>
                           </li>
                           <li><a href="#">Memory Max</a>
                           </li>
                           <li><a href="#">Memory Avg</a>
                           </li>
                       </ul>
                   </div>
               </div>
               </div>
             
              <div class="panel-body">
                <div id="trendArea"></div>
              </div>
              <div class="panel-footer stupid">
				<a href="<c:url value='/server_utilization'/>"> <span class="badge" class="pull-right"> Back</span> </a>
              </div>
            </div>
          </div>
       </div><!-- /.row -->	
 	 
	</div>
<!-- Components Code -->
<script>


 var rawDataserverutil =  [{"timeslot":10,"value":15 },{"timeslot":11 ,"value":90 },{"timeslot":12 ,"value":30 },{"timeslot":13 ,"value":95 },{"timeslot":14 ,"value":10 },
                           {"timeslot":15,"value":15 },{"timeslot":16 ,"value":90 },{"timeslot":17 ,"value":30 },{"timeslot":18 ,"value":95 },{"timeslot":9 ,"value":10 },
                           {"timeslot":10,"value":15 },{"timeslot":11 ,"value":90 },{"timeslot":12 ,"value":30 },{"timeslot":13 ,"value":95 },{"timeslot":14 ,"value":10 },
                           {"timeslot":15,"value":15 },{"timeslot":16 ,"value":90 },{"timeslot":17 ,"value":30 },{"timeslot":18 ,"value":95 },{"timeslot":19 ,"value":10 },
                           {"timeslot":20,"value":15 },{"timeslot":21 ,"value":90 },{"timeslot":22 ,"value":30 },{"timeslot":23 ,"value":95 },{"timeslot":14 ,"value":10 }
                           ];


 var chartArea = Morris.Area({
     element: 'trendArea',
     data: rawDataserverutil,
     xkey: 'timeslot',
     xLabels:['timeslot'],	  
	  ykeys: ['value'],
	  labels: ['value'],
	  lineWidth: 2
 });

  
 </script>