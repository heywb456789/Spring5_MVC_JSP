package com.minjae.web.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

//public class HomeController implements Controller {
@Controller
public class HomeController{

	@RequestMapping("/index")
	public String index(){
		return "root.index";
	}

	@RequestMapping("/help")
	@ResponseBody
	public void help(){
		System.out.println("aaa");
	}
//	@Override
//	public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response) throws Exception {
//		// TODO Auto-generated method stub
//		ModelAndView nv = new ModelAndView();
//		nv.addObject("data", "hello");
//		nv.setViewName("root.index");
//		return nv;
//	}

	
}
