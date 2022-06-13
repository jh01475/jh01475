package com.won.jun13cafe.gongji;

import javax.servlet.http.HttpServletRequest;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class GongjiDAO {
	@Autowired
	private SqlSession ss;
	
	public void getAllGongji(HttpServletRequest req) {
		try {
			req.setAttribute("gongji", ss.getMapper(GongjiMapper.class).getAllGongji());
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
}
