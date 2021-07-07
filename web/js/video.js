var clk = document.getElementById("clk");
clk.onclick = function (){

  var xhr = new XMLHttpRequest();
  xhr.open("get","likeServlet",true);
  xhr.send();
  xhr.onreadystatechange = function (){
      if (xhr.readyState == 4){
          var text = xhr.responseText;
          document.getElementById("count").innerText=text;
      }
  }

}











