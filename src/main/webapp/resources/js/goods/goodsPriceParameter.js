$(document).ready(function () {
    $('#list').dataTable({
        "aoColumnDefs": [ { "bSortable": false, "aTargets": [ 3 ] }]
    });
});

$(".edit").click(function () {
    var id=$(this).parents("tr").find("#priceParaId").text();
    $("#modalEditPriceParam").modal({
        remote: _ajax.url.goods.para.edit+id
    });
});

$("#modalEditType").on("hidden.bs.modal", function () {
    $(this).removeData("bs.modal");
});   

$(".del").click(function(){
    var id=$(this).parents("tr").find("#priceParaId").text();
    $.ajax({
        type:"post",
        url:_ajax.url.goods.para.del,
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
