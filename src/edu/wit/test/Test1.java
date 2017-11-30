package edu.wit.test;

import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;



import edu.wit.dao2.NewsDao2;
import edu.wit.entity.Comment;
import edu.wit.entity.News;

public class Test1 {

	public static void main(String[] args) throws IOException {
		InputStream inputStream =  Resources.getResourceAsStream("Config.xml");
		//创建SqlSessionFactory类的对象
		SqlSessionFactory factory = new  SqlSessionFactoryBuilder().build(inputStream);
		//创建SqlSession对象
		SqlSession session =  factory.openSession();
		System.out.println(session);
		NewsDao2 newDao=session.getMapper(NewsDao2.class);
		
		
		News news=new News();
		news.setNtitle("重庆");
		news.setNauthor("news");
		System.out.println(newDao.deleteNewsesByNid(new int[] {188,189})+"...");
		session.commit();
		
		
		//System.out.println(newDao.selectNewsComByNid(73).get(1).getNtitle()+"...");
//		List<News> news=newDao.selectNewsComByNid(73);
//		List<Comment> comments=news.get(0).getComments();
//		for (int i=0;i<news.size();i++) {
//			comments=news.get(i).getComments();
//			System.out.println(comments.size()+"...");
//			System.out.println(comments.get(0).getCcontent()+"\t"+comments.get(0).getCauthor());
//		}
		session.close();
		

	}

}
