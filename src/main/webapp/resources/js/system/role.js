$(document).ready(function () {
    $('#list').dataTable({
        "aoColumnDefs": [ { "bSortable": false, "aTargets": [ 2 ] }]
    });
});

// $(".edit").click(function () {
//     $("#modalEditRole").modal({
//         remote: "edit/editRole.html"
//     });
// });

$("#modalEditRole").on("hidden.bs.modal", function () {
    $(this).removeData("bs.modal");
});  

$("#modalAddRole").on("hidden.bs.modal", function () {
    document.getElementById("addRole").reset();
});  

// $(".del").click(function(){
//     var id=$(this).parents("tr").find("#roleId").text();
//     alert("点击删除"+id);
// });

$("#addSubmit").click(function(){
    var roleName=$("#roleName").val();
    var power=$("[name='power']").filter(":checked").val();
    alert(roleName+"+"+power);
});

$(document).ready(function () {
    var el = {
        J_tip: '.tip', //提示信息
        J_ajax_submit: '.J-ajax-submit', // ajax提交按钮
        J_change: '.edit', // 修改按钮
        J_delete: '.del', // 删除按钮
        J_role: '.role',// 角色名称
        J_remark: '.remark', // 备注
    };
    //调用初始化函数
    init();

    function init() {

    }
})