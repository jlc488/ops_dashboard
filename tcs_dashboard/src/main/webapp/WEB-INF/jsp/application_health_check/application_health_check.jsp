<div id="page-wrapper">
		<div class="row">
          <div class="col-lg-12 page-header">
            <ol class="breadcrumb">
              <i class="fa fa-desktop"></i> <li>Health Check</li>
              <li class="active">Concurrent Users</li>
            </ol>
          </div>
        </div><!-- /.row -->
        <div class="row">
          <div class="col-lg-12">
            <div class="panel panel-default">
              <div class="panel-heading">
                <i class="fa fa-bar-chart-o"></i> Concurrent Users
              </div>
              <div class="panel-body">
                <div id="morris-area-cc"></div>
              </div>
            </div>
          </div>
        </div><!-- /.row -->
</div>
<script>
var colors = ['#4AA02C','#37619d','#98AFC7','#38ACEC','#F6CEF5','#F87431','#786D5F','#38ACEC','#F6D8CE','#BCF5A9','#ECCEF5'] ;
Morris.Area({
    element: 'morris-area-cc',
    data: [{
        period: '10:00',
        iphone: 2293,
        ipad: 4567,
        itouch: 2647
    }, {
        period: '11',
        iphone: 5555,
        ipad: 5677,
        itouch: 2441
    }, {
        period: '12',
        iphone: 4912,
        ipad: 6788,
        itouch: 2501
    }, {
        period: '13',
        iphone: 3767,
        ipad: 9876,
        itouch: 5689
    }, {
        period: '14',
        iphone: 6810,
        ipad: 5566,
        itouch: 2293
    }, {
        period: '15',
        iphone: 5670,
        ipad: 4293,
        itouch: 1881
    }, {
        period: '16',
        iphone: 4820,
        ipad: 3795,
        itouch: 1588
    }, {
        period: '17',
        iphone: 1507,
        ipad: 5967,
        itouch: 5175
    }, {
        period: '18',
        iphone: 10687,
        ipad: 4460,
        itouch: 2028
    }, {
        period: '19',
        iphone: 8432,
        ipad: 456,
        itouch: 1791
    }],
    xkey: 'period',
    ykeys: ['iphone', 'ipad', 'itouch','iphone', 'ipad', 'itouch','iphone', 'ipad', 'itouch','iphone','ipad'],
    labels: ['SB_SVE_AP', 'AIA_PIP_DB', 'OSB_DB','BIS_AP', 'BIS_DB', 'STAGIN_DB','EGI_DB','AIA_PIP_AP','EGI_AP','SBL_ECONF','SBL_DB'],
    pointSize: 2,
    hideHover: 'auto',
    resize: true,
    lineColors: colors
});
</script>