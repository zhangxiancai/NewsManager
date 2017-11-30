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
<h1>添加新闻</h1>
	<h2>${addnewsInfo}</h2>
	<div>
		<form action="AddNewsServlet" method="post"  enctype="multipart/form-data">
			<p>
				<span>新闻专题:</span> 
				<select name="topics">
				<c:forEach items="${topics}" var="topic">
					<option value="${topic.tid}">${topic.tname}</option>
				</c:forEach>
				</select>
			</p>
			
			<p>
				<span>新闻标题:</span> <input type="text" name="newstitle"/>
			</p>
			<p>
				<span>作者:  </span> <input type="text" name="newsAuthor"/>
			</p>
			<p>
				<span>新闻摘要:</span> 
				<textarea rows="8" cols="80" name="newsSummary">
				
				</textarea>
			</p>
			
			<p>
				<span>新闻内容:</span> 
				<textarea rows="8" cols="80" name="newsContent">
				
				</textarea>
			</p>
			<p>
				<span>新闻图片:</span> <input type="file" name="newimage"/>
			</p>
			<input  type="submit" value="添加新闻"/>
			<input  type="reset" value="重置"/>
		</form>
		
		<p>${isornot}</p>
	</div>


</body>
</html>