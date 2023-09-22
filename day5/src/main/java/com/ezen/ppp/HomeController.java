package com.ezen.ppp;

import java.text.DateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Locale;

import javax.servlet.http.HttpServletRequest;

import org.apache.ibatis.session.SqlSession;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Handles requests for the application home page.
 */
@Controller
public class HomeController {
	
	@Autowired
		SqlSession sqlSession;
	
	@RequestMapping(value = "/main")
	public String h() {
		
		
		return "main";
	}
	
	@RequestMapping(value = "/in")
	public String in() {
	
	
		return "input";
	}
	
	@RequestMapping(value = "/save",method = RequestMethod.POST)
	public String home(MyDTO myDTO) {
		
		Service ss	=sqlSession.getMapper(Service.class);
		ss.inserta(myDTO);
		
		return "main";
	}
	
	@RequestMapping(value = "/ou")
	public String out(Model mo) {
		
		Service ss	=sqlSession.getMapper(Service.class);
		ArrayList<MyDTO>list= ss.outb();
		mo.addAttribute("list", list);
		
		return "out";
	}
	
	@RequestMapping(value = "/delete")
	public String del(HttpServletRequest request) {
		
		String id =request.getParameter("id");
		Service ss	=sqlSession.getMapper(Service.class);
			ss.delete(id);
		
		return "redirect:ou";
	}
	
	@RequestMapping(value = "/mo1")
	public String mo(HttpServletRequest request,Model mo) {
		
		String id =request.getParameter("id");
		Service ss	=sqlSession.getMapper(Service.class);
	ArrayList<MyDTO>list= ss.mo(id);
		mo.addAttribute("list", list);
		return "modifyform";
	}
	
	@RequestMapping(value = "/mo2",method = RequestMethod.POST)
	public String mot(MyDTO myDTO) {
		
		
		Service ss	=sqlSession.getMapper(Service.class);
		ss.mot(myDTO);
		
		return "redirect:ou";
	}
	
}
