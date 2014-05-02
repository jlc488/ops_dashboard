<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>

<div id="page-wrapper">
		<div class="row">
          <div class="col-lg-12 page-header">
            <ol class="breadcrumb">
              <i class="fa fa-desktop"></i> <li><spring:message code="menu.order"/></li>
              <li class="active"><spring:message code="menu.order.sub.status"/></li>
            </ol>
          </div>
        </div><!-- /.row -->
		<div class="row">
          <div class="col-lg-12">
          	<div class="alert alert-success alert-dismissable" id="alert" style="display:none;">
              <strong>&nbsp;</strong>
            </div>

            <div class="panel">
             	<div class="input-daterange" id="datepicker">
             	<span class="add-on"><spring:message code="date.picker.from" /> </span>
			    <input class="datepicker btn small" data-date-format="yyyy-mm-dd" id="date-start" value="${startYear}-${startMonth}-${startDay}">
			    <span class="add-on"><spring:message code="date.picker.to" /></span>
			    <input class="datepicker btn small" data-date-format="yyyy-mm-dd" id="date-end" value="${endYear}-${endMonth}-${endDay}">
			</div>
            </div>
          </div>
		</div><!-- /.row -->
	   <div class="row">
	       <div class="col-lg-4">
	            <div class="panel panel-default">
	              <div class="panel-heading">
	                <i class="fa fa-money"></i> <spring:message code="order.status.chart.new" />
	              </div>
	              <div class="table-responsive">
	                 <table class="table table-bordered table-hover table-striped">
	                   <thead>
	                     <tr>
	                       <th><spring:message code="order.status.chart.col.date" /></th>
	                       <th><spring:message code="order.status.chart.col.Inprogress"/> </th>
	                       <th><spring:message code="order.status.chart.col.completed"/></th>
	                      </tr>
	                   </thead>
	                   <!-- tobody starts -->
	                 	<tbody id="table1">
	                 	</tbody>
	                 	<!-- tobody ends -->
	            	 </table>
               	</div>
	              <div class="panel-body">
	               <div id="trendDonut"></div>
	              </div>
	            </div>
	        </div>
	        <div class="col-lg-4">
	            <div class="panel panel-default">
	              <div class="panel-heading">
	                <i class="fa fa-money"></i> Order Status : Modify Orders
	              </div>
	              <div class="table-responsive">
	                 <table class="table table-bordered table-hover table-striped">
	                   <thead>
	                     <tr>
	                      <th><spring:message code="order.status.chart.col.date" /></th>
	                      <th><spring:message code="order.status.chart.col.Inprogress"/> </th>
	                      <th><spring:message code="order.status.chart.col.completed"/></th>
	                     </tr>
	                   </thead>
	                   <!-- tobody starts -->
	                 	<tbody id="table2">
	                 	</tbody>
	                 	<!-- tobody ends -->
	            	 </table>
               	</div>
	               <div class="panel-body">
	               <div id="trendDonut2"></div>
	              </div>
	            </div>
	          </div>
	          <div class="col-lg-4">
	            <div class="panel panel-default">
	              <div class="panel-heading">
	                <i class="fa fa-money"></i><spring:message code="order.status.chart.terminate.orders" />
	              </div>
	              <div class="table-responsive">
	                 <table class="table table-bordered table-hover table-striped">
	                   <thead>
	                     <tr>
	                      <th><spring:message code="order.status.chart.col.date" /></th>
	                      <th><spring:message code="order.status.chart.col.Inprogress"/> </th>
	                      <th><spring:message code="order.status.chart.col.completed"/></th>
	                      </tr>
	                   </thead>
	                   <!-- tobody starts -->
	                 	<tbody id="table3">
	                 	</tbody>
	                 	<!-- tobody ends -->
	            	 </table>
               	</div>
	              <div class="panel-body">
	               <div id="trendDonut"></div>
	              </div>
	            </div>
	          </div>
          </div> <!-- Row 1 End -->
