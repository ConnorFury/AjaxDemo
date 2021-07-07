$("#btn").click(function (){
    $.ajax({
        url:"stu",
        data:{"method":"asynchronous","flag":"first"},
        type:"get",
        async:false,
        dataType:"json",
        success:function (msg) {
            $("body").append("<div style='width: 100%;height: 50px;background-color: rebeccapurple'>"+msg+"</div>");
        },
        error:function (){
            alert("fuck!")
        }
    });

    $.ajax({
        url:"stu",
        data:{"method":"asynchronous","flag":"second"},
        type:"get",
        async:true,
        dataType:"json",
        success:function (msg) {
            $("body").append("<div style='width: 100%;height: 50px;background-color: orange'>"+msg+"</div>");
        },
        error:function (){
            alert("fuck!")
        }
    });
});