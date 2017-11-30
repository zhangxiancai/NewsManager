package edu.wit.services2;

import java.util.HashMap;
import java.util.List;

import org.apache.ibatis.session.SqlSession;


import edu.wit.dao2.NewsDao2;
import edu.wit.entity.News;
import edu.wit.util.MyBatisUtil;

public class NewsServiceImpl implements NewsService{

	@Override
	public List<News> selectAllNews() throws Exception {
		List<News> news = null;	
		SqlSession session = MyBatisUtil.getSqlSession();		
				
		news =  session.getMapper(NewsDao2.class).findAllNews();
		MyBatisUtil.closeSession(session);
		return news;
		
	}

	@Override
	public List<News> selectAllNewsByNtid(int ntid) throws Exception {
		
		return null;
	}

	@Override
	public List<News> selectNewByNid(int nid) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int addNews(News news) throws Exception {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public List<News> selectNewsComByNid(int nid) throws Exception {
		List<News> news = null;	
		SqlSession session = MyBatisUtil.getSqlSession();		
				
		news =  session.getMapper(NewsDao2.class).selectNewsComByNid(nid);
		MyBatisUtil.closeSession(session);
		return news;
	}

	@Override
	public List<News> selectNewsByTitle(HashMap<String, String> condition) throws Exception {
		List<News> news = null;	
		SqlSession session = MyBatisUtil.getSqlSession();		
				
		news =  session.getMapper(NewsDao2.class).selectNewsByTitle(condition);
		MyBatisUtil.closeSession(session);
		return news;
	}

	@Override
	public List<News> selectNewsByTitle(String condition) throws Exception {
		List<News> news = null;	
		SqlSession session = MyBatisUtil.getSqlSession();		
				
		news =  session.getMapper(NewsDao2.class).selectNewsByTitle2(condition);
		MyBatisUtil.closeSession(session);
		return news;
	}

}
