$(document).ready(function () {
    $('#list').dataTable({
        "aoColumnDefs": [{"bSortable": false, "aTargets": [4]}]
    });
});

$(".edit").click(function () {
    var id = $(this).parents("tr").find("#userId").text();
    $("#modalEditUser").modal({
        remote: _ajax.url.system.user.edit + id
    });
});

$("#modalEditUser").on("hidden.bs.modal", function () {
    $(this).removeData("bs.modal");
});

$("#modalAddUser").on("hidden.bs.modal", function () {
    document.getElementById("addUser").reset();
});

$(".del").click(function () {
    var name = $(this).parents("tr").find("#user").text();
    if (confirm("您确定要删除用户：" + name + " 吗？") == true) {
        var id = $(this).parents("tr").find("#userId").text();
        $.ajax({
            type: "post",
            url: _ajax.url.system.user.del,
            dataType: "json",
            data: {
                id: id
            },
            success: function (data) {
                if (data.code) {
                    // 提示信息
                    alert('删除成功');
                    location.reload(true);
                }
                else {
                    alert('删除失败，请联系管理员');
                }
            },
            error: function () {
                console.log("获取JSON数据异常");
            }
        })
    }
});

$("#addSubmit").click(function () {
    var userName = $("#userName").val();
    var phone = $("#phone").val();
    var idCard = $("#idCard").val();
    var realName = $("#realName").val();
    var role = $("[name='role']").filter(":checked").val();
    $.ajax({
        type: "post",
        url: _ajax.url.system.user.add,
        dataType: "json",
        data: {
            username: userName,
            realName: realName,
            idCard: idCard,
            phone: phone,
            roleId: role,
        },
        success: function (data) {
            if (data.code) {
                // 提示信息
                alert('添加成功');
                location.reload(true);
            }
            else {
                alert('添加失败');
            }
        },
        error: function () {
            console.log("获取JSON数据异常");
        }
    })
});