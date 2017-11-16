$(document).ready(function () {
    $('#list').dataTable({
        "aoColumnDefs": [{"bSortable": false, "aTargets": [5]}]
    });
});

$(".edit").click(function () {
    var id = $(this).parents("tr").find("#goodsId").text();
    $("#modalEditGoods").modal({
        remote: _ajax.url.goods.manager.edit + id
    });
});

$("#modalEditGoods").on("hidden.bs.modal", function () {
    $(this).removeData("bs.modal");
});

$("#add").click(function () {
    $("#modalAddGoods").modal({
        remote: _ajax.url.goods.manager.add
    });
});

$("#modalAddGoods").on("hidden.bs.modal", function () {
    $(this).removeData("bs.modal");
});

$(".del").click(function () {
    var name = $(this).parents("tr").find("#goods").text();
    if (confirm("您确定要删除商品：" + name + " 吗？") == true) {
        var id = $(this).parents("tr").find("#goodsId").text();
        $.ajax({
            type: "post",
            url: _ajax.url.goods.manager.del,
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