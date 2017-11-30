package edu.wit.services2;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import edu.wit.entity.News;

public interface NewsService {
	public List<News> selectAllNews() throws Exception;
	
	public List<News> selectAllNewsByNtid(int ntid) throws Exception;
	
	public List<News> selectNewByNid(int nid) throws Exception;
	
	public int addNews(News news) throws Exception ;
	
	List<News> selectNewsComByNid(int nid) throws Exception;
	
    List<News> selectNewsByTitle(HashMap<String, String> condition) throws Exception;
	
    List<News> selectNewsByTitle(String condition) throws Exception;
}
