package com.minjae.web.controller.notice;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

import com.minjae.web.entity.Notice;
import com.minjae.web.service.NoticeService;
import com.minjae.web.service.jdbc.JDBCNoticeService;

public class ListController implements Controller{

	@Autowired
	private NoticeService  noticeService;


//	public void setNoticeService(NoticeService noticeService) {
//		this.noticeService = noticeService;
//	}

	@Override
	public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response) throws Exception {
		// TODO Auto-generated method stub
		ModelAndView mv = new ModelAndView("notice.list");
		List<Notice> list = noticeService.getList(1,"TITLE","");
		mv.addObject("list", list);
		return mv;
	}

}
