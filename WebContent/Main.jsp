<%@page import="edu.wit.services.TopicService"%>
<%@page import="java.util.Map"%>
<%@page import="java.util.List"%>

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
<h1>新闻网站</h1>
<p><a href="AddNews.jsp">添加新闻</a></p>

<form action="SelectNewsServlet" method="post">
<input type="text" name="condition"placeholder="输入新闻关键字">
<input type="submit" value="搜索">
</form>    

<ul class="ul_topic" >

<c:forEach items="${requestScope.topics}" var="topic">
	           		<li><a href="News.jsp?ntid=${topic.tid}&opr=selecttopnews">${topic.tname}</a></li>
	           </c:forEach>
          
</ul>

<ol>

<c:forEach items="${requestScope.newsmap}" var="newsmap">
	           		<li><a href="ContentServlet2?nid=${newsmap.nid}">${newsmap.ntitle}</a>
	           		
	           		</li>
	           </c:forEach>
</ol>
</body>
<style type="text/css">

.ul_topic li{
list-style: none; 
float:left;

}

.ul_topic{
height:20px;}

</style>
</html>