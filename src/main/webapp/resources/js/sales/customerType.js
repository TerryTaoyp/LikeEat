$(document).ready(function () {
    $('#list').dataTable({
        "aoColumnDefs": [ { "bSortable": false, "aTargets": [ 3 ] }]
    });
});

$(".edit").click(function () {
    $("#modalEditCustType").modal({
        remote: "../edit/editCustomerType.html"
    });
});

$("#modalEditCustType").on("hidden.bs.modal", function () {
    $(this).removeData("bs.modal");
});  

$("#modalAddCustType").on("hidden.bs.modal", function () {
    document.getElementById("addType").reset();
});  

$(".del").click(function(){
    var id=$(this).parents("tr").find("#typeId").text();
    alert("点击删除"+id);
});

$("#addSubmit").click(function(){
    var typeName=$("#typeName").val();
    var isVIP=$("#isVIP").is(':checked');
    var param=$("#param").val();
    var remark=$("#remark").val();
    alert(typeName+"+"+isVIP+"+"+param+"+"+remark);
});