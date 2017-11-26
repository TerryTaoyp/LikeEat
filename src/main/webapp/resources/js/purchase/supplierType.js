$(document).ready(function () {
    $('#list').dataTable({
        "aoColumnDefs": [ { "bSortable": false, "aTargets": [ 3 ] }]
    });
});

$(".edit").click(function () {
    var id=$(this).parents("tr").find("#typeId").text();
    $("#modalEditSuppType").modal({
        remote: _ajax.url.purchase.suppType.edit+id
    });
});

$("#modalEditSuppType").on("hidden.bs.modal", function () {
    $(this).removeData("bs.modal");
});  

$("#modalAddSuppType").on("hidden.bs.modal", function () {
    document.getElementById("addType").reset();
});  

$(".del").click(function(){
    var name = $(this).parent("tr").find("#name");
    if (confirm("您确定要删除供货商类别：" + name + " 吗？") == true) {
        var id = $(this).parents("tr").find("#typeId").text();
        $.ajax({
            type:"post",
            url:_ajax.url.purchase.suppType.del,
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
    }
});

$("#addSubmit").click(function(){
    var typeName=$("#typeName").val();
    var remark=$("#remark").val();
    $.ajax({
        type:"post",
        url:_ajax.url.purchase.suppType.insert,
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