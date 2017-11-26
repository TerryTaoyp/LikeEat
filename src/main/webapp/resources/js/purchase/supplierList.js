$(document).ready(function () {
    $('#list').dataTable({
        "aoColumnDefs": [ { "bSortable": false, "aTargets": [ 6 ] }]
    });
});

$(".edit").click(function () {
    var id=$(this).parents("tr").find("#suppId").text();
    $("#modalEditSupp").modal({
        remote: _ajax.url.purchase.suppList.edit+id
    });
});

$("#modalEditSupp").on("hidden.bs.modal", function () {
    $(this).removeData("bs.modal");
});  

$("#modalAddSupp").on("hidden.bs.modal", function () {
    document.getElementById("addSupp").reset();
});  

$(".del").click(function(){
    var name = $(this).parents("tr").find("#supplierName").text();
    if (confirm("您确定要删除供货商：" + name + " 吗？") == true) {
        var id = $(this).parents("tr").find("#suppId").text();
        $.ajax({
            type:"post",
            url:_ajax.url.purchase.suppList.del,
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
    var name = $("#name").val();
    var type = $("#type").select().val();
    var addr = $("#addr").val();
    var contact = $("#contact").val();
    var remark = $("#remark").val();
    $.ajax({
        type:"post",
        url:_ajax.url.purchase.suppList.insert,
        dataType:"json",
        data:{
            supplierName:name,
            supplierTypeId:type,
            supplierAddress:addr,
            telephone:contact,
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