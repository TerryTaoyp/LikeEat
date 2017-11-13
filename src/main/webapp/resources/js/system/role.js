$(document).ready(function () {
    $('#list').dataTable({
        "aoColumnDefs": [ { "bSortable": false, "aTargets": [ 2 ] }]
    });
});

$(".edit").click(function () {
    var id=$(this).parents("tr").find("#roleId").text();
    $("#modalEditRole").modal({
        remote: _ajax.website+"/role/to/edit/"+id
    });
});

$("#modalEditRole").on("hidden.bs.modal", function () {
    $(this).removeData("bs.modal");
});

$("#modalAddRole").on("hidden.bs.modal", function () {
    document.getElementById("addRole").reset();
});

$(".del").click(function(){
    var id=$(this).parents("tr").find("#roleId").text();
    alert("点击删除"+id);
});

$("#addSubmit").click(function(){
    var roleName=$("#roleName").val();
    var power=$("[name='power']").filter(":checked").val();
    alert(roleName+"+"+power);
});
