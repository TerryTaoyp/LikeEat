$(document).ready(function () {
    $('#list').dataTable({
        "aoColumnDefs": [ { "bSortable": false, "aTargets": [ 3 ] }]
    });
});

$(".edit").click(function () {
    $("#modalEditPriceParam").modal({
        remote: "edit/editPriceParameter.html"
    });
});

$("#modalEditType").on("hidden.bs.modal", function () {
    $(this).removeData("bs.modal");
});   

$(".del").click(function(){
    var id=$(this).parents("tr").find("#customerTypeId").text();
    alert("点击删除"+id);
});
