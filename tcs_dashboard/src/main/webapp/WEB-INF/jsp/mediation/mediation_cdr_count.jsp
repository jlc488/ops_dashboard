<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>

<div id="page-wrapper">

		<div class="row">
          <div class="col-lg-12 page-header">
            <ol class="breadcrumb">
              <i class="fa fa-desktop"></i> <li><spring:message code="menu.mediation"/></li>
              <li class="active"><spring:message code="menu.mediation.sub.cdr_count"/></li>
            </ol>
          </div>
        </div><!-- /.row -->
	   <div class="row">
	       <div class="col-lg-12">
	            <div class="panel panel-default">
	              <div class="panel-heading">
	                <i class="fa fa-money"></i> <spring:message code="mediation.chart.cdr.count" />
	              </div>
	              <div class="panel-body">
	               <div id="trendCDRCountWeeky"></div>
	              </div>
	            </div>
	        </div>
          </div> <!-- Row 2 End -->
</div>
<!-- Components Code -->
<script>
var rawDataWireless = ${systemCdrCountJSON};


/* Morris.Line({
	 element: 'trendCDRCountWeeky',
     data: rawDataWireless,
     xkey: 'systemName',
     xLabels:'systemName',	  
     ykeys: [['cdrWeek1'],['cdrWeek2']],
     labels: ['CDR Count'],
     lineWidth: 2
});
{ y: '1', a: 820309587, b: 19871940 ,c: 513264873, d: 0, e: 3167219426, f: 273 ,g: 3263710223},
	    { y: '2', a: 0,  b: 0 ,c: 0, d: 0, e: 0, f: 0 ,g: 0},
	    { y: '3', a: 0,  b: 0 ,c: 0, d: 0, e: 0, f: 0 ,g: 0},
	    { y: '4', a: 0,  b: 0 ,c: 0, d: 0, e: 0, f: 0 ,g: 0},
	    { y: '5', a: 0, b: 0 ,c: 0, d: 0, e: 0, f: 0 ,g: 0}
*/
Morris.Line({
	  element: 'trendCDRCountWeeky',
	  data: [
	    { y: '1', a: 100, b: 90 ,c: 75, d: 100, e: 90, f: 90 ,g: 75},
	    { y: '2', a: 75,  b: 65 ,c: 55, d: 100, e: 90, f: 90 ,g: 75},
	    { y: '3', a: 50,  b: 40 ,c: 30, d: 100, e: 90, f: 90 ,g: 75},
	    { y: '4', a: 75,  b: 65 ,c: 55, d: 100, e: 90, f: 90 ,g: 75},
	    { y: '5', a: 100, b: 90 ,c: 80, d: 100, e: 90, f: 90 ,g: 75}
	  ],
	  xkey: 'y',
	  ykeys: ['a', 'b','c','d','e','f','g'],
	  labels: [['ICIS'], ['WIBRO'],['ICBS'],['NISS'],['KDAP'],['BRM'],['IUM']]
	});


</script>