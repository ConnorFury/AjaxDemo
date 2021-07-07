$("#clk").click(function (){
    $.get(
        "likeServlet",
        null,
        function (shit){
            $("#count").text(shit);
        },
        "text"
    )
})