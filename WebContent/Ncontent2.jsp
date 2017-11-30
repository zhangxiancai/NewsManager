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
                <span class="newsdate"> 时间：${newsmap.ncreatedate}</span>
            </p>
            <hr/>

            <p class="newsContent">
               ${newsmap.ncontent}
            </p>
            <p><img src="F:/images/${newsmap.npicpath}"></p>
        </div>
        
        
        
       <div class="commentlist">
		<h2>评论区域</h2>
		<ul>

 <c:forEach items="${requestScope.newsmap.comments}" var="comments">
	           		<li>${comments.cauthor}</li>
	           		<li>${comments.ccontent}</li>
	           </c:forEach>
</ul>
   
</div>

</body>
</html>