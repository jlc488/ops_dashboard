<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>

<div id="page-wrapper">
	 <div class="row">
          <div class="col-lg-12 page-header">
            <ol class="breadcrumb">
              <i class="fa fa-desktop"></i> <li><spring:message code="menu.mediation"/></li>
              <li class="active"><spring:message code="menu.mediation.sub.cdr_trend"/></li>
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
	             	<span class="add-on"><spring:message code='Mediation.cdr.trend.from' /> </span>
				    <input class="datepicker btn small" data-date-format="yyyy-mm-dd" id="date-start" value="${startYear}-${startMonth}-${startDay}">
				    <span class="add-on"><spring:message code='Mediation.cdr.trend.to' /></span>
				    <input class="datepicker btn small" data-date-format="yyyy-mm-dd" id="date-end" value="${endYear}-${endMonth}-${endDay}">
				</div>
	            </div>
	          </div>
	</div><!-- /.row -->	
 	 <div class="row" >
          <div class="col-lg-12">
            <div class="panel panel-default">
              <div class="panel-heading">
                <i class="fa fa-bar-chart-o"></i><spring:message code='Mediation.cdr.trend.wirelessTitle' />
              </div>
              <div class="panel-body">
                <div id="trendLine"></div>
              </div>
            </div>
          </div>
       </div>
       <div class="row">
          <div class="col-lg-12">
            <div class="panel panel-default">
              <div class="panel-heading">
                <i class="fa fa-bar-chart-o"></i> <spring:message code='Mediation.cdr.trend.wirelineTitle' />
              </div>
              <div class="panel-body">
                <div id="trendArea"></div>
              </div>
            </div>
          </div>
       </div><!-- /.row -->
</div>
<!-- Components Code -->
<script>
 var rawDataWireless = ${trendJSONwireLess};
 var rawDataWireline = ${trendJSONwireLine};

 
 var chartLine = Morris.Line({
     element: 'trendLine',
     data: rawDataWireless,
     xkey: 'requestDate',
     xLabelFormat: function(d) {
    	    return d.getDate()+'/'+(d.getMonth()+1)+'/'+d.getFullYear(); 
    	  },
     xLabels:'day',	  
     ykeys: ['cdrCount'],
     labels: ['CDR Count'],
     lineWidth: 2,
     dateFormat: function(date) {
        d = new Date(date);
        return d.getDate()+'/'+(d.getMonth()+1)+'/'+d.getFullYear(); 
        }
 });

 var chartArea = Morris.Line({
     element: 'trendArea',
     data: rawDataWireless,
     xkey: 'requestDate',
     xLabelFormat: function(d) {
 	    return d.getDate()+'/'+(d.getMonth()+1)+'/'+d.getFullYear(); 
 	  },
	  xLabels:'day',	  
	  ykeys: ['cdrCount'],
	  labels: ['CDR Count'],
	  lineWidth: 2,
	  dateFormat: function(date) {
      d = new Date(date);
      return d.getDate()+'/'+(d.getMonth()+1)+'/'+d.getFullYear(); 
      }
 });


 
 

 function changeData(rawData){
	var s = $('#date-start').val().split('-');
	 var e = $('#date-end').val().split('-');
	 var sDate = new Date(s[0], (s[1]-1), s[2]);
	 var eDate = new Date(e[0], (e[1]-1), e[2]);


	 var ret = [];

	 for( var i = 0; i < rawData.length; i++ ){//for-1


		 var tmpDate = new Date(rawData[i].requestDate);
		
		 
		 if( tmpDate >= sDate && tmpDate <= eDate ){
			 ret.push({

				 requestDate : rawData[i].requestDate,
				 cdrCount : rawData[i].cdrCount

			 });
		 };
		 
	 }; 
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
         chartLine.setData( changeData(rawDataWireless) );
         //chartLine.redraw();
         chartArea.setData( changeData(rawDataWireline) );
         chartArea.redraw();
         
        
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
         chartLine.setData( changeData(rawDataWireless) );
         chartArea.setData( changeData(rawDataWireline) );
        
     });
 </script>