$(document).ready(function () {
    $('#list').dataTable({
        "searching":false,
        "aoColumnDefs": [ { "bSortable": false, "aTargets": [ 3 ] }]
    });
});

var VIPShow = false;

$("#baseOnVIP").click(function(){
    if(VIPShow==false){
        $("#VIPSearch").removeClass('hidden');
        $("#icon").removeClass('fa-angle-down');
        $("#icon").addClass('fa-angle-up');
        VIPShow=true;
    }else{
        $("#VIPSearch").addClass('hidden');
        $("#icon").removeClass('fa-angle-up');
        $("#icon").addClass('fa-angle-down');
        VIPShow=false;
    }
});

$("#searchSubmit").click(function(){
    var orderNum = $("#orderNum").val();
    var date = $("#date").val();
    var agent = $("#agent").val();
    var seller = $("#seller").val();
    var cardId = $("#cardId").val();
    var name = $("#name").val();
    var idNumber = $("#idNumber").val();
    var phone = $("#phone").val();
    var level = $("#level").select().val();
    alert(orderNum+"+"+date+"+"+agent+"+"+seller+"+"+cardId+"+"+name+"+"+idNumber+"+"+phone+"+"+level);
})