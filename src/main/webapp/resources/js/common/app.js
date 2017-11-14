$(function() {
  $(".navbar-expand-toggle").click(function() {
    $(".app-container").toggleClass("expanded");
    return $(".navbar-expand-toggle").toggleClass("fa-rotate-90");
  });
  return $(".navbar-right-expand-toggle").click(function() {
    $(".navbar-right").toggleClass("expanded");
    return $(".navbar-right-expand-toggle").toggleClass("fa-rotate-90");
  });
});

$(function() {
  return $('.toggle-checkbox').bootstrapSwitch({
    size: "small"
  });
});

$(function() {
  return $('.match-height').matchHeight();
});

$(function() {
  return $('.datatable').DataTable({
    "dom": '<"top"fl<"clear">>rt<"bottom"ip<"clear">>'
  });
});

$(function() {
  return $(".side-menu .nav .dropdown").on('show.bs.collapse', function() {
    return $(".side-menu .nav .dropdown .collapse").collapse('hide');
  });
});

$("#modalEditPassword").on('click','#editPasswordSubmit',function () {
    var id = $("#sessionUserId").text();
    var oldPassword = $("#oldPassword").val();
    var editPassword = $("#editPassword").val();
    var re_editPassword = $("#re-editPassword").val();
    alert(id+"+"+oldPassword+"+"+editPassword+"+"+re_editPassword);
    if (oldPassword == "" || oldPassword == null || oldPassword == undefined || editPassword == "" || editPassword == null || editPassword == undefined || re_editPassword == "" || re_editPassword == null || re_editPassword == undefined) {
        alert("请补全信息");
    } else if (editPassword != re_editPassword) {
        alert("两次输入密码不一致");
    } else {
        $.ajax({
            type: "post",
            url: _ajax.url.system.user.updatePassword,
            dataType: "json",
            data: {
                id:id,
                oldPassword: oldPassword,
                newPassword: editPassword
            },
            success: function (data) {
                if (data.code == 1) {
                    // 提示信息
                    alert('修改成功，请使用新密码重新登录');
                    window.location.href=_ajax.website+"/logout";
                }
                else if(data.code == 0){
                    alert('原密码错误，请重新输入');
                }else{
                    alert('非法操作，如有疑问请联系管理员');
                }
            },
            error: function () {
                console.log("获取JSON数据异常");
            }
        })
    }
});
// $("#editPasswordSubmit").click(function () {
//     var id = $("#sessionUserId").text();
//     var oldPassword = $("#oldPassword").val();
//     var editPassword = $("#editPassword").val();
//     var re_editPassword = $("#re-password").val();
//     alert(id+"+"+oldPassword);
//     if (oldPassword == "" || oldPassword == null || oldPassword == undefined || editPassword == "" || editPassword == null || editPassword == undefined || re_editPassword == "" || re_editPassword == null || re_editPassword == undefined) {
//         alert("请输入原密码");
//     } else if (editPassword != re_editPassword) {
//         alert("两次输入密码不一致");
//     } else {
//         $.ajax({
//             type: "post",
//             url: _ajax.url.system.user.updatePassword,
//             dataType: "json",
//             data: {
//                 id:id,
//                 oldPassword: oldPassword,
//                 newPassword: editPassword
//             },
//             success: function (data) {
//                 if (data.code) {
//                     // 提示信息
//                     alert('修改成功，请使用新密码重新登录');
//                     window.location.href=_ajax.website+"/logout";
//                 }
//                 else {
//                     alert('修改失败，请重新尝试');
//                 }
//             },
//             error: function () {
//                 console.log("获取JSON数据异常");
//             }
//         })
//     }
// });
