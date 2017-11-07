$(document).ready(function () {
    $('#list').dataTable({
        "aoColumnDefs": [ { "bSortable": false, "aTargets": [ 6 ] }]
    });
});

$(".edit").click(function () {
    $("#modalEditSupp").modal({
        remote: "../edit/editSupplierList.html"
    });
});

$("#modalEditSupp").on("hidden.bs.modal", function () {
    $(this).removeData("bs.modal");
});  

$("#modalAddSupp").on("hidden.bs.modal", function () {
    document.getElementById("addSupp").reset();
});  

$(".del").click(function(){
    var id=$(this).parents("tr").find("#suppId").text();
    alert("点击删除"+id);
});

$("#addSubmit").click(function(){
    var name = $("#name").val();
    var type = $("#type").select().val();
    var addr = $("#addr").val();
    var contact = $("#contact").val();
    var remark = $("#remark").val();
    alert(name+"+"+type+"+"+addr+"+"+contact+"+"+remark);
});