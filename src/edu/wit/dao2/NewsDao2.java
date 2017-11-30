package edu.wit.dao2;

import java.util.HashMap;
import java.util.List;


import edu.wit.entity.News;

public interface NewsDao2 {
	List<News> findAllNews();

	News findNewById(int nid);

	int insertNew(News news);
	
	List<News> selectNewsComByNid(int nid);
	
    List<News> selectNewsByTitle(HashMap<String, String> condition);
    
    List<News> selectNewsByTitle2(String condition);
    
    List<News> selectNewsByTitleAndAuthorAndSummary(News news);
    
    int deleteNewsesByNid(int [] nids);
}
