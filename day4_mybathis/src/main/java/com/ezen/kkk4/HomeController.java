package com.ezen.kkk4;

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
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Handles requests for the application home page.
 */
@Controller
public class HomeController {
	
	@Autowired
	SqlSession sqlSession;
	
	
	@RequestMapping(value = "/main" )
	public String kb() {
		
		return "main";
	}
	
	
	
	@RequestMapping(value = "/in" )
	public String kk() {
		
		return "input";
	}
	
	@RequestMapping(value = "/save",method = RequestMethod.POST)
	public String kk2(HttpServletRequest request) {
		
		String name =request.getParameter("name");
		int age =Integer.parseInt(request.getParameter("age"));
		String tell =request.getParameter("tell");
		
		Service ss=sqlSession.getMapper(Service.class); //inserta를 불러오기위해객체만들어줌
		ss.inserta(name,age,tell); //input에서 입력 받은 데이터를 Service로 넘겨줌
		
		
		return "redirect:/";
		
	}
	
	@RequestMapping(value = "/ou" )
	public String kk3(Model mo) {
		
	Service ss=	sqlSession.getMapper(Service.class);
	ArrayList<MyDTO>list=ss.out();
		mo.addAttribute("list", list);
		
		
		
		return "outp";
	}
	
	
}
