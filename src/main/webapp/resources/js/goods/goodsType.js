$(document).ready(function () {
    $('#list').dataTable({
        "aoColumnDefs": [ { "bSortable": false, "aTargets": [ 3 ] }]
    });
});

$(".edit").click(function () {
    $("#modalEditType").modal({
        remote: "edit/editType.html"
    });
});

$("#modalEditType").on("hidden.bs.modal", function () {
    $(this).removeData("bs.modal");
});  

$("#modalAddType").on("hidden.bs.modal", function () {
    document.getElementById("addType").reset();
});  

$(".del").click(function(){
    var id=$(this).parents("tr").find("#typeId").text();
    alert("点击删除"+id);
});

$("#addSubmit").click(function(){
    var typeName=$("#typeName").val();
    var remark=$("#remark").val();
    alert(typeName+"+"+remark);
});