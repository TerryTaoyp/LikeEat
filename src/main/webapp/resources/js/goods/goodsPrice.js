$(document).ready(function () {
    $('#list').dataTable({
        "aoColumnDefs": [ { "bSortable": false, "aTargets": [ 5,6 ] }]
    });
});

$(".detail").click(function(){
    var id=$(this).parents("tr").find("#goodsId").text();
    $("#modalPriceDetail").modal({
        remote: _ajax.url.goods.price.edit+id
    });
});

$("#modalPriceDetail").on("hidden.bs.modal",function(){
    $(this).removeData("bs.modal");
});

$(".edit").click(function(){
    $("#modalEditParam").modal({
        remote: "edit/editPrice.html"
    });
});

$("#modalEditParam").on("hidden.bs.modal",function(){
    $(this).removeData("bs.modal");
})

$(".del").click(function(){
    var name=$(this).parents("tr").find("#goods").text();
    if(confirm("您确定要删除商品：" + name + " 的价格信息吗？") == true){
        var id=$(this).parents("tr").find("#goodsId").text();
        $.ajax({
            type:"post",
            url:_ajax.url.goods.price.del,
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
})