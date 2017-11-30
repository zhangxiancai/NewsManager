package edu.wit.services;

import java.util.List;
import java.util.Map;

import edu.wit.dao.CommentDao;


public class CommentService {
	CommentDao commentDao=new CommentDao();
	public List<Map<String, Object>> selectAllComments() throws Exception{
		return commentDao.selectAllComments();
	}
	public List<Map<String, Object>> selectAllCommentsByCid(int cid) throws Exception{
		return commentDao.selectAllCommentsByCid(cid);
	}
	public static void main(String[] args) throws Exception {
		System.out.println("ss");
		CommentDao commentDao=new CommentDao();
		System.out.println(commentDao.selectAllCommentsByCid(73));
	}
}
