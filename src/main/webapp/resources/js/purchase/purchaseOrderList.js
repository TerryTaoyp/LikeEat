$(document).ready(function () {
    $('#list').dataTable({
        "aoColumnDefs": [{ "bSortable": false, "aTargets": [4] }]
    });
});

$("#addOrder").click(function(){
    $("#modalAddOrder").modal({
        remote: "addOrder.html"
    });
});

$("#modalAddOrder").on("hidden.bs.modal", function () {
    $(this).removeData("bs.modal");
});  

$(".del").click(function () {
    var id = $(this).parents("tr").find("#orderNum").text();
    alert("点击删除" + id);
});

$(".detail").click(function(){
    $("#modalOrderDetail").modal({
        remote: "orderDetail.html"
    });
});

$("#modalOrderDetail").on("hidden.bs.modal", function () {
    $(this).removeData("bs.modal");
});  