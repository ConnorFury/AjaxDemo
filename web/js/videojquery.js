var $clk = $("#clk");
$clk.click(function (){
    $.ajax({
        url:"likeServlet",
        data:null,
        type:"get",
        async:true,
        dataType:"text",
        success:function(obj){

            $("#count").text(obj);

        },
        error:function(){
            alert("Error!")
        }
    });
});

