package com.won.jun13cafe.gongji;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.won.jun13cafe.gongji.GongjiDAO;


@Controller
public class GongjiController {
	
	@Autowired
	private GongjiDAO gDAO;
	
	@RequestMapping(value = "/gongji", method = RequestMethod.GET)
	public String gongji(HttpServletRequest req) {
		
		gDAO.getAllGongji(req);
		return "index";
	}
	
}
