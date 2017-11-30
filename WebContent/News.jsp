<%@page import="edu.wit.services.TopicService"%>
<%@page import="edu.wit.services.NewsService"%>
<%@page import="java.util.Map"%>
<%@page import="java.util.List"%>

<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<% 
 int ntid = Integer.parseInt(request.getParameter("ntid"));
NewsService newsService=new NewsService();
List<Map<String,Object>> newsmap= newsService.selectAllNewsByNtid(ntid);
request.setAttribute("newsmap", newsmap);
TopicService topicService=new TopicService();
List<Map<String,Object>> topics=topicService.selectAllNews();
request.setAttribute("topics", topics);
request.getRequestDispatcher("Main.jsp").forward(request, response);


%>

</body>
</html>