package com.won.jun13cafe.clip;

import java.math.BigDecimal;

public class Clip {
	private BigDecimal c_no;
	private String c_title;
	private BigDecimal c_view;
	private String c_url;
	public Clip() {
		// TODO Auto-generated constructor stub
	}
	public Clip(BigDecimal c_no, String c_title, BigDecimal c_view, String c_url) {
		super();
		this.c_no = c_no;
		this.c_title = c_title;
		this.c_view = c_view;
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
	public BigDecimal getC_view() {
		return c_view;
	}
	public void setC_view(BigDecimal c_view) {
		this.c_view = c_view;
	}
	public String getC_url() {
		return c_url;
	}
	public void setC_url(String c_url) {
		this.c_url = c_url;
	}
}
