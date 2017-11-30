package edu.wit.services;


import java.util.Date;
import java.util.List;
import java.util.Map;
import edu.wit.dao.NewsDao;
import edu.wit.entity.News;

public class NewsService {

	NewsDao newsDao=new NewsDao();
	public List<Map<String, Object>> selectAllNews() throws Exception{
		return newsDao.selectAllNews();
	}
	
	public List<Map<String, Object>> selectAllNewsByNtid(int ntid) throws Exception{
		return newsDao.selectAllNewsByNtid(ntid);
	}
	
	public List<Map<String, Object>> selectNewByNid(int nid) throws Exception{
		return newsDao.selectNewByNid(nid);
	}
	
	public int addNews(News news) throws Exception {
		return newsDao.addNews(news);
	}
	
	public static void main(String[] args) throws Exception {
		NewsDao newsDao=new NewsDao();
		System.out.println(newsDao.selectNewByNid(50));
		Date createDate = new Date();
		System.out.println(createDate);
	}
	
	
	
}
