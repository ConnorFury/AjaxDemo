<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <div id="app">
        <test></test>
    </div>
    <script src="https://cdn.jsdelivr.net/npm/vue/dist/vue.js"></script>
    <script>

        Vue.component("test",{
            template:"<div><input type='button' value='测试' @click='count++'>{{count}}</div>",
            data:function (){
                return {
                    count:0
                }
            }
        })
        new Vue({
           el:"#app"
        });
    </script>
</body>
</html>
