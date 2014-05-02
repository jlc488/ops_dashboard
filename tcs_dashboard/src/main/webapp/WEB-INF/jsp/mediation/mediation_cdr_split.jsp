<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>

<div id="page-wrapper">

		<div class="row">
          <div class="col-lg-12 page-header">
            <ol class="breadcrumb">
              <i class="fa fa-desktop"></i> <li><spring:message code="menu.mediation"/></li>
              <li class="active"><spring:message code="menu.mediation.sub.cdr_split"/></li>
            </ol>
          </div>
        </div><!-- /.row -->
        
        <div class="panel">
	        <div class="input-daterange" id="datepicker">
		        <span class="add-on">Request Date </span>
				<input class="datepicker btn small" data-date-format="yyyy-mm-dd" id="req-date" value="${startYear}-${startMonth}-${startDay}">
		   	</div>
		</div>
       <div class="col-lg-6">
            <div class="panel panel-default">
              <div class="panel-heading">
                <i class="fa fa-money"></i> <spring:message code='Mediation.cdr.split.wirelineTitle' />
              </div>
              <div class="panel-body">
               <div id="trendDonut"></div>
              </div>
            </div>
        </div>
        <div class="col-lg-6">
            <div class="panel panel-default">
              <div class="panel-heading">
               <i class="fa fa-money"></i> <spring:message code='Mediation.cdr.split.wirelessTitle' />
              </div>
              <div class="panel-body">
               <div id="trendDonut2"></div>
              </div>
            </div>
          </div>
</div>
<!-- Components Code -->
<script>
 
 var colors = ['#D58025','#37619d','#98AFC7','#4AA02C','#F87431','#786D5F','#38ACEC'] ;
 
 var rawData = ${systemSplitJSON};
 var retWireline=[];
 var retWireless=[];
 var wirelessChart = '';
 var wirelineChart = '';
 
 $(function(){
	 changeData(rawData);
	 
   }
);
 

 
 
 $('#req-date').datepicker().on('changeDate', function(ev){
	 var toDate 	= new Date;
     if (ev.date.valueOf() >= toDate.valueOf()){
         alert('Requested Date Must be less than Today\'s date.');
     } else {
         $('#alert').hide();
     }
     $('#req-date').datepicker('hide');
     changeData(rawData);
     
          
 });


 
 function changeData(rawData){
	
	// alert('inside changeData function');
	retWireless=[];
	retWireline=[];
	 var r = $('#req-date').val().split('-');
 	 var rDate = new Date(r[0], (r[1]-1), r[2]);
	  var formatDate = rDate.getDate()+''+rDate.getMonth()+''+rDate.getYear();
		for( var i = 0; i < rawData.length; i++ ){//for-1
			 var tmpDate = new Date(rawData[i].createdDate);
			 
			  var tmpFormatDate = tmpDate.getDate()+''+tmpDate.getMonth()+''+tmpDate.getYear();
			 if( formatDate.valueOf() == tmpFormatDate.valueOf() ){//if
				 
					if(rawData[i].serviceType == "WIRELESS") {
							retWireless.push({
								label : rawData[i].systemName,
								value : rawData[i].cdrCount
						 });
					}else{
						retWireline.push({
							label : rawData[i].systemName,
						 	value : rawData[i].cdrCount
					 	});
					}
			 }//if
		}//for-1
		document.getElementById('trendDonut').innerHTML=[];
		document.getElementById('trendDonut2').innerHTML=[];
	  Morris.Donut({
		 element: "trendDonut",
		 data: retWireless,
		 colors: colors 
	});
	  Morris.Donut({
		 element: "trendDonut2",
		 data: retWireline,
		 colors: colors 
	});
	
}//changeData
	 
	 
 </script>