<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>

<div id="page-wrapper">
	<div class="row">
          <div class="col-lg-12 page-header">
            <ol class="breadcrumb">
              <i class="fa fa-desktop"></i> <li><spring:message code="menu.order"/></li>
              <li class="active"><spring:message code="menu.order.sub.fall_out"/></li>
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
				    <span class="add-on"><spring:message code="date.picker.to"/></span>
				    <input class="datepicker btn small" data-date-format="yyyy-mm-dd" id="date-end" value="${endYear}-${endMonth}-${endDay}">
				</div>
	            </div>
	          </div>
	</div><!-- /.row -->
	 <div class="row">
          <div class="col-lg-12">
            <div class="panel panel-default">
              <div class="panel-heading">
               <i class="fa fa-bar-chart-o"></i> <spring:message code="order.fall.out.trend" />
              </div>
              <div class="panel-body">
                <div id="trendArea"></div>
              </div>
            </div>
          </div>
       </div><!-- /.row -->	
 	 <div class="row" >
          <div class="col-lg-12">
           	<div class="panel panel-default">
          		<div class="panel-heading">
               		<i class="fa fa-bar-chart-o"></i> <spring:message code="order.fall.out.count" />
              	</div>
               <div class="table-responsive">
                 <table class="table table-bordered table-hover table-striped">
                   <thead>
                     <tr>
                       <th><spring:message code="order.fall.out.count.table.col1"/></th>
                       <th><spring:message code="order.fall.out.count.table.col2"/></th>
                      </tr>
                   </thead>
                   <!-- tobody starts -->
                 	<tbody>
                 	</tbody>
                 	<!-- tobody ends -->
            	 </table>
               </div>
            </div>
           </div>
       </div>
	</div>
<!-- Components Code -->
<script>


 var rawDataFallout = ${trendJSONorderFalloutcnt};


 var chartArea = Morris.Area({
     element: 'trendArea',
     data: rawDataFallout,
     xkey: 'createdDate',
     xLabelFormat: function(d) {
 	    return d.getDate()+'/'+(d.getMonth()+1)+'/'+d.getFullYear(); 
 	  },
	  xLabels:'day',	  
	  ykeys: ['falloutOrderCnt'],
	  labels: ['Fallout Count'],
	  lineWidth: 2,
	  dateFormat: function(date) {
      d = new Date(date);
      return d.getDate()+'/'+(d.getMonth()+1)+'/'+d.getFullYear(); 
      }
 });

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
	 
	 $("table tbody").empty();

	 for( var i = 0; i < rawDataFallout.length; i++ ){//for-1

		 var tmpDate = new Date(rawDataFallout[i].createdDate);
		
		 
		 if( tmpDate >= sDate && tmpDate <= eDate ){
			 ret.push({
				 createdDate : rawDataFallout[i].createdDate,
				 falloutOrderCnt : rawDataFallout[i].falloutOrderCnt
			 });

			 $("table tbody").append("<tr><td>"+rawDataFallout[i].falloutOrderCnt+"</td><td>"+formatDate(rawDataFallout[i].createdDate)+"</td></tr>"); 
			 $("table").trigger("update");
		 }
		 
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
        
         chartArea.setData( changeData() );
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
        
         chartArea.setData( changeData() );
         
        
     });



	 
 </script>