package edu.wit.services;

import java.util.List;
import java.util.Map;

import edu.wit.dao.TopicDao;
import edu.wit.dao.NewsDao;
public class TopicService {

	TopicDao topicDao=new TopicDao();
	public List<Map<String, Object>> selectAllNews() throws Exception{
		return topicDao.SelectAllTopics();
	}
	
}
