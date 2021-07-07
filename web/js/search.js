var temp;
$("#search").keyup(function (){
    var val = $("#search").val();
    if (val != null && val != ""){
        $.get(
            "stu",
            {"method":"completion","sname":val},
            function (msg){
                $("#show").html("");
                $(msg).each(function (index,content){
                    var snameDiv = "<div style='font-size: 36px' class='c'>"+content.sname+"<div>";
                    $("#show").append(snameDiv);
                })
            },
            "json"
        );
    }else {
        $("#show").html("");
    }
    temp = $('.c');

})

$("body").click(function (){
    console.log(temp);
    $(temp).each(function (){
        console.log($(this));
        // console.log($(content).text());
        $(this).on('click','.c',function (e){
            alert($(this).text());
        });
    })
})









