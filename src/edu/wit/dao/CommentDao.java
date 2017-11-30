package edu.wit.dao;

import java.util.List;
import java.util.Map;

public class CommentDao {

	public List<Map<String,Object>> selectAllComments() throws Exception{
		String sql="select * from comments";
		return DBUtil.executeQuery(sql);
	}
	public List<Map<String,Object>> selectAllCommentsByCid(int nid) throws Exception{
		String sql="select * from comments where cid=?";
		return DBUtil.executeQuery(sql,nid);
	}
	
	public int addComment() throws Exception{
		String sql="select * from comments";
		return 0;
	}
}
