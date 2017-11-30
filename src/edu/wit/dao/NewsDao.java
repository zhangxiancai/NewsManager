package edu.wit.dao;



import java.util.List;
import java.util.Map;

import edu.wit.entity.News;
public class NewsDao {
	

	public List<Map<String,Object>> selectAllNews() throws Exception{
		String sql="select * from news";
		return DBUtil.executeQuery(sql);
	}
	
	public List<Map<String,Object>> selectNewByNid(int nid) throws Exception{
		String sql="select * from news where nid=?";
		return DBUtil.executeQuery(sql,nid);
	}
	
	public List<Map<String,Object>> selectAllNewsByNtid(int ntid) throws Exception{
		String sql="select * from news where ntid=?";
		return DBUtil.executeQuery(sql,ntid);
	}
	
	public int addNews(News news) throws Exception {
		String sql=
				"insert into news(ntid,ntitle,nauthor,ncreateDate,npicPath,ncontent,nmodifyDate,nsummary)\r\n" + 
				" values(?,?,?,?,?,?,?,?);";
		return DBUtil.executePreparedUpdate(sql, news.getNtid(),news.getNtitle(),
				news.getNauthor(),news.getNcreatedate(),news.getNpicpath(),
				news.getNcontent(),news.getNmodifydate(),news.getNsummary());
	}
	
}
