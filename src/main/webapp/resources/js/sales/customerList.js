var vipDisplay = false;
var bankInfoDisplay = false;
var contactDisplay = false;
var sellerDisplay = false;
var agentDisplay = false;

$(document).ready(function () {
    $('#list').dataTable({
        "aoColumnDefs": [ { "bSortable": false, "aTargets": [ 6 ] }]
    });
});


$(".edit").click(function () {
    var id=$(this).parents("tr").find("#custId").text();
    $("#modalEditCust").modal({
        remote: _ajax.url.sale.customerList.edit+id
    });
});

$("#modalEditCust").on("hidden.bs.modal", function () {
    $(this).removeData("bs.modal");
});  

$("#modalAddCust").on("hidden.bs.modal", function () {
    document.getElementById("addCust").reset();
    if(vipDisplay==true){
        $("#vipInfo").addClass('hidden');
        vipDisplay=false;
    }
    if(bankInfoDisplay==true){
        $("#bankInfo").addClass('hidden');
        bankInfoDisplay=false;
    }
    if(contactDisplay==true){
        $("#contact").addClass('hidden');
        contactDisplay=false;
    }
    if(sellerDisplay==true){
        $("#contact").addClass('hidden');
        sellerDisplay=false;
    }
    if(agentDispaly==true){
        $("#contact").addClass('hidden');
        agentDispaly=false;
    }
});  

$(".del").click(function(){
    var name = $(this).parents("tr").find("#custName").text();
    if(confirm("您确定要删除客户：" + name + " 吗？") == true) {
        var id = $(this).parents("tr").find("#custId").text();
        $.ajax({
            type:"post",
            url:_ajax.url.sale.customerList.del,
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

$("#typeId").change(function(){
    if($("#typeId").select().val()=="2"&&vipDisplay==false){
        $("#vipInfo").removeClass('hidden');
        vipDisplay=true;
        if(sellerDisplay==true){
            $("#sellerInfo").addClass('hidden');
            sellerDisplay=false;
        }
        if(agentDisplay==true){
            $("#agentInfo").addClass('hidden');
            agentDisplay=false;
        }
    }else if($("#typeId").select().val()!="3"&&sellerDisplay==false){
        $("#sellerInfo").removeClass('hidden');
        sellerDisplay=true;
        if(vipDisplay==true){
            $("#vipInfo").addClass('hidden');
            vipDisplay=false;
        }
        if(agentDisplay==true){
            $("#agentInfo").addClass('hidden');
            agentDisplay=false;
        }
    }else if($("#typeId").select().val()!="4"&&agentDisplay==false){
        $("#agentInfo").removeClass('hidden');
        agentDisplay=true;
        if(vipDisplay==true){
            $("#vipInfo").addClass('hidden');
            vipDisplay=false;
        }
        if(sellerDisplay==true){
            $("#agentInfo").addClass('hidden');
            sellerDisplay=false;
        }
    }
});

$("#addBankInfo").click(function(){
    if(bankInfoDisplay==false){
        $("#bankInfo").removeClass('hidden');
        bankInfoDisplay=true;
    }else{
        $("#bankInfo").addClass('hidden');
        bankInfoDisplay=false;
    }
});

$("#addContact").click(function(){
    if(contactDisplay==false){
        $("#contact").removeClass('hidden');
        contactDisplay=true;
    }else{
        $("#contact").addClass('hidden');
        contactDisplay=false;
    }
});

$("#addSubmit").click(function(){
    var name = $("#name").val();
    var typeId = $("#typeId").select().val();
    var company = $("#company").val();
    var addr1 = $("#addr1").val();
    var addr2 = $("#addr2").val();
    var addr3 = $("#addr3").val();
    var phone1 = $("#phone1").val();
    var phone2 = $("#phone2").val();
    var phone3 = $("#phone3").val();
    var aliPay = $("#aliPay").val();
    var remark = $("#remark").val();
    var level = $("#level").select().val();
    var sex = $("#sex").val();
    var cardId = $("#cardId").val();
    var birth = $("#birth").val();
    var idNumber = $("#idNumber").val();
    var account = $("#account").val();
    var bank = $("#bank").val();
    var qq = $("#qq").val();
    var weChat = $("#weChat").val();
    var mail1 = $("#mail1").val();
    var mail2 = $("#mail2").val();
    if(vipDisplay==true){
        var typeId2 = $("#level").val();
    }else if(sellerDisplay==true){
        var typeId2 = $("#sellerType").val();
    }else if(agentDisplay==true){
        var typeId2 = $("#agentType").val();
    }else{
        var typeId2 = -1;
    }
    $.ajax({
        type:"post",
        url:_ajax.url.sale.customerList.add,
        dataType:"json",
        data:{
            customerName:name,
            customerTypeId:typeId,
            unitAddress:company,
            deliveryAddress1:addr1,
            deliveryAddress2:addr2,
            deliveryAddress3:addr3,
            telephone1:phone1,
            telephone2:phone2,
            telephone3:phone3,
            qq:qq,
            wechat:weChat,
            alipay:aliPay,
            bankName:bank,
            bankNum:account,
            email1:mail1,
            email2:mail2,
            customerTypeId2:typeId2,
            remark:remark,
            level:level,
            sex:sex,
            cardId:cardId,
            birth:birth,
            idNumber:idNumber
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