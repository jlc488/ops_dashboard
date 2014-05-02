<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>

<div id="page-wrapper">

		<div class="row">
          <div class="col-lg-12 page-header">
            <ol class="breadcrumb">
              <i class="fa fa-desktop"></i> <li>Health Check</li>
              <li class="active">Server Utilization</li>
            </ol>
          </div>
        </div><!-- /.row -->
	   <div class="row">
	       <div class="col-lg-6">
	            <div class="panel panel-default">
	              <div class="panel-heading">
	                <h3 class="panel-title"><i class="fa fa-money"></i>CPU Average</h3>
	              </div>
	              <div class="panel-body">
	               <div id="trendCPUAvg"></div>
	              </div>
	            </div>
	        </div>
	        <div class="col-lg-6">
	            <div class="panel panel-default">
	              <div class="panel-heading">
	                <h3 class="panel-title"><i class="fa fa-money"></i>Memory Average</h3>
	              </div>
	              <div class="panel-body">
	               <div id="trendMEMAvg"></div>
	              </div>
	            </div>
	          </div>
          </div> <!-- Row 1 End -->
          <div class="row">
         	 <div class="col-lg-6">
            	<div class="panel panel-default">
	              <div class="panel-heading">
	                <h3 class="panel-title"><i class="fa fa-money"></i>CPU Max</h3>
	              </div>
	              <div class="panel-body">
	               <div id=trendCPUMax></div>
	              </div>
            	</div>
          	</div>
          	<div class="col-lg-6">
            	<div class="panel panel-default">
	              <div class="panel-heading">
	                <h3 class="panel-title"><i class="fa fa-money"></i>Memory Max</h3>
	              </div>
	              <div class="panel-body">
	               <div id=trendMEMMax></div>
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
 var rawData  = ${trendJSONwireLess};
 var rawData2 = ${trendJSONwireLess};
 var rawData3 = ${trendJSONwireLess};
 var rawData4 = ${trendJSONwireLess};
 
 for(var i =0; i< rawData.length; i++){//for-1
	 splitData.push({
		 label : rawData[i]["timeSlot"],
		 value : rawData[i]["sbSveAp"]
		 });
 }//for-1

 for(var i =0; i< rawData2.length; i++){//for-1
	 splitData2.push({
		 label : rawData2[i]["timeSlot"],
		 value : rawData2[i]["sbSveAp"]
		 });
 }//for-1

 Morris.Line ({
	  element: 'trendCPUAvg',
	  data: rawData3,
	  xkey:  'timeSlot',
	  ykeys: [['aiaPipDb'],['sbSveAp'],['osbDB'],['bisAp'],['bisDb'],['stagingDb'],['osbDB'],['egiDb'],['aiaPipAp'],['egiAp'],['sblConf'],['sblOm'],['sblDb'],['osbAp']],
	  labels: [['aiaPipDb'],['sbSveAp'],['osbDB'],['bisAp'],['bisDb'],['stagingDb'],['osbDB'],['egiDb'],['aiaPipAp'],['egiAp'],['sblConf'],['sblOm'],['sblDb'],['osbAp']],
	  barRatio: 0.4,
	  xLabelAngle: 35,
	  hideHover: 'auto'
	});
 
 Morris.Line ({
	  element: 'trendMEMAvg',
	  data: rawData3,
	  xkey: 'timeSlot',
	  ykeys: [['aiaPipDb'],['sbSveAp'],['osbDB'],['bisAp'],['bisDb'],['stagingDb'],['osbDB'],['egiDb'],['aiaPipAp'],['egiAp'],['sblConf'],['sblOm'],['sblDb'],['osbAp']],
	  labels: [['aiaPipDb'],['sbSveAp'],['osbDB'],['bisAp'],['bisDb'],['stagingDb'],['osbDB'],['egiDb'],['aiaPipAp'],['egiAp'],['sblConf'],['sblOm'],['sblDb'],['osbAp']],
	  barRatio: 0.4,
	  xLabelAngle: 35,
	  hideHover: 'auto'
	});

 Morris.Line ({
	  element: 'trendCPUMax',
	  data: rawData3,
	  xkey: 'timeSlot',
	  ykeys: [['aiaPipDb'],['sbSveAp'],['osbDB'],['bisAp'],['bisDb'],['stagingDb'],['osbDB'],['egiDb'],['aiaPipAp'],['egiAp'],['sblConf'],['sblOm'],['sblDb'],['osbAp']],
	  labels: [['aiaPipDb'],['sbSveAp'],['osbDB'],['bisAp'],['bisDb'],['stagingDb'],['osbDB'],['egiDb'],['aiaPipAp'],['egiAp'],['sblConf'],['sblOm'],['sblDb'],['osbAp']],
	  barRatio: 0.4,
	  xLabelAngle: 35,
	  hideHover: 'auto'
	});
 Morris.Line ({
	  element: 'trendMEMMax',
	  data: rawData4,
	  xkey: 'timeSlot',
	  ykeys: [['aiaPipDb'],['sbSveAp'],['osbDB'],['bisAp'],['bisDb'],['stagingDb'],['osbDB'],['egiDb'],['aiaPipAp'],['egiAp'],['sblConf'],['sblOm'],['sblDb'],['osbAp']],
	  labels: [['aiaPipDb'],['sbSveAp'],['osbDB'],['bisAp'],['bisDb'],['stagingDb'],['osbDB'],['egiDb'],['aiaPipAp'],['egiAp'],['sblConf'],['sblOm'],['sblDb'],['osbAp']],
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