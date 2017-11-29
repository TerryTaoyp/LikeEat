$(document).ready(function () {
    $('#list').dataTable({
        "aoColumnDefs": [ { "bSortable": false, "aTargets": [ 3 ] }]
    });
});

$(".edit").click(function () {
    var id=$(this).parents("tr").find("#typeId").text();
    $("#modalEditCustType").modal({
        remote: _ajax.url.sale.customerType.edit+id
    });
});

$("#modalEditCustType").on("hidden.bs.modal", function () {
    $(this).removeData("bs.modal");
});  

$("#modalAddCustType").on("hidden.bs.modal", function () {
    document.getElementById("addType").reset();
});  

$(".del").click(function(){
    var name = $(this).parents("tr").find("#name");
    if(confirm("您确定要删除客户类型：" + name + " 吗？") == true) {
        var id=$(this).parents("tr").find("#typeId").text();
        $.ajax({
            type:"post",
            url:_ajax.url.sale.customerType.del,
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
    var isVIP=$("#isVIP").is(':checked');
    var param=$("#param").val();
    var remark=$("#remark").val();
    alert(typeName+"+"+isVIP+"+"+param+"+"+remark);
});