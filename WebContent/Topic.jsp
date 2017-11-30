<%@page import="edu.wit.entity.News"%>
<%@page import="edu.wit.services2.NewsServiceImpl"%>
<%@page import="edu.wit.services2.NewsService"%>
<%@page import="java.util.Map"%>
<%@page import="java.util.List"%>
<%@page import="edu.wit.services.TopicService"%>

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
		
		TopicService topicService=new TopicService();
		List<Map<String,Object>> topics=topicService.selectAllNews();
		//NewsService newsService=new NewsService();
		//List<Map<String,Object>> newsmap= newsService.selectAllNews();
		NewsService newsService=new NewsServiceImpl();
		List<News> newsmap= newsService.selectAllNews();
		request.setAttribute("topics", topics);
		request.setAttribute("newsmap", newsmap);
		String username="jack";
		session.setAttribute("username",username);
		request.getRequestDispatcher("Main.jsp").forward(request, response);
		
	%>
	
</body>
</html>