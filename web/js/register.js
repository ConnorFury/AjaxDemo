$("#usr").blur(function (){
    $.get(
        "reg",
        {"usr" : $("#usr").val()},
        function (msg){
            if (msg){
                $("#msg").text("该账号可使用！");
            }else {
                $("#msg").text("该账号已存在！");
            }

        },
        "json"
    );
})













