package com.won.jun13cafe.clip;

import javax.servlet.http.HttpServletRequest;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ClipDAO {
	@Autowired
	private SqlSession ss;
	
	public void getAllClip(HttpServletRequest req) {
		try {
			req.setAttribute("clip", ss.getMapper(ClipMapper.class).getAllClip());
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
}
