window.onload=function () {
    $.post("LoginServlet?opr=log",{name:name,pwd:pwd},function (result) {
        if(result.code==1){
            window.location.href="Productservlet?opr=querypro";
        }else {
            alert(result.msg);
        }
    },'json')
}