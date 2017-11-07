$(document).ready(function () {
    $('#list').dataTable({
        "aoColumnDefs": [ { "bSortable": false, "aTargets": [ 5 ] }]
    });
});

$(".edit").click(function () {
    $("#modalEditGoods").modal({
        remote: "edit/editManager.html"
    });
});

$("#modalEditGoods").on("hidden.bs.modal", function () {
    $(this).removeData("bs.modal");
});  

$("#add").click(function(){
    $("#modalAddGoods").modal({
        remote: "edit/addManager.html"
    });
});

$("#modalAddGoods").on("hidden.bs.modal", function () {
    $(this).removeData("bs.modal");
});  

$(".del").click(function(){
    var id=$(this).parents("tr").find("#goodsId").text();
    alert("点击删除"+id);
});