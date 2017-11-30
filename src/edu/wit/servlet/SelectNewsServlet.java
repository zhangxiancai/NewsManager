package edu.wit.servlet;

import java.io.IOException;
import java.util.List;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import edu.wit.entity.News;
import edu.wit.services.TopicService;
import edu.wit.services2.NewsService;
import edu.wit.services2.NewsServiceImpl;

/**
 * Servlet implementation class SelectNewsServlet
 */
@WebServlet("/SelectNewsServlet")
public class SelectNewsServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public SelectNewsServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		NewsService newsService=new NewsServiceImpl();
		String condition=request.getParameter("condition");
		List<News> newsmap=null;
		List<Map<String,Object>> topics=null;
		TopicService topicService=new TopicService();
		
	    try {
			topics=topicService.selectAllNews();
			newsmap = newsService.selectNewsByTitle(condition);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		request.setAttribute("topics", topics);
		request.setAttribute("newsmap", newsmap);
		request.getRequestDispatcher("Main.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
