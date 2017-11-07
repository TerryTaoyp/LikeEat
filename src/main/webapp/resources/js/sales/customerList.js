var vipDisplay = false;
var bankInfoDisplay = false;
var contactDisplay = false;

$(document).ready(function () {
    $('#list').dataTable({
        "aoColumnDefs": [ { "bSortable": false, "aTargets": [ 6 ] }]
    });
});


$(".edit").click(function () {
    $("#modalEditCust").modal({
        remote: "../edit/editCustomerList.html"
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
});  

$(".del").click(function(){
    var id=$(this).parents("tr").find("#custId").text();
    alert("点击删除"+id);
});

$("#typeId").change(function(){
    if($("#typeId").select().val()=="会员"&&vipDisplay==false){
        $("#vipInfo").removeClass('hidden');
        vipDisplay=true;
    }else if($("#typeId").select().val()!="会员"&&vipDisplay==true){
        $("#vipInfo").addClass('hidden');
        vipDisplay=false;
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
})

$("#addSubmit").click(function(){
    var name = $("#name").val();
    var typeId = $("#typeId").select().val();
    var company = $("#company").val();
    var addr = $("#addr").val();
    var phone = $("#phone").val();
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
    var mail = $("#mail").val();
    alert(name+typeId+company+addr+phone+aliPay+remark+level+sex+cardId+birth+idNumber+account+bank+qq+weChat+mail);
});