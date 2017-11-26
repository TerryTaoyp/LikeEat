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