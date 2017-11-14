$(document).ready(function () {
    $('#list').dataTable({
        "aoColumnDefs": [{"bSortable": false, "aTargets": [4]}]
    });
});

$(".edit").click(function () {
    var id = $(this).parents("tr").find("#userId").text();
    $("#modalEditUser").modal({
        remote: _ajax.url.system.user.edit+id
    });
});

$("#modalEditUser").on("hidden.bs.modal", function () {
    $(this).removeData("bs.modal");
});

$("#modalAddUser").on("hidden.bs.modal", function () {
    document.getElementById("addUser").reset();
});

$(".del").click(function () {
    var id = $(this).parents("tr").find("#userId").text();
    alert("点击删除" + id);
});

$("#addSubmit").click(function () {
    var userName = $("#userName").val();
    var phone = $("#phone").val();
    var password = $("#password").val();
    var re_password = $("#re-password").val();
    var role = $("[name='role']").filter(":checked").val();
    alert(userName + "+" + phone + "+" + password + "+" + re_password + "+" + role);
});