</div>
<!-- Components Code -->
<script>


 var rawDataNewOrder = ${tcountJSONnewOrderIPTV};
 var rawDateModifyOrd= ${tcountJSONmodifyOrderIPTV};
 var rawDataTerminateOrd=${tcountJSONterminateOrderIPTV};

 function formatDate( data ){
	 d = new Date(data);
     return d.getDate()+'/'+(d.getMonth()+1)+'/'+d.getFullYear(); 
 }
 
 $(function() {
	   changeData();
 });

 
 
 function changeData(){
	 var sDate = new Date($('#date-start').val());
	 var eDate = new Date($('#date-end').val());
	 var ret = [];
	 
	 $("#table1").empty();

	 for( var i = rawDataNewOrder.length-1; i >=0 ; i-- ){//for-1

		 var tmpDate = new Date(rawDataNewOrder[i].createdDate);
		
		 
		 if( tmpDate >= sDate && tmpDate <= eDate ){
			 ret.push({
				 createdDate : rawDataNewOrder[i].createdDate,
				 inprogress :  rawDataNewOrder[i].inprogress,
				 completed :  rawDataNewOrder[i].completed
			 });

			 $("#table1").append("<tr><td>"+formatDate(rawDataNewOrder[i].createdDate)+"</td><td>"+rawDataNewOrder[i].inprogress+"</td><td>"+rawDataNewOrder[i].completed+"</td></tr>"); 
			 $("table").trigger("update");
		 };
		 
	 }//for-1 
	 $("#table2").empty();

	 for( var i = rawDateModifyOrd.length-1; i >= 0 ; i-- ){//for-1

		 var tmpDate = new Date(rawDateModifyOrd[i].createdDate);
		
		 
		 if( tmpDate >= sDate && tmpDate <= eDate ){
			 ret.push({
				 createdDate : rawDateModifyOrd[i].createdDate,
				 inprogress :  rawDateModifyOrd[i].inprogress,
				 completed :  rawDateModifyOrd[i].completed
			 });

			 $("#table2").append("<tr><td>"+formatDate(rawDateModifyOrd[i].createdDate)+"</td><td>"+rawDateModifyOrd[i].inprogress+"</td><td>"+rawDateModifyOrd[i].completed+"</td></tr>"); 
			 $("table").trigger("update");
		 };
		 
	 }//for-1 

	 $("#table3").empty();

	 for( var i = rawDataTerminateOrd.length-1; i >=0 ; i-- ){//for-1

		 var tmpDate = new Date(rawDataTerminateOrd[i].createdDate);
		
		 
		 if( tmpDate >= sDate && tmpDate <= eDate ){
			 ret.push({
				 createdDate : rawDataTerminateOrd[i].createdDate,
				 inprogress :  rawDataTerminateOrd[i].inprogress,
				 completed :  rawDataTerminateOrd[i].completed
			 });

			 $("#table3").append("<tr><td>"+formatDate(rawDataTerminateOrd[i].createdDate)+"</td><td>"+rawDataTerminateOrd[i].inprogress+"</td><td>"+rawDataTerminateOrd[i].completed+"</td></tr>"); 
			 $("table").trigger("update");
		 };
		 
	 }//for-1 

	 

	 return ret;
 }
 
 $('.datepicker').datepicker({
	    format: 'yyyy-mm-dd',
	    language:'ko',
	    todayHighlight : true
 });
 
 $('#date-start')
     .datepicker()
     .on('changeDate', function(ev){
    	 var endDate 	= new Date($('#date-end').val());
         if (ev.date.valueOf() > endDate.valueOf()){
             $('#alert').show().find('strong').text('The start date must be before the end date.');
         } else {
             $('#alert').hide();
         }
         $('#date-start').datepicker('hide');
        
         changeData();
     });
 
 $('#date-end')
     .datepicker()
     .on('changeDate', function(ev){
    	 var startDate 	= new Date($('#date-start').val());
         if (ev.date.valueOf() < startDate.valueOf()){
             $('#alert').show().find('strong').text('The end date must be after the start date.');
         } else {
             $('#alert').hide();
         }
         $('#date-end').datepicker('hide');
        
         changeData();
        
     });
	 
 </script>