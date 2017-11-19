$(document).ready(function () {
    $('#list').dataTable({
        "aoColumnDefs": [ { "bSortable": false, "aTargets": [ 3 ] }]
    });
});

$(".edit").click(function () {
    var id=$(this).parents("tr").find("#typeId").text();
    $("#modalEditType").modal({
        remote: _ajax.url.goods.type.edit+id
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
    $.ajax({
        type:"post",
        url:_ajax.url.goods.type.del,
        dataType:"json",
        data:{
            id:id
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
});

$("#addSubmit").click(function(){
    var typeName=$("#typeName").val();
    var remark=$("#remark").val();
    $.ajax({
        type:"post",
        url:_ajax.url.goods.type.insert,
        dataType:"json",
        data:{
            name:typeName,
            remark:remark
        },
        success: function (data) {
            if (data.code) {
                // 提示信息
                alert('添加成功');
                location.reload(true);
            }
            else {
                alert('添加失败，请联系管理员');
            }
        },
        error: function () {
            console.log("获取JSON数据异常");
        }
    })
});