<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@taglib uri="http://java.sun.com/jsp/jstl/core"  prefix="c"%> 
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
  <div class="newslist">

            <h3>${requestScope.newsmap.ntitle}</h3>
            <p>
                <span class="author"> 作者：${newsmap.nauthor}</span>
                <span class="newsdate"> 时间：${newsmap.ncreateDate}</span>
            </p>
            <hr/>

            <p class="newsContent">
               ${newsmap.ncontent}
            </p>
            <p><img src="F:/images/${newsmap.npicPath}"></p>
        </div>
        
        
        
       <div class="commentlist">
		<h2>评论区域</h2>
   
</div>

<div class="comment">
<h2>发个评论呗</h2>
    <ul>
        <li>用户名: <input type="text" name="nickname"/></li>
        <li>
            <input  type="hidden" id="newsid" value="${newsmap.nid}"/>
            <textarea rows="5" cols="60"></textarea>
        </li>

        <li>
            <input type="button" value="发表"/>
        </li>
    </ul>
</div>


</body>
<style type="text/css">

.newsContent{
text-indent:30px;
line-height:25px;
}
</style>

<script src="js/jquery-3.2.1.js"></script>
    <script type="text/javascript">
       
        	
        	 var nid =  $("#newsid").val();
        	 $.get("CommentServlet","opr=selectComments&nid="+nid,function (comments) {
        		 
        		 $(comments).each(function (index,item){			 
        			  var $ulcomment =  $("<ul>\n" +
        	                     "        <li>留言人: "+item.cauthor+"  IP:"+item.cip+"  留言时间:"+item.cdate+"</li>\n" +
        	                     "        <li>"+item.ccontent+"</li>\n" +
        	                     "</ul>");
        	           $(".commentlist").append($ulcomment);
        			 
        		 });
                 
             },"json");


</script>


</html>