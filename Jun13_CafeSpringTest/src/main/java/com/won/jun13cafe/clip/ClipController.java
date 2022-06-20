package com.won.jun13cafe.clip;

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

import com.won.jun13cafe.clip.ClipDAO;


@Controller
public class ClipController {
	
	@Autowired
	private ClipDAO cDAO;
	
	@RequestMapping(value = "/clip", method = RequestMethod.GET)
	public String clip(HttpServletRequest req) {
		
		cDAO.getAllClip(req);
		return "clip";
	}
	
}
