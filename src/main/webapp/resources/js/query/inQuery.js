$(document).ready(function () {
    $('#list').dataTable({
        "searching":false,
        "aoColumnDefs": [ { "bSortable": false, "aTargets": [ 3 ] }]
    });
});

$("#searchSubmit").click(function(){
    var orderNum = $("#orderNum").val();
    var date = $("#date").val();
    var supplier = $("#supplier").val();
    alert(orderNum+"+"+date+"+"+supplier);
})