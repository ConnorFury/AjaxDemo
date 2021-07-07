$("#btn").click(function (){
    $.post(
        "json",
        null,
        function (obj){
            console.log(obj);
            $(obj).each(function (index,content){
                console.log(content);
                alert(content.sname);
            });
        },
        "json");
});