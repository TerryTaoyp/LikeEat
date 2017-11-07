$(document).ready(function () {
    $('#list').dataTable({
        "searching":false,
        "aoColumnDefs": [ { "bSortable": false, "aTargets": [ 3 ] }]
    });
});

$("#searchSubmit").click(function(){
    var goodsId = $("#goodsId").val();
    var goodsType = $("#goodsType").val();
    alert(goodsId+"+"+goodsType);
})