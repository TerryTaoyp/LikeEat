$(document).ready(function () {
    $('#list').dataTable({
        "aoColumnDefs": [ { "bSortable": false, "aTargets": [ 5,6 ] }]
    });
});

$(".detail").click(function(){
    $("#modalPriceDetail").modal({
        remote: "priceDetail.html"
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
    var id=$(this).parents("tr").find("#goodsId").text();
    alert("点击删除"+id);
})