package edu.wit.dao;

import java.util.List;
import java.util.Map;

public class TopicDao {

	public List<Map<String,Object>> SelectAllTopics() throws Exception{
		String sql="select * from topic";
		return DBUtil.executeQuery(sql);
		
	}
}
