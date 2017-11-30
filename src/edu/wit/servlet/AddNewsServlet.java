package edu.wit.servlet;

import java.io.IOException;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Part;

import edu.wit.entity.News;
import edu.wit.services.NewsService;

/**
 * Servlet implementation class AddImgServlet
 */
@WebServlet("/AddNewsServlet")
@MultipartConfig
public class AddNewsServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AddNewsServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String newsTitle = request.getParameter("newstitle");
		String newsAuthor = request.getParameter("newsAuthor");
		String newsSummary = request.getParameter("newsSummary");
		String newsContent = request.getParameter("newsContent");
		Date createDate = new Date();
		Date modifyDate = new Date();
		
		
		Part newsImg =  request.getPart("newimage");//获取上传的文件
		String fileUrl=newsImg.getHeaders("content-disposition").toString().substring(35).replace("\"]", "");		
		String extfix = fileUrl.substring(fileUrl.lastIndexOf("."));
		
		String fileName = System.currentTimeMillis()+extfix;
		News news = new News();
		news.setNtid(2);
		news.setNauthor(newsAuthor);
		news.setNtitle(newsTitle);
		news.setNcontent(newsContent);
		news.setNsummary(newsSummary);
		news.setNmodifydate(modifyDate);
		news.setNcreatedate(createDate);
		news.setNpicpath(fileName);
		 newsImg.write("F:\\images\\"+fileName);
		NewsService newsService=new NewsService();
		int temp=0;
		try {
			 temp=newsService.addNews(news);	
		} catch (Exception e) {
			
			e.printStackTrace();
		}
		if(temp==1) {
			request.setAttribute("isornot", "添加成功。。");
			request.getRequestDispatcher("AddNews.jsp").forward(request, response);
		}
		else {
			request.setAttribute("isornot", "添加失败。。");
		request.getRequestDispatcher("AddNews.jsp").forward(request, response);
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
