package com.won.jun13cafe.gongji;

import java.math.BigDecimal;

public class Gongji {
	private BigDecimal c_no;
	private String c_title;
	private String c_url;
	public Gongji() {
		// TODO Auto-generated constructor stub
	}	
	public Gongji(BigDecimal c_no, String c_title, String c_url) {
		super();
		this.c_no = c_no;
		this.c_title = c_title;
		this.c_url = c_url;
	}
	public BigDecimal getC_no() {
		return c_no;
	}
	public void setC_no(BigDecimal c_no) {
		this.c_no = c_no;
	}
	public String getC_title() {
		return c_title;
	}
	public void setC_title(String c_title) {
		this.c_title = c_title;
	}
	public String getC_url() {
		return c_url;
	}
	public void setC_url(String c_url) {
		this.c_url = c_url;
	}
	
}
