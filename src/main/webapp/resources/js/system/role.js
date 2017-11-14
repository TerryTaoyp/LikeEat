$(document).ready(function () {
    $('#list').dataTable({
        "aoColumnDefs": [ { "bSortable": false, "aTargets": [ 2 ] }]
    });
});

$(".edit").click(function () {
    var id=$(this).parents("tr").find("#roleId").text();
    $("#modalEditRole").modal({
        remote: _ajax.url.system.role.edit+id
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
    $.ajax({
        type: "post",
        url: _ajax.url.system.role.del,
        dataType: "json",
        data:{
            id:id
        },
        success: function(data) {
            if (data.code) {
                // 提示信息
                alert('删除成功');
                location.reload(true);
            }
            else{
                alert('删除失败，请联系管理员');
            }
        },
        error: function () {
            console.log("获取JSON数据异常");
        }
    })
});

$("#addSubmit").click(function(){
    var roleName=$("#roleName").val();
    var power=$("[name='power']").filter(":checked").val();
    $.ajax({
        type: "post",
        url: _ajax.url.system.role.add,
        dataType: "json",
        data: {
            role: roleName,
            power: power,
        },
        success: function(data) {
            if (data.code) {
                // 提示信息
                alert('添加成功');
                location.reload(true);
            }
            else{
                alert('添加失败');
            }
        },
        error: function () {
            console.log("获取JSON数据异常");
        }
    })
});
